import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.io.Reader;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fug implements auu, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ale a = ale.b("missing");
   private static final akx d = akx.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fui f;
   private final List<fgp> g = new ArrayList<>();
   private final Map<ale, fui> h = new HashMap<>();
   private final hib i;
   @Nullable
   private volatile fui j;

   public fug(hib $$0) {
      this.i = $$0;
      this.f = af.a(new fui($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fgp.a d() {
      return new fgp.a(new fue(), fuh.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bqi.a()), $$3);
   }

   private CompletableFuture<fug.d> a(avb $$0, Executor $$1) {
      List<CompletableFuture<fug.e>> $$2 = new ArrayList<>();

      for (Entry<ale, List<auz>> $$3 : d.b($$0).entrySet()) {
         ale $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fug.a, fut.a>> $$4x = a($$3.getValue(), $$4);
            fug.e $$5 = new fug.e($$4);

            for (Pair<fug.a, fut.a> $$6 : $$4x) {
               fug.a $$7 = (fug.a)$$6.getFirst();
               fuh.a $$8 = ((fut.a)$$6.getSecond()).b();
               ((fut.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fgp>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fgp>>> $$2x = $$1x.stream().flatMap(fug.e::d).collect(af.b());
               fgp.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ale, List<fgp.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fgp> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fug.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fgp>> a(fug.a $$0, fut.b $$1, avb $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ale, List<fgp.a>> a(List<fug.e> $$0) {
      Map<ale, List<fgp.a>> $$1 = new HashMap<>();
      ayo<ale, fug.e> $$2 = new ayo<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fgp.a> $$0, fgp.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fgp.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fgp.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fuh> b(foj $$0) {
      Set<fuh> $$1 = EnumSet.noneOf(fuh.class);
      if ($$0.S().c()) {
         $$1.add(fuh.a);
      }

      if ($$0.T().c()) {
         $$1.add(fuh.b);
      }

      return $$1;
   }

   private void a(fug.d $$0, bqj $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fui::close);
      this.h.clear();
      this.g.forEach(fgp::close);
      this.g.clear();
      Set<fuh> $$2 = b(fof.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fui $$3 = new fui(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fof.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(foj $$0) {
      Set<fuh> $$1 = b($$0);

      for (fui $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fug.a, fut.a>> a(List<auz> $$0, ale $$1) {
      List<Pair<fug.a, fut.a>> $$2 = new ArrayList<>();

      for (auz $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fug.c $$6 = (fug.c)fug.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fut.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fug.a $$9 = new fug.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fra a() {
      return new fra(this::b, false);
   }

   public fra b() {
      return new fra(this::b, true);
   }

   private fui a(ale $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fui b(ale $$0) {
      fui $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fui $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fui::close);
      this.g.forEach(fgp::close);
      this.f.close();
   }

   static record a(ale a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fug.a a, fuh.a b, Either<CompletableFuture<Optional<fgp>>, ale> c) {

      public Optional<List<fgp.a>> a(Function<ale, List<fgp.a>> $$0) {
         return (Optional<List<fgp.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fgp.a($$0xx, this.b))), $$1 -> {
            List<fgp.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fug.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fgp.a a(fgp.a $$0) {
         return new fgp.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fut.a> b) {
      public static final Codec<fug.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fut.a.a.listOf().fieldOf("providers").forGetter(fug.c::a)).apply($$0, fug.c::new)
      );

      public List<fut.a> a() {
         return this.b;
      }
   }

   static record d(Map<ale, List<fgp.a>> a, List<fgp> b) {
   }

   static record e(ale a, List<fug.b> b, Set<ale> c) implements ayo.a<ale> {

      public e(ale $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fug.a $$0, fuh.a $$1, fut.c $$2) {
         this.b.add(new fug.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fug.a $$0, fuh.a $$1, CompletableFuture<Optional<fgp>> $$2) {
         this.b.add(new fug.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fgp>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fgp.a>> a(Function<ale, List<fgp.a>> $$0) {
         List<fgp.a> $$1 = new ArrayList<>();

         for (fug.b $$2 : this.b) {
            Optional<List<fgp.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ale> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ale> $$0) {
      }
   }
}

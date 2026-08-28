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

public class fnx implements auu, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ali a = ali.b("missing");
   private static final alb d = alb.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fnz f;
   private final List<fca> g = new ArrayList<>();
   private final Map<ali, fnz> h = new HashMap<>();
   private final gye i;
   @Nullable
   private volatile fnz j;

   public fnx(gye $$0) {
      this.i = $$0;
      this.f = ae.a(new fnz($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fca.a d() {
      return new fca.a(new fnv(), fny.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bom.a()), $$3);
   }

   private CompletableFuture<fnx.d> a(avb $$0, Executor $$1) {
      List<CompletableFuture<fnx.e>> $$2 = new ArrayList<>();

      for (Entry<ali, List<auz>> $$3 : d.b($$0).entrySet()) {
         ali $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fnx.a, fok.a>> $$4x = a($$3.getValue(), $$4);
            fnx.e $$5 = new fnx.e($$4);

            for (Pair<fnx.a, fok.a> $$6 : $$4x) {
               fnx.a $$7 = (fnx.a)$$6.getFirst();
               fny.a $$8 = ((fok.a)$$6.getSecond()).b();
               ((fok.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fca>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ae.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fca>>> $$2x = $$1x.stream().flatMap(fnx.e::d).collect(ae.b());
               fca.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ae.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ali, List<fca.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fca> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fnx.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fca>> a(fnx.a $$0, fok.b $$1, avb $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ali, List<fca.a>> a(List<fnx.e> $$0) {
      Map<ali, List<fca.a>> $$1 = new HashMap<>();
      ayp<ali, fnx.e> $$2 = new ayp<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fca.a> $$0, fca.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fca.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fca.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fny> b(fjm $$0) {
      Set<fny> $$1 = EnumSet.noneOf(fny.class);
      if ($$0.R().c()) {
         $$1.add(fny.a);
      }

      if ($$0.S().c()) {
         $$1.add(fny.b);
      }

      return $$1;
   }

   private void a(fnx.d $$0, bon $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fnz::close);
      this.h.clear();
      this.g.forEach(fca::close);
      this.g.clear();
      Set<fny> $$2 = b(fji.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fnz $$3 = new fnz(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fji.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fjm $$0) {
      Set<fny> $$1 = b($$0);

      for (fnz $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fnx.a, fok.a>> a(List<auz> $$0, ali $$1) {
      List<Pair<fnx.a, fok.a>> $$2 = new ArrayList<>();

      for (auz $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fnx.c $$6 = (fnx.c)fnx.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fok.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fnx.a $$9 = new fnx.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fks a() {
      return new fks(this::b, false);
   }

   public fks b() {
      return new fks(this::b, true);
   }

   private fnz a(ali $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fnz b(ali $$0) {
      fnz $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fnz $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fnz::close);
      this.g.forEach(fca::close);
      this.f.close();
   }

   static record a(ali a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fnx.a a, fny.a b, Either<CompletableFuture<Optional<fca>>, ali> c) {

      public Optional<List<fca.a>> a(Function<ali, List<fca.a>> $$0) {
         return (Optional<List<fca.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fca.a($$0xx, this.b))), $$1 -> {
            List<fca.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fnx.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fca.a a(fca.a $$0) {
         return new fca.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fok.a> b) {
      public static final Codec<fnx.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fok.a.a.listOf().fieldOf("providers").forGetter(fnx.c::a)).apply($$0, fnx.c::new)
      );

      public List<fok.a> a() {
         return this.b;
      }
   }

   static record d(Map<ali, List<fca.a>> a, List<fca> b) {
   }

   static record e(ali a, List<fnx.b> b, Set<ali> c) implements ayp.a<ali> {

      public e(ali $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fnx.a $$0, fny.a $$1, fok.c $$2) {
         this.b.add(new fnx.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fnx.a $$0, fny.a $$1, CompletableFuture<Optional<fca>> $$2) {
         this.b.add(new fnx.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fca>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fca.a>> a(Function<ali, List<fca.a>> $$0) {
         List<fca.a> $$1 = new ArrayList<>();

         for (fnx.b $$2 : this.b) {
            Optional<List<fca.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ali> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ali> $$0) {
      }
   }
}

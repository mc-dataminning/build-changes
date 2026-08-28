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

public class frk implements auj, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akv a = akv.b("missing");
   private static final ako d = ako.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final frm f;
   private final List<fdu> g = new ArrayList<>();
   private final Map<akv, frm> h = new HashMap<>();
   private final hev i;
   @Nullable
   private volatile frm j;

   public frk(hev $$0) {
      this.i = $$0;
      this.f = af.a(new frm($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fdu.a d() {
      return new fdu.a(new fri(), frl.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bot.a()), $$3);
   }

   private CompletableFuture<frk.d> a(aup $$0, Executor $$1) {
      List<CompletableFuture<frk.e>> $$2 = new ArrayList<>();

      for (Entry<akv, List<aun>> $$3 : d.b($$0).entrySet()) {
         akv $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<frk.a, frx.a>> $$4x = a($$3.getValue(), $$4);
            frk.e $$5 = new frk.e($$4);

            for (Pair<frk.a, frx.a> $$6 : $$4x) {
               frk.a $$7 = (frk.a)$$6.getFirst();
               frl.a $$8 = ((frx.a)$$6.getSecond()).b();
               ((frx.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fdu>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fdu>>> $$2x = $$1x.stream().flatMap(frk.e::d).collect(af.b());
               fdu.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akv, List<fdu.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fdu> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new frk.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fdu>> a(frk.a $$0, frx.b $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akv, List<fdu.a>> a(List<frk.e> $$0) {
      Map<akv, List<fdu.a>> $$1 = new HashMap<>();
      aye<akv, frk.e> $$2 = new aye<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fdu.a> $$0, fdu.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fdu.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fdu.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<frl> b(flo $$0) {
      Set<frl> $$1 = EnumSet.noneOf(frl.class);
      if ($$0.S().c()) {
         $$1.add(frl.a);
      }

      if ($$0.T().c()) {
         $$1.add(frl.b);
      }

      return $$1;
   }

   private void a(frk.d $$0, bou $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(frm::close);
      this.h.clear();
      this.g.forEach(fdu::close);
      this.g.clear();
      Set<frl> $$2 = b(flk.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         frm $$3 = new frm(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(flk.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(flo $$0) {
      Set<frl> $$1 = b($$0);

      for (frm $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<frk.a, frx.a>> a(List<aun> $$0, akv $$1) {
      List<Pair<frk.a, frx.a>> $$2 = new ArrayList<>();

      for (aun $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            frk.c $$6 = (frk.c)frk.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<frx.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               frk.a $$9 = new frk.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fod a() {
      return new fod(this::b, false);
   }

   public fod b() {
      return new fod(this::b, true);
   }

   private frm a(akv $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private frm b(akv $$0) {
      frm $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         frm $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(frm::close);
      this.g.forEach(fdu::close);
      this.f.close();
   }

   static record a(akv a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(frk.a a, frl.a b, Either<CompletableFuture<Optional<fdu>>, akv> c) {

      public Optional<List<fdu.a>> a(Function<akv, List<fdu.a>> $$0) {
         return (Optional<List<fdu.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fdu.a($$0xx, this.b))), $$1 -> {
            List<fdu.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               frk.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fdu.a a(fdu.a $$0) {
         return new fdu.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<frx.a> b) {
      public static final Codec<frk.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frx.a.a.listOf().fieldOf("providers").forGetter(frk.c::a)).apply($$0, frk.c::new)
      );

      public List<frx.a> a() {
         return this.b;
      }
   }

   static record d(Map<akv, List<fdu.a>> a, List<fdu> b) {
   }

   static record e(akv a, List<frk.b> b, Set<akv> c) implements aye.a<akv> {

      public e(akv $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(frk.a $$0, frl.a $$1, frx.c $$2) {
         this.b.add(new frk.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(frk.a $$0, frl.a $$1, CompletableFuture<Optional<fdu>> $$2) {
         this.b.add(new frk.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fdu>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fdu.a>> a(Function<akv, List<fdu.a>> $$0) {
         List<fdu.a> $$1 = new ArrayList<>();

         for (frk.b $$2 : this.b) {
            Optional<List<fdu.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akv> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akv> $$0) {
      }
   }
}

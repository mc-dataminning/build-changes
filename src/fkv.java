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

public class fkv implements atx, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akq a = akq.b("missing");
   private static final akj d = akj.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fkx f;
   private final List<ezg> g = new ArrayList<>();
   private final Map<akq, fkx> h = new HashMap<>();
   private final gqg i;
   @Nullable
   private volatile fkx j;

   public fkv(gqg $$0) {
      this.i = $$0;
      this.f = ad.a(new fkx($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ezg.a d() {
      return new ezg.a(new fkt(), fkw.a.b);
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bne $$2, bne $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fkv.d> a(aud $$0, Executor $$1) {
      List<CompletableFuture<fkv.e>> $$2 = new ArrayList<>();

      for (Entry<akq, List<aub>> $$3 : d.b($$0).entrySet()) {
         akq $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fkv.a, fli.a>> $$4x = a($$3.getValue(), $$4);
            fkv.e $$5 = new fkv.e($$4);

            for (Pair<fkv.a, fli.a> $$6 : $$4x) {
               fkv.a $$7 = (fkv.a)$$6.getFirst();
               fkw.a $$8 = ((fli.a)$$6.getSecond()).b();
               ((fli.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ezg>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ad.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ezg>>> $$2x = $$1x.stream().flatMap(fkv.e::d).collect(ad.b());
               ezg.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ad.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akq, List<ezg.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ezg> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fkv.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ezg>> a(fkv.a $$0, fli.b $$1, aud $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akq, List<ezg.a>> a(List<fkv.e> $$0) {
      Map<akq, List<ezg.a>> $$1 = new HashMap<>();
      axr<akq, fkv.e> $$2 = new axr<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ezg.a> $$0, ezg.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ezg.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ezg.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fkw> b(fgm $$0) {
      Set<fkw> $$1 = EnumSet.noneOf(fkw.class);
      if ($$0.P().c()) {
         $$1.add(fkw.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fkw.b);
      }

      return $$1;
   }

   private void a(fkv.d $$0, bne $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fkx::close);
      this.h.clear();
      this.g.forEach(ezg::close);
      this.g.clear();
      Set<fkw> $$2 = b(fgi.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fkx $$3 = new fkx(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fgi.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fgm $$0) {
      Set<fkw> $$1 = b($$0);

      for (fkx $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fkv.a, fli.a>> a(List<aub> $$0, akq $$1) {
      List<Pair<fkv.a, fli.a>> $$2 = new ArrayList<>();

      for (aub $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fkv.c $$6 = (fkv.c)fkv.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fli.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fkv.a $$9 = new fkv.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fhr a() {
      return new fhr(this::b, false);
   }

   public fhr b() {
      return new fhr(this::b, true);
   }

   private fkx a(akq $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fkx b(akq $$0) {
      fkx $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fkx $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fkx::close);
      this.g.forEach(ezg::close);
      this.f.close();
   }

   static record a(akq a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fkv.a a, fkw.a b, Either<CompletableFuture<Optional<ezg>>, akq> c) {

      public Optional<List<ezg.a>> a(Function<akq, List<ezg.a>> $$0) {
         return (Optional<List<ezg.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ezg.a($$0xx, this.b))), $$1 -> {
            List<ezg.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fkv.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ezg.a a(ezg.a $$0) {
         return new ezg.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fli.a> b) {
      public static final Codec<fkv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fli.a.a.listOf().fieldOf("providers").forGetter(fkv.c::a)).apply($$0, fkv.c::new)
      );

      public List<fli.a> a() {
         return this.b;
      }
   }

   static record d(Map<akq, List<ezg.a>> a, List<ezg> b) {
   }

   static record e(akq a, List<fkv.b> b, Set<akq> c) implements axr.a<akq> {

      public e(akq $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fkv.a $$0, fkw.a $$1, fli.c $$2) {
         this.b.add(new fkv.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fkv.a $$0, fkw.a $$1, CompletableFuture<Optional<ezg>> $$2) {
         this.b.add(new fkv.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ezg>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ezg.a>> a(Function<akq, List<ezg.a>> $$0) {
         List<ezg.a> $$1 = new ArrayList<>();

         for (fkv.b $$2 : this.b) {
            Optional<List<ezg.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akq> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akq> $$0) {
      }
   }
}

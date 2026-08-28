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

public class fna implements aun, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alc a = alc.b("missing");
   private static final akv d = akv.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fnc f;
   private final List<fbd> g = new ArrayList<>();
   private final Map<alc, fnc> h = new HashMap<>();
   private final gxc i;
   @Nullable
   private volatile fnc j;

   public fna(gxc $$0) {
      this.i = $$0;
      this.f = ad.a(new fnc($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fbd.a d() {
      return new fbd.a(new fmy(), fnb.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aun.a $$0, aut $$1, bod $$2, bod $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fna.d> a(aut $$0, Executor $$1) {
      List<CompletableFuture<fna.e>> $$2 = new ArrayList<>();

      for (Entry<alc, List<aur>> $$3 : d.b($$0).entrySet()) {
         alc $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fna.a, fnn.a>> $$4x = a($$3.getValue(), $$4);
            fna.e $$5 = new fna.e($$4);

            for (Pair<fna.a, fnn.a> $$6 : $$4x) {
               fna.a $$7 = (fna.a)$$6.getFirst();
               fnb.a $$8 = ((fnn.a)$$6.getSecond()).b();
               ((fnn.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fbd>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ad.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fbd>>> $$2x = $$1x.stream().flatMap(fna.e::d).collect(ad.b());
               fbd.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ad.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alc, List<fbd.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fbd> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fna.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fbd>> a(fna.a $$0, fnn.b $$1, aut $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alc, List<fbd.a>> a(List<fna.e> $$0) {
      Map<alc, List<fbd.a>> $$1 = new HashMap<>();
      ayi<alc, fna.e> $$2 = new ayi<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fbd.a> $$0, fbd.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fbd.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fbd.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fnb> b(fip $$0) {
      Set<fnb> $$1 = EnumSet.noneOf(fnb.class);
      if ($$0.R().c()) {
         $$1.add(fnb.a);
      }

      if ($$0.S().c()) {
         $$1.add(fnb.b);
      }

      return $$1;
   }

   private void a(fna.d $$0, bod $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fnc::close);
      this.h.clear();
      this.g.forEach(fbd::close);
      this.g.clear();
      Set<fnb> $$2 = b(fil.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fnc $$3 = new fnc(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fil.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fip $$0) {
      Set<fnb> $$1 = b($$0);

      for (fnc $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fna.a, fnn.a>> a(List<aur> $$0, alc $$1) {
      List<Pair<fna.a, fnn.a>> $$2 = new ArrayList<>();

      for (aur $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fna.c $$6 = (fna.c)fna.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fnn.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fna.a $$9 = new fna.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fjv a() {
      return new fjv(this::b, false);
   }

   public fjv b() {
      return new fjv(this::b, true);
   }

   private fnc a(alc $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fnc b(alc $$0) {
      fnc $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fnc $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fnc::close);
      this.g.forEach(fbd::close);
      this.f.close();
   }

   static record a(alc a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fna.a a, fnb.a b, Either<CompletableFuture<Optional<fbd>>, alc> c) {

      public Optional<List<fbd.a>> a(Function<alc, List<fbd.a>> $$0) {
         return (Optional<List<fbd.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fbd.a($$0xx, this.b))), $$1 -> {
            List<fbd.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fna.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fbd.a a(fbd.a $$0) {
         return new fbd.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fnn.a> b) {
      public static final Codec<fna.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnn.a.a.listOf().fieldOf("providers").forGetter(fna.c::a)).apply($$0, fna.c::new)
      );

      public List<fnn.a> a() {
         return this.b;
      }
   }

   static record d(Map<alc, List<fbd.a>> a, List<fbd> b) {
   }

   static record e(alc a, List<fna.b> b, Set<alc> c) implements ayi.a<alc> {

      public e(alc $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fna.a $$0, fnb.a $$1, fnn.c $$2) {
         this.b.add(new fna.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fna.a $$0, fnb.a $$1, CompletableFuture<Optional<fbd>> $$2) {
         this.b.add(new fna.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fbd>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fbd.a>> a(Function<alc, List<fbd.a>> $$0) {
         List<fbd.a> $$1 = new ArrayList<>();

         for (fna.b $$2 : this.b) {
            Optional<List<fbd.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alc> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alc> $$0) {
      }
   }
}

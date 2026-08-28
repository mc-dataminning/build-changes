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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjo implements auf, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alb a = new alb("minecraft", "missing");
   private static final aku d = aku.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fjq f;
   private final List<exw> g = new ArrayList<>();
   private final Map<alb, fjq> h = new HashMap<>();
   private final gov i;
   @Nullable
   private volatile fjq j;

   public fjo(gov $$0) {
      this.i = $$0;
      this.f = ac.a(new fjq($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static exw.a d() {
      return new exw.a(new fjm(), fjp.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fjo.d> a(aul $$0, Executor $$1) {
      List<CompletableFuture<fjo.e>> $$2 = new ArrayList<>();

      for (Entry<alb, List<auj>> $$3 : d.b($$0).entrySet()) {
         alb $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fjo.a, fkb.a>> $$4x = a($$3.getValue(), $$4);
            fjo.e $$5 = new fjo.e($$4);

            for (Pair<fjo.a, fkb.a> $$6 : $$4x) {
               fjo.a $$7 = (fjo.a)$$6.getFirst();
               fjp.a $$8 = ((fkb.a)$$6.getSecond()).b();
               ((fkb.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<exw>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<exw>>> $$2x = $$1x.stream().flatMap(fjo.e::d).collect(Collectors.toCollection(ArrayList::new));
               exw.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alb, List<exw.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<exw> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fjo.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<exw>> a(fjo.a $$0, fkb.b $$1, aul $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alb, List<exw.a>> a(List<fjo.e> $$0) {
      Map<alb, List<exw.a>> $$1 = new HashMap<>();
      axz<alb, fjo.e> $$2 = new axz<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<exw.a> $$0, exw.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (exw.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (exw.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fjp> b(ffe $$0) {
      Set<fjp> $$1 = EnumSet.noneOf(fjp.class);
      if ($$0.P().c()) {
         $$1.add(fjp.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fjp.b);
      }

      return $$1;
   }

   private void a(fjo.d $$0, bnd $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fjq::close);
      this.h.clear();
      this.g.forEach(exw::close);
      this.g.clear();
      Set<fjp> $$2 = b(ffa.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fjq $$3 = new fjq(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ffa.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(ffe $$0) {
      Set<fjp> $$1 = b($$0);

      for (fjq $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fjo.a, fkb.a>> a(List<auj> $$0, alb $$1) {
      List<Pair<fjo.a, fkb.a>> $$2 = new ArrayList<>();

      for (auj $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fjo.c $$6 = (fjo.c)fjo.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fkb.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fjo.a $$9 = new fjo.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fgk a() {
      return new fgk(this::b, false);
   }

   public fgk b() {
      return new fgk(this::b, true);
   }

   private fjq a(alb $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fjq b(alb $$0) {
      fjq $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fjq $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fjq::close);
      this.g.forEach(exw::close);
      this.f.close();
   }

   static record a(alb a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fjo.a a, fjp.a b, Either<CompletableFuture<Optional<exw>>, alb> c) {

      public Optional<List<exw.a>> a(Function<alb, List<exw.a>> $$0) {
         return (Optional<List<exw.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new exw.a($$0xx, this.b))), $$1 -> {
            List<exw.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fjo.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private exw.a a(exw.a $$0) {
         return new exw.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fkb.a> b) {
      public static final Codec<fjo.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkb.a.a.listOf().fieldOf("providers").forGetter(fjo.c::a)).apply($$0, fjo.c::new)
      );

      public List<fkb.a> a() {
         return this.b;
      }
   }

   static record d(Map<alb, List<exw.a>> a, List<exw> b) {
   }

   static record e(alb a, List<fjo.b> b, Set<alb> c) implements axz.a<alb> {

      public e(alb $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fjo.a $$0, fjp.a $$1, fkb.c $$2) {
         this.b.add(new fjo.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fjo.a $$0, fjp.a $$1, CompletableFuture<Optional<exw>> $$2) {
         this.b.add(new fjo.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<exw>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<exw.a>> a(Function<alb, List<exw.a>> $$0) {
         List<exw.a> $$1 = new ArrayList<>();

         for (fjo.b $$2 : this.b) {
            Optional<List<exw.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alb> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alb> $$0) {
      }
   }
}

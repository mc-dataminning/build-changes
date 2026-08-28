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

public class flb implements aty, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akr a = akr.b("missing");
   private static final akk d = akk.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fld f;
   private final List<ezm> g = new ArrayList<>();
   private final Map<akr, fld> h = new HashMap<>();
   private final gqm i;
   @Nullable
   private volatile fld j;

   public flb(gqm $$0) {
      this.i = $$0;
      this.f = ad.a(new fld($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ezm.a d() {
      return new ezm.a(new fkz(), flc.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<flb.d> a(aue $$0, Executor $$1) {
      List<CompletableFuture<flb.e>> $$2 = new ArrayList<>();

      for (Entry<akr, List<auc>> $$3 : d.b($$0).entrySet()) {
         akr $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<flb.a, flo.a>> $$4x = a($$3.getValue(), $$4);
            flb.e $$5 = new flb.e($$4);

            for (Pair<flb.a, flo.a> $$6 : $$4x) {
               flb.a $$7 = (flb.a)$$6.getFirst();
               flc.a $$8 = ((flo.a)$$6.getSecond()).b();
               ((flo.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ezm>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ad.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ezm>>> $$2x = $$1x.stream().flatMap(flb.e::d).collect(ad.b());
               ezm.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ad.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akr, List<ezm.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ezm> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new flb.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ezm>> a(flb.a $$0, flo.b $$1, aue $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akr, List<ezm.a>> a(List<flb.e> $$0) {
      Map<akr, List<ezm.a>> $$1 = new HashMap<>();
      axs<akr, flb.e> $$2 = new axs<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ezm.a> $$0, ezm.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ezm.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ezm.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<flc> b(fgs $$0) {
      Set<flc> $$1 = EnumSet.noneOf(flc.class);
      if ($$0.P().c()) {
         $$1.add(flc.a);
      }

      if ($$0.Q().c()) {
         $$1.add(flc.b);
      }

      return $$1;
   }

   private void a(flb.d $$0, bnf $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fld::close);
      this.h.clear();
      this.g.forEach(ezm::close);
      this.g.clear();
      Set<flc> $$2 = b(fgo.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fld $$3 = new fld(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fgo.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fgs $$0) {
      Set<flc> $$1 = b($$0);

      for (fld $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<flb.a, flo.a>> a(List<auc> $$0, akr $$1) {
      List<Pair<flb.a, flo.a>> $$2 = new ArrayList<>();

      for (auc $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            flb.c $$6 = (flb.c)flb.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<flo.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               flb.a $$9 = new flb.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fhx a() {
      return new fhx(this::b, false);
   }

   public fhx b() {
      return new fhx(this::b, true);
   }

   private fld a(akr $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fld b(akr $$0) {
      fld $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fld $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fld::close);
      this.g.forEach(ezm::close);
      this.f.close();
   }

   static record a(akr a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(flb.a a, flc.a b, Either<CompletableFuture<Optional<ezm>>, akr> c) {

      public Optional<List<ezm.a>> a(Function<akr, List<ezm.a>> $$0) {
         return (Optional<List<ezm.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ezm.a($$0xx, this.b))), $$1 -> {
            List<ezm.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               flb.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ezm.a a(ezm.a $$0) {
         return new ezm.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<flo.a> b) {
      public static final Codec<flb.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(flo.a.a.listOf().fieldOf("providers").forGetter(flb.c::a)).apply($$0, flb.c::new)
      );

      public List<flo.a> a() {
         return this.b;
      }
   }

   static record d(Map<akr, List<ezm.a>> a, List<ezm> b) {
   }

   static record e(akr a, List<flb.b> b, Set<akr> c) implements axs.a<akr> {

      public e(akr $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(flb.a $$0, flc.a $$1, flo.c $$2) {
         this.b.add(new flb.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(flb.a $$0, flc.a $$1, CompletableFuture<Optional<ezm>> $$2) {
         this.b.add(new flb.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ezm>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ezm.a>> a(Function<akr, List<ezm.a>> $$0) {
         List<ezm.a> $$1 = new ArrayList<>();

         for (flb.b $$2 : this.b) {
            Optional<List<ezm.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akr> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akr> $$0) {
      }
   }
}

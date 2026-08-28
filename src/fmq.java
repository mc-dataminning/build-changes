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

public class fmq implements aum, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alb a = alb.b("missing");
   private static final aku d = aku.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fms f;
   private final List<fao> g = new ArrayList<>();
   private final Map<alb, fms> h = new HashMap<>();
   private final gwl i;
   @Nullable
   private volatile fms j;

   public fmq(gwl $$0) {
      this.i = $$0;
      this.f = ad.a(new fms($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fao.a d() {
      return new fao.a(new fmo(), fmr.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aum.a $$0, aus $$1, bny $$2, bny $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fmq.d> a(aus $$0, Executor $$1) {
      List<CompletableFuture<fmq.e>> $$2 = new ArrayList<>();

      for (Entry<alb, List<auq>> $$3 : d.b($$0).entrySet()) {
         alb $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fmq.a, fnd.a>> $$4x = a($$3.getValue(), $$4);
            fmq.e $$5 = new fmq.e($$4);

            for (Pair<fmq.a, fnd.a> $$6 : $$4x) {
               fmq.a $$7 = (fmq.a)$$6.getFirst();
               fmr.a $$8 = ((fnd.a)$$6.getSecond()).b();
               ((fnd.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fao>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ad.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fao>>> $$2x = $$1x.stream().flatMap(fmq.e::d).collect(ad.b());
               fao.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ad.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alb, List<fao.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fao> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fmq.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fao>> a(fmq.a $$0, fnd.b $$1, aus $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alb, List<fao.a>> a(List<fmq.e> $$0) {
      Map<alb, List<fao.a>> $$1 = new HashMap<>();
      ayh<alb, fmq.e> $$2 = new ayh<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fao.a> $$0, fao.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fao.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fao.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fmr> b(fif $$0) {
      Set<fmr> $$1 = EnumSet.noneOf(fmr.class);
      if ($$0.R().c()) {
         $$1.add(fmr.a);
      }

      if ($$0.S().c()) {
         $$1.add(fmr.b);
      }

      return $$1;
   }

   private void a(fmq.d $$0, bny $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fms::close);
      this.h.clear();
      this.g.forEach(fao::close);
      this.g.clear();
      Set<fmr> $$2 = b(fib.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fms $$3 = new fms(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fib.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fif $$0) {
      Set<fmr> $$1 = b($$0);

      for (fms $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fmq.a, fnd.a>> a(List<auq> $$0, alb $$1) {
      List<Pair<fmq.a, fnd.a>> $$2 = new ArrayList<>();

      for (auq $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fmq.c $$6 = (fmq.c)fmq.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fnd.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fmq.a $$9 = new fmq.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fjl a() {
      return new fjl(this::b, false);
   }

   public fjl b() {
      return new fjl(this::b, true);
   }

   private fms a(alb $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fms b(alb $$0) {
      fms $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fms $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fms::close);
      this.g.forEach(fao::close);
      this.f.close();
   }

   static record a(alb a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fmq.a a, fmr.a b, Either<CompletableFuture<Optional<fao>>, alb> c) {

      public Optional<List<fao.a>> a(Function<alb, List<fao.a>> $$0) {
         return (Optional<List<fao.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fao.a($$0xx, this.b))), $$1 -> {
            List<fao.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fmq.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fao.a a(fao.a $$0) {
         return new fao.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fnd.a> b) {
      public static final Codec<fmq.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnd.a.a.listOf().fieldOf("providers").forGetter(fmq.c::a)).apply($$0, fmq.c::new)
      );

      public List<fnd.a> a() {
         return this.b;
      }
   }

   static record d(Map<alb, List<fao.a>> a, List<fao> b) {
   }

   static record e(alb a, List<fmq.b> b, Set<alb> c) implements ayh.a<alb> {

      public e(alb $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fmq.a $$0, fmr.a $$1, fnd.c $$2) {
         this.b.add(new fmq.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fmq.a $$0, fmr.a $$1, CompletableFuture<Optional<fao>> $$2) {
         this.b.add(new fmq.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fao>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fao.a>> a(Function<alb, List<fao.a>> $$0) {
         List<fao.a> $$1 = new ArrayList<>();

         for (fmq.b $$2 : this.b) {
            Optional<List<fao.a>> $$3 = $$2.a($$0);
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

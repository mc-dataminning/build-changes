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

public class fqp implements avp, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alz a = alz.b("missing");
   private static final als d = als.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fqr f;
   private final List<fek> g = new ArrayList<>();
   private final Map<alz, fqr> h = new HashMap<>();
   private final hbf i;
   @Nullable
   private volatile fqr j;

   public fqp(hbf $$0) {
      this.i = $$0;
      this.f = ae.a(new fqr($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fek.a d() {
      return new fek.a(new fqn(), fqq.a.b);
   }

   @Override
   public CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpn.a()), $$3);
   }

   private CompletableFuture<fqp.d> a(avv $$0, Executor $$1) {
      List<CompletableFuture<fqp.e>> $$2 = new ArrayList<>();

      for (Entry<alz, List<avt>> $$3 : d.b($$0).entrySet()) {
         alz $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fqp.a, frc.a>> $$4x = a($$3.getValue(), $$4);
            fqp.e $$5 = new fqp.e($$4);

            for (Pair<fqp.a, frc.a> $$6 : $$4x) {
               fqp.a $$7 = (fqp.a)$$6.getFirst();
               fqq.a $$8 = ((frc.a)$$6.getSecond()).b();
               ((frc.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fek>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ae.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fek>>> $$2x = $$1x.stream().flatMap(fqp.e::d).collect(ae.b());
               fek.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ae.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alz, List<fek.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fek> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fqp.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fek>> a(fqp.a $$0, frc.b $$1, avv $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alz, List<fek.a>> a(List<fqp.e> $$0) {
      Map<alz, List<fek.a>> $$1 = new HashMap<>();
      azj<alz, fqp.e> $$2 = new azj<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fek.a> $$0, fek.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fek.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fek.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fqq> b(fmd $$0) {
      Set<fqq> $$1 = EnumSet.noneOf(fqq.class);
      if ($$0.S().c()) {
         $$1.add(fqq.a);
      }

      if ($$0.T().c()) {
         $$1.add(fqq.b);
      }

      return $$1;
   }

   private void a(fqp.d $$0, bpo $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fqr::close);
      this.h.clear();
      this.g.forEach(fek::close);
      this.g.clear();
      Set<fqq> $$2 = b(flz.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fqr $$3 = new fqr(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(flz.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fmd $$0) {
      Set<fqq> $$1 = b($$0);

      for (fqr $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fqp.a, frc.a>> a(List<avt> $$0, alz $$1) {
      List<Pair<fqp.a, frc.a>> $$2 = new ArrayList<>();

      for (avt $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fqp.c $$6 = (fqp.c)fqp.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<frc.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fqp.a $$9 = new fqp.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fnj a() {
      return new fnj(this::b, false);
   }

   public fnj b() {
      return new fnj(this::b, true);
   }

   private fqr a(alz $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fqr b(alz $$0) {
      fqr $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fqr $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fqr::close);
      this.g.forEach(fek::close);
      this.f.close();
   }

   static record a(alz a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fqp.a a, fqq.a b, Either<CompletableFuture<Optional<fek>>, alz> c) {

      public Optional<List<fek.a>> a(Function<alz, List<fek.a>> $$0) {
         return (Optional<List<fek.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fek.a($$0xx, this.b))), $$1 -> {
            List<fek.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fqp.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fek.a a(fek.a $$0) {
         return new fek.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<frc.a> b) {
      public static final Codec<fqp.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frc.a.a.listOf().fieldOf("providers").forGetter(fqp.c::a)).apply($$0, fqp.c::new)
      );

      public List<frc.a> a() {
         return this.b;
      }
   }

   static record d(Map<alz, List<fek.a>> a, List<fek> b) {
   }

   static record e(alz a, List<fqp.b> b, Set<alz> c) implements azj.a<alz> {

      public e(alz $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fqp.a $$0, fqq.a $$1, frc.c $$2) {
         this.b.add(new fqp.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fqp.a $$0, fqq.a $$1, CompletableFuture<Optional<fek>> $$2) {
         this.b.add(new fqp.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fek>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fek.a>> a(Function<alz, List<fek.a>> $$0) {
         List<fek.a> $$1 = new ArrayList<>();

         for (fqp.b $$2 : this.b) {
            Optional<List<fek.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alz> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alz> $$0) {
      }
   }
}

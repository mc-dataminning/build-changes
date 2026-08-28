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

public class fqv implements avp, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alz a = alz.b("missing");
   private static final als d = als.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fqx f;
   private final List<feq> g = new ArrayList<>();
   private final Map<alz, fqx> h = new HashMap<>();
   private final hbl i;
   @Nullable
   private volatile fqx j;

   public fqv(hbl $$0) {
      this.i = $$0;
      this.f = ae.a(new fqx($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static feq.a d() {
      return new feq.a(new fqt(), fqw.a.b);
   }

   @Override
   public CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpr.a()), $$3);
   }

   private CompletableFuture<fqv.d> a(avv $$0, Executor $$1) {
      List<CompletableFuture<fqv.e>> $$2 = new ArrayList<>();

      for (Entry<alz, List<avt>> $$3 : d.b($$0).entrySet()) {
         alz $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fqv.a, fri.a>> $$4x = a($$3.getValue(), $$4);
            fqv.e $$5 = new fqv.e($$4);

            for (Pair<fqv.a, fri.a> $$6 : $$4x) {
               fqv.a $$7 = (fqv.a)$$6.getFirst();
               fqw.a $$8 = ((fri.a)$$6.getSecond()).b();
               ((fri.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<feq>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ae.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<feq>>> $$2x = $$1x.stream().flatMap(fqv.e::d).collect(ae.b());
               feq.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ae.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alz, List<feq.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<feq> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fqv.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<feq>> a(fqv.a $$0, fri.b $$1, avv $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alz, List<feq.a>> a(List<fqv.e> $$0) {
      Map<alz, List<feq.a>> $$1 = new HashMap<>();
      azj<alz, fqv.e> $$2 = new azj<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<feq.a> $$0, feq.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (feq.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (feq.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fqw> b(fmj $$0) {
      Set<fqw> $$1 = EnumSet.noneOf(fqw.class);
      if ($$0.S().c()) {
         $$1.add(fqw.a);
      }

      if ($$0.T().c()) {
         $$1.add(fqw.b);
      }

      return $$1;
   }

   private void a(fqv.d $$0, bps $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fqx::close);
      this.h.clear();
      this.g.forEach(feq::close);
      this.g.clear();
      Set<fqw> $$2 = b(fmf.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fqx $$3 = new fqx(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fmf.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fmj $$0) {
      Set<fqw> $$1 = b($$0);

      for (fqx $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fqv.a, fri.a>> a(List<avt> $$0, alz $$1) {
      List<Pair<fqv.a, fri.a>> $$2 = new ArrayList<>();

      for (avt $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fqv.c $$6 = (fqv.c)fqv.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fri.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fqv.a $$9 = new fqv.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fnp a() {
      return new fnp(this::b, false);
   }

   public fnp b() {
      return new fnp(this::b, true);
   }

   private fqx a(alz $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fqx b(alz $$0) {
      fqx $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fqx $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fqx::close);
      this.g.forEach(feq::close);
      this.f.close();
   }

   static record a(alz a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fqv.a a, fqw.a b, Either<CompletableFuture<Optional<feq>>, alz> c) {

      public Optional<List<feq.a>> a(Function<alz, List<feq.a>> $$0) {
         return (Optional<List<feq.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new feq.a($$0xx, this.b))), $$1 -> {
            List<feq.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fqv.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private feq.a a(feq.a $$0) {
         return new feq.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fri.a> b) {
      public static final Codec<fqv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fri.a.a.listOf().fieldOf("providers").forGetter(fqv.c::a)).apply($$0, fqv.c::new)
      );

      public List<fri.a> a() {
         return this.b;
      }
   }

   static record d(Map<alz, List<feq.a>> a, List<feq> b) {
   }

   static record e(alz a, List<fqv.b> b, Set<alz> c) implements azj.a<alz> {

      public e(alz $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fqv.a $$0, fqw.a $$1, fri.c $$2) {
         this.b.add(new fqv.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fqv.a $$0, fqw.a $$1, CompletableFuture<Optional<feq>> $$2) {
         this.b.add(new fqv.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<feq>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<feq.a>> a(Function<alz, List<feq.a>> $$0) {
         List<feq.a> $$1 = new ArrayList<>();

         for (fqv.b $$2 : this.b) {
            Optional<List<feq.a>> $$3 = $$2.a($$0);
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

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

public class fht implements atl, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akh a = new akh("minecraft", "missing");
   private static final aka d = aka.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fhv f;
   private final List<ewa> g = new ArrayList<>();
   private final Map<akh, fhv> h = new HashMap<>();
   private final gmz i;
   @Nullable
   private volatile fhv j;

   public fht(gmz $$0) {
      this.i = $$0;
      this.f = ac.a(new fhv($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ewa.a d() {
      return new ewa.a(new fhr(), fhu.a.b);
   }

   @Override
   public CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fht.d> a(atr $$0, Executor $$1) {
      List<CompletableFuture<fht.e>> $$2 = new ArrayList<>();

      for (Entry<akh, List<atp>> $$3 : d.b($$0).entrySet()) {
         akh $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fht.a, fig.a>> $$4x = a($$3.getValue(), $$4);
            fht.e $$5 = new fht.e($$4);

            for (Pair<fht.a, fig.a> $$6 : $$4x) {
               fht.a $$7 = (fht.a)$$6.getFirst();
               fhu.a $$8 = ((fig.a)$$6.getSecond()).b();
               ((fig.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ewa>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ewa>>> $$2x = $$1x.stream().flatMap(fht.e::d).collect(Collectors.toCollection(ArrayList::new));
               ewa.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akh, List<ewa.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ewa> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fht.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ewa>> a(fht.a $$0, fig.b $$1, atr $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akh, List<ewa.a>> a(List<fht.e> $$0) {
      Map<akh, List<ewa.a>> $$1 = new HashMap<>();
      axe<akh, fht.e> $$2 = new axe<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ewa.a> $$0, ewa.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ewa.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ewa.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fhu> b(fdi $$0) {
      Set<fhu> $$1 = EnumSet.noneOf(fhu.class);
      if ($$0.P().c()) {
         $$1.add(fhu.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fhu.b);
      }

      return $$1;
   }

   private void a(fht.d $$0, bma $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fhv::close);
      this.h.clear();
      this.g.forEach(ewa::close);
      this.g.clear();
      Set<fhu> $$2 = b(fde.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fhv $$3 = new fhv(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fde.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fdi $$0) {
      Set<fhu> $$1 = b($$0);

      for (fhv $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fht.a, fig.a>> a(List<atp> $$0, akh $$1) {
      List<Pair<fht.a, fig.a>> $$2 = new ArrayList<>();

      for (atp $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fht.c $$6 = ac.a(fht.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fig.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fht.a $$9 = new fht.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fep a() {
      return new fep(this::b, false);
   }

   public fep b() {
      return new fep(this::b, true);
   }

   private fhv a(akh $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fhv b(akh $$0) {
      fhv $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fhv $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fhv::close);
      this.g.forEach(ewa::close);
      this.f.close();
   }

   static record a(akh a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fht.a a, fhu.a b, Either<CompletableFuture<Optional<ewa>>, akh> c) {

      public Optional<List<ewa.a>> a(Function<akh, List<ewa.a>> $$0) {
         return (Optional<List<ewa.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ewa.a($$0xx, this.b))), $$1 -> {
            List<ewa.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fht.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ewa.a a(ewa.a $$0) {
         return new ewa.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fig.a> b) {
      public static final Codec<fht.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fig.a.a.listOf().fieldOf("providers").forGetter(fht.c::a)).apply($$0, fht.c::new)
      );

      public List<fig.a> a() {
         return this.b;
      }
   }

   static record d(Map<akh, List<ewa.a>> a, List<ewa> b) {
   }

   static record e(akh a, List<fht.b> b, Set<akh> c) implements axe.a<akh> {

      public e(akh $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fht.a $$0, fhu.a $$1, fig.c $$2) {
         this.b.add(new fht.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fht.a $$0, fhu.a $$1, CompletableFuture<Optional<ewa>> $$2) {
         this.b.add(new fht.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ewa>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ewa.a>> a(Function<akh, List<ewa.a>> $$0) {
         List<ewa.a> $$1 = new ArrayList<>();

         for (fht.b $$2 : this.b) {
            Optional<List<ewa.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akh> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akh> $$0) {
      }
   }
}

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

public class fhj implements ati, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akf a = new akf("minecraft", "missing");
   private static final ajy d = ajy.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fhl f;
   private final List<evq> g = new ArrayList<>();
   private final Map<akf, fhl> h = new HashMap<>();
   private final gmp i;
   @Nullable
   private volatile fhl j;

   public fhj(gmp $$0) {
      this.i = $$0;
      this.f = ac.a(new fhl($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static evq.a d() {
      return new evq.a(new fhh(), fhk.a.b);
   }

   @Override
   public CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fhj.d> a(ato $$0, Executor $$1) {
      List<CompletableFuture<fhj.e>> $$2 = new ArrayList<>();

      for (Entry<akf, List<atm>> $$3 : d.b($$0).entrySet()) {
         akf $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fhj.a, fhw.a>> $$4x = a($$3.getValue(), $$4);
            fhj.e $$5 = new fhj.e($$4);

            for (Pair<fhj.a, fhw.a> $$6 : $$4x) {
               fhj.a $$7 = (fhj.a)$$6.getFirst();
               fhk.a $$8 = ((fhw.a)$$6.getSecond()).b();
               ((fhw.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<evq>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<evq>>> $$2x = $$1x.stream().flatMap(fhj.e::d).collect(Collectors.toCollection(ArrayList::new));
               evq.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akf, List<evq.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<evq> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fhj.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<evq>> a(fhj.a $$0, fhw.b $$1, ato $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akf, List<evq.a>> a(List<fhj.e> $$0) {
      Map<akf, List<evq.a>> $$1 = new HashMap<>();
      axb<akf, fhj.e> $$2 = new axb<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<evq.a> $$0, evq.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (evq.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (evq.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fhk> b(fcy $$0) {
      Set<fhk> $$1 = EnumSet.noneOf(fhk.class);
      if ($$0.P().c()) {
         $$1.add(fhk.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fhk.b);
      }

      return $$1;
   }

   private void a(fhj.d $$0, ble $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fhl::close);
      this.h.clear();
      this.g.forEach(evq::close);
      this.g.clear();
      Set<fhk> $$2 = b(fcu.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fhl $$3 = new fhl(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fcu.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fcy $$0) {
      Set<fhk> $$1 = b($$0);

      for (fhl $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fhj.a, fhw.a>> a(List<atm> $$0, akf $$1) {
      List<Pair<fhj.a, fhw.a>> $$2 = new ArrayList<>();

      for (atm $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fhj.c $$6 = ac.a(fhj.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fhw.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fhj.a $$9 = new fhj.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fef a() {
      return new fef(this::b, false);
   }

   public fef b() {
      return new fef(this::b, true);
   }

   private fhl a(akf $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fhl b(akf $$0) {
      fhl $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fhl $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fhl::close);
      this.g.forEach(evq::close);
      this.f.close();
   }

   static record a(akf a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fhj.a a, fhk.a b, Either<CompletableFuture<Optional<evq>>, akf> c) {

      public Optional<List<evq.a>> a(Function<akf, List<evq.a>> $$0) {
         return (Optional<List<evq.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new evq.a($$0xx, this.b))), $$1 -> {
            List<evq.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fhj.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private evq.a a(evq.a $$0) {
         return new evq.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fhw.a> b) {
      public static final Codec<fhj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fhw.a.a.listOf().fieldOf("providers").forGetter(fhj.c::a)).apply($$0, fhj.c::new)
      );

      public List<fhw.a> a() {
         return this.b;
      }
   }

   static record d(Map<akf, List<evq.a>> a, List<evq> b) {
   }

   static record e(akf a, List<fhj.b> b, Set<akf> c) implements axb.a<akf> {

      public e(akf $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fhj.a $$0, fhk.a $$1, fhw.c $$2) {
         this.b.add(new fhj.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fhj.a $$0, fhk.a $$1, CompletableFuture<Optional<evq>> $$2) {
         this.b.add(new fhj.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<evq>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<evq.a>> a(Function<akf, List<evq.a>> $$0) {
         List<evq.a> $$1 = new ArrayList<>();

         for (fhj.b $$2 : this.b) {
            Optional<List<evq.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akf> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akf> $$0) {
      }
   }
}

import com.google.common.collect.ImmutableMap;
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
import org.slf4j.Logger;

public class fcd implements arv, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aiy a = new aiy("minecraft", "missing");
   private static final air d = air.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fce f;
   private final List<eqk> g = new ArrayList<>();
   private final Map<aiy, fce> h = new HashMap<>();
   private final ghc i;
   private Map<aiy, aiy> j = ImmutableMap.of();

   public fcd(ghc $$0) {
      this.i = $$0;
      this.f = ac.a(new fce($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eqk[]{new fcb()})));
   }

   @Override
   public CompletableFuture<Void> a(arv.a $$0, asb $$1, bin $$2, bin $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fcd.d> a(asb $$0, Executor $$1) {
      List<CompletableFuture<fcd.e>> $$2 = new ArrayList<>();

      for (Entry<aiy, List<arz>> $$3 : d.b($$0).entrySet()) {
         aiy $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fcd.a, fcp>> $$4x = a($$3.getValue(), $$4);
            fcd.e $$5 = new fcd.e($$4);

            for (Pair<fcd.a, fcp> $$6 : $$4x) {
               fcd.a $$7 = (fcd.a)$$6.getFirst();
               ((fcp)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eqk>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eqk>>> $$2x = $$1x.stream().flatMap(fcd.e::d).collect(Collectors.toCollection(ArrayList::new));
               eqk $$3x = new fcb();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aiy, List<eqk>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eqk> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fcd.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eqk>> a(fcd.a $$0, fcp.a $$1, asb $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aiy, List<eqk>> a(List<fcd.e> $$0) {
      Map<aiy, List<eqk>> $$1 = new HashMap<>();
      avn<aiy, fcd.e> $$2 = new avn<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eqk> $$0, eqk $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eqk $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eqk $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(fcd.d $$0, bin $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fce::close);
      this.h.clear();
      this.g.forEach(eqk::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         fce $$2 = new fce(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(exo.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<fcd.a, fcp>> a(List<arz> $$0, aiy $$1) {
      List<Pair<fcd.a, fcp>> $$2 = new ArrayList<>();

      for (arz $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fcd.c $$6 = ac.a(fcd.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fcp> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fcd.a $$9 = new fcd.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<aiy, aiy> $$0) {
      this.j = $$0;
   }

   private aiy a(aiy $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public eyz a() {
      return new eyz($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public eyz b() {
      return new eyz($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(fce::close);
      this.g.forEach(eqk::close);
      this.f.close();
   }

   static record a(aiy a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fcd.a a, Either<CompletableFuture<Optional<eqk>>, aiy> b) {

      public Optional<List<eqk>> a(Function<aiy, List<eqk>> $$0) {
         return (Optional<List<eqk>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eqk> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fcd.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<fcp> b) {
      public static final Codec<fcd.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fcp.b.listOf().fieldOf("providers").forGetter(fcd.c::a)).apply($$0, fcd.c::new)
      );

      public List<fcp> a() {
         return this.b;
      }
   }

   static record d(Map<aiy, List<eqk>> a, List<eqk> b) {
   }

   static record e(aiy a, List<fcd.b> b, Set<aiy> c) implements avn.a<aiy> {

      public e(aiy $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fcd.a $$0, fcp.b $$1) {
         this.b.add(new fcd.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(fcd.a $$0, CompletableFuture<Optional<eqk>> $$1) {
         this.b.add(new fcd.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eqk>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eqk>> a(Function<aiy, List<eqk>> $$0) {
         List<eqk> $$1 = new ArrayList<>();

         for (fcd.b $$2 : this.b) {
            Optional<List<eqk>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aiy> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aiy> $$0) {
      }
   }
}

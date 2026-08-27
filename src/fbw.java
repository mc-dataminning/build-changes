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

public class fbw implements aru, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aiy a = new aiy("minecraft", "missing");
   private static final air d = air.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fbx f;
   private final List<eqd> g = new ArrayList<>();
   private final Map<aiy, fbx> h = new HashMap<>();
   private final ggv i;
   private Map<aiy, aiy> j = ImmutableMap.of();

   public fbw(ggv $$0) {
      this.i = $$0;
      this.f = ac.a(new fbx($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eqd[]{new fbu()})));
   }

   @Override
   public CompletableFuture<Void> a(aru.a $$0, asa $$1, bil $$2, bil $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fbw.d> a(asa $$0, Executor $$1) {
      List<CompletableFuture<fbw.e>> $$2 = new ArrayList<>();

      for (Entry<aiy, List<ary>> $$3 : d.b($$0).entrySet()) {
         aiy $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fbw.a, fci>> $$4x = a($$3.getValue(), $$4);
            fbw.e $$5 = new fbw.e($$4);

            for (Pair<fbw.a, fci> $$6 : $$4x) {
               fbw.a $$7 = (fbw.a)$$6.getFirst();
               ((fci)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eqd>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eqd>>> $$2x = $$1x.stream().flatMap(fbw.e::d).collect(Collectors.toCollection(ArrayList::new));
               eqd $$3x = new fbu();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aiy, List<eqd>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eqd> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fbw.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eqd>> a(fbw.a $$0, fci.a $$1, asa $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aiy, List<eqd>> a(List<fbw.e> $$0) {
      Map<aiy, List<eqd>> $$1 = new HashMap<>();
      avm<aiy, fbw.e> $$2 = new avm<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eqd> $$0, eqd $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eqd $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eqd $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(fbw.d $$0, bil $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fbx::close);
      this.h.clear();
      this.g.forEach(eqd::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         fbx $$2 = new fbx(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(exh.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<fbw.a, fci>> a(List<ary> $$0, aiy $$1) {
      List<Pair<fbw.a, fci>> $$2 = new ArrayList<>();

      for (ary $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fbw.c $$6 = ac.a(fbw.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fci> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fbw.a $$9 = new fbw.a($$1, $$3.b(), $$8);
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

   public eys a() {
      return new eys($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public eys b() {
      return new eys($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(fbx::close);
      this.g.forEach(eqd::close);
      this.f.close();
   }

   static record a(aiy a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fbw.a a, Either<CompletableFuture<Optional<eqd>>, aiy> b) {

      public Optional<List<eqd>> a(Function<aiy, List<eqd>> $$0) {
         return (Optional<List<eqd>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eqd> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fbw.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<fci> b) {
      public static final Codec<fbw.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fci.b.listOf().fieldOf("providers").forGetter(fbw.c::a)).apply($$0, fbw.c::new)
      );

      public List<fci> a() {
         return this.b;
      }
   }

   static record d(Map<aiy, List<eqd>> a, List<eqd> b) {
   }

   static record e(aiy a, List<fbw.b> b, Set<aiy> c) implements avm.a<aiy> {

      public e(aiy $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fbw.a $$0, fci.b $$1) {
         this.b.add(new fbw.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(fbw.a $$0, CompletableFuture<Optional<eqd>> $$1) {
         this.b.add(new fbw.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eqd>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eqd>> a(Function<aiy, List<eqd>> $$0) {
         List<eqd> $$1 = new ArrayList<>();

         for (fbw.b $$2 : this.b) {
            Optional<List<eqd>> $$3 = $$2.a($$0);
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

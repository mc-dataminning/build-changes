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

public class eup implements ane, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aep a = new aep("minecraft", "missing");
   private static final aei d = aei.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final euq f;
   private final List<ejk> g = new ArrayList<>();
   private final Map<aep, euq> h = new HashMap<>();
   private final fyh i;
   private Map<aep, aep> j = ImmutableMap.of();

   public eup(fyh $$0) {
      this.i = $$0;
      this.f = ac.a(new euq($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new ejk[]{new eun()})));
   }

   @Override
   public CompletableFuture<Void> a(ane.a $$0, ank $$1, bde $$2, bde $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<eup.d> a(ank $$0, Executor $$1) {
      List<CompletableFuture<eup.e>> $$2 = new ArrayList<>();

      for (Entry<aep, List<ani>> $$3 : d.b($$0).entrySet()) {
         aep $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<eup.a, eva>> $$4x = a($$3.getValue(), $$4);
            eup.e $$5 = new eup.e($$4);

            for (Pair<eup.a, eva> $$6 : $$4x) {
               eup.a $$7 = (eup.a)$$6.getFirst();
               ((eva)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<ejk>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ejk>>> $$2x = $$1x.stream().flatMap(eup.e::d).collect(Collectors.toCollection(ArrayList::new));
               ejk $$3x = new eun();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aep, List<ejk>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ejk> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new eup.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ejk>> a(eup.a $$0, eva.a $$1, ank $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aep, List<ejk>> a(List<eup.e> $$0) {
      Map<aep, List<ejk>> $$1 = new HashMap<>();
      aqt<aep, eup.e> $$2 = new aqt<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ejk> $$0, ejk $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ejk $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ejk $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(eup.d $$0, bde $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(euq::close);
      this.h.clear();
      this.g.forEach(ejk::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         euq $$2 = new euq(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eqn.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<eup.a, eva>> a(List<ani> $$0, aep $$1) {
      List<Pair<eup.a, eva>> $$2 = new ArrayList<>();

      for (ani $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            eup.c $$6 = ac.a(eup.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<eva> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               eup.a $$9 = new eup.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<aep, aep> $$0) {
      this.j = $$0;
   }

   private aep a(aep $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public erv a() {
      return new erv($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public erv b() {
      return new erv($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(euq::close);
      this.g.forEach(ejk::close);
      this.f.close();
   }

   static record a(aep a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(eup.a a, Either<CompletableFuture<Optional<ejk>>, aep> b) {

      public Optional<List<ejk>> a(Function<aep, List<ejk>> $$0) {
         return (Optional<List<ejk>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<ejk> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               eup.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<eva> b) {
      public static final Codec<eup.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eva.b.listOf().fieldOf("providers").forGetter(eup.c::a)).apply($$0, eup.c::new)
      );

      public List<eva> a() {
         return this.b;
      }
   }

   static record d(Map<aep, List<ejk>> a, List<ejk> b) {
   }

   static record e(aep a, List<eup.b> b, Set<aep> c) implements aqt.a<aep> {

      public e(aep $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(eup.a $$0, eva.b $$1) {
         this.b.add(new eup.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(eup.a $$0, CompletableFuture<Optional<ejk>> $$1) {
         this.b.add(new eup.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<ejk>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<ejk>> a(Function<aep, List<ejk>> $$0) {
         List<ejk> $$1 = new ArrayList<>();

         for (eup.b $$2 : this.b) {
            Optional<List<ejk>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aep> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aep> $$0) {
      }
   }
}

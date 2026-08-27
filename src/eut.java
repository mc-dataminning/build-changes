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

public class eut implements ang, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aer a = new aer("minecraft", "missing");
   private static final aek d = aek.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final euu f;
   private final List<ejj> g = new ArrayList<>();
   private final Map<aer, euu> h = new HashMap<>();
   private final fym i;
   private Map<aer, aer> j = ImmutableMap.of();

   public eut(fym $$0) {
      this.i = $$0;
      this.f = ac.a(new euu($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new ejj[]{new eur()})));
   }

   @Override
   public CompletableFuture<Void> a(ang.a $$0, anm $$1, bdh $$2, bdh $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<eut.d> a(anm $$0, Executor $$1) {
      List<CompletableFuture<eut.e>> $$2 = new ArrayList<>();

      for (Entry<aer, List<ank>> $$3 : d.b($$0).entrySet()) {
         aer $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<eut.a, eve>> $$4x = a($$3.getValue(), $$4);
            eut.e $$5 = new eut.e($$4);

            for (Pair<eut.a, eve> $$6 : $$4x) {
               eut.a $$7 = (eut.a)$$6.getFirst();
               ((eve)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<ejj>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ejj>>> $$2x = $$1x.stream().flatMap(eut.e::d).collect(Collectors.toCollection(ArrayList::new));
               ejj $$3x = new eur();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aer, List<ejj>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ejj> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new eut.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ejj>> a(eut.a $$0, eve.a $$1, anm $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aer, List<ejj>> a(List<eut.e> $$0) {
      Map<aer, List<ejj>> $$1 = new HashMap<>();
      aqv<aer, eut.e> $$2 = new aqv<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ejj> $$0, ejj $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ejj $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ejj $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(eut.d $$0, bdh $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(euu::close);
      this.h.clear();
      this.g.forEach(ejj::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         euu $$2 = new euu(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eqm.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<eut.a, eve>> a(List<ank> $$0, aer $$1) {
      List<Pair<eut.a, eve>> $$2 = new ArrayList<>();

      for (ank $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            eut.c $$6 = ac.a(eut.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<eve> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               eut.a $$9 = new eut.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<aer, aer> $$0) {
      this.j = $$0;
   }

   private aer a(aer $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public eru a() {
      return new eru($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public eru b() {
      return new eru($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(euu::close);
      this.g.forEach(ejj::close);
      this.f.close();
   }

   static record a(aer a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(eut.a a, Either<CompletableFuture<Optional<ejj>>, aer> b) {

      public Optional<List<ejj>> a(Function<aer, List<ejj>> $$0) {
         return (Optional<List<ejj>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<ejj> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               eut.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<eve> b) {
      public static final Codec<eut.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eve.b.listOf().fieldOf("providers").forGetter(eut.c::a)).apply($$0, eut.c::new)
      );

      public List<eve> a() {
         return this.b;
      }
   }

   static record d(Map<aer, List<ejj>> a, List<ejj> b) {
   }

   static record e(aer a, List<eut.b> b, Set<aer> c) implements aqv.a<aer> {

      public e(aer $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(eut.a $$0, eve.b $$1) {
         this.b.add(new eut.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(eut.a $$0, CompletableFuture<Optional<ejj>> $$1) {
         this.b.add(new eut.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<ejj>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<ejj>> a(Function<aer, List<ejj>> $$0) {
         List<ejj> $$1 = new ArrayList<>();

         for (eut.b $$2 : this.b) {
            Optional<List<ejj>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aer> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aer> $$0) {
      }
   }
}

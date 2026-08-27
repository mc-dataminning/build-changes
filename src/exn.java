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

public class exn implements apb, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final agi a = new agi("minecraft", "missing");
   private static final agb d = agb.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final exo f;
   private final List<elz> g = new ArrayList<>();
   private final Map<agi, exo> h = new HashMap<>();
   private final gbv i;
   private Map<agi, agi> j = ImmutableMap.of();

   public exn(gbv $$0) {
      this.i = $$0;
      this.f = ac.a(new exo($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new elz[]{new exl()})));
   }

   @Override
   public CompletableFuture<Void> a(apb.a $$0, aph $$1, bfo $$2, bfo $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<exn.d> a(aph $$0, Executor $$1) {
      List<CompletableFuture<exn.e>> $$2 = new ArrayList<>();

      for (Entry<agi, List<apf>> $$3 : d.b($$0).entrySet()) {
         agi $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<exn.a, exy>> $$4x = a($$3.getValue(), $$4);
            exn.e $$5 = new exn.e($$4);

            for (Pair<exn.a, exy> $$6 : $$4x) {
               exn.a $$7 = (exn.a)$$6.getFirst();
               ((exy)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<elz>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<elz>>> $$2x = $$1x.stream().flatMap(exn.e::d).collect(Collectors.toCollection(ArrayList::new));
               elz $$3x = new exl();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<agi, List<elz>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<elz> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new exn.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<elz>> a(exn.a $$0, exy.a $$1, aph $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<agi, List<elz>> a(List<exn.e> $$0) {
      Map<agi, List<elz>> $$1 = new HashMap<>();
      asr<agi, exn.e> $$2 = new asr<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<elz> $$0, elz $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (elz $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (elz $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(exn.d $$0, bfo $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(exo::close);
      this.h.clear();
      this.g.forEach(elz::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         exo $$2 = new exo(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(etd.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<exn.a, exy>> a(List<apf> $$0, agi $$1) {
      List<Pair<exn.a, exy>> $$2 = new ArrayList<>();

      for (apf $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            exn.c $$6 = ac.a(exn.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<exy> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               exn.a $$9 = new exn.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<agi, agi> $$0) {
      this.j = $$0;
   }

   private agi a(agi $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public eum a() {
      return new eum($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public eum b() {
      return new eum($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(exo::close);
      this.g.forEach(elz::close);
      this.f.close();
   }

   static record a(agi a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(exn.a a, Either<CompletableFuture<Optional<elz>>, agi> b) {

      public Optional<List<elz>> a(Function<agi, List<elz>> $$0) {
         return (Optional<List<elz>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<elz> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               exn.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<exy> b) {
      public static final Codec<exn.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(exy.b.listOf().fieldOf("providers").forGetter(exn.c::a)).apply($$0, exn.c::new)
      );

      public List<exy> a() {
         return this.b;
      }
   }

   static record d(Map<agi, List<elz>> a, List<elz> b) {
   }

   static record e(agi a, List<exn.b> b, Set<agi> c) implements asr.a<agi> {

      public e(agi $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(exn.a $$0, exy.b $$1) {
         this.b.add(new exn.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(exn.a $$0, CompletableFuture<Optional<elz>> $$1) {
         this.b.add(new exn.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<elz>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<elz>> a(Function<agi, List<elz>> $$0) {
         List<elz> $$1 = new ArrayList<>();

         for (exn.b $$2 : this.b) {
            Optional<List<elz>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<agi> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<agi> $$0) {
      }
   }
}

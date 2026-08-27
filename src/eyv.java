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

public class eyv implements apm, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final agt a = new agt("minecraft", "missing");
   private static final agm d = agm.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final eyw f;
   private final List<eng> g = new ArrayList<>();
   private final Map<agt, eyw> h = new HashMap<>();
   private final gdp i;
   private Map<agt, agt> j = ImmutableMap.of();

   public eyv(gdp $$0) {
      this.i = $$0;
      this.f = ac.a(new eyw($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eng[]{new eyt()})));
   }

   @Override
   public CompletableFuture<Void> a(apm.a $$0, aps $$1, bgc $$2, bgc $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<eyv.d> a(aps $$0, Executor $$1) {
      List<CompletableFuture<eyv.e>> $$2 = new ArrayList<>();

      for (Entry<agt, List<apq>> $$3 : d.b($$0).entrySet()) {
         agt $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<eyv.a, ezg>> $$4x = a($$3.getValue(), $$4);
            eyv.e $$5 = new eyv.e($$4);

            for (Pair<eyv.a, ezg> $$6 : $$4x) {
               eyv.a $$7 = (eyv.a)$$6.getFirst();
               ((ezg)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eng>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eng>>> $$2x = $$1x.stream().flatMap(eyv.e::d).collect(Collectors.toCollection(ArrayList::new));
               eng $$3x = new eyt();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<agt, List<eng>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eng> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new eyv.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eng>> a(eyv.a $$0, ezg.a $$1, aps $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<agt, List<eng>> a(List<eyv.e> $$0) {
      Map<agt, List<eng>> $$1 = new HashMap<>();
      atd<agt, eyv.e> $$2 = new atd<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eng> $$0, eng $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eng $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eng $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(eyv.d $$0, bgc $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(eyw::close);
      this.h.clear();
      this.g.forEach(eng::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         eyw $$2 = new eyw(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(euk.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<eyv.a, ezg>> a(List<apq> $$0, agt $$1) {
      List<Pair<eyv.a, ezg>> $$2 = new ArrayList<>();

      for (apq $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            eyv.c $$6 = ac.a(eyv.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<ezg> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               eyv.a $$9 = new eyv.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<agt, agt> $$0) {
      this.j = $$0;
   }

   private agt a(agt $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public evu a() {
      return new evu($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public evu b() {
      return new evu($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(eyw::close);
      this.g.forEach(eng::close);
      this.f.close();
   }

   static record a(agt a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(eyv.a a, Either<CompletableFuture<Optional<eng>>, agt> b) {

      public Optional<List<eng>> a(Function<agt, List<eng>> $$0) {
         return (Optional<List<eng>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eng> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               eyv.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<ezg> b) {
      public static final Codec<eyv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ezg.b.listOf().fieldOf("providers").forGetter(eyv.c::a)).apply($$0, eyv.c::new)
      );

      public List<ezg> a() {
         return this.b;
      }
   }

   static record d(Map<agt, List<eng>> a, List<eng> b) {
   }

   static record e(agt a, List<eyv.b> b, Set<agt> c) implements atd.a<agt> {

      public e(agt $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(eyv.a $$0, ezg.b $$1) {
         this.b.add(new eyv.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(eyv.a $$0, CompletableFuture<Optional<eng>> $$1) {
         this.b.add(new eyv.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eng>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eng>> a(Function<agt, List<eng>> $$0) {
         List<eng> $$1 = new ArrayList<>();

         for (eyv.b $$2 : this.b) {
            Optional<List<eng>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<agt> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<agt> $$0) {
      }
   }
}

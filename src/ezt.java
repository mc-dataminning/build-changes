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

public class ezt implements aqb, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ahg a = new ahg("minecraft", "missing");
   private static final agz d = agz.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ezu f;
   private final List<eod> g = new ArrayList<>();
   private final Map<ahg, ezu> h = new HashMap<>();
   private final gen i;
   private Map<ahg, ahg> j = ImmutableMap.of();

   public ezt(gen $$0) {
      this.i = $$0;
      this.f = ac.a(new ezu($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eod[]{new ezr()})));
   }

   @Override
   public CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<ezt.d> a(aqh $$0, Executor $$1) {
      List<CompletableFuture<ezt.e>> $$2 = new ArrayList<>();

      for (Entry<ahg, List<aqf>> $$3 : d.b($$0).entrySet()) {
         ahg $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<ezt.a, fae>> $$4x = a($$3.getValue(), $$4);
            ezt.e $$5 = new ezt.e($$4);

            for (Pair<ezt.a, fae> $$6 : $$4x) {
               ezt.a $$7 = (ezt.a)$$6.getFirst();
               ((fae)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eod>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eod>>> $$2x = $$1x.stream().flatMap(ezt.e::d).collect(Collectors.toCollection(ArrayList::new));
               eod $$3x = new ezr();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ahg, List<eod>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eod> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new ezt.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eod>> a(ezt.a $$0, fae.a $$1, aqh $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ahg, List<eod>> a(List<ezt.e> $$0) {
      Map<ahg, List<eod>> $$1 = new HashMap<>();
      ats<ahg, ezt.e> $$2 = new ats<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eod> $$0, eod $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eod $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eod $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(ezt.d $$0, bgr $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(ezu::close);
      this.h.clear();
      this.g.forEach(eod::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         ezu $$2 = new ezu(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(evh.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<ezt.a, fae>> a(List<aqf> $$0, ahg $$1) {
      List<Pair<ezt.a, fae>> $$2 = new ArrayList<>();

      for (aqf $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            ezt.c $$6 = ac.a(ezt.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fae> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               ezt.a $$9 = new ezt.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<ahg, ahg> $$0) {
      this.j = $$0;
   }

   private ahg a(ahg $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public ewr a() {
      return new ewr($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public ewr b() {
      return new ewr($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(ezu::close);
      this.g.forEach(eod::close);
      this.f.close();
   }

   static record a(ahg a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(ezt.a a, Either<CompletableFuture<Optional<eod>>, ahg> b) {

      public Optional<List<eod>> a(Function<ahg, List<eod>> $$0) {
         return (Optional<List<eod>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eod> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               ezt.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<fae> b) {
      public static final Codec<ezt.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fae.b.listOf().fieldOf("providers").forGetter(ezt.c::a)).apply($$0, ezt.c::new)
      );

      public List<fae> a() {
         return this.b;
      }
   }

   static record d(Map<ahg, List<eod>> a, List<eod> b) {
   }

   static record e(ahg a, List<ezt.b> b, Set<ahg> c) implements ats.a<ahg> {

      public e(ahg $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(ezt.a $$0, fae.b $$1) {
         this.b.add(new ezt.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(ezt.a $$0, CompletableFuture<Optional<eod>> $$1) {
         this.b.add(new ezt.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eod>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eod>> a(Function<ahg, List<eod>> $$0) {
         List<eod> $$1 = new ArrayList<>();

         for (ezt.b $$2 : this.b) {
            Optional<List<eod>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ahg> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ahg> $$0) {
      }
   }
}

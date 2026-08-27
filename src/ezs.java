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

public class ezs implements aqb, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ahg a = new ahg("minecraft", "missing");
   private static final agz d = agz.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ezt f;
   private final List<eoc> g = new ArrayList<>();
   private final Map<ahg, ezt> h = new HashMap<>();
   private final gem i;
   private Map<ahg, ahg> j = ImmutableMap.of();

   public ezs(gem $$0) {
      this.i = $$0;
      this.f = ac.a(new ezt($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eoc[]{new ezq()})));
   }

   @Override
   public CompletableFuture<Void> a(aqb.a $$0, aqh $$1, bgr $$2, bgr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<ezs.d> a(aqh $$0, Executor $$1) {
      List<CompletableFuture<ezs.e>> $$2 = new ArrayList<>();

      for (Entry<ahg, List<aqf>> $$3 : d.b($$0).entrySet()) {
         ahg $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<ezs.a, fad>> $$4x = a($$3.getValue(), $$4);
            ezs.e $$5 = new ezs.e($$4);

            for (Pair<ezs.a, fad> $$6 : $$4x) {
               ezs.a $$7 = (ezs.a)$$6.getFirst();
               ((fad)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eoc>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eoc>>> $$2x = $$1x.stream().flatMap(ezs.e::d).collect(Collectors.toCollection(ArrayList::new));
               eoc $$3x = new ezq();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ahg, List<eoc>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eoc> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new ezs.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eoc>> a(ezs.a $$0, fad.a $$1, aqh $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ahg, List<eoc>> a(List<ezs.e> $$0) {
      Map<ahg, List<eoc>> $$1 = new HashMap<>();
      ats<ahg, ezs.e> $$2 = new ats<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eoc> $$0, eoc $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eoc $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eoc $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(ezs.d $$0, bgr $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(ezt::close);
      this.h.clear();
      this.g.forEach(eoc::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         ezt $$2 = new ezt(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(evg.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<ezs.a, fad>> a(List<aqf> $$0, ahg $$1) {
      List<Pair<ezs.a, fad>> $$2 = new ArrayList<>();

      for (aqf $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            ezs.c $$6 = ac.a(ezs.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fad> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               ezs.a $$9 = new ezs.a($$1, $$3.b(), $$8);
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

   public ewq a() {
      return new ewq($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public ewq b() {
      return new ewq($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(ezt::close);
      this.g.forEach(eoc::close);
      this.f.close();
   }

   static record a(ahg a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(ezs.a a, Either<CompletableFuture<Optional<eoc>>, ahg> b) {

      public Optional<List<eoc>> a(Function<ahg, List<eoc>> $$0) {
         return (Optional<List<eoc>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eoc> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               ezs.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<fad> b) {
      public static final Codec<ezs.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fad.b.listOf().fieldOf("providers").forGetter(ezs.c::a)).apply($$0, ezs.c::new)
      );

      public List<fad> a() {
         return this.b;
      }
   }

   static record d(Map<ahg, List<eoc>> a, List<eoc> b) {
   }

   static record e(ahg a, List<ezs.b> b, Set<ahg> c) implements ats.a<ahg> {

      public e(ahg $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(ezs.a $$0, fad.b $$1) {
         this.b.add(new ezs.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(ezs.a $$0, CompletableFuture<Optional<eoc>> $$1) {
         this.b.add(new ezs.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eoc>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eoc>> a(Function<ahg, List<eoc>> $$0) {
         List<eoc> $$1 = new ArrayList<>();

         for (ezs.b $$2 : this.b) {
            Optional<List<eoc>> $$3 = $$2.a($$0);
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

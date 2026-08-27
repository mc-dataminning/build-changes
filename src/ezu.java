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

public class ezu implements aqc, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ahg a = new ahg("minecraft", "missing");
   private static final agz d = agz.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ezv f;
   private final List<eoe> g = new ArrayList<>();
   private final Map<ahg, ezv> h = new HashMap<>();
   private final geo i;
   private Map<ahg, ahg> j = ImmutableMap.of();

   public ezu(geo $$0) {
      this.i = $$0;
      this.f = ac.a(new ezv($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eoe[]{new ezs()})));
   }

   @Override
   public CompletableFuture<Void> a(aqc.a $$0, aqi $$1, bgs $$2, bgs $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<ezu.d> a(aqi $$0, Executor $$1) {
      List<CompletableFuture<ezu.e>> $$2 = new ArrayList<>();

      for (Entry<ahg, List<aqg>> $$3 : d.b($$0).entrySet()) {
         ahg $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<ezu.a, faf>> $$4x = a($$3.getValue(), $$4);
            ezu.e $$5 = new ezu.e($$4);

            for (Pair<ezu.a, faf> $$6 : $$4x) {
               ezu.a $$7 = (ezu.a)$$6.getFirst();
               ((faf)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eoe>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eoe>>> $$2x = $$1x.stream().flatMap(ezu.e::d).collect(Collectors.toCollection(ArrayList::new));
               eoe $$3x = new ezs();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ahg, List<eoe>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eoe> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new ezu.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eoe>> a(ezu.a $$0, faf.a $$1, aqi $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ahg, List<eoe>> a(List<ezu.e> $$0) {
      Map<ahg, List<eoe>> $$1 = new HashMap<>();
      att<ahg, ezu.e> $$2 = new att<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eoe> $$0, eoe $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eoe $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eoe $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(ezu.d $$0, bgs $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(ezv::close);
      this.h.clear();
      this.g.forEach(eoe::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         ezv $$2 = new ezv(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(evi.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<ezu.a, faf>> a(List<aqg> $$0, ahg $$1) {
      List<Pair<ezu.a, faf>> $$2 = new ArrayList<>();

      for (aqg $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            ezu.c $$6 = ac.a(ezu.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<faf> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               ezu.a $$9 = new ezu.a($$1, $$3.b(), $$8);
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

   public ews a() {
      return new ews($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public ews b() {
      return new ews($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(ezv::close);
      this.g.forEach(eoe::close);
      this.f.close();
   }

   static record a(ahg a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(ezu.a a, Either<CompletableFuture<Optional<eoe>>, ahg> b) {

      public Optional<List<eoe>> a(Function<ahg, List<eoe>> $$0) {
         return (Optional<List<eoe>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eoe> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               ezu.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<faf> b) {
      public static final Codec<ezu.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(faf.b.listOf().fieldOf("providers").forGetter(ezu.c::a)).apply($$0, ezu.c::new)
      );

      public List<faf> a() {
         return this.b;
      }
   }

   static record d(Map<ahg, List<eoe>> a, List<eoe> b) {
   }

   static record e(ahg a, List<ezu.b> b, Set<ahg> c) implements att.a<ahg> {

      public e(ahg $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(ezu.a $$0, faf.b $$1) {
         this.b.add(new ezu.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(ezu.a $$0, CompletableFuture<Optional<eoe>> $$1) {
         this.b.add(new ezu.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eoe>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eoe>> a(Function<ahg, List<eoe>> $$0) {
         List<eoe> $$1 = new ArrayList<>();

         for (ezu.b $$2 : this.b) {
            Optional<List<eoe>> $$3 = $$2.a($$0);
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

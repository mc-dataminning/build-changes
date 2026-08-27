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

public class fcz implements arz, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ajc a = new ajc("minecraft", "missing");
   private static final aiv d = aiv.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fda f;
   private final List<erg> g = new ArrayList<>();
   private final Map<ajc, fda> h = new HashMap<>();
   private final gia i;
   private Map<ajc, ajc> j = ImmutableMap.of();

   public fcz(gia $$0) {
      this.i = $$0;
      this.f = ac.a(new fda($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new erg[]{new fcx()})));
   }

   @Override
   public CompletableFuture<Void> a(arz.a $$0, asf $$1, bjc $$2, bjc $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fcz.d> a(asf $$0, Executor $$1) {
      List<CompletableFuture<fcz.e>> $$2 = new ArrayList<>();

      for (Entry<ajc, List<asd>> $$3 : d.b($$0).entrySet()) {
         ajc $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fcz.a, fdl>> $$4x = a($$3.getValue(), $$4);
            fcz.e $$5 = new fcz.e($$4);

            for (Pair<fcz.a, fdl> $$6 : $$4x) {
               fcz.a $$7 = (fcz.a)$$6.getFirst();
               ((fdl)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<erg>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<erg>>> $$2x = $$1x.stream().flatMap(fcz.e::d).collect(Collectors.toCollection(ArrayList::new));
               erg $$3x = new fcx();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ajc, List<erg>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<erg> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fcz.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<erg>> a(fcz.a $$0, fdl.a $$1, asf $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ajc, List<erg>> a(List<fcz.e> $$0) {
      Map<ajc, List<erg>> $$1 = new HashMap<>();
      avr<ajc, fcz.e> $$2 = new avr<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<erg> $$0, erg $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (erg $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (erg $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(fcz.d $$0, bjc $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fda::close);
      this.h.clear();
      this.g.forEach(erg::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         fda $$2 = new fda(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eyk.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<fcz.a, fdl>> a(List<asd> $$0, ajc $$1) {
      List<Pair<fcz.a, fdl>> $$2 = new ArrayList<>();

      for (asd $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fcz.c $$6 = ac.a(fcz.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fdl> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fcz.a $$9 = new fcz.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<ajc, ajc> $$0) {
      this.j = $$0;
   }

   private ajc a(ajc $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public ezv a() {
      return new ezv($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public ezv b() {
      return new ezv($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(fda::close);
      this.g.forEach(erg::close);
      this.f.close();
   }

   static record a(ajc a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fcz.a a, Either<CompletableFuture<Optional<erg>>, ajc> b) {

      public Optional<List<erg>> a(Function<ajc, List<erg>> $$0) {
         return (Optional<List<erg>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<erg> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fcz.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<fdl> b) {
      public static final Codec<fcz.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fdl.b.listOf().fieldOf("providers").forGetter(fcz.c::a)).apply($$0, fcz.c::new)
      );

      public List<fdl> a() {
         return this.b;
      }
   }

   static record d(Map<ajc, List<erg>> a, List<erg> b) {
   }

   static record e(ajc a, List<fcz.b> b, Set<ajc> c) implements avr.a<ajc> {

      public e(ajc $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fcz.a $$0, fdl.b $$1) {
         this.b.add(new fcz.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(fcz.a $$0, CompletableFuture<Optional<erg>> $$1) {
         this.b.add(new fcz.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<erg>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<erg>> a(Function<ajc, List<erg>> $$0) {
         List<erg> $$1 = new ArrayList<>();

         for (fcz.b $$2 : this.b) {
            Optional<List<erg>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ajc> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ajc> $$0) {
      }
   }
}

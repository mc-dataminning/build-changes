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

public class faf implements aqd, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ahh a = new ahh("minecraft", "missing");
   private static final aha d = aha.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fag f;
   private final List<eon> g = new ArrayList<>();
   private final Map<ahh, fag> h = new HashMap<>();
   private final gfc i;
   private Map<ahh, ahh> j = ImmutableMap.of();

   public faf(gfc $$0) {
      this.i = $$0;
      this.f = ac.a(new fag($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eon[]{new fad()})));
   }

   @Override
   public CompletableFuture<Void> a(aqd.a $$0, aqj $$1, bgt $$2, bgt $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<faf.d> a(aqj $$0, Executor $$1) {
      List<CompletableFuture<faf.e>> $$2 = new ArrayList<>();

      for (Entry<ahh, List<aqh>> $$3 : d.b($$0).entrySet()) {
         ahh $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<faf.a, faq>> $$4x = a($$3.getValue(), $$4);
            faf.e $$5 = new faf.e($$4);

            for (Pair<faf.a, faq> $$6 : $$4x) {
               faf.a $$7 = (faf.a)$$6.getFirst();
               ((faq)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eon>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eon>>> $$2x = $$1x.stream().flatMap(faf.e::d).collect(Collectors.toCollection(ArrayList::new));
               eon $$3x = new fad();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ahh, List<eon>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eon> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new faf.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eon>> a(faf.a $$0, faq.a $$1, aqj $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ahh, List<eon>> a(List<faf.e> $$0) {
      Map<ahh, List<eon>> $$1 = new HashMap<>();
      atu<ahh, faf.e> $$2 = new atu<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eon> $$0, eon $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eon $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eon $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(faf.d $$0, bgt $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fag::close);
      this.h.clear();
      this.g.forEach(eon::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         fag $$2 = new fag(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(evr.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<faf.a, faq>> a(List<aqh> $$0, ahh $$1) {
      List<Pair<faf.a, faq>> $$2 = new ArrayList<>();

      for (aqh $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            faf.c $$6 = ac.a(faf.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<faq> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               faf.a $$9 = new faf.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<ahh, ahh> $$0) {
      this.j = $$0;
   }

   private ahh a(ahh $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public exc a() {
      return new exc($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public exc b() {
      return new exc($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(fag::close);
      this.g.forEach(eon::close);
      this.f.close();
   }

   static record a(ahh a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(faf.a a, Either<CompletableFuture<Optional<eon>>, ahh> b) {

      public Optional<List<eon>> a(Function<ahh, List<eon>> $$0) {
         return (Optional<List<eon>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eon> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               faf.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<faq> b) {
      public static final Codec<faf.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(faq.b.listOf().fieldOf("providers").forGetter(faf.c::a)).apply($$0, faf.c::new)
      );

      public List<faq> a() {
         return this.b;
      }
   }

   static record d(Map<ahh, List<eon>> a, List<eon> b) {
   }

   static record e(ahh a, List<faf.b> b, Set<ahh> c) implements atu.a<ahh> {

      public e(ahh $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(faf.a $$0, faq.b $$1) {
         this.b.add(new faf.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(faf.a $$0, CompletableFuture<Optional<eon>> $$1) {
         this.b.add(new faf.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eon>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eon>> a(Function<ahh, List<eon>> $$0) {
         List<eon> $$1 = new ArrayList<>();

         for (faf.b $$2 : this.b) {
            Optional<List<eon>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ahh> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ahh> $$0) {
      }
   }
}

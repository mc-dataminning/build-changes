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

public class evd implements ann, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aew a = new aew("minecraft", "missing");
   private static final aep d = aep.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final eve f;
   private final List<ejs> g = new ArrayList<>();
   private final Map<aew, eve> h = new HashMap<>();
   private final fzf i;
   private Map<aew, aew> j = ImmutableMap.of();

   public evd(fzf $$0) {
      this.i = $$0;
      this.f = ac.a(new eve($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new ejs[]{new evb()})));
   }

   @Override
   public CompletableFuture<Void> a(ann.a $$0, ant $$1, bdp $$2, bdp $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<evd.d> a(ant $$0, Executor $$1) {
      List<CompletableFuture<evd.e>> $$2 = new ArrayList<>();

      for (Entry<aew, List<anr>> $$3 : d.b($$0).entrySet()) {
         aew $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<evd.a, evo>> $$4x = a($$3.getValue(), $$4);
            evd.e $$5 = new evd.e($$4);

            for (Pair<evd.a, evo> $$6 : $$4x) {
               evd.a $$7 = (evd.a)$$6.getFirst();
               ((evo)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<ejs>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ejs>>> $$2x = $$1x.stream().flatMap(evd.e::d).collect(Collectors.toCollection(ArrayList::new));
               ejs $$3x = new evb();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aew, List<ejs>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ejs> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new evd.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ejs>> a(evd.a $$0, evo.a $$1, ant $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aew, List<ejs>> a(List<evd.e> $$0) {
      Map<aew, List<ejs>> $$1 = new HashMap<>();
      arc<aew, evd.e> $$2 = new arc<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ejs> $$0, ejs $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ejs $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ejs $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(evd.d $$0, bdp $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(eve::close);
      this.h.clear();
      this.g.forEach(ejs::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         eve $$2 = new eve(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eqv.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<evd.a, evo>> a(List<anr> $$0, aew $$1) {
      List<Pair<evd.a, evo>> $$2 = new ArrayList<>();

      for (anr $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            evd.c $$6 = ac.a(evd.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<evo> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               evd.a $$9 = new evd.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<aew, aew> $$0) {
      this.j = $$0;
   }

   private aew a(aew $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public esd a() {
      return new esd($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public esd b() {
      return new esd($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(eve::close);
      this.g.forEach(ejs::close);
      this.f.close();
   }

   static record a(aew a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(evd.a a, Either<CompletableFuture<Optional<ejs>>, aew> b) {

      public Optional<List<ejs>> a(Function<aew, List<ejs>> $$0) {
         return (Optional<List<ejs>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<ejs> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               evd.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<evo> b) {
      public static final Codec<evd.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(evo.b.listOf().fieldOf("providers").forGetter(evd.c::a)).apply($$0, evd.c::new)
      );

      public List<evo> a() {
         return this.b;
      }
   }

   static record d(Map<aew, List<ejs>> a, List<ejs> b) {
   }

   static record e(aew a, List<evd.b> b, Set<aew> c) implements arc.a<aew> {

      public e(aew $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(evd.a $$0, evo.b $$1) {
         this.b.add(new evd.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(evd.a $$0, CompletableFuture<Optional<ejs>> $$1) {
         this.b.add(new evd.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<ejs>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<ejs>> a(Function<aew, List<ejs>> $$0) {
         List<ejs> $$1 = new ArrayList<>();

         for (evd.b $$2 : this.b) {
            Optional<List<ejs>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aew> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aew> $$0) {
      }
   }
}

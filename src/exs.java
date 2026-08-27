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

public class exs implements apf, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final agm a = new agm("minecraft", "missing");
   private static final agf d = agf.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ext f;
   private final List<eme> g = new ArrayList<>();
   private final Map<agm, ext> h = new HashMap<>();
   private final gca i;
   private Map<agm, agm> j = ImmutableMap.of();

   public exs(gca $$0) {
      this.i = $$0;
      this.f = ac.a(new ext($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eme[]{new exq()})));
   }

   @Override
   public CompletableFuture<Void> a(apf.a $$0, apl $$1, bfs $$2, bfs $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<exs.d> a(apl $$0, Executor $$1) {
      List<CompletableFuture<exs.e>> $$2 = new ArrayList<>();

      for (Entry<agm, List<apj>> $$3 : d.b($$0).entrySet()) {
         agm $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<exs.a, eyd>> $$4x = a($$3.getValue(), $$4);
            exs.e $$5 = new exs.e($$4);

            for (Pair<exs.a, eyd> $$6 : $$4x) {
               exs.a $$7 = (exs.a)$$6.getFirst();
               ((eyd)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eme>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eme>>> $$2x = $$1x.stream().flatMap(exs.e::d).collect(Collectors.toCollection(ArrayList::new));
               eme $$3x = new exq();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<agm, List<eme>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eme> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new exs.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eme>> a(exs.a $$0, eyd.a $$1, apl $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<agm, List<eme>> a(List<exs.e> $$0) {
      Map<agm, List<eme>> $$1 = new HashMap<>();
      asv<agm, exs.e> $$2 = new asv<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eme> $$0, eme $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eme $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eme $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(exs.d $$0, bfs $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(ext::close);
      this.h.clear();
      this.g.forEach(eme::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         ext $$2 = new ext(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eti.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<exs.a, eyd>> a(List<apj> $$0, agm $$1) {
      List<Pair<exs.a, eyd>> $$2 = new ArrayList<>();

      for (apj $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            exs.c $$6 = ac.a(exs.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<eyd> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               exs.a $$9 = new exs.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<agm, agm> $$0) {
      this.j = $$0;
   }

   private agm a(agm $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public eur a() {
      return new eur($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public eur b() {
      return new eur($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(ext::close);
      this.g.forEach(eme::close);
      this.f.close();
   }

   static record a(agm a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(exs.a a, Either<CompletableFuture<Optional<eme>>, agm> b) {

      public Optional<List<eme>> a(Function<agm, List<eme>> $$0) {
         return (Optional<List<eme>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eme> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               exs.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<eyd> b) {
      public static final Codec<exs.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eyd.b.listOf().fieldOf("providers").forGetter(exs.c::a)).apply($$0, exs.c::new)
      );

      public List<eyd> a() {
         return this.b;
      }
   }

   static record d(Map<agm, List<eme>> a, List<eme> b) {
   }

   static record e(agm a, List<exs.b> b, Set<agm> c) implements asv.a<agm> {

      public e(agm $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(exs.a $$0, eyd.b $$1) {
         this.b.add(new exs.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(exs.a $$0, CompletableFuture<Optional<eme>> $$1) {
         this.b.add(new exs.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eme>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eme>> a(Function<agm, List<eme>> $$0) {
         List<eme> $$1 = new ArrayList<>();

         for (exs.b $$2 : this.b) {
            Optional<List<eme>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<agm> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<agm> $$0) {
      }
   }
}

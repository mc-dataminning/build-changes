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

public class evf implements anp, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aey a = new aey("minecraft", "missing");
   private static final aer d = aer.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final evg f;
   private final List<eju> g = new ArrayList<>();
   private final Map<aey, evg> h = new HashMap<>();
   private final fzh i;
   private Map<aey, aey> j = ImmutableMap.of();

   public evf(fzh $$0) {
      this.i = $$0;
      this.f = ac.a(new evg($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eju[]{new evd()})));
   }

   @Override
   public CompletableFuture<Void> a(anp.a $$0, anv $$1, bdr $$2, bdr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<evf.d> a(anv $$0, Executor $$1) {
      List<CompletableFuture<evf.e>> $$2 = new ArrayList<>();

      for (Entry<aey, List<ant>> $$3 : d.b($$0).entrySet()) {
         aey $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<evf.a, evq>> $$4x = a($$3.getValue(), $$4);
            evf.e $$5 = new evf.e($$4);

            for (Pair<evf.a, evq> $$6 : $$4x) {
               evf.a $$7 = (evf.a)$$6.getFirst();
               ((evq)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eju>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eju>>> $$2x = $$1x.stream().flatMap(evf.e::d).collect(Collectors.toCollection(ArrayList::new));
               eju $$3x = new evd();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aey, List<eju>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eju> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new evf.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eju>> a(evf.a $$0, evq.a $$1, anv $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aey, List<eju>> a(List<evf.e> $$0) {
      Map<aey, List<eju>> $$1 = new HashMap<>();
      are<aey, evf.e> $$2 = new are<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eju> $$0, eju $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eju $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eju $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(evf.d $$0, bdr $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(evg::close);
      this.h.clear();
      this.g.forEach(eju::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         evg $$2 = new evg(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eqx.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<evf.a, evq>> a(List<ant> $$0, aey $$1) {
      List<Pair<evf.a, evq>> $$2 = new ArrayList<>();

      for (ant $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            evf.c $$6 = ac.a(evf.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<evq> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               evf.a $$9 = new evf.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<aey, aey> $$0) {
      this.j = $$0;
   }

   private aey a(aey $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public esf a() {
      return new esf($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public esf b() {
      return new esf($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(evg::close);
      this.g.forEach(eju::close);
      this.f.close();
   }

   static record a(aey a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(evf.a a, Either<CompletableFuture<Optional<eju>>, aey> b) {

      public Optional<List<eju>> a(Function<aey, List<eju>> $$0) {
         return (Optional<List<eju>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eju> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               evf.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<evq> b) {
      public static final Codec<evf.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(evq.b.listOf().fieldOf("providers").forGetter(evf.c::a)).apply($$0, evf.c::new)
      );

      public List<evq> a() {
         return this.b;
      }
   }

   static record d(Map<aey, List<eju>> a, List<eju> b) {
   }

   static record e(aey a, List<evf.b> b, Set<aey> c) implements are.a<aey> {

      public e(aey $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(evf.a $$0, evq.b $$1) {
         this.b.add(new evf.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(evf.a $$0, CompletableFuture<Optional<eju>> $$1) {
         this.b.add(new evf.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eju>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eju>> a(Function<aey, List<eju>> $$0) {
         List<eju> $$1 = new ArrayList<>();

         for (evf.b $$2 : this.b) {
            Optional<List<eju>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aey> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aey> $$0) {
      }
   }
}

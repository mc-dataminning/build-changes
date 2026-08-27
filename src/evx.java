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

public class evx implements aon, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final afw a = new afw("minecraft", "missing");
   private static final afp d = afp.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final evy f;
   private final List<ekk> g = new ArrayList<>();
   private final Map<afw, evy> h = new HashMap<>();
   private final gab i;
   private Map<afw, afw> j = ImmutableMap.of();

   public evx(gab $$0) {
      this.i = $$0;
      this.f = ac.a(new evy($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new ekk[]{new evv()})));
   }

   @Override
   public CompletableFuture<Void> a(aon.a $$0, aot $$1, bes $$2, bes $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<evx.d> a(aot $$0, Executor $$1) {
      List<CompletableFuture<evx.e>> $$2 = new ArrayList<>();

      for (Entry<afw, List<aor>> $$3 : d.b($$0).entrySet()) {
         afw $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<evx.a, ewi>> $$4x = a($$3.getValue(), $$4);
            evx.e $$5 = new evx.e($$4);

            for (Pair<evx.a, ewi> $$6 : $$4x) {
               evx.a $$7 = (evx.a)$$6.getFirst();
               ((ewi)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<ekk>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ekk>>> $$2x = $$1x.stream().flatMap(evx.e::d).collect(Collectors.toCollection(ArrayList::new));
               ekk $$3x = new evv();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<afw, List<ekk>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ekk> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new evx.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ekk>> a(evx.a $$0, ewi.a $$1, aot $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<afw, List<ekk>> a(List<evx.e> $$0) {
      Map<afw, List<ekk>> $$1 = new HashMap<>();
      asd<afw, evx.e> $$2 = new asd<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ekk> $$0, ekk $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ekk $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ekk $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(evx.d $$0, bes $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(evy::close);
      this.h.clear();
      this.g.forEach(ekk::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         evy $$2 = new evy(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(ero.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<evx.a, ewi>> a(List<aor> $$0, afw $$1) {
      List<Pair<evx.a, ewi>> $$2 = new ArrayList<>();

      for (aor $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            evx.c $$6 = ac.a(evx.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<ewi> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               evx.a $$9 = new evx.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<afw, afw> $$0) {
      this.j = $$0;
   }

   private afw a(afw $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public esw a() {
      return new esw($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public esw b() {
      return new esw($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(evy::close);
      this.g.forEach(ekk::close);
      this.f.close();
   }

   static record a(afw a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(evx.a a, Either<CompletableFuture<Optional<ekk>>, afw> b) {

      public Optional<List<ekk>> a(Function<afw, List<ekk>> $$0) {
         return (Optional<List<ekk>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<ekk> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               evx.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<ewi> b) {
      public static final Codec<evx.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ewi.b.listOf().fieldOf("providers").forGetter(evx.c::a)).apply($$0, evx.c::new)
      );

      public List<ewi> a() {
         return this.b;
      }
   }

   static record d(Map<afw, List<ekk>> a, List<ekk> b) {
   }

   static record e(afw a, List<evx.b> b, Set<afw> c) implements asd.a<afw> {

      public e(afw $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(evx.a $$0, ewi.b $$1) {
         this.b.add(new evx.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(evx.a $$0, CompletableFuture<Optional<ekk>> $$1) {
         this.b.add(new evx.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<ekk>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<ekk>> a(Function<afw, List<ekk>> $$0) {
         List<ekk> $$1 = new ArrayList<>();

         for (evx.b $$2 : this.b) {
            Optional<List<ekk>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<afw> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<afw> $$0) {
      }
   }
}

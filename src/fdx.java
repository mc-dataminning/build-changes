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
import java.util.EnumSet;
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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdx implements asi, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ajh a = new ajh("minecraft", "missing");
   private static final aja d = aja.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fdz f;
   private final List<ese> g = new ArrayList<>();
   private final Map<ajh, fdz> h = new HashMap<>();
   private final gjd i;
   @Nullable
   private volatile fdz j;

   public fdx(gjd $$0) {
      this.i = $$0;
      this.f = ac.a(new fdz($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ese.a d() {
      return new ese.a(new fdv(), fdy.a.b);
   }

   @Override
   public CompletableFuture<Void> a(asi.a $$0, aso $$1, bjr $$2, bjr $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fdx.d> a(aso $$0, Executor $$1) {
      List<CompletableFuture<fdx.e>> $$2 = new ArrayList<>();

      for (Entry<ajh, List<asm>> $$3 : d.b($$0).entrySet()) {
         ajh $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fdx.a, fek.a>> $$4x = a($$3.getValue(), $$4);
            fdx.e $$5 = new fdx.e($$4);

            for (Pair<fdx.a, fek.a> $$6 : $$4x) {
               fdx.a $$7 = (fdx.a)$$6.getFirst();
               fdy.a $$8 = ((fek.a)$$6.getSecond()).b();
               ((fek.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ese>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ese>>> $$2x = $$1x.stream().flatMap(fdx.e::d).collect(Collectors.toCollection(ArrayList::new));
               ese.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ajh, List<ese.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ese> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fdx.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ese>> a(fdx.a $$0, fek.b $$1, aso $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ajh, List<ese.a>> a(List<fdx.e> $$0) {
      Map<ajh, List<ese.a>> $$1 = new HashMap<>();
      awb<ajh, fdx.e> $$2 = new awb<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ese.a> $$0, ese.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ese.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ese.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fdy> b(ezm $$0) {
      Set<fdy> $$1 = EnumSet.noneOf(fdy.class);
      if ($$0.N().c()) {
         $$1.add(fdy.a);
      }

      if ($$0.O().c()) {
         $$1.add(fdy.b);
      }

      return $$1;
   }

   private void a(fdx.d $$0, bjr $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fdz::close);
      this.h.clear();
      this.g.forEach(ese::close);
      this.g.clear();
      Set<fdy> $$2 = b(ezi.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fdz $$3 = new fdz(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ezi.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(ezm $$0) {
      Set<fdy> $$1 = b($$0);

      for (fdz $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fdx.a, fek.a>> a(List<asm> $$0, ajh $$1) {
      List<Pair<fdx.a, fek.a>> $$2 = new ArrayList<>();

      for (asm $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fdx.c $$6 = ac.a(fdx.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fek.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fdx.a $$9 = new fdx.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fat a() {
      return new fat(this::b, false);
   }

   public fat b() {
      return new fat(this::b, true);
   }

   private fdz a(ajh $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fdz b(ajh $$0) {
      fdz $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fdz $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fdz::close);
      this.g.forEach(ese::close);
      this.f.close();
   }

   static record a(ajh a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fdx.a a, fdy.a b, Either<CompletableFuture<Optional<ese>>, ajh> c) {

      public Optional<List<ese.a>> a(Function<ajh, List<ese.a>> $$0) {
         return (Optional<List<ese.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ese.a($$0xx, this.b))), $$1 -> {
            List<ese.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fdx.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ese.a a(ese.a $$0) {
         return new ese.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fek.a> b) {
      public static final Codec<fdx.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fek.a.a.listOf().fieldOf("providers").forGetter(fdx.c::a)).apply($$0, fdx.c::new)
      );

      public List<fek.a> a() {
         return this.b;
      }
   }

   static record d(Map<ajh, List<ese.a>> a, List<ese> b) {
   }

   static record e(ajh a, List<fdx.b> b, Set<ajh> c) implements awb.a<ajh> {

      public e(ajh $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fdx.a $$0, fdy.a $$1, fek.c $$2) {
         this.b.add(new fdx.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fdx.a $$0, fdy.a $$1, CompletableFuture<Optional<ese>> $$2) {
         this.b.add(new fdx.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ese>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ese.a>> a(Function<ajh, List<ese.a>> $$0) {
         List<ese.a> $$1 = new ArrayList<>();

         for (fdx.b $$2 : this.b) {
            Optional<List<ese.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ajh> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ajh> $$0) {
      }
   }
}

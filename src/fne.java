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
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fne implements aup, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ale a = ale.b("missing");
   private static final akx d = akx.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fng f;
   private final List<fbh> g = new ArrayList<>();
   private final Map<ale, fng> h = new HashMap<>();
   private final gxh i;
   @Nullable
   private volatile fng j;

   public fne(gxh $$0) {
      this.i = $$0;
      this.f = ad.a(new fng($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fbh.a d() {
      return new fbh.a(new fnc(), fnf.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fne.d> a(auv $$0, Executor $$1) {
      List<CompletableFuture<fne.e>> $$2 = new ArrayList<>();

      for (Entry<ale, List<aut>> $$3 : d.b($$0).entrySet()) {
         ale $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fne.a, fnr.a>> $$4x = a($$3.getValue(), $$4);
            fne.e $$5 = new fne.e($$4);

            for (Pair<fne.a, fnr.a> $$6 : $$4x) {
               fne.a $$7 = (fne.a)$$6.getFirst();
               fnf.a $$8 = ((fnr.a)$$6.getSecond()).b();
               ((fnr.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fbh>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ad.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fbh>>> $$2x = $$1x.stream().flatMap(fne.e::d).collect(ad.b());
               fbh.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ad.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ale, List<fbh.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fbh> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fne.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fbh>> a(fne.a $$0, fnr.b $$1, auv $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ale, List<fbh.a>> a(List<fne.e> $$0) {
      Map<ale, List<fbh.a>> $$1 = new HashMap<>();
      ayk<ale, fne.e> $$2 = new ayk<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fbh.a> $$0, fbh.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fbh.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fbh.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fnf> b(fit $$0) {
      Set<fnf> $$1 = EnumSet.noneOf(fnf.class);
      if ($$0.R().c()) {
         $$1.add(fnf.a);
      }

      if ($$0.S().c()) {
         $$1.add(fnf.b);
      }

      return $$1;
   }

   private void a(fne.d $$0, bog $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fng::close);
      this.h.clear();
      this.g.forEach(fbh::close);
      this.g.clear();
      Set<fnf> $$2 = b(fip.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fng $$3 = new fng(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fip.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fit $$0) {
      Set<fnf> $$1 = b($$0);

      for (fng $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fne.a, fnr.a>> a(List<aut> $$0, ale $$1) {
      List<Pair<fne.a, fnr.a>> $$2 = new ArrayList<>();

      for (aut $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fne.c $$6 = (fne.c)fne.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fnr.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fne.a $$9 = new fne.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fjz a() {
      return new fjz(this::b, false);
   }

   public fjz b() {
      return new fjz(this::b, true);
   }

   private fng a(ale $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fng b(ale $$0) {
      fng $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fng $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fng::close);
      this.g.forEach(fbh::close);
      this.f.close();
   }

   static record a(ale a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fne.a a, fnf.a b, Either<CompletableFuture<Optional<fbh>>, ale> c) {

      public Optional<List<fbh.a>> a(Function<ale, List<fbh.a>> $$0) {
         return (Optional<List<fbh.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fbh.a($$0xx, this.b))), $$1 -> {
            List<fbh.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fne.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fbh.a a(fbh.a $$0) {
         return new fbh.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fnr.a> b) {
      public static final Codec<fne.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnr.a.a.listOf().fieldOf("providers").forGetter(fne.c::a)).apply($$0, fne.c::new)
      );

      public List<fnr.a> a() {
         return this.b;
      }
   }

   static record d(Map<ale, List<fbh.a>> a, List<fbh> b) {
   }

   static record e(ale a, List<fne.b> b, Set<ale> c) implements ayk.a<ale> {

      public e(ale $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fne.a $$0, fnf.a $$1, fnr.c $$2) {
         this.b.add(new fne.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fne.a $$0, fnf.a $$1, CompletableFuture<Optional<fbh>> $$2) {
         this.b.add(new fne.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fbh>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fbh.a>> a(Function<ale, List<fbh.a>> $$0) {
         List<fbh.a> $$1 = new ArrayList<>();

         for (fne.b $$2 : this.b) {
            Optional<List<fbh.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ale> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ale> $$0) {
      }
   }
}

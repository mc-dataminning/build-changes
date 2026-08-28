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

public class fou implements auw, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alj a = alj.b("missing");
   private static final alc d = alc.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fow f;
   private final List<fcq> g = new ArrayList<>();
   private final Map<alj, fow> h = new HashMap<>();
   private final gzf i;
   @Nullable
   private volatile fow j;

   public fou(gzf $$0) {
      this.i = $$0;
      this.f = ae.a(new fow($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fcq.a d() {
      return new fcq.a(new fos(), fov.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bot.a()), $$3);
   }

   private CompletableFuture<fou.d> a(avd $$0, Executor $$1) {
      List<CompletableFuture<fou.e>> $$2 = new ArrayList<>();

      for (Entry<alj, List<avb>> $$3 : d.b($$0).entrySet()) {
         alj $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fou.a, fph.a>> $$4x = a($$3.getValue(), $$4);
            fou.e $$5 = new fou.e($$4);

            for (Pair<fou.a, fph.a> $$6 : $$4x) {
               fou.a $$7 = (fou.a)$$6.getFirst();
               fov.a $$8 = ((fph.a)$$6.getSecond()).b();
               ((fph.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fcq>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ae.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fcq>>> $$2x = $$1x.stream().flatMap(fou.e::d).collect(ae.b());
               fcq.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ae.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alj, List<fcq.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fcq> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fou.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fcq>> a(fou.a $$0, fph.b $$1, avd $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alj, List<fcq.a>> a(List<fou.e> $$0) {
      Map<alj, List<fcq.a>> $$1 = new HashMap<>();
      ayr<alj, fou.e> $$2 = new ayr<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fcq.a> $$0, fcq.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fcq.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fcq.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fov> b(fki $$0) {
      Set<fov> $$1 = EnumSet.noneOf(fov.class);
      if ($$0.R().c()) {
         $$1.add(fov.a);
      }

      if ($$0.S().c()) {
         $$1.add(fov.b);
      }

      return $$1;
   }

   private void a(fou.d $$0, bou $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fow::close);
      this.h.clear();
      this.g.forEach(fcq::close);
      this.g.clear();
      Set<fov> $$2 = b(fke.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fow $$3 = new fow(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fke.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fki $$0) {
      Set<fov> $$1 = b($$0);

      for (fow $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fou.a, fph.a>> a(List<avb> $$0, alj $$1) {
      List<Pair<fou.a, fph.a>> $$2 = new ArrayList<>();

      for (avb $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fou.c $$6 = (fou.c)fou.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fph.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fou.a $$9 = new fou.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public flo a() {
      return new flo(this::b, false);
   }

   public flo b() {
      return new flo(this::b, true);
   }

   private fow a(alj $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fow b(alj $$0) {
      fow $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fow $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fow::close);
      this.g.forEach(fcq::close);
      this.f.close();
   }

   static record a(alj a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fou.a a, fov.a b, Either<CompletableFuture<Optional<fcq>>, alj> c) {

      public Optional<List<fcq.a>> a(Function<alj, List<fcq.a>> $$0) {
         return (Optional<List<fcq.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fcq.a($$0xx, this.b))), $$1 -> {
            List<fcq.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fou.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fcq.a a(fcq.a $$0) {
         return new fcq.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fph.a> b) {
      public static final Codec<fou.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fph.a.a.listOf().fieldOf("providers").forGetter(fou.c::a)).apply($$0, fou.c::new)
      );

      public List<fph.a> a() {
         return this.b;
      }
   }

   static record d(Map<alj, List<fcq.a>> a, List<fcq> b) {
   }

   static record e(alj a, List<fou.b> b, Set<alj> c) implements ayr.a<alj> {

      public e(alj $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fou.a $$0, fov.a $$1, fph.c $$2) {
         this.b.add(new fou.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fou.a $$0, fov.a $$1, CompletableFuture<Optional<fcq>> $$2) {
         this.b.add(new fou.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fcq>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fcq.a>> a(Function<alj, List<fcq.a>> $$0) {
         List<fcq.a> $$1 = new ArrayList<>();

         for (fou.b $$2 : this.b) {
            Optional<List<fcq.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alj> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alj> $$0) {
      }
   }
}

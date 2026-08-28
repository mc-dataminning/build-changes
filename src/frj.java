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

public class frj implements auj, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akv a = akv.b("missing");
   private static final ako d = ako.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final frl f;
   private final List<fdt> g = new ArrayList<>();
   private final Map<akv, frl> h = new HashMap<>();
   private final heu i;
   @Nullable
   private volatile frl j;

   public frj(heu $$0) {
      this.i = $$0;
      this.f = af.a(new frl($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fdt.a d() {
      return new fdt.a(new frh(), frk.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bos.a()), $$3);
   }

   private CompletableFuture<frj.d> a(aup $$0, Executor $$1) {
      List<CompletableFuture<frj.e>> $$2 = new ArrayList<>();

      for (Entry<akv, List<aun>> $$3 : d.b($$0).entrySet()) {
         akv $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<frj.a, frw.a>> $$4x = a($$3.getValue(), $$4);
            frj.e $$5 = new frj.e($$4);

            for (Pair<frj.a, frw.a> $$6 : $$4x) {
               frj.a $$7 = (frj.a)$$6.getFirst();
               frk.a $$8 = ((frw.a)$$6.getSecond()).b();
               ((frw.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fdt>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fdt>>> $$2x = $$1x.stream().flatMap(frj.e::d).collect(af.b());
               fdt.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akv, List<fdt.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fdt> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new frj.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fdt>> a(frj.a $$0, frw.b $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akv, List<fdt.a>> a(List<frj.e> $$0) {
      Map<akv, List<fdt.a>> $$1 = new HashMap<>();
      aye<akv, frj.e> $$2 = new aye<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fdt.a> $$0, fdt.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fdt.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fdt.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<frk> b(fln $$0) {
      Set<frk> $$1 = EnumSet.noneOf(frk.class);
      if ($$0.S().c()) {
         $$1.add(frk.a);
      }

      if ($$0.T().c()) {
         $$1.add(frk.b);
      }

      return $$1;
   }

   private void a(frj.d $$0, bot $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(frl::close);
      this.h.clear();
      this.g.forEach(fdt::close);
      this.g.clear();
      Set<frk> $$2 = b(flj.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         frl $$3 = new frl(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(flj.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fln $$0) {
      Set<frk> $$1 = b($$0);

      for (frl $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<frj.a, frw.a>> a(List<aun> $$0, akv $$1) {
      List<Pair<frj.a, frw.a>> $$2 = new ArrayList<>();

      for (aun $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            frj.c $$6 = (frj.c)frj.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<frw.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               frj.a $$9 = new frj.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public foc a() {
      return new foc(this::b, false);
   }

   public foc b() {
      return new foc(this::b, true);
   }

   private frl a(akv $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private frl b(akv $$0) {
      frl $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         frl $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(frl::close);
      this.g.forEach(fdt::close);
      this.f.close();
   }

   static record a(akv a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(frj.a a, frk.a b, Either<CompletableFuture<Optional<fdt>>, akv> c) {

      public Optional<List<fdt.a>> a(Function<akv, List<fdt.a>> $$0) {
         return (Optional<List<fdt.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fdt.a($$0xx, this.b))), $$1 -> {
            List<fdt.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               frj.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fdt.a a(fdt.a $$0) {
         return new fdt.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<frw.a> b) {
      public static final Codec<frj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frw.a.a.listOf().fieldOf("providers").forGetter(frj.c::a)).apply($$0, frj.c::new)
      );

      public List<frw.a> a() {
         return this.b;
      }
   }

   static record d(Map<akv, List<fdt.a>> a, List<fdt> b) {
   }

   static record e(akv a, List<frj.b> b, Set<akv> c) implements aye.a<akv> {

      public e(akv $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(frj.a $$0, frk.a $$1, frw.c $$2) {
         this.b.add(new frj.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(frj.a $$0, frk.a $$1, CompletableFuture<Optional<fdt>> $$2) {
         this.b.add(new frj.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fdt>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fdt.a>> a(Function<akv, List<fdt.a>> $$0) {
         List<fdt.a> $$1 = new ArrayList<>();

         for (frj.b $$2 : this.b) {
            Optional<List<fdt.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akv> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akv> $$0) {
      }
   }
}

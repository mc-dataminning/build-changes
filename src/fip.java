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

public class fip implements atr, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akn a = new akn("minecraft", "missing");
   private static final akg d = akg.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fir f;
   private final List<ewx> g = new ArrayList<>();
   private final Map<akn, fir> h = new HashMap<>();
   private final gnw i;
   @Nullable
   private volatile fir j;

   public fip(gnw $$0) {
      this.i = $$0;
      this.f = ac.a(new fir($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ewx.a d() {
      return new ewx.a(new fin(), fiq.a.b);
   }

   @Override
   public CompletableFuture<Void> a(atr.a $$0, atx $$1, bmk $$2, bmk $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fip.d> a(atx $$0, Executor $$1) {
      List<CompletableFuture<fip.e>> $$2 = new ArrayList<>();

      for (Entry<akn, List<atv>> $$3 : d.b($$0).entrySet()) {
         akn $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fip.a, fjc.a>> $$4x = a($$3.getValue(), $$4);
            fip.e $$5 = new fip.e($$4);

            for (Pair<fip.a, fjc.a> $$6 : $$4x) {
               fip.a $$7 = (fip.a)$$6.getFirst();
               fiq.a $$8 = ((fjc.a)$$6.getSecond()).b();
               ((fjc.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ewx>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ewx>>> $$2x = $$1x.stream().flatMap(fip.e::d).collect(Collectors.toCollection(ArrayList::new));
               ewx.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akn, List<ewx.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ewx> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fip.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ewx>> a(fip.a $$0, fjc.b $$1, atx $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akn, List<ewx.a>> a(List<fip.e> $$0) {
      Map<akn, List<ewx.a>> $$1 = new HashMap<>();
      axk<akn, fip.e> $$2 = new axk<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ewx.a> $$0, ewx.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ewx.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ewx.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fiq> b(fef $$0) {
      Set<fiq> $$1 = EnumSet.noneOf(fiq.class);
      if ($$0.P().c()) {
         $$1.add(fiq.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fiq.b);
      }

      return $$1;
   }

   private void a(fip.d $$0, bmk $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fir::close);
      this.h.clear();
      this.g.forEach(ewx::close);
      this.g.clear();
      Set<fiq> $$2 = b(feb.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fir $$3 = new fir(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(feb.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fef $$0) {
      Set<fiq> $$1 = b($$0);

      for (fir $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fip.a, fjc.a>> a(List<atv> $$0, akn $$1) {
      List<Pair<fip.a, fjc.a>> $$2 = new ArrayList<>();

      for (atv $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fip.c $$6 = (fip.c)fip.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fjc.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fip.a $$9 = new fip.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public ffl a() {
      return new ffl(this::b, false);
   }

   public ffl b() {
      return new ffl(this::b, true);
   }

   private fir a(akn $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fir b(akn $$0) {
      fir $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fir $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fir::close);
      this.g.forEach(ewx::close);
      this.f.close();
   }

   static record a(akn a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fip.a a, fiq.a b, Either<CompletableFuture<Optional<ewx>>, akn> c) {

      public Optional<List<ewx.a>> a(Function<akn, List<ewx.a>> $$0) {
         return (Optional<List<ewx.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ewx.a($$0xx, this.b))), $$1 -> {
            List<ewx.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fip.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ewx.a a(ewx.a $$0) {
         return new ewx.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fjc.a> b) {
      public static final Codec<fip.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fjc.a.a.listOf().fieldOf("providers").forGetter(fip.c::a)).apply($$0, fip.c::new)
      );

      public List<fjc.a> a() {
         return this.b;
      }
   }

   static record d(Map<akn, List<ewx.a>> a, List<ewx> b) {
   }

   static record e(akn a, List<fip.b> b, Set<akn> c) implements axk.a<akn> {

      public e(akn $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fip.a $$0, fiq.a $$1, fjc.c $$2) {
         this.b.add(new fip.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fip.a $$0, fiq.a $$1, CompletableFuture<Optional<ewx>> $$2) {
         this.b.add(new fip.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ewx>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ewx.a>> a(Function<akn, List<ewx.a>> $$0) {
         List<ewx.a> $$1 = new ArrayList<>();

         for (fip.b $$2 : this.b) {
            Optional<List<ewx.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akn> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akn> $$0) {
      }
   }
}

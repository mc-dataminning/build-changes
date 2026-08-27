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

public class fio implements atq, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akm a = new akm("minecraft", "missing");
   private static final akf d = akf.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fiq f;
   private final List<ewv> g = new ArrayList<>();
   private final Map<akm, fiq> h = new HashMap<>();
   private final gnw i;
   @Nullable
   private volatile fiq j;

   public fio(gnw $$0) {
      this.i = $$0;
      this.f = ac.a(new fiq($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ewv.a d() {
      return new ewv.a(new fim(), fip.a.b);
   }

   @Override
   public CompletableFuture<Void> a(atq.a $$0, atw $$1, bmi $$2, bmi $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fio.d> a(atw $$0, Executor $$1) {
      List<CompletableFuture<fio.e>> $$2 = new ArrayList<>();

      for (Entry<akm, List<atu>> $$3 : d.b($$0).entrySet()) {
         akm $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fio.a, fjb.a>> $$4x = a($$3.getValue(), $$4);
            fio.e $$5 = new fio.e($$4);

            for (Pair<fio.a, fjb.a> $$6 : $$4x) {
               fio.a $$7 = (fio.a)$$6.getFirst();
               fip.a $$8 = ((fjb.a)$$6.getSecond()).b();
               ((fjb.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ewv>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ewv>>> $$2x = $$1x.stream().flatMap(fio.e::d).collect(Collectors.toCollection(ArrayList::new));
               ewv.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akm, List<ewv.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ewv> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fio.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ewv>> a(fio.a $$0, fjb.b $$1, atw $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akm, List<ewv.a>> a(List<fio.e> $$0) {
      Map<akm, List<ewv.a>> $$1 = new HashMap<>();
      axj<akm, fio.e> $$2 = new axj<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ewv.a> $$0, ewv.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ewv.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ewv.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fip> b(fed $$0) {
      Set<fip> $$1 = EnumSet.noneOf(fip.class);
      if ($$0.P().c()) {
         $$1.add(fip.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fip.b);
      }

      return $$1;
   }

   private void a(fio.d $$0, bmi $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fiq::close);
      this.h.clear();
      this.g.forEach(ewv::close);
      this.g.clear();
      Set<fip> $$2 = b(fdz.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fiq $$3 = new fiq(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fdz.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fed $$0) {
      Set<fip> $$1 = b($$0);

      for (fiq $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fio.a, fjb.a>> a(List<atu> $$0, akm $$1) {
      List<Pair<fio.a, fjb.a>> $$2 = new ArrayList<>();

      for (atu $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fio.c $$6 = (fio.c)fio.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fjb.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fio.a $$9 = new fio.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public ffk a() {
      return new ffk(this::b, false);
   }

   public ffk b() {
      return new ffk(this::b, true);
   }

   private fiq a(akm $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fiq b(akm $$0) {
      fiq $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fiq $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fiq::close);
      this.g.forEach(ewv::close);
      this.f.close();
   }

   static record a(akm a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fio.a a, fip.a b, Either<CompletableFuture<Optional<ewv>>, akm> c) {

      public Optional<List<ewv.a>> a(Function<akm, List<ewv.a>> $$0) {
         return (Optional<List<ewv.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ewv.a($$0xx, this.b))), $$1 -> {
            List<ewv.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fio.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ewv.a a(ewv.a $$0) {
         return new ewv.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fjb.a> b) {
      public static final Codec<fio.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fjb.a.a.listOf().fieldOf("providers").forGetter(fio.c::a)).apply($$0, fio.c::new)
      );

      public List<fjb.a> a() {
         return this.b;
      }
   }

   static record d(Map<akm, List<ewv.a>> a, List<ewv> b) {
   }

   static record e(akm a, List<fio.b> b, Set<akm> c) implements axj.a<akm> {

      public e(akm $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fio.a $$0, fip.a $$1, fjb.c $$2) {
         this.b.add(new fio.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fio.a $$0, fip.a $$1, CompletableFuture<Optional<ewv>> $$2) {
         this.b.add(new fio.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ewv>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ewv.a>> a(Function<akm, List<ewv.a>> $$0) {
         List<ewv.a> $$1 = new ArrayList<>();

         for (fio.b $$2 : this.b) {
            Optional<List<ewv.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akm> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akm> $$0) {
      }
   }
}

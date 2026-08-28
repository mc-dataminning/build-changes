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

public class fom implements auy, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final all a = all.b("missing");
   private static final ale d = ale.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final foo f;
   private final List<fcj> g = new ArrayList<>();
   private final Map<all, foo> h = new HashMap<>();
   private final gyu i;
   @Nullable
   private volatile foo j;

   public fom(gyu $$0) {
      this.i = $$0;
      this.f = ae.a(new foo($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fcj.a d() {
      return new fcj.a(new fok(), fon.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auy.a $$0, ave $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, boq.a()), $$3);
   }

   private CompletableFuture<fom.d> a(ave $$0, Executor $$1) {
      List<CompletableFuture<fom.e>> $$2 = new ArrayList<>();

      for (Entry<all, List<avc>> $$3 : d.b($$0).entrySet()) {
         all $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fom.a, fpa.a>> $$4x = a($$3.getValue(), $$4);
            fom.e $$5 = new fom.e($$4);

            for (Pair<fom.a, fpa.a> $$6 : $$4x) {
               fom.a $$7 = (fom.a)$$6.getFirst();
               fon.a $$8 = ((fpa.a)$$6.getSecond()).b();
               ((fpa.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fcj>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ae.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fcj>>> $$2x = $$1x.stream().flatMap(fom.e::d).collect(ae.b());
               fcj.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ae.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<all, List<fcj.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fcj> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fom.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fcj>> a(fom.a $$0, fpa.b $$1, ave $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<all, List<fcj.a>> a(List<fom.e> $$0) {
      Map<all, List<fcj.a>> $$1 = new HashMap<>();
      ays<all, fom.e> $$2 = new ays<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fcj.a> $$0, fcj.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fcj.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fcj.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fon> b(fkb $$0) {
      Set<fon> $$1 = EnumSet.noneOf(fon.class);
      if ($$0.R().c()) {
         $$1.add(fon.a);
      }

      if ($$0.S().c()) {
         $$1.add(fon.b);
      }

      return $$1;
   }

   private void a(fom.d $$0, bor $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(foo::close);
      this.h.clear();
      this.g.forEach(fcj::close);
      this.g.clear();
      Set<fon> $$2 = b(fjx.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         foo $$3 = new foo(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fjx.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fkb $$0) {
      Set<fon> $$1 = b($$0);

      for (foo $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fom.a, fpa.a>> a(List<avc> $$0, all $$1) {
      List<Pair<fom.a, fpa.a>> $$2 = new ArrayList<>();

      for (avc $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fom.c $$6 = (fom.c)fom.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fpa.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fom.a $$9 = new fom.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public flh a() {
      return new flh(this::b, false);
   }

   public flh b() {
      return new flh(this::b, true);
   }

   private foo a(all $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private foo b(all $$0) {
      foo $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         foo $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(foo::close);
      this.g.forEach(fcj::close);
      this.f.close();
   }

   static record a(all a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fom.a a, fon.a b, Either<CompletableFuture<Optional<fcj>>, all> c) {

      public Optional<List<fcj.a>> a(Function<all, List<fcj.a>> $$0) {
         return (Optional<List<fcj.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fcj.a($$0xx, this.b))), $$1 -> {
            List<fcj.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fom.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fcj.a a(fcj.a $$0) {
         return new fcj.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fpa.a> b) {
      public static final Codec<fom.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fpa.a.a.listOf().fieldOf("providers").forGetter(fom.c::a)).apply($$0, fom.c::new)
      );

      public List<fpa.a> a() {
         return this.b;
      }
   }

   static record d(Map<all, List<fcj.a>> a, List<fcj> b) {
   }

   static record e(all a, List<fom.b> b, Set<all> c) implements ays.a<all> {

      public e(all $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fom.a $$0, fon.a $$1, fpa.c $$2) {
         this.b.add(new fom.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fom.a $$0, fon.a $$1, CompletableFuture<Optional<fcj>> $$2) {
         this.b.add(new fom.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fcj>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fcj.a>> a(Function<all, List<fcj.a>> $$0) {
         List<fcj.a> $$1 = new ArrayList<>();

         for (fom.b $$2 : this.b) {
            Optional<List<fcj.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<all> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<all> $$0) {
      }
   }
}

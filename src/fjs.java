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

public class fjs implements aui, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ale a = new ale("minecraft", "missing");
   private static final akx d = akx.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fju f;
   private final List<eya> g = new ArrayList<>();
   private final Map<ale, fju> h = new HashMap<>();
   private final goz i;
   @Nullable
   private volatile fju j;

   public fjs(goz $$0) {
      this.i = $$0;
      this.f = ac.a(new fju($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static eya.a d() {
      return new eya.a(new fjq(), fjt.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, bnh $$2, bnh $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fjs.d> a(auo $$0, Executor $$1) {
      List<CompletableFuture<fjs.e>> $$2 = new ArrayList<>();

      for (Entry<ale, List<aum>> $$3 : d.b($$0).entrySet()) {
         ale $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fjs.a, fkf.a>> $$4x = a($$3.getValue(), $$4);
            fjs.e $$5 = new fjs.e($$4);

            for (Pair<fjs.a, fkf.a> $$6 : $$4x) {
               fjs.a $$7 = (fjs.a)$$6.getFirst();
               fjt.a $$8 = ((fkf.a)$$6.getSecond()).b();
               ((fkf.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<eya>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eya>>> $$2x = $$1x.stream().flatMap(fjs.e::d).collect(ac.b());
               eya.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ale, List<eya.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eya> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fjs.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eya>> a(fjs.a $$0, fkf.b $$1, auo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ale, List<eya.a>> a(List<fjs.e> $$0) {
      Map<ale, List<eya.a>> $$1 = new HashMap<>();
      ayc<ale, fjs.e> $$2 = new ayc<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eya.a> $$0, eya.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eya.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eya.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fjt> b(ffi $$0) {
      Set<fjt> $$1 = EnumSet.noneOf(fjt.class);
      if ($$0.P().c()) {
         $$1.add(fjt.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fjt.b);
      }

      return $$1;
   }

   private void a(fjs.d $$0, bnh $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fju::close);
      this.h.clear();
      this.g.forEach(eya::close);
      this.g.clear();
      Set<fjt> $$2 = b(ffe.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fju $$3 = new fju(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ffe.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(ffi $$0) {
      Set<fjt> $$1 = b($$0);

      for (fju $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fjs.a, fkf.a>> a(List<aum> $$0, ale $$1) {
      List<Pair<fjs.a, fkf.a>> $$2 = new ArrayList<>();

      for (aum $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fjs.c $$6 = (fjs.c)fjs.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fkf.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fjs.a $$9 = new fjs.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fgo a() {
      return new fgo(this::b, false);
   }

   public fgo b() {
      return new fgo(this::b, true);
   }

   private fju a(ale $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fju b(ale $$0) {
      fju $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fju $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fju::close);
      this.g.forEach(eya::close);
      this.f.close();
   }

   static record a(ale a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fjs.a a, fjt.a b, Either<CompletableFuture<Optional<eya>>, ale> c) {

      public Optional<List<eya.a>> a(Function<ale, List<eya.a>> $$0) {
         return (Optional<List<eya.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new eya.a($$0xx, this.b))), $$1 -> {
            List<eya.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fjs.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private eya.a a(eya.a $$0) {
         return new eya.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fkf.a> b) {
      public static final Codec<fjs.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkf.a.a.listOf().fieldOf("providers").forGetter(fjs.c::a)).apply($$0, fjs.c::new)
      );

      public List<fkf.a> a() {
         return this.b;
      }
   }

   static record d(Map<ale, List<eya.a>> a, List<eya> b) {
   }

   static record e(ale a, List<fjs.b> b, Set<ale> c) implements ayc.a<ale> {

      public e(ale $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fjs.a $$0, fjt.a $$1, fkf.c $$2) {
         this.b.add(new fjs.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fjs.a $$0, fjt.a $$1, CompletableFuture<Optional<eya>> $$2) {
         this.b.add(new fjs.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<eya>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<eya.a>> a(Function<ale, List<eya.a>> $$0) {
         List<eya.a> $$1 = new ArrayList<>();

         for (fjs.b $$2 : this.b) {
            Optional<List<eya.a>> $$3 = $$2.a($$0);
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

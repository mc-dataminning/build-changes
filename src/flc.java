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

public class flc implements atx, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akt a = new akt("minecraft", "missing");
   private static final akm d = akm.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fle f;
   private final List<ezf> g = new ArrayList<>();
   private final Map<akt, fle> h = new HashMap<>();
   private final gqz i;
   @Nullable
   private volatile fle j;

   public flc(gqz $$0) {
      this.i = $$0;
      this.f = ad.a(new fle($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ezf.a d() {
      return new ezf.a(new fla(), fld.a.b);
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bmo $$2, bmo $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<flc.d> a(aud $$0, Executor $$1) {
      List<CompletableFuture<flc.e>> $$2 = new ArrayList<>();

      for (Entry<akt, List<aub>> $$3 : d.b($$0).entrySet()) {
         akt $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<flc.a, flp.a>> $$4x = a($$3.getValue(), $$4);
            flc.e $$5 = new flc.e($$4);

            for (Pair<flc.a, flp.a> $$6 : $$4x) {
               flc.a $$7 = (flc.a)$$6.getFirst();
               fld.a $$8 = ((flp.a)$$6.getSecond()).b();
               ((flp.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ezf>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ad.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ezf>>> $$2x = $$1x.stream().flatMap(flc.e::d).collect(Collectors.toCollection(ArrayList::new));
               ezf.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ad.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akt, List<ezf.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ezf> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new flc.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ezf>> a(flc.a $$0, flp.b $$1, aud $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akt, List<ezf.a>> a(List<flc.e> $$0) {
      Map<akt, List<ezf.a>> $$1 = new HashMap<>();
      axr<akt, flc.e> $$2 = new axr<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ezf.a> $$0, ezf.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ezf.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ezf.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fld> b(fgn $$0) {
      Set<fld> $$1 = EnumSet.noneOf(fld.class);
      if ($$0.P().c()) {
         $$1.add(fld.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fld.b);
      }

      return $$1;
   }

   private void a(flc.d $$0, bmo $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fle::close);
      this.h.clear();
      this.g.forEach(ezf::close);
      this.g.clear();
      Set<fld> $$2 = b(fgj.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fle $$3 = new fle(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fgj.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fgn $$0) {
      Set<fld> $$1 = b($$0);

      for (fle $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<flc.a, flp.a>> a(List<aub> $$0, akt $$1) {
      List<Pair<flc.a, flp.a>> $$2 = new ArrayList<>();

      for (aub $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            flc.c $$6 = ad.a(flc.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<flp.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               flc.a $$9 = new flc.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fhy a() {
      return new fhy(this::b, false);
   }

   public fhy b() {
      return new fhy(this::b, true);
   }

   private fle a(akt $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fle b(akt $$0) {
      fle $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fle $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fle::close);
      this.g.forEach(ezf::close);
      this.f.close();
   }

   static record a(akt a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(flc.a a, fld.a b, Either<CompletableFuture<Optional<ezf>>, akt> c) {

      public Optional<List<ezf.a>> a(Function<akt, List<ezf.a>> $$0) {
         return (Optional<List<ezf.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ezf.a($$0xx, this.b))), $$1 -> {
            List<ezf.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               flc.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ezf.a a(ezf.a $$0) {
         return new ezf.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<flp.a> b) {
      public static final Codec<flc.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(flp.a.a.listOf().fieldOf("providers").forGetter(flc.c::a)).apply($$0, flc.c::new)
      );

      public List<flp.a> a() {
         return this.b;
      }
   }

   static record d(Map<akt, List<ezf.a>> a, List<ezf> b) {
   }

   static record e(akt a, List<flc.b> b, Set<akt> c) implements axr.a<akt> {

      public e(akt $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(flc.a $$0, fld.a $$1, flp.c $$2) {
         this.b.add(new flc.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(flc.a $$0, fld.a $$1, CompletableFuture<Optional<ezf>> $$2) {
         this.b.add(new flc.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ezf>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ezf.a>> a(Function<akt, List<ezf.a>> $$0) {
         List<ezf.a> $$1 = new ArrayList<>();

         for (flc.b $$2 : this.b) {
            Optional<List<ezf.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akt> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akt> $$0) {
      }
   }
}

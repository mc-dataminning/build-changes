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

public class fgn implements asy, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ajv a = new ajv("minecraft", "missing");
   private static final ajo d = ajo.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fgp f;
   private final List<euu> g = new ArrayList<>();
   private final Map<ajv, fgp> h = new HashMap<>();
   private final glt i;
   @Nullable
   private volatile fgp j;

   public fgn(glt $$0) {
      this.i = $$0;
      this.f = ac.a(new fgp($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static euu.a d() {
      return new euu.a(new fgl(), fgo.a.b);
   }

   @Override
   public CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fgn.d> a(ate $$0, Executor $$1) {
      List<CompletableFuture<fgn.e>> $$2 = new ArrayList<>();

      for (Entry<ajv, List<atc>> $$3 : d.b($$0).entrySet()) {
         ajv $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fgn.a, fha.a>> $$4x = a($$3.getValue(), $$4);
            fgn.e $$5 = new fgn.e($$4);

            for (Pair<fgn.a, fha.a> $$6 : $$4x) {
               fgn.a $$7 = (fgn.a)$$6.getFirst();
               fgo.a $$8 = ((fha.a)$$6.getSecond()).b();
               ((fha.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<euu>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<euu>>> $$2x = $$1x.stream().flatMap(fgn.e::d).collect(Collectors.toCollection(ArrayList::new));
               euu.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ajv, List<euu.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<euu> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fgn.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<euu>> a(fgn.a $$0, fha.b $$1, ate $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ajv, List<euu.a>> a(List<fgn.e> $$0) {
      Map<ajv, List<euu.a>> $$1 = new HashMap<>();
      awr<ajv, fgn.e> $$2 = new awr<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<euu.a> $$0, euu.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (euu.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (euu.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fgo> b(fcc $$0) {
      Set<fgo> $$1 = EnumSet.noneOf(fgo.class);
      if ($$0.P().c()) {
         $$1.add(fgo.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fgo.b);
      }

      return $$1;
   }

   private void a(fgn.d $$0, bkt $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fgp::close);
      this.h.clear();
      this.g.forEach(euu::close);
      this.g.clear();
      Set<fgo> $$2 = b(fby.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fgp $$3 = new fgp(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fby.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fcc $$0) {
      Set<fgo> $$1 = b($$0);

      for (fgp $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fgn.a, fha.a>> a(List<atc> $$0, ajv $$1) {
      List<Pair<fgn.a, fha.a>> $$2 = new ArrayList<>();

      for (atc $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fgn.c $$6 = ac.a(fgn.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fha.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fgn.a $$9 = new fgn.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fdj a() {
      return new fdj(this::b, false);
   }

   public fdj b() {
      return new fdj(this::b, true);
   }

   private fgp a(ajv $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fgp b(ajv $$0) {
      fgp $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fgp $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fgp::close);
      this.g.forEach(euu::close);
      this.f.close();
   }

   static record a(ajv a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fgn.a a, fgo.a b, Either<CompletableFuture<Optional<euu>>, ajv> c) {

      public Optional<List<euu.a>> a(Function<ajv, List<euu.a>> $$0) {
         return (Optional<List<euu.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new euu.a($$0xx, this.b))), $$1 -> {
            List<euu.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fgn.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private euu.a a(euu.a $$0) {
         return new euu.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fha.a> b) {
      public static final Codec<fgn.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fha.a.a.listOf().fieldOf("providers").forGetter(fgn.c::a)).apply($$0, fgn.c::new)
      );

      public List<fha.a> a() {
         return this.b;
      }
   }

   static record d(Map<ajv, List<euu.a>> a, List<euu> b) {
   }

   static record e(ajv a, List<fgn.b> b, Set<ajv> c) implements awr.a<ajv> {

      public e(ajv $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fgn.a $$0, fgo.a $$1, fha.c $$2) {
         this.b.add(new fgn.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fgn.a $$0, fgo.a $$1, CompletableFuture<Optional<euu>> $$2) {
         this.b.add(new fgn.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<euu>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<euu.a>> a(Function<ajv, List<euu.a>> $$0) {
         List<euu.a> $$1 = new ArrayList<>();

         for (fgn.b $$2 : this.b) {
            Optional<List<euu.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ajv> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ajv> $$0) {
      }
   }
}

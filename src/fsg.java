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

public class fsg implements auj, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aku a = aku.b("missing");
   private static final akn d = akn.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fsi f;
   private final List<feq> g = new ArrayList<>();
   private final Map<aku, fsi> h = new HashMap<>();
   private final hft i;
   @Nullable
   private volatile fsi j;

   public fsg(hft $$0) {
      this.i = $$0;
      this.f = af.a(new fsi($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static feq.a d() {
      return new feq.a(new fse(), fsh.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpi.a()), $$3);
   }

   private CompletableFuture<fsg.d> a(aup $$0, Executor $$1) {
      List<CompletableFuture<fsg.e>> $$2 = new ArrayList<>();

      for (Entry<aku, List<aun>> $$3 : d.b($$0).entrySet()) {
         aku $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fsg.a, fst.a>> $$4x = a($$3.getValue(), $$4);
            fsg.e $$5 = new fsg.e($$4);

            for (Pair<fsg.a, fst.a> $$6 : $$4x) {
               fsg.a $$7 = (fsg.a)$$6.getFirst();
               fsh.a $$8 = ((fst.a)$$6.getSecond()).b();
               ((fst.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<feq>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<feq>>> $$2x = $$1x.stream().flatMap(fsg.e::d).collect(af.b());
               feq.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aku, List<feq.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<feq> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fsg.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<feq>> a(fsg.a $$0, fst.b $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aku, List<feq.a>> a(List<fsg.e> $$0) {
      Map<aku, List<feq.a>> $$1 = new HashMap<>();
      aye<aku, fsg.e> $$2 = new aye<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<feq.a> $$0, feq.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (feq.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (feq.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fsh> b(fmk $$0) {
      Set<fsh> $$1 = EnumSet.noneOf(fsh.class);
      if ($$0.S().c()) {
         $$1.add(fsh.a);
      }

      if ($$0.T().c()) {
         $$1.add(fsh.b);
      }

      return $$1;
   }

   private void a(fsg.d $$0, bpj $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fsi::close);
      this.h.clear();
      this.g.forEach(feq::close);
      this.g.clear();
      Set<fsh> $$2 = b(fmg.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fsi $$3 = new fsi(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fmg.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fmk $$0) {
      Set<fsh> $$1 = b($$0);

      for (fsi $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fsg.a, fst.a>> a(List<aun> $$0, aku $$1) {
      List<Pair<fsg.a, fst.a>> $$2 = new ArrayList<>();

      for (aun $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fsg.c $$6 = (fsg.c)fsg.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fst.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fsg.a $$9 = new fsg.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fpa a() {
      return new fpa(this::b, false);
   }

   public fpa b() {
      return new fpa(this::b, true);
   }

   private fsi a(aku $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fsi b(aku $$0) {
      fsi $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fsi $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fsi::close);
      this.g.forEach(feq::close);
      this.f.close();
   }

   static record a(aku a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fsg.a a, fsh.a b, Either<CompletableFuture<Optional<feq>>, aku> c) {

      public Optional<List<feq.a>> a(Function<aku, List<feq.a>> $$0) {
         return (Optional<List<feq.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new feq.a($$0xx, this.b))), $$1 -> {
            List<feq.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fsg.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private feq.a a(feq.a $$0) {
         return new feq.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fst.a> b) {
      public static final Codec<fsg.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fst.a.a.listOf().fieldOf("providers").forGetter(fsg.c::a)).apply($$0, fsg.c::new)
      );

      public List<fst.a> a() {
         return this.b;
      }
   }

   static record d(Map<aku, List<feq.a>> a, List<feq> b) {
   }

   static record e(aku a, List<fsg.b> b, Set<aku> c) implements aye.a<aku> {

      public e(aku $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fsg.a $$0, fsh.a $$1, fst.c $$2) {
         this.b.add(new fsg.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fsg.a $$0, fsh.a $$1, CompletableFuture<Optional<feq>> $$2) {
         this.b.add(new fsg.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<feq>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<feq.a>> a(Function<aku, List<feq.a>> $$0) {
         List<feq.a> $$1 = new ArrayList<>();

         for (fsg.b $$2 : this.b) {
            Optional<List<feq.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aku> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aku> $$0) {
      }
   }
}

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

public class fri implements auj, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akv a = akv.b("missing");
   private static final ako d = ako.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final frk f;
   private final List<fds> g = new ArrayList<>();
   private final Map<akv, frk> h = new HashMap<>();
   private final het i;
   @Nullable
   private volatile frk j;

   public fri(het $$0) {
      this.i = $$0;
      this.f = af.a(new frk($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fds.a d() {
      return new fds.a(new frg(), frj.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bor.a()), $$3);
   }

   private CompletableFuture<fri.d> a(aup $$0, Executor $$1) {
      List<CompletableFuture<fri.e>> $$2 = new ArrayList<>();

      for (Entry<akv, List<aun>> $$3 : d.b($$0).entrySet()) {
         akv $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fri.a, frv.a>> $$4x = a($$3.getValue(), $$4);
            fri.e $$5 = new fri.e($$4);

            for (Pair<fri.a, frv.a> $$6 : $$4x) {
               fri.a $$7 = (fri.a)$$6.getFirst();
               frj.a $$8 = ((frv.a)$$6.getSecond()).b();
               ((frv.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fds>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fds>>> $$2x = $$1x.stream().flatMap(fri.e::d).collect(af.b());
               fds.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akv, List<fds.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fds> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fri.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fds>> a(fri.a $$0, frv.b $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akv, List<fds.a>> a(List<fri.e> $$0) {
      Map<akv, List<fds.a>> $$1 = new HashMap<>();
      aye<akv, fri.e> $$2 = new aye<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fds.a> $$0, fds.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fds.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fds.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<frj> b(flm $$0) {
      Set<frj> $$1 = EnumSet.noneOf(frj.class);
      if ($$0.S().c()) {
         $$1.add(frj.a);
      }

      if ($$0.T().c()) {
         $$1.add(frj.b);
      }

      return $$1;
   }

   private void a(fri.d $$0, bos $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(frk::close);
      this.h.clear();
      this.g.forEach(fds::close);
      this.g.clear();
      Set<frj> $$2 = b(fli.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         frk $$3 = new frk(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fli.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(flm $$0) {
      Set<frj> $$1 = b($$0);

      for (frk $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fri.a, frv.a>> a(List<aun> $$0, akv $$1) {
      List<Pair<fri.a, frv.a>> $$2 = new ArrayList<>();

      for (aun $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fri.c $$6 = (fri.c)fri.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<frv.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fri.a $$9 = new fri.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fob a() {
      return new fob(this::b, false);
   }

   public fob b() {
      return new fob(this::b, true);
   }

   private frk a(akv $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private frk b(akv $$0) {
      frk $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         frk $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(frk::close);
      this.g.forEach(fds::close);
      this.f.close();
   }

   static record a(akv a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fri.a a, frj.a b, Either<CompletableFuture<Optional<fds>>, akv> c) {

      public Optional<List<fds.a>> a(Function<akv, List<fds.a>> $$0) {
         return (Optional<List<fds.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fds.a($$0xx, this.b))), $$1 -> {
            List<fds.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fri.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fds.a a(fds.a $$0) {
         return new fds.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<frv.a> b) {
      public static final Codec<fri.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frv.a.a.listOf().fieldOf("providers").forGetter(fri.c::a)).apply($$0, fri.c::new)
      );

      public List<frv.a> a() {
         return this.b;
      }
   }

   static record d(Map<akv, List<fds.a>> a, List<fds> b) {
   }

   static record e(akv a, List<fri.b> b, Set<akv> c) implements aye.a<akv> {

      public e(akv $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fri.a $$0, frj.a $$1, frv.c $$2) {
         this.b.add(new fri.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fri.a $$0, frj.a $$1, CompletableFuture<Optional<fds>> $$2) {
         this.b.add(new fri.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fds>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fds.a>> a(Function<akv, List<fds.a>> $$0) {
         List<fds.a> $$1 = new ArrayList<>();

         for (fri.b $$2 : this.b) {
            Optional<List<fds.a>> $$3 = $$2.a($$0);
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

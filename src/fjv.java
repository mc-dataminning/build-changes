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

public class fjv implements auj, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alf a = new alf("minecraft", "missing");
   private static final aky d = aky.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fjx f;
   private final List<eyd> g = new ArrayList<>();
   private final Map<alf, fjx> h = new HashMap<>();
   private final gpc i;
   @Nullable
   private volatile fjx j;

   public fjv(gpc $$0) {
      this.i = $$0;
      this.f = ac.a(new fjx($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static eyd.a d() {
      return new eyd.a(new fjt(), fjw.a.b);
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, bnk $$2, bnk $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fjv.d> a(aup $$0, Executor $$1) {
      List<CompletableFuture<fjv.e>> $$2 = new ArrayList<>();

      for (Entry<alf, List<aun>> $$3 : d.b($$0).entrySet()) {
         alf $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fjv.a, fki.a>> $$4x = a($$3.getValue(), $$4);
            fjv.e $$5 = new fjv.e($$4);

            for (Pair<fjv.a, fki.a> $$6 : $$4x) {
               fjv.a $$7 = (fjv.a)$$6.getFirst();
               fjw.a $$8 = ((fki.a)$$6.getSecond()).b();
               ((fki.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<eyd>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eyd>>> $$2x = $$1x.stream().flatMap(fjv.e::d).collect(ac.b());
               eyd.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alf, List<eyd.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eyd> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fjv.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eyd>> a(fjv.a $$0, fki.b $$1, aup $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alf, List<eyd.a>> a(List<fjv.e> $$0) {
      Map<alf, List<eyd.a>> $$1 = new HashMap<>();
      ayd<alf, fjv.e> $$2 = new ayd<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eyd.a> $$0, eyd.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eyd.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eyd.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fjw> b(ffl $$0) {
      Set<fjw> $$1 = EnumSet.noneOf(fjw.class);
      if ($$0.P().c()) {
         $$1.add(fjw.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fjw.b);
      }

      return $$1;
   }

   private void a(fjv.d $$0, bnk $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fjx::close);
      this.h.clear();
      this.g.forEach(eyd::close);
      this.g.clear();
      Set<fjw> $$2 = b(ffh.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fjx $$3 = new fjx(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ffh.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(ffl $$0) {
      Set<fjw> $$1 = b($$0);

      for (fjx $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fjv.a, fki.a>> a(List<aun> $$0, alf $$1) {
      List<Pair<fjv.a, fki.a>> $$2 = new ArrayList<>();

      for (aun $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fjv.c $$6 = (fjv.c)fjv.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fki.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fjv.a $$9 = new fjv.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fgr a() {
      return new fgr(this::b, false);
   }

   public fgr b() {
      return new fgr(this::b, true);
   }

   private fjx a(alf $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fjx b(alf $$0) {
      fjx $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fjx $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fjx::close);
      this.g.forEach(eyd::close);
      this.f.close();
   }

   static record a(alf a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fjv.a a, fjw.a b, Either<CompletableFuture<Optional<eyd>>, alf> c) {

      public Optional<List<eyd.a>> a(Function<alf, List<eyd.a>> $$0) {
         return (Optional<List<eyd.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new eyd.a($$0xx, this.b))), $$1 -> {
            List<eyd.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fjv.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private eyd.a a(eyd.a $$0) {
         return new eyd.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fki.a> b) {
      public static final Codec<fjv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fki.a.a.listOf().fieldOf("providers").forGetter(fjv.c::a)).apply($$0, fjv.c::new)
      );

      public List<fki.a> a() {
         return this.b;
      }
   }

   static record d(Map<alf, List<eyd.a>> a, List<eyd> b) {
   }

   static record e(alf a, List<fjv.b> b, Set<alf> c) implements ayd.a<alf> {

      public e(alf $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fjv.a $$0, fjw.a $$1, fki.c $$2) {
         this.b.add(new fjv.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fjv.a $$0, fjw.a $$1, CompletableFuture<Optional<eyd>> $$2) {
         this.b.add(new fjv.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<eyd>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<eyd.a>> a(Function<alf, List<eyd.a>> $$0) {
         List<eyd.a> $$1 = new ArrayList<>();

         for (fjv.b $$2 : this.b) {
            Optional<List<eyd.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alf> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alf> $$0) {
      }
   }
}

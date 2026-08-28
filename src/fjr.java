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

public class fjr implements aui, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ale a = new ale("minecraft", "missing");
   private static final akx d = akx.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fjt f;
   private final List<exz> g = new ArrayList<>();
   private final Map<ale, fjt> h = new HashMap<>();
   private final goy i;
   @Nullable
   private volatile fjt j;

   public fjr(goy $$0) {
      this.i = $$0;
      this.f = ac.a(new fjt($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static exz.a d() {
      return new exz.a(new fjp(), fjs.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, bng $$2, bng $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fjr.d> a(auo $$0, Executor $$1) {
      List<CompletableFuture<fjr.e>> $$2 = new ArrayList<>();

      for (Entry<ale, List<aum>> $$3 : d.b($$0).entrySet()) {
         ale $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fjr.a, fke.a>> $$4x = a($$3.getValue(), $$4);
            fjr.e $$5 = new fjr.e($$4);

            for (Pair<fjr.a, fke.a> $$6 : $$4x) {
               fjr.a $$7 = (fjr.a)$$6.getFirst();
               fjs.a $$8 = ((fke.a)$$6.getSecond()).b();
               ((fke.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<exz>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<exz>>> $$2x = $$1x.stream().flatMap(fjr.e::d).collect(ac.b());
               exz.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ale, List<exz.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<exz> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fjr.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<exz>> a(fjr.a $$0, fke.b $$1, auo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ale, List<exz.a>> a(List<fjr.e> $$0) {
      Map<ale, List<exz.a>> $$1 = new HashMap<>();
      ayc<ale, fjr.e> $$2 = new ayc<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<exz.a> $$0, exz.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (exz.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (exz.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fjs> b(ffh $$0) {
      Set<fjs> $$1 = EnumSet.noneOf(fjs.class);
      if ($$0.P().c()) {
         $$1.add(fjs.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fjs.b);
      }

      return $$1;
   }

   private void a(fjr.d $$0, bng $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fjt::close);
      this.h.clear();
      this.g.forEach(exz::close);
      this.g.clear();
      Set<fjs> $$2 = b(ffd.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fjt $$3 = new fjt(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ffd.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(ffh $$0) {
      Set<fjs> $$1 = b($$0);

      for (fjt $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fjr.a, fke.a>> a(List<aum> $$0, ale $$1) {
      List<Pair<fjr.a, fke.a>> $$2 = new ArrayList<>();

      for (aum $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fjr.c $$6 = (fjr.c)fjr.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fke.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fjr.a $$9 = new fjr.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fgn a() {
      return new fgn(this::b, false);
   }

   public fgn b() {
      return new fgn(this::b, true);
   }

   private fjt a(ale $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fjt b(ale $$0) {
      fjt $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fjt $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fjt::close);
      this.g.forEach(exz::close);
      this.f.close();
   }

   static record a(ale a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fjr.a a, fjs.a b, Either<CompletableFuture<Optional<exz>>, ale> c) {

      public Optional<List<exz.a>> a(Function<ale, List<exz.a>> $$0) {
         return (Optional<List<exz.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new exz.a($$0xx, this.b))), $$1 -> {
            List<exz.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fjr.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private exz.a a(exz.a $$0) {
         return new exz.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fke.a> b) {
      public static final Codec<fjr.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fke.a.a.listOf().fieldOf("providers").forGetter(fjr.c::a)).apply($$0, fjr.c::new)
      );

      public List<fke.a> a() {
         return this.b;
      }
   }

   static record d(Map<ale, List<exz.a>> a, List<exz> b) {
   }

   static record e(ale a, List<fjr.b> b, Set<ale> c) implements ayc.a<ale> {

      public e(ale $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fjr.a $$0, fjs.a $$1, fke.c $$2) {
         this.b.add(new fjr.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fjr.a $$0, fjs.a $$1, CompletableFuture<Optional<exz>> $$2) {
         this.b.add(new fjr.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<exz>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<exz.a>> a(Function<ale, List<exz.a>> $$0) {
         List<exz.a> $$1 = new ArrayList<>();

         for (fjr.b $$2 : this.b) {
            Optional<List<exz.a>> $$3 = $$2.a($$0);
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

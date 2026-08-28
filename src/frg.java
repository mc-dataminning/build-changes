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

public class frg implements aui, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aku a = aku.b("missing");
   private static final akn d = akn.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fri f;
   private final List<fdr> g = new ArrayList<>();
   private final Map<aku, fri> h = new HashMap<>();
   private final heo i;
   @Nullable
   private volatile fri j;

   public frg(heo $$0) {
      this.i = $$0;
      this.f = af.a(new fri($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fdr.a d() {
      return new fdr.a(new fre(), frh.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, boq.a()), $$3);
   }

   private CompletableFuture<frg.d> a(auo $$0, Executor $$1) {
      List<CompletableFuture<frg.e>> $$2 = new ArrayList<>();

      for (Entry<aku, List<aum>> $$3 : d.b($$0).entrySet()) {
         aku $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<frg.a, frt.a>> $$4x = a($$3.getValue(), $$4);
            frg.e $$5 = new frg.e($$4);

            for (Pair<frg.a, frt.a> $$6 : $$4x) {
               frg.a $$7 = (frg.a)$$6.getFirst();
               frh.a $$8 = ((frt.a)$$6.getSecond()).b();
               ((frt.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fdr>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fdr>>> $$2x = $$1x.stream().flatMap(frg.e::d).collect(af.b());
               fdr.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aku, List<fdr.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fdr> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new frg.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fdr>> a(frg.a $$0, frt.b $$1, auo $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aku, List<fdr.a>> a(List<frg.e> $$0) {
      Map<aku, List<fdr.a>> $$1 = new HashMap<>();
      ayd<aku, frg.e> $$2 = new ayd<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fdr.a> $$0, fdr.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fdr.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fdr.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<frh> b(fll $$0) {
      Set<frh> $$1 = EnumSet.noneOf(frh.class);
      if ($$0.S().c()) {
         $$1.add(frh.a);
      }

      if ($$0.T().c()) {
         $$1.add(frh.b);
      }

      return $$1;
   }

   private void a(frg.d $$0, bor $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fri::close);
      this.h.clear();
      this.g.forEach(fdr::close);
      this.g.clear();
      Set<frh> $$2 = b(flh.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fri $$3 = new fri(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(flh.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fll $$0) {
      Set<frh> $$1 = b($$0);

      for (fri $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<frg.a, frt.a>> a(List<aum> $$0, aku $$1) {
      List<Pair<frg.a, frt.a>> $$2 = new ArrayList<>();

      for (aum $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            frg.c $$6 = (frg.c)frg.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<frt.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               frg.a $$9 = new frg.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fnz a() {
      return new fnz(this::b, false);
   }

   public fnz b() {
      return new fnz(this::b, true);
   }

   private fri a(aku $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fri b(aku $$0) {
      fri $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fri $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fri::close);
      this.g.forEach(fdr::close);
      this.f.close();
   }

   static record a(aku a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(frg.a a, frh.a b, Either<CompletableFuture<Optional<fdr>>, aku> c) {

      public Optional<List<fdr.a>> a(Function<aku, List<fdr.a>> $$0) {
         return (Optional<List<fdr.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fdr.a($$0xx, this.b))), $$1 -> {
            List<fdr.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               frg.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fdr.a a(fdr.a $$0) {
         return new fdr.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<frt.a> b) {
      public static final Codec<frg.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frt.a.a.listOf().fieldOf("providers").forGetter(frg.c::a)).apply($$0, frg.c::new)
      );

      public List<frt.a> a() {
         return this.b;
      }
   }

   static record d(Map<aku, List<fdr.a>> a, List<fdr> b) {
   }

   static record e(aku a, List<frg.b> b, Set<aku> c) implements ayd.a<aku> {

      public e(aku $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(frg.a $$0, frh.a $$1, frt.c $$2) {
         this.b.add(new frg.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(frg.a $$0, frh.a $$1, CompletableFuture<Optional<fdr>> $$2) {
         this.b.add(new frg.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fdr>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fdr.a>> a(Function<aku, List<fdr.a>> $$0) {
         List<fdr.a> $$1 = new ArrayList<>();

         for (frg.b $$2 : this.b) {
            Optional<List<fdr.a>> $$3 = $$2.a($$0);
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

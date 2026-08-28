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

public class ftd implements aut, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ald a = ald.b("missing");
   private static final akw d = akw.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ftf f;
   private final List<ffn> g = new ArrayList<>();
   private final Map<ald, ftf> h = new HashMap<>();
   private final hgu i;
   @Nullable
   private volatile ftf j;

   public ftd(hgu $$0) {
      this.i = $$0;
      this.f = af.a(new ftf($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static ffn.a d() {
      return new ffn.a(new ftb(), fte.a.b);
   }

   @Override
   public CompletableFuture<Void> a(aut.a $$0, ava $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bqa.a()), $$3);
   }

   private CompletableFuture<ftd.d> a(ava $$0, Executor $$1) {
      List<CompletableFuture<ftd.e>> $$2 = new ArrayList<>();

      for (Entry<ald, List<auy>> $$3 : d.b($$0).entrySet()) {
         ald $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<ftd.a, ftq.a>> $$4x = a($$3.getValue(), $$4);
            ftd.e $$5 = new ftd.e($$4);

            for (Pair<ftd.a, ftq.a> $$6 : $$4x) {
               ftd.a $$7 = (ftd.a)$$6.getFirst();
               fte.a $$8 = ((ftq.a)$$6.getSecond()).b();
               ((ftq.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<ffn>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return af.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ffn>>> $$2x = $$1x.stream().flatMap(ftd.e::d).collect(af.b());
               ffn.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return af.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ald, List<ffn.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ffn> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new ftd.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ffn>> a(ftd.a $$0, ftq.b $$1, ava $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ald, List<ffn.a>> a(List<ftd.e> $$0) {
      Map<ald, List<ffn.a>> $$1 = new HashMap<>();
      ayo<ald, ftd.e> $$2 = new ayo<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ffn.a> $$0, ffn.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ffn.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ffn.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fte> b(fnh $$0) {
      Set<fte> $$1 = EnumSet.noneOf(fte.class);
      if ($$0.S().c()) {
         $$1.add(fte.a);
      }

      if ($$0.T().c()) {
         $$1.add(fte.b);
      }

      return $$1;
   }

   private void a(ftd.d $$0, bqb $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(ftf::close);
      this.h.clear();
      this.g.forEach(ffn::close);
      this.g.clear();
      Set<fte> $$2 = b(fnd.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         ftf $$3 = new ftf(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fnd.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fnh $$0) {
      Set<fte> $$1 = b($$0);

      for (ftf $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<ftd.a, ftq.a>> a(List<auy> $$0, ald $$1) {
      List<Pair<ftd.a, ftq.a>> $$2 = new ArrayList<>();

      for (auy $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            ftd.c $$6 = (ftd.c)ftd.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<ftq.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               ftd.a $$9 = new ftd.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fpx a() {
      return new fpx(this::b, false);
   }

   public fpx b() {
      return new fpx(this::b, true);
   }

   private ftf a(ald $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private ftf b(ald $$0) {
      ftf $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         ftf $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(ftf::close);
      this.g.forEach(ffn::close);
      this.f.close();
   }

   static record a(ald a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(ftd.a a, fte.a b, Either<CompletableFuture<Optional<ffn>>, ald> c) {

      public Optional<List<ffn.a>> a(Function<ald, List<ffn.a>> $$0) {
         return (Optional<List<ffn.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new ffn.a($$0xx, this.b))), $$1 -> {
            List<ffn.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               ftd.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private ffn.a a(ffn.a $$0) {
         return new ffn.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<ftq.a> b) {
      public static final Codec<ftd.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ftq.a.a.listOf().fieldOf("providers").forGetter(ftd.c::a)).apply($$0, ftd.c::new)
      );

      public List<ftq.a> a() {
         return this.b;
      }
   }

   static record d(Map<ald, List<ffn.a>> a, List<ffn> b) {
   }

   static record e(ald a, List<ftd.b> b, Set<ald> c) implements ayo.a<ald> {

      public e(ald $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(ftd.a $$0, fte.a $$1, ftq.c $$2) {
         this.b.add(new ftd.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(ftd.a $$0, fte.a $$1, CompletableFuture<Optional<ffn>> $$2) {
         this.b.add(new ftd.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<ffn>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<ffn.a>> a(Function<ald, List<ffn.a>> $$0) {
         List<ffn.a> $$1 = new ArrayList<>();

         for (ftd.b $$2 : this.b) {
            Optional<List<ffn.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ald> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ald> $$0) {
      }
   }
}

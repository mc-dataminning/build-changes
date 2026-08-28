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

public class fqu implements avp, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final alz a = alz.b("missing");
   private static final als d = als.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fqw f;
   private final List<fep> g = new ArrayList<>();
   private final Map<alz, fqw> h = new HashMap<>();
   private final hbk i;
   @Nullable
   private volatile fqw j;

   public fqu(hbk $$0) {
      this.i = $$0;
      this.f = ae.a(new fqw($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static fep.a d() {
      return new fep.a(new fqs(), fqv.a.b);
   }

   @Override
   public CompletableFuture<Void> a(avp.a $$0, avv $$1, Executor $$2, Executor $$3) {
      return this.a($$1, $$2).thenCompose($$0::a).thenAcceptAsync($$0x -> this.a($$0x, bpr.a()), $$3);
   }

   private CompletableFuture<fqu.d> a(avv $$0, Executor $$1) {
      List<CompletableFuture<fqu.e>> $$2 = new ArrayList<>();

      for (Entry<alz, List<avt>> $$3 : d.b($$0).entrySet()) {
         alz $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fqu.a, frh.a>> $$4x = a($$3.getValue(), $$4);
            fqu.e $$5 = new fqu.e($$4);

            for (Pair<fqu.a, frh.a> $$6 : $$4x) {
               fqu.a $$7 = (fqu.a)$$6.getFirst();
               fqv.a $$8 = ((frh.a)$$6.getSecond()).b();
               ((frh.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<fep>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ae.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<fep>>> $$2x = $$1x.stream().flatMap(fqu.e::d).collect(ae.b());
               fep.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ae.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<alz, List<fep.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<fep> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fqu.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<fep>> a(fqu.a $$0, frh.b $$1, avv $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<alz, List<fep.a>> a(List<fqu.e> $$0) {
      Map<alz, List<fep.a>> $$1 = new HashMap<>();
      azj<alz, fqu.e> $$2 = new azj<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<fep.a> $$0, fep.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (fep.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (fep.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fqv> b(fmi $$0) {
      Set<fqv> $$1 = EnumSet.noneOf(fqv.class);
      if ($$0.S().c()) {
         $$1.add(fqv.a);
      }

      if ($$0.T().c()) {
         $$1.add(fqv.b);
      }

      return $$1;
   }

   private void a(fqu.d $$0, bps $$1) {
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fqw::close);
      this.h.clear();
      this.g.forEach(fep::close);
      this.g.clear();
      Set<fqv> $$2 = b(fme.Q().n);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fqw $$3 = new fqw(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      if (!this.h.containsKey(fme.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fmi $$0) {
      Set<fqv> $$1 = b($$0);

      for (fqw $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fqu.a, frh.a>> a(List<avt> $$0, alz $$1) {
      List<Pair<fqu.a, frh.a>> $$2 = new ArrayList<>();

      for (avt $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fqu.c $$6 = (fqu.c)fqu.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<frh.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fqu.a $$9 = new fqu.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fno a() {
      return new fno(this::b, false);
   }

   public fno b() {
      return new fno(this::b, true);
   }

   private fqw a(alz $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fqw b(alz $$0) {
      fqw $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fqw $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fqw::close);
      this.g.forEach(fep::close);
      this.f.close();
   }

   static record a(alz a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fqu.a a, fqv.a b, Either<CompletableFuture<Optional<fep>>, alz> c) {

      public Optional<List<fep.a>> a(Function<alz, List<fep.a>> $$0) {
         return (Optional<List<fep.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new fep.a($$0xx, this.b))), $$1 -> {
            List<fep.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fqu.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private fep.a a(fep.a $$0) {
         return new fep.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<frh.a> b) {
      public static final Codec<fqu.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(frh.a.a.listOf().fieldOf("providers").forGetter(fqu.c::a)).apply($$0, fqu.c::new)
      );

      public List<frh.a> a() {
         return this.b;
      }
   }

   static record d(Map<alz, List<fep.a>> a, List<fep> b) {
   }

   static record e(alz a, List<fqu.b> b, Set<alz> c) implements azj.a<alz> {

      public e(alz $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fqu.a $$0, fqv.a $$1, frh.c $$2) {
         this.b.add(new fqu.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fqu.a $$0, fqv.a $$1, CompletableFuture<Optional<fep>> $$2) {
         this.b.add(new fqu.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<fep>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<fep.a>> a(Function<alz, List<fep.a>> $$0) {
         List<fep.a> $$1 = new ArrayList<>();

         for (fqu.b $$2 : this.b) {
            Optional<List<fep.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<alz> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<alz> $$0) {
      }
   }
}

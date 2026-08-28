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

public class fkj implements atq, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final akk a = new akk("minecraft", "missing");
   private static final akd d = akd.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fkl f;
   private final List<eyr> g = new ArrayList<>();
   private final Map<akk, fkl> h = new HashMap<>();
   private final gpr i;
   @Nullable
   private volatile fkl j;

   public fkj(gpr $$0) {
      this.i = $$0;
      this.f = ac.a(new fkl($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static eyr.a d() {
      return new eyr.a(new fkh(), fkk.a.b);
   }

   @Override
   public CompletableFuture<Void> a(atq.a $$0, atw $$1, bmv $$2, bmv $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fkj.d> a(atw $$0, Executor $$1) {
      List<CompletableFuture<fkj.e>> $$2 = new ArrayList<>();

      for (Entry<akk, List<atu>> $$3 : d.b($$0).entrySet()) {
         akk $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fkj.a, fkw.a>> $$4x = a($$3.getValue(), $$4);
            fkj.e $$5 = new fkj.e($$4);

            for (Pair<fkj.a, fkw.a> $$6 : $$4x) {
               fkj.a $$7 = (fkj.a)$$6.getFirst();
               fkk.a $$8 = ((fkw.a)$$6.getSecond()).b();
               ((fkw.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<eyr>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eyr>>> $$2x = $$1x.stream().flatMap(fkj.e::d).collect(ac.b());
               eyr.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<akk, List<eyr.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eyr> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fkj.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eyr>> a(fkj.a $$0, fkw.b $$1, atw $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<akk, List<eyr.a>> a(List<fkj.e> $$0) {
      Map<akk, List<eyr.a>> $$1 = new HashMap<>();
      axk<akk, fkj.e> $$2 = new axk<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eyr.a> $$0, eyr.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eyr.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eyr.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fkk> b(fga $$0) {
      Set<fkk> $$1 = EnumSet.noneOf(fkk.class);
      if ($$0.P().c()) {
         $$1.add(fkk.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fkk.b);
      }

      return $$1;
   }

   private void a(fkj.d $$0, bmv $$1) {
      $$1.a();
      $$1.a("closing");
      this.j = null;
      this.h.values().forEach(fkl::close);
      this.h.clear();
      this.g.forEach(eyr::close);
      this.g.clear();
      Set<fkk> $$2 = b(ffw.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fkl $$3 = new fkl(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ffw.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fga $$0) {
      Set<fkk> $$1 = b($$0);

      for (fkl $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fkj.a, fkw.a>> a(List<atu> $$0, akk $$1) {
      List<Pair<fkj.a, fkw.a>> $$2 = new ArrayList<>();

      for (atu $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fkj.c $$6 = (fkj.c)fkj.c.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonParseException::new);
            List<fkw.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fkj.a $$9 = new fkj.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fhf a() {
      return new fhf(this::b, false);
   }

   public fhf b() {
      return new fhf(this::b, true);
   }

   private fkl a(akk $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fkl b(akk $$0) {
      fkl $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fkl $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fkl::close);
      this.g.forEach(eyr::close);
      this.f.close();
   }

   static record a(akk a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fkj.a a, fkk.a b, Either<CompletableFuture<Optional<eyr>>, akk> c) {

      public Optional<List<eyr.a>> a(Function<akk, List<eyr.a>> $$0) {
         return (Optional<List<eyr.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new eyr.a($$0xx, this.b))), $$1 -> {
            List<eyr.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fkj.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private eyr.a a(eyr.a $$0) {
         return new eyr.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fkw.a> b) {
      public static final Codec<fkj.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fkw.a.a.listOf().fieldOf("providers").forGetter(fkj.c::a)).apply($$0, fkj.c::new)
      );

      public List<fkw.a> a() {
         return this.b;
      }
   }

   static record d(Map<akk, List<eyr.a>> a, List<eyr> b) {
   }

   static record e(akk a, List<fkj.b> b, Set<akk> c) implements axk.a<akk> {

      public e(akk $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fkj.a $$0, fkk.a $$1, fkw.c $$2) {
         this.b.add(new fkj.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fkj.a $$0, fkk.a $$1, CompletableFuture<Optional<eyr>> $$2) {
         this.b.add(new fkj.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<eyr>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<eyr.a>> a(Function<akk, List<eyr.a>> $$0) {
         List<eyr.a> $$1 = new ArrayList<>();

         for (fkj.b $$2 : this.b) {
            Optional<List<eyr.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<akk> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<akk> $$0) {
      }
   }
}

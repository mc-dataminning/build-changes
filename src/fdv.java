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

public class fdv implements asi, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ajh a = new ajh("minecraft", "missing");
   private static final aja d = aja.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fdx f;
   private final List<esc> g = new ArrayList<>();
   private final Map<ajh, fdx> h = new HashMap<>();
   private final gja i;
   @Nullable
   private volatile fdx j;

   public fdv(gja $$0) {
      this.i = $$0;
      this.f = ac.a(new fdx($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static esc.a d() {
      return new esc.a(new fdt(), fdw.a.b);
   }

   @Override
   public CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fdv.d> a(aso $$0, Executor $$1) {
      List<CompletableFuture<fdv.e>> $$2 = new ArrayList<>();

      for (Entry<ajh, List<asm>> $$3 : d.b($$0).entrySet()) {
         ajh $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fdv.a, fei.a>> $$4x = a($$3.getValue(), $$4);
            fdv.e $$5 = new fdv.e($$4);

            for (Pair<fdv.a, fei.a> $$6 : $$4x) {
               fdv.a $$7 = (fdv.a)$$6.getFirst();
               fdw.a $$8 = ((fei.a)$$6.getSecond()).b();
               ((fei.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<esc>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<esc>>> $$2x = $$1x.stream().flatMap(fdv.e::d).collect(Collectors.toCollection(ArrayList::new));
               esc.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ajh, List<esc.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<esc> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fdv.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<esc>> a(fdv.a $$0, fei.b $$1, aso $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ajh, List<esc.a>> a(List<fdv.e> $$0) {
      Map<ajh, List<esc.a>> $$1 = new HashMap<>();
      awb<ajh, fdv.e> $$2 = new awb<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<esc.a> $$0, esc.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (esc.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (esc.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fdw> b(ezk $$0) {
      Set<fdw> $$1 = EnumSet.noneOf(fdw.class);
      if ($$0.N().c()) {
         $$1.add(fdw.a);
      }

      if ($$0.O().c()) {
         $$1.add(fdw.b);
      }

      return $$1;
   }

   private void a(fdv.d $$0, bjq $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fdx::close);
      this.h.clear();
      this.g.forEach(esc::close);
      this.g.clear();
      Set<fdw> $$2 = b(ezg.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fdx $$3 = new fdx(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(ezg.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(ezk $$0) {
      Set<fdw> $$1 = b($$0);

      for (fdx $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fdv.a, fei.a>> a(List<asm> $$0, ajh $$1) {
      List<Pair<fdv.a, fei.a>> $$2 = new ArrayList<>();

      for (asm $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fdv.c $$6 = ac.a(fdv.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fei.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fdv.a $$9 = new fdv.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public far a() {
      return new far(this::b, false);
   }

   public far b() {
      return new far(this::b, true);
   }

   private fdx a(ajh $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fdx b(ajh $$0) {
      fdx $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fdx $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fdx::close);
      this.g.forEach(esc::close);
      this.f.close();
   }

   static record a(ajh a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fdv.a a, fdw.a b, Either<CompletableFuture<Optional<esc>>, ajh> c) {

      public Optional<List<esc.a>> a(Function<ajh, List<esc.a>> $$0) {
         return (Optional<List<esc.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new esc.a($$0xx, this.b))), $$1 -> {
            List<esc.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fdv.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private esc.a a(esc.a $$0) {
         return new esc.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fei.a> b) {
      public static final Codec<fdv.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fei.a.a.listOf().fieldOf("providers").forGetter(fdv.c::a)).apply($$0, fdv.c::new)
      );

      public List<fei.a> a() {
         return this.b;
      }
   }

   static record d(Map<ajh, List<esc.a>> a, List<esc> b) {
   }

   static record e(ajh a, List<fdv.b> b, Set<ajh> c) implements awb.a<ajh> {

      public e(ajh $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fdv.a $$0, fdw.a $$1, fei.c $$2) {
         this.b.add(new fdv.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fdv.a $$0, fdw.a $$1, CompletableFuture<Optional<esc>> $$2) {
         this.b.add(new fdv.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<esc>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<esc.a>> a(Function<ajh, List<esc.a>> $$0) {
         List<esc.a> $$1 = new ArrayList<>();

         for (fdv.b $$2 : this.b) {
            Optional<List<esc.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ajh> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ajh> $$0) {
      }
   }
}

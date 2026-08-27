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

public class fge implements asw, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ajt a = new ajt("minecraft", "missing");
   private static final ajm d = ajm.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final fgg f;
   private final List<eul> g = new ArrayList<>();
   private final Map<ajt, fgg> h = new HashMap<>();
   private final glk i;
   @Nullable
   private volatile fgg j;

   public fge(glk $$0) {
      this.i = $$0;
      this.f = ac.a(new fgg($$0, a), $$0x -> $$0x.a(List.of(d()), Set.of()));
   }

   private static eul.a d() {
      return new eul.a(new fgc(), fgf.a.b);
   }

   @Override
   public CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<fge.d> a(atc $$0, Executor $$1) {
      List<CompletableFuture<fge.e>> $$2 = new ArrayList<>();

      for (Entry<ajt, List<ata>> $$3 : d.b($$0).entrySet()) {
         ajt $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<fge.a, fgr.a>> $$4x = a($$3.getValue(), $$4);
            fge.e $$5 = new fge.e($$4);

            for (Pair<fge.a, fgr.a> $$6 : $$4x) {
               fge.a $$7 = (fge.a)$$6.getFirst();
               fgf.a $$8 = ((fgr.a)$$6.getSecond()).b();
               ((fgr.a)$$6.getSecond()).a().b().ifLeft($$5x -> {
                  CompletableFuture<Optional<eul>> $$6x = this.a($$7, $$5x, $$0, $$1);
                  $$5.a($$7, $$8, $$6x);
               }).ifRight($$3xx -> $$5.a($$7, $$8, $$3xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.d($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eul>>> $$2x = $$1x.stream().flatMap(fge.e::d).collect(Collectors.toCollection(ArrayList::new));
               eul.a $$3x = d();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x.a())));
               return ac.d($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ajt, List<eul.a>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eul> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new fge.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eul>> a(fge.a $$0, fgr.b $$1, atc $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ajt, List<eul.a>> a(List<fge.e> $$0) {
      Map<ajt, List<eul.a>> $$1 = new HashMap<>();
      awp<ajt, fge.e> $$2 = new awp<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eul.a> $$0, eul.a $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eul.a $$3 : $$0) {
         $$2.addAll($$3.a().a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eul.a $$2x : Lists.reverse($$0)) {
               if ($$2x.a().a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private static Set<fgf> b(fbt $$0) {
      Set<fgf> $$1 = EnumSet.noneOf(fgf.class);
      if ($$0.P().c()) {
         $$1.add(fgf.a);
      }

      if ($$0.Q().c()) {
         $$1.add(fgf.b);
      }

      return $$1;
   }

   private void a(fge.d $$0, bko $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(fgg::close);
      this.h.clear();
      this.g.forEach(eul::close);
      this.g.clear();
      Set<fgf> $$2 = b(fbp.Q().m);
      $$1.b("reloading");
      $$0.a().forEach(($$1x, $$2x) -> {
         fgg $$3 = new fgg(this.i, $$1x);
         $$3.a(Lists.reverse($$2x), $$2);
         this.h.put($$1x, $$3);
      });
      this.g.addAll($$0.b);
      this.j = null;
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(fbp.b)) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   public void a(fbt $$0) {
      Set<fgf> $$1 = b($$0);

      for (fgg $$2 : this.h.values()) {
         $$2.a($$1);
      }
   }

   private static List<Pair<fge.a, fgr.a>> a(List<ata> $$0, ajt $$1) {
      List<Pair<fge.a, fgr.a>> $$2 = new ArrayList<>();

      for (ata $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            fge.c $$6 = ac.a(fge.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<fgr.a> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               fge.a $$9 = new fge.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public fda a() {
      return new fda(this::b, false);
   }

   public fda b() {
      return new fda(this::b, true);
   }

   private fgg a(ajt $$0) {
      return this.h.getOrDefault($$0, this.f);
   }

   private fgg b(ajt $$0) {
      fgg $$1 = this.j;
      if ($$1 != null && $$0.equals($$1.a())) {
         return $$1;
      } else {
         fgg $$2 = this.a($$0);
         this.j = $$2;
         return $$2;
      }
   }

   @Override
   public void close() {
      this.h.values().forEach(fgg::close);
      this.g.forEach(eul::close);
      this.f.close();
   }

   static record a(ajt a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(fge.a a, fgf.a b, Either<CompletableFuture<Optional<eul>>, ajt> c) {

      public Optional<List<eul.a>> a(Function<ajt, List<eul.a>> $$0) {
         return (Optional<List<eul.a>>)this.c.map($$0x -> ((Optional)$$0x.join()).map($$0xx -> List.of(new eul.a($$0xx, this.b))), $$1 -> {
            List<eul.a> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               fge.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2.stream().map(this::a).toList());
            }
         });
      }

      private eul.a a(eul.a $$0) {
         return new eul.a($$0.a(), this.b.a($$0.b()));
      }
   }

   static record c(List<fgr.a> b) {
      public static final Codec<fge.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fgr.a.a.listOf().fieldOf("providers").forGetter(fge.c::a)).apply($$0, fge.c::new)
      );

      public List<fgr.a> a() {
         return this.b;
      }
   }

   static record d(Map<ajt, List<eul.a>> a, List<eul> b) {
   }

   static record e(ajt a, List<fge.b> b, Set<ajt> c) implements awp.a<ajt> {

      public e(ajt $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(fge.a $$0, fgf.a $$1, fgr.c $$2) {
         this.b.add(new fge.b($$0, $$1, Either.right($$2.a())));
         this.c.add($$2.a());
      }

      public void a(fge.a $$0, fgf.a $$1, CompletableFuture<Optional<eul>> $$2) {
         this.b.add(new fge.b($$0, $$1, Either.left($$2)));
      }

      private Stream<CompletableFuture<Optional<eul>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.c.left().stream());
      }

      public Optional<List<eul.a>> a(Function<ajt, List<eul.a>> $$0) {
         List<eul.a> $$1 = new ArrayList<>();

         for (fge.b $$2 : this.b) {
            Optional<List<eul.a>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ajt> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ajt> $$0) {
      }
   }
}

import com.google.common.collect.ImmutableMap;
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
import org.slf4j.Logger;

public class ezm implements apw, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final ahd a = new ahd("minecraft", "missing");
   private static final agw d = agw.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ezn f;
   private final List<enw> g = new ArrayList<>();
   private final Map<ahd, ezn> h = new HashMap<>();
   private final geg i;
   private Map<ahd, ahd> j = ImmutableMap.of();

   public ezm(geg $$0) {
      this.i = $$0;
      this.f = ac.a(new ezn($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new enw[]{new ezk()})));
   }

   @Override
   public CompletableFuture<Void> a(apw.a $$0, aqc $$1, bgm $$2, bgm $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<ezm.d> a(aqc $$0, Executor $$1) {
      List<CompletableFuture<ezm.e>> $$2 = new ArrayList<>();

      for (Entry<ahd, List<aqa>> $$3 : d.b($$0).entrySet()) {
         ahd $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<ezm.a, ezx>> $$4x = a($$3.getValue(), $$4);
            ezm.e $$5 = new ezm.e($$4);

            for (Pair<ezm.a, ezx> $$6 : $$4x) {
               ezm.a $$7 = (ezm.a)$$6.getFirst();
               ((ezx)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<enw>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<enw>>> $$2x = $$1x.stream().flatMap(ezm.e::d).collect(Collectors.toCollection(ArrayList::new));
               enw $$3x = new ezk();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<ahd, List<enw>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<enw> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new ezm.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<enw>> a(ezm.a $$0, ezx.a $$1, aqc $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<ahd, List<enw>> a(List<ezm.e> $$0) {
      Map<ahd, List<enw>> $$1 = new HashMap<>();
      atn<ahd, ezm.e> $$2 = new atn<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<enw> $$0, enw $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (enw $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (enw $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(ezm.d $$0, bgm $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(ezn::close);
      this.h.clear();
      this.g.forEach(enw::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         ezn $$2 = new ezn(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eva.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<ezm.a, ezx>> a(List<aqa> $$0, ahd $$1) {
      List<Pair<ezm.a, ezx>> $$2 = new ArrayList<>();

      for (aqa $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            ezm.c $$6 = ac.a(ezm.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<ezx> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               ezm.a $$9 = new ezm.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<ahd, ahd> $$0) {
      this.j = $$0;
   }

   private ahd a(ahd $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public ewk a() {
      return new ewk($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public ewk b() {
      return new ewk($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(ezn::close);
      this.g.forEach(enw::close);
      this.f.close();
   }

   static record a(ahd a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(ezm.a a, Either<CompletableFuture<Optional<enw>>, ahd> b) {

      public Optional<List<enw>> a(Function<ahd, List<enw>> $$0) {
         return (Optional<List<enw>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<enw> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               ezm.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<ezx> b) {
      public static final Codec<ezm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ezx.b.listOf().fieldOf("providers").forGetter(ezm.c::a)).apply($$0, ezm.c::new)
      );

      public List<ezx> a() {
         return this.b;
      }
   }

   static record d(Map<ahd, List<enw>> a, List<enw> b) {
   }

   static record e(ahd a, List<ezm.b> b, Set<ahd> c) implements atn.a<ahd> {

      public e(ahd $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(ezm.a $$0, ezx.b $$1) {
         this.b.add(new ezm.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(ezm.a $$0, CompletableFuture<Optional<enw>> $$1) {
         this.b.add(new ezm.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<enw>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<enw>> a(Function<ahd, List<enw>> $$0) {
         List<enw> $$1 = new ArrayList<>();

         for (ezm.b $$2 : this.b) {
            Optional<List<enw>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<ahd> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<ahd> $$0) {
      }
   }
}

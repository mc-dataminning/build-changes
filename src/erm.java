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

public class erm implements akr, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final acq a = new acq("minecraft", "missing");
   private static final acj d = acj.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final ern f;
   private final List<egm> g = new ArrayList<>();
   private final Map<acq, ern> h = new HashMap<>();
   private final fuw i;
   private Map<acq, acq> j = ImmutableMap.of();

   public erm(fuw $$0) {
      this.i = $$0;
      this.f = ac.a(new ern($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new egm[]{new erk()})));
   }

   @Override
   public CompletableFuture<Void> a(akr.a $$0, akx $$1, ban $$2, ban $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<erm.d> a(akx $$0, Executor $$1) {
      List<CompletableFuture<erm.e>> $$2 = new ArrayList<>();

      for (Entry<acq, List<akv>> $$3 : d.b($$0).entrySet()) {
         acq $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<erm.a, erx>> $$4x = a($$3.getValue(), $$4);
            erm.e $$5 = new erm.e($$4);

            for (Pair<erm.a, erx> $$6 : $$4x) {
               erm.a $$7 = (erm.a)$$6.getFirst();
               ((erx)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<egm>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<egm>>> $$2x = $$1x.stream().flatMap(erm.e::d).collect(Collectors.toCollection(ArrayList::new));
               egm $$3x = new erk();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<acq, List<egm>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<egm> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new erm.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<egm>> a(erm.a $$0, erx.a $$1, akx $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<acq, List<egm>> a(List<erm.e> $$0) {
      Map<acq, List<egm>> $$1 = new HashMap<>();
      aof<acq, erm.e> $$2 = new aof<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<egm> $$0, egm $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (egm $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (egm $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(erm.d $$0, ban $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(ern::close);
      this.h.clear();
      this.g.forEach(egm::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         ern $$2 = new ern(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(enn.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<erm.a, erx>> a(List<akv> $$0, acq $$1) {
      List<Pair<erm.a, erx>> $$2 = new ArrayList<>();

      for (akv $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            erm.c $$6 = ac.a(erm.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<erx> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               erm.a $$9 = new erm.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<acq, acq> $$0) {
      this.j = $$0;
   }

   private acq a(acq $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public eov a() {
      return new eov($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public eov b() {
      return new eov($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(ern::close);
      this.g.forEach(egm::close);
      this.f.close();
   }

   static record a(acq a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(erm.a a, Either<CompletableFuture<Optional<egm>>, acq> b) {

      public Optional<List<egm>> a(Function<acq, List<egm>> $$0) {
         return (Optional<List<egm>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<egm> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               erm.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<erx> b) {
      public static final Codec<erm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(erx.b.listOf().fieldOf("providers").forGetter(erm.c::a)).apply($$0, erm.c::new)
      );

      public List<erx> a() {
         return this.b;
      }
   }

   static record d(Map<acq, List<egm>> a, List<egm> b) {
   }

   static record e(acq a, List<erm.b> b, Set<acq> c) implements aof.a<acq> {

      public e(acq $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(erm.a $$0, erx.b $$1) {
         this.b.add(new erm.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(erm.a $$0, CompletableFuture<Optional<egm>> $$1) {
         this.b.add(new erm.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<egm>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<egm>> a(Function<acq, List<egm>> $$0) {
         List<egm> $$1 = new ArrayList<>();

         for (erm.b $$2 : this.b) {
            Optional<List<egm>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<acq> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<acq> $$0) {
      }
   }
}

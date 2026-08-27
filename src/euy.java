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

public class euy implements anq, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final aez a = new aez("minecraft", "missing");
   private static final aes d = aes.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final euz f;
   private final List<ejm> g = new ArrayList<>();
   private final Map<aez, euz> h = new HashMap<>();
   private final fzb i;
   private Map<aez, aez> j = ImmutableMap.of();

   public euy(fzb $$0) {
      this.i = $$0;
      this.f = ac.a(new euz($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new ejm[]{new euw()})));
   }

   @Override
   public CompletableFuture<Void> a(anq.a $$0, anw $$1, bdv $$2, bdv $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<euy.d> a(anw $$0, Executor $$1) {
      List<CompletableFuture<euy.e>> $$2 = new ArrayList<>();

      for (Entry<aez, List<anu>> $$3 : d.b($$0).entrySet()) {
         aez $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<euy.a, evj>> $$4x = a($$3.getValue(), $$4);
            euy.e $$5 = new euy.e($$4);

            for (Pair<euy.a, evj> $$6 : $$4x) {
               euy.a $$7 = (euy.a)$$6.getFirst();
               ((evj)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<ejm>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<ejm>>> $$2x = $$1x.stream().flatMap(euy.e::d).collect(Collectors.toCollection(ArrayList::new));
               ejm $$3x = new euw();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<aez, List<ejm>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<ejm> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new euy.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<ejm>> a(euy.a $$0, evj.a $$1, anw $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<aez, List<ejm>> a(List<euy.e> $$0) {
      Map<aez, List<ejm>> $$1 = new HashMap<>();
      arg<aez, euy.e> $$2 = new arg<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<ejm> $$0, ejm $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (ejm $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (ejm $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(euy.d $$0, bdv $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(euz::close);
      this.h.clear();
      this.g.forEach(ejm::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         euz $$2 = new euz(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(eqp.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<euy.a, evj>> a(List<anu> $$0, aez $$1) {
      List<Pair<euy.a, evj>> $$2 = new ArrayList<>();

      for (anu $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            euy.c $$6 = ac.a(euy.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<evj> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               euy.a $$9 = new euy.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<aez, aez> $$0) {
      this.j = $$0;
   }

   private aez a(aez $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public erx a() {
      return new erx($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public erx b() {
      return new erx($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(euz::close);
      this.g.forEach(ejm::close);
      this.f.close();
   }

   static record a(aez a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(euy.a a, Either<CompletableFuture<Optional<ejm>>, aez> b) {

      public Optional<List<ejm>> a(Function<aez, List<ejm>> $$0) {
         return (Optional<List<ejm>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<ejm> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               euy.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<evj> b) {
      public static final Codec<euy.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(evj.b.listOf().fieldOf("providers").forGetter(euy.c::a)).apply($$0, euy.c::new)
      );

      public List<evj> a() {
         return this.b;
      }
   }

   static record d(Map<aez, List<ejm>> a, List<ejm> b) {
   }

   static record e(aez a, List<euy.b> b, Set<aez> c) implements arg.a<aez> {

      public e(aez $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(euy.a $$0, evj.b $$1) {
         this.b.add(new euy.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(euy.a $$0, CompletableFuture<Optional<ejm>> $$1) {
         this.b.add(new euy.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<ejm>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<ejm>> a(Function<aez, List<ejm>> $$0) {
         List<ejm> $$1 = new ArrayList<>();

         for (euy.b $$2 : this.b) {
            Optional<List<ejm>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<aez> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<aez> $$0) {
      }
   }
}

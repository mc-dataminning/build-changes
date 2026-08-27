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

public class exa implements aox, AutoCloseable {
   static final Logger b = LogUtils.getLogger();
   private static final String c = "fonts.json";
   public static final agg a = new agg("minecraft", "missing");
   private static final afz d = afz.a("font");
   private static final Gson e = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private final exb f;
   private final List<eln> g = new ArrayList<>();
   private final Map<agg, exb> h = new HashMap<>();
   private final gbi i;
   private Map<agg, agg> j = ImmutableMap.of();

   public exa(gbi $$0) {
      this.i = $$0;
      this.f = ac.a(new exb($$0, a), $$0x -> $$0x.a(Lists.newArrayList(new eln[]{new ewy()})));
   }

   @Override
   public CompletableFuture<Void> a(aox.a $$0, apd $$1, bfh $$2, bfh $$3, Executor $$4, Executor $$5) {
      $$2.a();
      $$2.b();
      return this.a($$1, $$4).thenCompose($$0::a).thenAcceptAsync($$1x -> this.a($$1x, $$3), $$5);
   }

   private CompletableFuture<exa.d> a(apd $$0, Executor $$1) {
      List<CompletableFuture<exa.e>> $$2 = new ArrayList<>();

      for (Entry<agg, List<apb>> $$3 : d.b($$0).entrySet()) {
         agg $$4 = d.b($$3.getKey());
         $$2.add(CompletableFuture.supplyAsync(() -> {
            List<Pair<exa.a, exl>> $$4x = a($$3.getValue(), $$4);
            exa.e $$5 = new exa.e($$4);

            for (Pair<exa.a, exl> $$6 : $$4x) {
               exa.a $$7 = (exa.a)$$6.getFirst();
               ((exl)$$6.getSecond()).b().ifLeft($$4xx -> {
                  CompletableFuture<Optional<eln>> $$5x = this.a($$7, $$4xx, $$0, $$1);
                  $$5.a($$7, $$5x);
               }).ifRight($$2xx -> $$5.a($$7, $$2xx));
            }

            return $$5;
         }, $$1));
      }

      return ac.b($$2)
         .thenCompose(
            $$1x -> {
               List<CompletableFuture<Optional<eln>>> $$2x = $$1x.stream().flatMap(exa.e::d).collect(Collectors.toCollection(ArrayList::new));
               eln $$3x = new ewy();
               $$2x.add(CompletableFuture.completedFuture(Optional.of($$3x)));
               return ac.b($$2x)
                  .thenCompose(
                     $$3xx -> {
                        Map<agg, List<eln>> $$4x = this.a($$1x);
                        CompletableFuture<?>[] $$5 = $$4x.values()
                           .stream()
                           .map($$2xxx -> CompletableFuture.runAsync(() -> this.a($$2xxx, $$3x), $$1))
                           .toArray(CompletableFuture[]::new);
                        return CompletableFuture.allOf($$5).thenApply($$2xxx -> {
                           List<eln> $$3xxx = $$3xx.stream().flatMap(Optional::stream).toList();
                           return new exa.d($$4x, $$3xxx);
                        });
                     }
                  );
            }
         );
   }

   private CompletableFuture<Optional<eln>> a(exa.a $$0, exl.a $$1, apd $$2, Executor $$3) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            return Optional.of($$1.load($$2));
         } catch (Exception var4x) {
            b.warn("Failed to load builder {}, rejecting", $$0, var4x);
            return Optional.empty();
         }
      }, $$3);
   }

   private Map<agg, List<eln>> a(List<exa.e> $$0) {
      Map<agg, List<eln>> $$1 = new HashMap<>();
      asn<agg, exa.e> $$2 = new asn<>();
      $$0.forEach($$1x -> $$2.a($$1x.a, $$1x));
      $$2.a(($$1x, $$2x) -> $$2x.a($$1::get).ifPresent($$2xx -> $$1.put($$1x, $$2xx)));
      return $$1;
   }

   private void a(List<eln> $$0, eln $$1) {
      $$0.add(0, $$1);
      IntSet $$2 = new IntOpenHashSet();

      for (eln $$3 : $$0) {
         $$2.addAll($$3.a());
      }

      $$2.forEach($$1x -> {
         if ($$1x != 32) {
            for (eln $$2x : Lists.reverse($$0)) {
               if ($$2x.a($$1x) != null) {
                  break;
               }
            }
         }
      });
   }

   private void a(exa.d $$0, bfh $$1) {
      $$1.a();
      $$1.a("closing");
      this.h.values().forEach(exb::close);
      this.h.clear();
      this.g.forEach(eln::close);
      this.g.clear();
      $$1.b("reloading");
      $$0.a().forEach(($$0x, $$1x) -> {
         exb $$2 = new exb(this.i, $$0x);
         $$2.a(Lists.reverse($$1x));
         this.h.put($$0x, $$2);
      });
      this.g.addAll($$0.b);
      $$1.c();
      $$1.b();
      if (!this.h.containsKey(this.a(esr.b))) {
         throw new IllegalStateException("Default font failed to load");
      }
   }

   private static List<Pair<exa.a, exl>> a(List<apb> $$0, agg $$1) {
      List<Pair<exa.a, exl>> $$2 = new ArrayList<>();

      for (apb $$3 : $$0) {
         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = (JsonElement)e.fromJson($$4, JsonElement.class);
            exa.c $$6 = ac.a(exa.c.a.parse(JsonOps.INSTANCE, $$5), JsonParseException::new);
            List<exl> $$7 = $$6.b;

            for (int $$8 = $$7.size() - 1; $$8 >= 0; $$8--) {
               exa.a $$9 = new exa.a($$1, $$3.b(), $$8);
               $$2.add(Pair.of($$9, $$7.get($$8)));
            }
         } catch (Exception var13) {
            b.warn("Unable to load font '{}' in {} in resourcepack: '{}'", new Object[]{$$1, "fonts.json", $$3.b(), var13});
         }
      }

      return $$2;
   }

   public void a(Map<agg, agg> $$0) {
      this.j = $$0;
   }

   private agg a(agg $$0) {
      return this.j.getOrDefault($$0, $$0);
   }

   public etz a() {
      return new etz($$0 -> this.h.getOrDefault(this.a($$0), this.f), false);
   }

   public etz b() {
      return new etz($$0 -> this.h.getOrDefault(this.a($$0), this.f), true);
   }

   @Override
   public void close() {
      this.h.values().forEach(exb::close);
      this.g.forEach(eln::close);
      this.f.close();
   }

   static record a(agg a, String b, int c) {
      @Override
      public String toString() {
         return "(" + this.a + ": builder #" + this.c + " from pack " + this.b + ")";
      }
   }

   static record b(exa.a a, Either<CompletableFuture<Optional<eln>>, agg> b) {

      public Optional<List<eln>> a(Function<agg, List<eln>> $$0) {
         return (Optional<List<eln>>)this.b.map($$0x -> ((Optional)$$0x.join()).map(List::of), $$1 -> {
            List<eln> $$2 = $$0.apply($$1);
            if ($$2 == null) {
               exa.b.warn("Can't find font {} referenced by builder {}, either because it's missing, failed to load or is part of loading cycle", $$1, this.a);
               return Optional.empty();
            } else {
               return Optional.of($$2);
            }
         });
      }
   }

   static record c(List<exl> b) {
      public static final Codec<exa.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(exl.b.listOf().fieldOf("providers").forGetter(exa.c::a)).apply($$0, exa.c::new)
      );

      public List<exl> a() {
         return this.b;
      }
   }

   static record d(Map<agg, List<eln>> a, List<eln> b) {
   }

   static record e(agg a, List<exa.b> b, Set<agg> c) implements asn.a<agg> {

      public e(agg $$0) {
         this($$0, new ArrayList<>(), new HashSet<>());
      }

      public void a(exa.a $$0, exl.b $$1) {
         this.b.add(new exa.b($$0, Either.right($$1.a())));
         this.c.add($$1.a());
      }

      public void a(exa.a $$0, CompletableFuture<Optional<eln>> $$1) {
         this.b.add(new exa.b($$0, Either.left($$1)));
      }

      private Stream<CompletableFuture<Optional<eln>>> d() {
         return this.b.stream().flatMap($$0 -> $$0.b.left().stream());
      }

      public Optional<List<eln>> a(Function<agg, List<eln>> $$0) {
         List<eln> $$1 = new ArrayList<>();

         for (exa.b $$2 : this.b) {
            Optional<List<eln>> $$3 = $$2.a($$0);
            if (!$$3.isPresent()) {
               return Optional.empty();
            }

            $$1.addAll($$3.get());
         }

         return Optional.of($$1);
      }

      @Override
      public void a(Consumer<agg> $$0) {
         this.c.forEach($$0);
      }

      @Override
      public void b(Consumer<agg> $$0) {
      }
   }
}

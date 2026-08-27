import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ahb {
   private static final Logger c = LogUtils.getLogger();
   public static final List<ahb.b<?>> a = List.of(
      new ahb.b<>(ke.ay, dmq.h),
      new ahb.b<>(ke.at, cuo.a),
      new ahb.b<>(ke.au, vb.a),
      new ahb.b<>(ke.av, dqt.a),
      new ahb.b<>(ke.aw, drh.a),
      new ahb.b<>(ke.aC, dyk.a),
      new ahb.b<>(ke.aD, dzg.a),
      new ahb.b<>(ke.aF, dzm.a),
      new ahb.b<>(ke.aE, edf.c),
      new ahb.b<>(ke.aG, eap.a),
      new ahb.b<>(ke.aA, dov.a),
      new ahb.b<>(ke.aB, edu.a.a),
      new ahb.b<>(ke.ax, doj.b),
      new ahb.b<>(ke.aK, dyv.a),
      new ahb.b<>(ke.az, dxh.a),
      new ahb.b<>(ke.aJ, cpe.a),
      new ahb.b<>(ke.aI, cpc.a),
      new ahb.b<>(ke.r, bkv.a),
      new ahb.b<>(ke.aL, cvc.a)
   );
   public static final List<ahb.b<?>> b = List.of(new ahb.b<>(ke.aN, dmr.a));

   public static iu.b a(aqi $$0, iu $$1, List<ahb.b<?>> $$2) {
      Map<ahf<?>, Exception> $$3 = new HashMap<>();
      List<Pair<jc<?>, ahb.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      ahe.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((ahb.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         it<?> $$2x = (it<?>)$$1x.getFirst();

         try {
            $$2x.l();
         } catch (Exception var4x) {
            $$3.put($$2x.c(), var4x);
         }
      });
      if (!$$3.isEmpty()) {
         a($$3);
         throw new IllegalStateException("Failed to load registries due to above errors");
      } else {
         return new iu.c($$4.stream().map(Pair::getFirst).toList()).d();
      }
   }

   private static ahe.b a(iu $$0, List<Pair<jc<?>, ahb.a>> $$1) {
      final Map<ahf<? extends it<?>>, ahe.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((jc)$$1x.getFirst()).c(), a((jc)$$1x.getFirst())));
      return new ahe.b() {
         @Override
         public <T> Optional<ahe.a<T>> a(ahf<? extends it<? extends T>> $$0) {
            return Optional.ofNullable((ahe.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ahe.a<T> a(jc<T> $$0) {
      return new ahe.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ahe.a<T> a(it<T> $$0) {
      return new ahe.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ahf<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ahg, Map<ahg, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ahf)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ahf)$$0x.getKey()).a(), Entry::getValue)));
      $$3.entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1x -> {
         $$2.printf("> Errors in registry %s:%n", $$1x.getKey());
         ((Map)$$1x.getValue()).entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1xx -> {
            $$2.printf(">> Errors in element %s:%n", $$1xx.getKey());
            ((Exception)$$1xx.getValue()).printStackTrace($$2);
         });
      });
      $$2.flush();
      c.error("Registry loading errors:\n{}", $$1);
   }

   private static String a(ahg $$0) {
      return $$0.a();
   }

   static <E> void a(ahe.b $$0, aqi $$1, ahf<? extends it<E>> $$2, jc<E> $$3, Decoder<E> $$4, Map<ahf<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      agz $$7 = agz.a($$6);
      ahe<JsonElement> $$8 = ahe.a(JsonOps.INSTANCE, $$0);

      for (Entry<ahg, aqg> $$9 : $$7.a($$1).entrySet()) {
         ahg $$10 = $$9.getKey();
         ahf<E> $$11 = ahf.a($$2, $$7.b($$10));
         aqg $$12 = $$9.getValue();

         try (Reader $$13 = $$12.e()) {
            JsonElement $$14 = JsonParser.parseReader($$13);
            DataResult<E> $$15 = $$4.parse($$8, $$14);
            E $$16 = (E)$$15.getOrThrow(false, $$0x -> {
            });
            $$3.a($$11, $$16, $$12.c() ? Lifecycle.stable() : $$15.lifecycle());
         } catch (Exception var20) {
            $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$10, $$12.b()), var20));
         }
      }
   }

   interface a {
      void load(aqi var1, ahe.b var2);
   }

   public static record b<T>(ahf<? extends it<T>> a, Codec<T> b) {
      Pair<jc<?>, ahb.a> a(Lifecycle $$0, Map<ahf<?>, Exception> $$1) {
         jc<T> $$2 = new ip<>(this.a, $$0);
         ahb.a $$3 = ($$2x, $$3x) -> ahb.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }

      public void a(BiConsumer<ahf<? extends it<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

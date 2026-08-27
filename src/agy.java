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

public class agy {
   private static final Logger c = LogUtils.getLogger();
   public static final List<agy.b<?>> a = List.of(
      new agy.b<>(ke.ay, dmj.h),
      new agy.b<>(ke.at, cuh.a),
      new agy.b<>(ke.au, uz.a),
      new agy.b<>(ke.av, dqm.a),
      new agy.b<>(ke.aw, dra.a),
      new agy.b<>(ke.aC, dyd.a),
      new agy.b<>(ke.aD, dyz.a),
      new agy.b<>(ke.aF, dzf.a),
      new agy.b<>(ke.aE, ecy.c),
      new agy.b<>(ke.aG, eai.a),
      new agy.b<>(ke.aA, doo.a),
      new agy.b<>(ke.aB, edn.a.a),
      new agy.b<>(ke.ax, doc.b),
      new agy.b<>(ke.aK, dyo.a),
      new agy.b<>(ke.az, dxa.a),
      new agy.b<>(ke.aJ, cox.a),
      new agy.b<>(ke.aI, cov.a),
      new agy.b<>(ke.r, bkp.a),
      new agy.b<>(ke.aL, cuv.a)
   );
   public static final List<agy.b<?>> b = List.of(new agy.b<>(ke.aN, dmk.a));

   public static iu.b a(aqc $$0, iu $$1, List<agy.b<?>> $$2) {
      Map<ahc<?>, Exception> $$3 = new HashMap<>();
      List<Pair<jc<?>, agy.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      ahb.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((agy.a)$$2x.getSecond()).load($$0, $$5));
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

   private static ahb.b a(iu $$0, List<Pair<jc<?>, agy.a>> $$1) {
      final Map<ahc<? extends it<?>>, ahb.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((jc)$$1x.getFirst()).c(), a((jc)$$1x.getFirst())));
      return new ahb.b() {
         @Override
         public <T> Optional<ahb.a<T>> a(ahc<? extends it<? extends T>> $$0) {
            return Optional.ofNullable((ahb.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ahb.a<T> a(jc<T> $$0) {
      return new ahb.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ahb.a<T> a(it<T> $$0) {
      return new ahb.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ahc<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ahd, Map<ahd, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ahc)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ahc)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ahd $$0) {
      return $$0.a();
   }

   static <E> void a(ahb.b $$0, aqc $$1, ahc<? extends it<E>> $$2, jc<E> $$3, Decoder<E> $$4, Map<ahc<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      agw $$7 = agw.a($$6);
      ahb<JsonElement> $$8 = ahb.a(JsonOps.INSTANCE, $$0);

      for (Entry<ahd, aqa> $$9 : $$7.a($$1).entrySet()) {
         ahd $$10 = $$9.getKey();
         ahc<E> $$11 = ahc.a($$2, $$7.b($$10));
         aqa $$12 = $$9.getValue();

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
      void load(aqc var1, ahb.b var2);
   }

   public static record b<T>(ahc<? extends it<T>> a, Codec<T> b) {
      Pair<jc<?>, agy.a> a(Lifecycle $$0, Map<ahc<?>, Exception> $$1) {
         jc<T> $$2 = new ip<>(this.a, $$0);
         agy.a $$3 = ($$2x, $$3x) -> agy.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }

      public void a(BiConsumer<ahc<? extends it<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

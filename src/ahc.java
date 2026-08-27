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

public class ahc {
   private static final Logger c = LogUtils.getLogger();
   public static final List<ahc.b<?>> a = List.of(
      new ahc.b<>(ke.ay, dmy.h),
      new ahc.b<>(ke.at, cuw.a),
      new ahc.b<>(ke.au, vc.a),
      new ahc.b<>(ke.av, drb.a),
      new ahc.b<>(ke.aw, drp.a),
      new ahc.b<>(ke.aC, dys.a),
      new ahc.b<>(ke.aD, dzo.a),
      new ahc.b<>(ke.aF, dzu.a),
      new ahc.b<>(ke.aE, edn.c),
      new ahc.b<>(ke.aG, eax.a),
      new ahc.b<>(ke.aA, dpd.a),
      new ahc.b<>(ke.aB, eec.a.a),
      new ahc.b<>(ke.ax, dor.b),
      new ahc.b<>(ke.aK, dzd.a),
      new ahc.b<>(ke.az, dxp.a),
      new ahc.b<>(ke.aJ, cpm.a),
      new ahc.b<>(ke.aI, cpk.a),
      new ahc.b<>(ke.r, bkx.a),
      new ahc.b<>(ke.aL, cvk.a)
   );
   public static final List<ahc.b<?>> b = List.of(new ahc.b<>(ke.aN, dmz.a));

   public static iu.b a(aqj $$0, iu $$1, List<ahc.b<?>> $$2) {
      Map<ahg<?>, Exception> $$3 = new HashMap<>();
      List<Pair<jc<?>, ahc.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      ahf.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((ahc.a)$$2x.getSecond()).load($$0, $$5));
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

   private static ahf.b a(iu $$0, List<Pair<jc<?>, ahc.a>> $$1) {
      final Map<ahg<? extends it<?>>, ahf.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((jc)$$1x.getFirst()).c(), a((jc)$$1x.getFirst())));
      return new ahf.b() {
         @Override
         public <T> Optional<ahf.a<T>> a(ahg<? extends it<? extends T>> $$0) {
            return Optional.ofNullable((ahf.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ahf.a<T> a(jc<T> $$0) {
      return new ahf.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ahf.a<T> a(it<T> $$0) {
      return new ahf.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ahg<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ahh, Map<ahh, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ahg)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ahg)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ahh $$0) {
      return $$0.a();
   }

   static <E> void a(ahf.b $$0, aqj $$1, ahg<? extends it<E>> $$2, jc<E> $$3, Decoder<E> $$4, Map<ahg<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aha $$7 = aha.a($$6);
      ahf<JsonElement> $$8 = ahf.a(JsonOps.INSTANCE, $$0);

      for (Entry<ahh, aqh> $$9 : $$7.a($$1).entrySet()) {
         ahh $$10 = $$9.getKey();
         ahg<E> $$11 = ahg.a($$2, $$7.b($$10));
         aqh $$12 = $$9.getValue();

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
      void load(aqj var1, ahf.b var2);
   }

   public static record b<T>(ahg<? extends it<T>> a, Codec<T> b) {
      Pair<jc<?>, ahc.a> a(Lifecycle $$0, Map<ahg<?>, Exception> $$1) {
         jc<T> $$2 = new ip<>(this.a, $$0);
         ahc.a $$3 = ($$2x, $$3x) -> ahc.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }

      public void a(BiConsumer<ahg<? extends it<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

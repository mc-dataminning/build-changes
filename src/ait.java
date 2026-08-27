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

public class ait {
   private static final Logger c = LogUtils.getLogger();
   public static final List<ait.b<?>> a = List.of(
      new ait.b<>(kg.ay, doo.h),
      new ait.b<>(kg.at, cwm.a),
      new ait.b<>(kg.au, vm.a),
      new ait.b<>(kg.av, dsr.a),
      new ait.b<>(kg.aw, dtf.a),
      new ait.b<>(kg.aC, eai.a),
      new ait.b<>(kg.aD, ebe.a),
      new ait.b<>(kg.aF, ebk.a),
      new ait.b<>(kg.aE, efd.c),
      new ait.b<>(kg.aG, ecn.a),
      new ait.b<>(kg.aA, dqt.a),
      new ait.b<>(kg.aB, efs.a.a),
      new ait.b<>(kg.ax, dqh.b),
      new ait.b<>(kg.aK, eat.a),
      new ait.b<>(kg.az, dzf.a),
      new ait.b<>(kg.aJ, crd.a),
      new ait.b<>(kg.aI, crb.a),
      new ait.b<>(kg.r, bmp.a),
      new ait.b<>(kg.aL, cxa.a)
   );
   public static final List<ait.b<?>> b = List.of(new ait.b<>(kg.aN, dop.a));

   public static iw.b a(asa $$0, iw $$1, List<ait.b<?>> $$2) {
      Map<aix<?>, Exception> $$3 = new HashMap<>();
      List<Pair<je<?>, ait.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aiw.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((ait.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         iv<?> $$2x = (iv<?>)$$1x.getFirst();

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
         return new iw.c($$4.stream().map(Pair::getFirst).toList()).d();
      }
   }

   private static aiw.b a(iw $$0, List<Pair<je<?>, ait.a>> $$1) {
      final Map<aix<? extends iv<?>>, aiw.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((je)$$1x.getFirst()).c(), a((je)$$1x.getFirst())));
      return new aiw.b() {
         @Override
         public <T> Optional<aiw.a<T>> a(aix<? extends iv<? extends T>> $$0) {
            return Optional.ofNullable((aiw.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aiw.a<T> a(je<T> $$0) {
      return new aiw.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aiw.a<T> a(iv<T> $$0) {
      return new aiw.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aix<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aiy, Map<aiy, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aix)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aix)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aiy $$0) {
      return $$0.a();
   }

   static <E> void a(aiw.b $$0, asa $$1, aix<? extends iv<E>> $$2, je<E> $$3, Decoder<E> $$4, Map<aix<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      air $$7 = air.a($$6);
      aiw<JsonElement> $$8 = aiw.a(JsonOps.INSTANCE, $$0);

      for (Entry<aiy, ary> $$9 : $$7.a($$1).entrySet()) {
         aiy $$10 = $$9.getKey();
         aix<E> $$11 = aix.a($$2, $$7.b($$10));
         ary $$12 = $$9.getValue();

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
      void load(asa var1, aiw.b var2);
   }

   public static record b<T>(aix<? extends iv<T>> a, Codec<T> b) {
      Pair<je<?>, ait.a> a(Lifecycle $$0, Map<aix<?>, Exception> $$1) {
         je<T> $$2 = new ir<>(this.a, $$0);
         ait.a $$3 = ($$2x, $$3x) -> ait.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }

      public void a(BiConsumer<aix<? extends iv<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

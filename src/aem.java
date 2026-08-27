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
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class aem {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aem.b<?>> a = List.of(
      new aem.b<>(jc.au, dij.h),
      new aem.b<>(jc.ap, cqk.a),
      new aem.b<>(jc.aq, tb.a),
      new aem.b<>(jc.ar, dmm.a),
      new aem.b<>(jc.as, dna.a),
      new aem.b<>(jc.ay, dud.a),
      new aem.b<>(jc.az, duz.a),
      new aem.b<>(jc.aB, dvf.a),
      new aem.b<>(jc.aA, dyr.c),
      new aem.b<>(jc.aC, dwi.a),
      new aem.b<>(jc.aw, dko.a),
      new aem.b<>(jc.ax, dzg.a.a),
      new aem.b<>(jc.at, dkc.b),
      new aem.b<>(jc.aF, duo.a),
      new aem.b<>(jc.av, dta.a),
      new aem.b<>(jc.aE, cld.a),
      new aem.b<>(jc.aD, clb.a),
      new aem.b<>(jc.p, bhi.a),
      new aem.b<>(jc.aG, cqy.a)
   );
   public static final List<aem.b<?>> b = List.of(new aem.b<>(jc.aI, dik.a));

   public static hs.b a(anm $$0, hs $$1, List<aem.b<?>> $$2) {
      Map<aeq<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ia<?>, aem.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aep.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aem.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         hr<?> $$2x = (hr<?>)$$1x.getFirst();

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
         return new hs.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static aep.b a(hs $$0, List<Pair<ia<?>, aem.a>> $$1) {
      final Map<aeq<? extends hr<?>>, aep.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ia)$$1x.getFirst()).c(), a((ia)$$1x.getFirst())));
      return new aep.b() {
         @Override
         public <T> Optional<aep.a<T>> a(aeq<? extends hr<? extends T>> $$0) {
            return Optional.ofNullable((aep.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aep.a<T> a(ia<T> $$0) {
      return new aep.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aep.a<T> a(hr<T> $$0) {
      return new aep.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aeq<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aer, Map<aer, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aeq)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aeq)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aer $$0) {
      return $$0.a();
   }

   static <E> void a(aep.b $$0, anm $$1, aeq<? extends hr<E>> $$2, ia<E> $$3, Decoder<E> $$4, Map<aeq<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aek $$7 = aek.a($$6);
      aep<JsonElement> $$8 = aep.a(JsonOps.INSTANCE, $$0);

      for (Entry<aer, ank> $$9 : $$7.a($$1).entrySet()) {
         aer $$10 = $$9.getKey();
         aeq<E> $$11 = aeq.a($$2, $$7.b($$10));
         ank $$12 = $$9.getValue();

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
      void load(anm var1, aep.b var2);
   }

   public static record b<T>(aeq<? extends hr<T>> a, Codec<T> b) {
      Pair<ia<?>, aem.a> a(Lifecycle $$0, Map<aeq<?>, Exception> $$1) {
         ia<T> $$2 = new hm<>(this.a, $$0);
         aem.a $$3 = ($$2x, $$3x) -> aem.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

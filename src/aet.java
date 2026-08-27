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

public class aet {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aet.b<?>> a = List.of(
      new aet.b<>(je.au, diu.h),
      new aet.b<>(je.ap, cqv.a),
      new aet.b<>(je.aq, tj.a),
      new aet.b<>(je.ar, dmx.a),
      new aet.b<>(je.as, dnl.a),
      new aet.b<>(je.ay, duo.a),
      new aet.b<>(je.az, dvk.a),
      new aet.b<>(je.aB, dvq.a),
      new aet.b<>(je.aA, dzc.c),
      new aet.b<>(je.aC, dwt.a),
      new aet.b<>(je.aw, dkz.a),
      new aet.b<>(je.ax, dzr.a.a),
      new aet.b<>(je.at, dkn.b),
      new aet.b<>(je.aF, duz.a),
      new aet.b<>(je.av, dtl.a),
      new aet.b<>(je.aE, clm.a),
      new aet.b<>(je.aD, clk.a),
      new aet.b<>(je.p, bhs.a),
      new aet.b<>(je.aG, crj.a)
   );
   public static final List<aet.b<?>> b = List.of(new aet.b<>(je.aI, div.a));

   public static hu.b a(anv $$0, hu $$1, List<aet.b<?>> $$2) {
      Map<aex<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ic<?>, aet.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aew.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aet.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         ht<?> $$2x = (ht<?>)$$1x.getFirst();

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
         return new hu.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static aew.b a(hu $$0, List<Pair<ic<?>, aet.a>> $$1) {
      final Map<aex<? extends ht<?>>, aew.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ic)$$1x.getFirst()).c(), a((ic)$$1x.getFirst())));
      return new aew.b() {
         @Override
         public <T> Optional<aew.a<T>> a(aex<? extends ht<? extends T>> $$0) {
            return Optional.ofNullable((aew.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aew.a<T> a(ic<T> $$0) {
      return new aew.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aew.a<T> a(ht<T> $$0) {
      return new aew.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aex<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aey, Map<aey, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aex)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aex)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aey $$0) {
      return $$0.a();
   }

   static <E> void a(aew.b $$0, anv $$1, aex<? extends ht<E>> $$2, ic<E> $$3, Decoder<E> $$4, Map<aex<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aer $$7 = aer.a($$6);
      aew<JsonElement> $$8 = aew.a(JsonOps.INSTANCE, $$0);

      for (Entry<aey, ant> $$9 : $$7.a($$1).entrySet()) {
         aey $$10 = $$9.getKey();
         aex<E> $$11 = aex.a($$2, $$7.b($$10));
         ant $$12 = $$9.getValue();

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
      void load(anv var1, aew.b var2);
   }

   public static record b<T>(aex<? extends ht<T>> a, Codec<T> b) {
      Pair<ic<?>, aet.a> a(Lifecycle $$0, Map<aex<?>, Exception> $$1) {
         ic<T> $$2 = new ho<>(this.a, $$0);
         aet.a $$3 = ($$2x, $$3x) -> aet.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

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

public class aer {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aer.b<?>> a = List.of(
      new aer.b<>(jc.au, dis.h),
      new aer.b<>(jc.ap, cqt.a),
      new aer.b<>(jc.aq, th.a),
      new aer.b<>(jc.ar, dmv.a),
      new aer.b<>(jc.as, dnj.a),
      new aer.b<>(jc.ay, dum.a),
      new aer.b<>(jc.az, dvi.a),
      new aer.b<>(jc.aB, dvo.a),
      new aer.b<>(jc.aA, dza.c),
      new aer.b<>(jc.aC, dwr.a),
      new aer.b<>(jc.aw, dkx.a),
      new aer.b<>(jc.ax, dzp.a.a),
      new aer.b<>(jc.at, dkl.b),
      new aer.b<>(jc.aF, dux.a),
      new aer.b<>(jc.av, dtj.a),
      new aer.b<>(jc.aE, clk.a),
      new aer.b<>(jc.aD, cli.a),
      new aer.b<>(jc.p, bhq.a),
      new aer.b<>(jc.aG, crh.a)
   );
   public static final List<aer.b<?>> b = List.of(new aer.b<>(jc.aI, dit.a));

   public static hr.b a(ant $$0, hr $$1, List<aer.b<?>> $$2) {
      Map<aev<?>, Exception> $$3 = new HashMap<>();
      List<Pair<hz<?>, aer.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aeu.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aer.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         hq<?> $$2x = (hq<?>)$$1x.getFirst();

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
         return new hr.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static aeu.b a(hr $$0, List<Pair<hz<?>, aer.a>> $$1) {
      final Map<aev<? extends hq<?>>, aeu.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((hz)$$1x.getFirst()).c(), a((hz)$$1x.getFirst())));
      return new aeu.b() {
         @Override
         public <T> Optional<aeu.a<T>> a(aev<? extends hq<? extends T>> $$0) {
            return Optional.ofNullable((aeu.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aeu.a<T> a(hz<T> $$0) {
      return new aeu.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aeu.a<T> a(hq<T> $$0) {
      return new aeu.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aev<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aew, Map<aew, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aev)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aev)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aew $$0) {
      return $$0.a();
   }

   static <E> void a(aeu.b $$0, ant $$1, aev<? extends hq<E>> $$2, hz<E> $$3, Decoder<E> $$4, Map<aev<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aep $$7 = aep.a($$6);
      aeu<JsonElement> $$8 = aeu.a(JsonOps.INSTANCE, $$0);

      for (Entry<aew, anr> $$9 : $$7.a($$1).entrySet()) {
         aew $$10 = $$9.getKey();
         aev<E> $$11 = aev.a($$2, $$7.b($$10));
         anr $$12 = $$9.getValue();

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
      void load(ant var1, aeu.b var2);
   }

   public static record b<T>(aev<? extends hq<T>> a, Codec<T> b) {
      Pair<hz<?>, aer.a> a(Lifecycle $$0, Map<aev<?>, Exception> $$1) {
         hz<T> $$2 = new hm<>(this.a, $$0);
         aer.a $$3 = ($$2x, $$3x) -> aer.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

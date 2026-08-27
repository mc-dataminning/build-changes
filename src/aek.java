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

public class aek {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aek.b<?>> a = List.of(
      new aek.b<>(jd.au, dih.h),
      new aek.b<>(jd.ap, cqi.a),
      new aek.b<>(jd.aq, ta.a),
      new aek.b<>(jd.ar, dmk.a),
      new aek.b<>(jd.as, dmy.a),
      new aek.b<>(jd.ay, dub.a),
      new aek.b<>(jd.az, dux.a),
      new aek.b<>(jd.aB, dvd.a),
      new aek.b<>(jd.aA, dyp.c),
      new aek.b<>(jd.aC, dwg.a),
      new aek.b<>(jd.aw, dkm.a),
      new aek.b<>(jd.ax, dze.a.a),
      new aek.b<>(jd.at, dka.b),
      new aek.b<>(jd.aF, dum.a),
      new aek.b<>(jd.av, dsy.a),
      new aek.b<>(jd.aE, clb.a),
      new aek.b<>(jd.aD, ckz.a),
      new aek.b<>(jd.p, bhg.a),
      new aek.b<>(jd.aG, cqw.a)
   );
   public static final List<aek.b<?>> b = List.of(new aek.b<>(jd.aI, dii.a));

   public static ht.b a(ank $$0, ht $$1, List<aek.b<?>> $$2) {
      Map<aeo<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ib<?>, aek.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aen.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aek.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         hs<?> $$2x = (hs<?>)$$1x.getFirst();

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
         return new ht.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static aen.b a(ht $$0, List<Pair<ib<?>, aek.a>> $$1) {
      final Map<aeo<? extends hs<?>>, aen.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ib)$$1x.getFirst()).c(), a((ib)$$1x.getFirst())));
      return new aen.b() {
         @Override
         public <T> Optional<aen.a<T>> a(aeo<? extends hs<? extends T>> $$0) {
            return Optional.ofNullable((aen.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aen.a<T> a(ib<T> $$0) {
      return new aen.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aen.a<T> a(hs<T> $$0) {
      return new aen.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aeo<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aep, Map<aep, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aeo)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aeo)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aep $$0) {
      return $$0.a();
   }

   static <E> void a(aen.b $$0, ank $$1, aeo<? extends hs<E>> $$2, ib<E> $$3, Decoder<E> $$4, Map<aeo<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aei $$7 = aei.a($$6);
      aen<JsonElement> $$8 = aen.a(JsonOps.INSTANCE, $$0);

      for (Entry<aep, ani> $$9 : $$7.a($$1).entrySet()) {
         aep $$10 = $$9.getKey();
         aeo<E> $$11 = aeo.a($$2, $$7.b($$10));
         ani $$12 = $$9.getValue();

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
      void load(ank var1, aen.b var2);
   }

   public static record b<T>(aeo<? extends hs<T>> a, Codec<T> b) {
      Pair<ib<?>, aek.a> a(Lifecycle $$0, Map<aeo<?>, Exception> $$1) {
         ib<T> $$2 = new hn<>(this.a, $$0);
         aek.a $$3 = ($$2x, $$3x) -> aek.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

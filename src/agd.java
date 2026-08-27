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

public class agd {
   private static final Logger c = LogUtils.getLogger();
   public static final List<agd.b<?>> a = List.of(
      new agd.b<>(jz.aw, dkr.h),
      new agd.b<>(jz.ar, csy.a),
      new agd.b<>(jz.as, un.a),
      new agd.b<>(jz.at, dou.a),
      new agd.b<>(jz.au, dpi.a),
      new agd.b<>(jz.aA, dwl.a),
      new agd.b<>(jz.aB, dxh.a),
      new agd.b<>(jz.aD, dxn.a),
      new agd.b<>(jz.aC, ebg.c),
      new agd.b<>(jz.aE, dyq.a),
      new agd.b<>(jz.ay, dmw.a),
      new agd.b<>(jz.az, ebv.a.a),
      new agd.b<>(jz.av, dmk.b),
      new agd.b<>(jz.aH, dww.a),
      new agd.b<>(jz.ax, dvi.a),
      new agd.b<>(jz.aG, cno.a),
      new agd.b<>(jz.aF, cnm.a),
      new agd.b<>(jz.q, bjq.a),
      new agd.b<>(jz.aI, ctm.a)
   );
   public static final List<agd.b<?>> b = List.of(new agd.b<>(jz.aK, dks.a));

   public static ip.b a(aph $$0, ip $$1, List<agd.b<?>> $$2) {
      Map<agh<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ix<?>, agd.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      agg.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((agd.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         io<?> $$2x = (io<?>)$$1x.getFirst();

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
         return new ip.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static agg.b a(ip $$0, List<Pair<ix<?>, agd.a>> $$1) {
      final Map<agh<? extends io<?>>, agg.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ix)$$1x.getFirst()).c(), a((ix)$$1x.getFirst())));
      return new agg.b() {
         @Override
         public <T> Optional<agg.a<T>> a(agh<? extends io<? extends T>> $$0) {
            return Optional.ofNullable((agg.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> agg.a<T> a(ix<T> $$0) {
      return new agg.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> agg.a<T> a(io<T> $$0) {
      return new agg.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<agh<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<agi, Map<agi, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((agh)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((agh)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(agi $$0) {
      return $$0.a();
   }

   static <E> void a(agg.b $$0, aph $$1, agh<? extends io<E>> $$2, ix<E> $$3, Decoder<E> $$4, Map<agh<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      agb $$7 = agb.a($$6);
      agg<JsonElement> $$8 = agg.a(JsonOps.INSTANCE, $$0);

      for (Entry<agi, apf> $$9 : $$7.a($$1).entrySet()) {
         agi $$10 = $$9.getKey();
         agh<E> $$11 = agh.a($$2, $$7.b($$10));
         apf $$12 = $$9.getValue();

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
      void load(aph var1, agg.b var2);
   }

   public static record b<T>(agh<? extends io<T>> a, Codec<T> b) {
      Pair<ix<?>, agd.a> a(Lifecycle $$0, Map<agh<?>, Exception> $$1) {
         ix<T> $$2 = new ik<>(this.a, $$0);
         agd.a $$3 = ($$2x, $$3x) -> agd.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

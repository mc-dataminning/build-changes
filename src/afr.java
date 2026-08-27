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

public class afr {
   private static final Logger c = LogUtils.getLogger();
   public static final List<afr.b<?>> a = List.of(
      new afr.b<>(jz.av, djk.h),
      new afr.b<>(jz.aq, crx.a),
      new afr.b<>(jz.ar, ue.a),
      new afr.b<>(jz.as, dnn.a),
      new afr.b<>(jz.at, dob.a),
      new afr.b<>(jz.az, dve.a),
      new afr.b<>(jz.aA, dwa.a),
      new afr.b<>(jz.aC, dwg.a),
      new afr.b<>(jz.aB, dzs.c),
      new afr.b<>(jz.aD, dxj.a),
      new afr.b<>(jz.ax, dlp.a),
      new afr.b<>(jz.ay, eah.a.a),
      new afr.b<>(jz.au, dld.b),
      new afr.b<>(jz.aG, dvp.a),
      new afr.b<>(jz.aw, dub.a),
      new afr.b<>(jz.aF, cmo.a),
      new afr.b<>(jz.aE, cmm.a),
      new afr.b<>(jz.q, bit.a),
      new afr.b<>(jz.aH, csl.a)
   );
   public static final List<afr.b<?>> b = List.of(new afr.b<>(jz.aJ, djl.a));

   public static ip.b a(aot $$0, ip $$1, List<afr.b<?>> $$2) {
      Map<afv<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ix<?>, afr.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      afu.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((afr.a)$$2x.getSecond()).load($$0, $$5));
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

   private static afu.b a(ip $$0, List<Pair<ix<?>, afr.a>> $$1) {
      final Map<afv<? extends io<?>>, afu.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ix)$$1x.getFirst()).c(), a((ix)$$1x.getFirst())));
      return new afu.b() {
         @Override
         public <T> Optional<afu.a<T>> a(afv<? extends io<? extends T>> $$0) {
            return Optional.ofNullable((afu.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> afu.a<T> a(ix<T> $$0) {
      return new afu.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> afu.a<T> a(io<T> $$0) {
      return new afu.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<afv<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<afw, Map<afw, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((afv)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((afv)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(afw $$0) {
      return $$0.a();
   }

   static <E> void a(afu.b $$0, aot $$1, afv<? extends io<E>> $$2, ix<E> $$3, Decoder<E> $$4, Map<afv<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      afp $$7 = afp.a($$6);
      afu<JsonElement> $$8 = afu.a(JsonOps.INSTANCE, $$0);

      for (Entry<afw, aor> $$9 : $$7.a($$1).entrySet()) {
         afw $$10 = $$9.getKey();
         afv<E> $$11 = afv.a($$2, $$7.b($$10));
         aor $$12 = $$9.getValue();

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
      void load(aot var1, afu.b var2);
   }

   public static record b<T>(afv<? extends io<T>> a, Codec<T> b) {
      Pair<ix<?>, afr.a> a(Lifecycle $$0, Map<afv<?>, Exception> $$1) {
         ix<T> $$2 = new ik<>(this.a, $$0);
         afr.a $$3 = ($$2x, $$3x) -> afr.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

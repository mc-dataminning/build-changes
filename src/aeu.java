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

public class aeu {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aeu.b<?>> a = List.of(
      new aeu.b<>(jc.av, dim.h),
      new aeu.b<>(jc.aq, cqz.a),
      new aeu.b<>(jc.ar, th.a),
      new aeu.b<>(jc.as, dmp.a),
      new aeu.b<>(jc.at, dnd.a),
      new aeu.b<>(jc.az, dug.a),
      new aeu.b<>(jc.aA, dvc.a),
      new aeu.b<>(jc.aC, dvi.a),
      new aeu.b<>(jc.aB, dyu.c),
      new aeu.b<>(jc.aD, dwl.a),
      new aeu.b<>(jc.ax, dkr.a),
      new aeu.b<>(jc.ay, dzj.a.a),
      new aeu.b<>(jc.au, dkf.b),
      new aeu.b<>(jc.aG, dur.a),
      new aeu.b<>(jc.aw, dtd.a),
      new aeu.b<>(jc.aF, clq.a),
      new aeu.b<>(jc.aE, clo.a),
      new aeu.b<>(jc.q, bhw.a),
      new aeu.b<>(jc.aH, crn.a)
   );
   public static final List<aeu.b<?>> b = List.of(new aeu.b<>(jc.aJ, din.a));

   public static hr.b a(anw $$0, hr $$1, List<aeu.b<?>> $$2) {
      Map<aey<?>, Exception> $$3 = new HashMap<>();
      List<Pair<hz<?>, aeu.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aex.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aeu.a)$$2x.getSecond()).load($$0, $$5));
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

   private static aex.b a(hr $$0, List<Pair<hz<?>, aeu.a>> $$1) {
      final Map<aey<? extends hq<?>>, aex.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((hz)$$1x.getFirst()).c(), a((hz)$$1x.getFirst())));
      return new aex.b() {
         @Override
         public <T> Optional<aex.a<T>> a(aey<? extends hq<? extends T>> $$0) {
            return Optional.ofNullable((aex.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aex.a<T> a(hz<T> $$0) {
      return new aex.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aex.a<T> a(hq<T> $$0) {
      return new aex.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aey<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aez, Map<aez, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aey)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aey)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aez $$0) {
      return $$0.a();
   }

   static <E> void a(aex.b $$0, anw $$1, aey<? extends hq<E>> $$2, hz<E> $$3, Decoder<E> $$4, Map<aey<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aes $$7 = aes.a($$6);
      aex<JsonElement> $$8 = aex.a(JsonOps.INSTANCE, $$0);

      for (Entry<aez, anu> $$9 : $$7.a($$1).entrySet()) {
         aez $$10 = $$9.getKey();
         aey<E> $$11 = aey.a($$2, $$7.b($$10));
         anu $$12 = $$9.getValue();

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
      void load(anw var1, aex.b var2);
   }

   public static record b<T>(aey<? extends hq<T>> a, Codec<T> b) {
      Pair<hz<?>, aeu.a> a(Lifecycle $$0, Map<aey<?>, Exception> $$1) {
         hz<T> $$2 = new hm<>(this.a, $$0);
         aeu.a $$3 = ($$2x, $$3x) -> aeu.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

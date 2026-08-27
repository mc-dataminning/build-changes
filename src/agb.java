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

public class agb {
   private static final Logger c = LogUtils.getLogger();
   public static final List<agb.b<?>> a = List.of(
      new agb.b<>(jz.aw, dkf.h),
      new agb.b<>(jz.ar, csq.a),
      new agb.b<>(jz.as, un.a),
      new agb.b<>(jz.at, doi.a),
      new agb.b<>(jz.au, dow.a),
      new agb.b<>(jz.aA, dvz.a),
      new agb.b<>(jz.aB, dwv.a),
      new agb.b<>(jz.aD, dxb.a),
      new agb.b<>(jz.aC, eau.c),
      new agb.b<>(jz.aE, dye.a),
      new agb.b<>(jz.ay, dmk.a),
      new agb.b<>(jz.az, ebj.a.a),
      new agb.b<>(jz.av, dly.b),
      new agb.b<>(jz.aH, dwk.a),
      new agb.b<>(jz.ax, duw.a),
      new agb.b<>(jz.aG, cng.a),
      new agb.b<>(jz.aF, cne.a),
      new agb.b<>(jz.q, bji.a),
      new agb.b<>(jz.aI, cte.a)
   );
   public static final List<agb.b<?>> b = List.of(new agb.b<>(jz.aK, dkg.a));

   public static ip.b a(apd $$0, ip $$1, List<agb.b<?>> $$2) {
      Map<agf<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ix<?>, agb.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      age.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((agb.a)$$2x.getSecond()).load($$0, $$5));
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

   private static age.b a(ip $$0, List<Pair<ix<?>, agb.a>> $$1) {
      final Map<agf<? extends io<?>>, age.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ix)$$1x.getFirst()).c(), a((ix)$$1x.getFirst())));
      return new age.b() {
         @Override
         public <T> Optional<age.a<T>> a(agf<? extends io<? extends T>> $$0) {
            return Optional.ofNullable((age.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> age.a<T> a(ix<T> $$0) {
      return new age.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> age.a<T> a(io<T> $$0) {
      return new age.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<agf<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<agg, Map<agg, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((agf)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((agf)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(agg $$0) {
      return $$0.a();
   }

   static <E> void a(age.b $$0, apd $$1, agf<? extends io<E>> $$2, ix<E> $$3, Decoder<E> $$4, Map<agf<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      afz $$7 = afz.a($$6);
      age<JsonElement> $$8 = age.a(JsonOps.INSTANCE, $$0);

      for (Entry<agg, apb> $$9 : $$7.a($$1).entrySet()) {
         agg $$10 = $$9.getKey();
         agf<E> $$11 = agf.a($$2, $$7.b($$10));
         apb $$12 = $$9.getValue();

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
      void load(apd var1, age.b var2);
   }

   public static record b<T>(agf<? extends io<T>> a, Codec<T> b) {
      Pair<ix<?>, agb.a> a(Lifecycle $$0, Map<agf<?>, Exception> $$1) {
         ix<T> $$2 = new ik<>(this.a, $$0);
         agb.a $$3 = ($$2x, $$3x) -> agb.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

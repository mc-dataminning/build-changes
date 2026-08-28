import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
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
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ala {
   private static final Logger d = LogUtils.getLogger();
   private static final ju e = new ju(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atw>, ju> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atw::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ju($$0, $$1);
   });
   public static final List<ala.c<?>> a = List.of(
      new ala.c<>(lq.aE, dvw.h),
      new ala.c<>(lq.az, dcz.a),
      new ala.c<>(lq.aA, xl.a),
      new ala.c<>(lq.aB, dzz.a),
      new ala.c<>(lq.aC, ean.a),
      new ala.c<>(lq.aI, ehq.a),
      new ala.c<>(lq.aJ, eim.a),
      new ala.c<>(lq.aL, eis.a),
      new ala.c<>(lq.aK, eml.c),
      new ala.c<>(lq.aM, ejv.a),
      new ala.c<>(lq.aG, dyb.a),
      new ala.c<>(lq.aH, ena.a.a),
      new ala.c<>(lq.aD, dxp.b),
      new ala.c<>(lq.aQ, eib.a),
      new ala.c<>(lq.aF, egn.a),
      new ala.c<>(lq.aP, cwy.a),
      new ala.c<>(lq.aO, cww.a),
      new ala.c<>(lq.m, cgl.a),
      new ala.c<>(lq.s, brr.a),
      new ala.c<>(lq.aR, ddn.a),
      new ala.c<>(lq.d, doz.a)
   );
   public static final List<ala.c<?>> b = List.of(new ala.c<>(lq.aT, dvx.a));
   public static final List<ala.c<?>> c = List.of(
      new ala.c<>(lq.az, dcz.b),
      new ala.c<>(lq.aA, xl.a),
      new ala.c<>(lq.aP, cwy.a),
      new ala.c<>(lq.aO, cww.a),
      new ala.c<>(lq.m, cgl.a),
      new ala.c<>(lq.aE, dvw.h),
      new ala.c<>(lq.s, brr.a),
      new ala.c<>(lq.d, doz.a)
   );

   public static jw.b a(aup $$0, jw $$1, List<ala.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jw.b a(Map<ale<? extends jv<?>>, List<jz.a>> $$0, aus $$1, jw $$2, List<ala.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jw.b a(ala.b $$0, jw $$1, List<ala.c<?>> $$2) {
      Map<ale<?>, Exception> $$3 = new HashMap<>();
      List<ala.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ald.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jv<?> $$2x = $$1x.b();

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
         return new jw.c($$4.stream().map(ala.a::b).toList()).d();
      }
   }

   private static ald.c a(jw $$0, List<ala.a<?>> $$1) {
      final Map<ale<? extends jv<?>>, ald.b<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new ald.c() {
         @Override
         public <T> Optional<ald.b<T>> a(ale<? extends jv<? extends T>> $$0) {
            return Optional.ofNullable((ald.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ald.b<T> a(ke<T> $$0) {
      return new ald.b<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ald.b<T> a(jv<T> $$0) {
      return new ald.b<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ale<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alf, Map<alf, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ale)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ale)$$0x.getKey()).a(), Entry::getValue)));
      $$3.entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1x -> {
         $$2.printf("> Errors in registry %s:%n", $$1x.getKey());
         ((Map)$$1x.getValue()).entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1xx -> {
            $$2.printf(">> Errors in element %s:%n", $$1xx.getKey());
            ((Exception)$$1xx.getValue()).printStackTrace($$2);
         });
      });
      $$2.flush();
      d.error("Registry loading errors:\n{}", $$1);
   }

   private static String a(alf $$0) {
      return $$0.a();
   }

   private static <E> void a(ke<E> $$0, Decoder<E> $$1, ald<JsonElement> $$2, ale<E> $$3, aun $$4, ju $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aup $$0, ald.c $$1, ke<E> $$2, Decoder<E> $$3, Map<ale<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      aky $$6 = aky.a($$5);
      ald<JsonElement> $$7 = ald.a(JsonOps.INSTANCE, $$1);

      for (Entry<alf, aun> $$8 : $$6.a($$0).entrySet()) {
         alf $$9 = $$8.getKey();
         ale<E> $$10 = ale.a($$2.c(), $$6.b($$9));
         aun $$11 = $$8.getValue();
         ju $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<ale<? extends jv<?>>, List<jz.a>> $$0, aus $$1, ald.c $$2, ke<E> $$3, Decoder<E> $$4, Map<ale<?>, Exception> $$5) {
      List<jz.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         ald<vp> $$7 = ald.a(vg.a, $$2);
         ald<JsonElement> $$8 = ald.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         aky $$10 = aky.a($$9);

         for (jz.a $$11 : $$6) {
            ale<E> $$12 = ale.a($$3.c(), $$11.a());
            Optional<vp> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alf $$17 = $$10.a($$11.a());

               try {
                  aun $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(ala.c<T> a, ke<T> b, Map<ale<?>, Exception> c) {

      public void a(aup $$0, ald.c $$1) {
         ala.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ale<? extends jv<?>>, List<jz.a>> $$0, aus $$1, ald.c $$2) {
         ala.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ala.a<?> var1, ald.c var2);
   }

   public static record c<T>(ale<? extends jv<T>> a, Codec<T> b) {

      ala.a<T> a(Lifecycle $$0, Map<ale<?>, Exception> $$1) {
         ke<T> $$2 = new jq<>(this.a, $$0);
         return new ala.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ale<? extends jv<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

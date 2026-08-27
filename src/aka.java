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

public class aka {
   private static final Logger d = LogUtils.getLogger();
   private static final jh e = new jh(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<asv>, jh> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(asv::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jh($$0, $$1);
   });
   public static final List<aka.c<?>> a = List.of(
      new aka.c<>(ld.aD, dtq.h),
      new aka.c<>(ld.ay, dat.a),
      new aka.c<>(ld.az, wo.a),
      new aka.c<>(ld.aA, dxt.a),
      new aka.c<>(ld.aB, dyh.a),
      new aka.c<>(ld.aH, efk.a),
      new aka.c<>(ld.aI, egg.a),
      new aka.c<>(ld.aK, egm.a),
      new aka.c<>(ld.aJ, ekf.c),
      new aka.c<>(ld.aL, ehp.a),
      new aka.c<>(ld.aF, dvv.a),
      new aka.c<>(ld.aG, eku.a.a),
      new aka.c<>(ld.aC, dvj.b),
      new aka.c<>(ld.aP, efv.a),
      new aka.c<>(ld.aE, eeh.a),
      new aka.c<>(ld.aO, cui.a),
      new aka.c<>(ld.aN, cug.a),
      new aka.c<>(ld.m, cdx.a),
      new aka.c<>(ld.s, bpl.a),
      new aka.c<>(ld.aQ, dbh.a),
      new aka.c<>(ld.d, dmt.a)
   );
   public static final List<aka.c<?>> b = List.of(new aka.c<>(ld.aS, dtr.a));
   public static final List<aka.c<?>> c = List.of(
      new aka.c<>(ld.ay, dat.b),
      new aka.c<>(ld.az, wo.a),
      new aka.c<>(ld.aO, cui.a),
      new aka.c<>(ld.aN, cug.a),
      new aka.c<>(ld.m, cdx.a),
      new aka.c<>(ld.aD, dtq.h),
      new aka.c<>(ld.s, bpl.a),
      new aka.c<>(ld.d, dmt.a)
   );

   public static jj.b a(ato $$0, jj $$1, List<aka.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jj.b a(Map<ake<? extends ji<?>>, List<jm.a>> $$0, atr $$1, jj $$2, List<aka.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jj.b a(aka.b $$0, jj $$1, List<aka.c<?>> $$2) {
      Map<ake<?>, Exception> $$3 = new HashMap<>();
      List<aka.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akd.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ji<?> $$2x = $$1x.b();

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
         return new jj.c($$4.stream().map(aka.a::b).toList()).d();
      }
   }

   private static akd.b a(jj $$0, List<aka.a<?>> $$1) {
      final Map<ake<? extends ji<?>>, akd.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new akd.b() {
         @Override
         public <T> Optional<akd.a<T>> a(ake<? extends ji<? extends T>> $$0) {
            return Optional.ofNullable((akd.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akd.a<T> a(jr<T> $$0) {
      return new akd.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> akd.a<T> a(ji<T> $$0) {
      return new akd.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ake<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akf, Map<akf, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ake)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ake)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(akf $$0) {
      return $$0.a();
   }

   private static <E> void a(jr<E> $$0, Decoder<E> $$1, akd<JsonElement> $$2, ake<E> $$3, atm $$4, jh $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow(false, $$0x -> {
         });
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(ato $$0, akd.b $$1, jr<E> $$2, Decoder<E> $$3, Map<ake<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      ajy $$6 = ajy.a($$5);
      akd<JsonElement> $$7 = akd.a(JsonOps.INSTANCE, $$1);

      for (Entry<akf, atm> $$8 : $$6.a($$0).entrySet()) {
         akf $$9 = $$8.getKey();
         ake<E> $$10 = ake.a($$2.c(), $$6.b($$9));
         atm $$11 = $$8.getValue();
         jh $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<ake<? extends ji<?>>, List<jm.a>> $$0, atr $$1, akd.b $$2, jr<E> $$3, Decoder<E> $$4, Map<ake<?>, Exception> $$5) {
      List<jm.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         akd<uv> $$7 = akd.a(um.a, $$2);
         akd<JsonElement> $$8 = akd.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         ajy $$10 = ajy.a($$9);

         for (jm.a $$11 : $$6) {
            ake<E> $$12 = ake.a($$3.c(), $$11.a());
            Optional<uv> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow(false, $$0x -> {
                  });
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               akf $$17 = $$10.a($$11.a());

               try {
                  atm $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(aka.c<T> a, jr<T> b, Map<ake<?>, Exception> c) {

      public void a(ato $$0, akd.b $$1) {
         aka.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ake<? extends ji<?>>, List<jm.a>> $$0, atr $$1, akd.b $$2) {
         aka.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(aka.a<?> var1, akd.b var2);
   }

   public static record c<T>(ake<? extends ji<T>> a, Codec<T> b) {

      aka.a<T> a(Lifecycle $$0, Map<ake<?>, Exception> $$1) {
         jr<T> $$2 = new jd<>(this.a, $$0);
         return new aka.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ake<? extends ji<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

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

public class akw {
   private static final Logger d = LogUtils.getLogger();
   private static final jz e = new jz(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atz>, jz> f = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atz::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jz($$0, $$1);
   });
   public static final List<akw.d<?>> a = List.of(
      new akw.d<>(lv.aK, dxw.h),
      new akw.d<>(lv.aF, det.a),
      new akw.d<>(lv.aG, wz.a),
      new akw.d<>(lv.aH, eca.a),
      new akw.d<>(lv.aI, eco.a),
      new akw.d<>(lv.aQ, ejs.a),
      new akw.d<>(lv.aR, eko.a),
      new akw.d<>(lv.aT, eku.a),
      new akw.d<>(lv.aS, eop.c),
      new akw.d<>(lv.aU, ely.a),
      new akw.d<>(lv.aO, eab.a),
      new akw.d<>(lv.aP, epe.a.a),
      new akw.d<>(lv.aJ, dzp.b),
      new akw.d<>(lv.aY, ekd.a),
      new akw.d<>(lv.aN, eip.a),
      new akw.d<>(lv.aX, cxt.a),
      new akw.d<>(lv.aW, cxr.a),
      new akw.d<>(lv.m, cgz.a, true),
      new akw.d<>(lv.X, cjv.a, true),
      new akw.d<>(lv.s, bsd.a),
      new akw.d<>(lv.aZ, dfh.a),
      new akw.d<>(lv.d, dqu.a),
      new akw.d<>(lv.aL, daw.b),
      new akw.d<>(lv.aM, dce.a),
      new akw.d<>(lv.L, cvq.a),
      new akw.d<>(lv.I, cvd.a)
   );
   public static final List<akw.d<?>> b = List.of(new akw.d<>(lv.bb, dxx.a));
   public static final List<akw.d<?>> c = List.of(
      new akw.d<>(lv.aF, det.b),
      new akw.d<>(lv.aG, wz.a),
      new akw.d<>(lv.aX, cxt.a),
      new akw.d<>(lv.aW, cxr.a),
      new akw.d<>(lv.m, cgz.a, true),
      new akw.d<>(lv.X, cjv.a, true),
      new akw.d<>(lv.aK, dxw.h),
      new akw.d<>(lv.s, bsd.a),
      new akw.d<>(lv.d, dqu.a),
      new akw.d<>(lv.aL, daw.b),
      new akw.d<>(lv.L, cvq.a),
      new akw.d<>(lv.I, cvd.a)
   );

   public static kb.b a(aus $$0, List<jp.b<?>> $$1, List<akw.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kb.b a(Map<ala<? extends ka<?>>, akw.c> $$0, auv $$1, List<jp.b<?>> $$2, List<akw.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kb.b a(akw.b $$0, List<jp.b<?>> $$1, List<akw.d<?>> $$2) {
      Map<ala<?>, Exception> $$3 = new HashMap<>();
      List<akw.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akz.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ka<?> $$2x = $$1x.b();

         try {
            $$2x.l();
         } catch (Exception var4x) {
            $$3.put($$2x.d(), var4x);
         }

         if ($$1x.a.c && $$2x.c() == 0) {
            $$3.put($$2x.d(), new IllegalStateException("Registry must be non-empty"));
         }
      });
      if (!$$3.isEmpty()) {
         a($$3);
         throw new IllegalStateException("Failed to load registries due to above errors");
      } else {
         return new kb.c($$4.stream().map(akw.a::b).toList()).f();
      }
   }

   private static akz.c a(List<jp.b<?>> $$0, List<akw.a<?>> $$1) {
      final Map<ala<? extends ka<?>>, akz.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.f(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.d(), a($$1x.b)));
      return new akz.c() {
         @Override
         public <T> Optional<akz.b<T>> a(ala<? extends ka<? extends T>> $$0) {
            return Optional.ofNullable((akz.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akz.b<T> a(kj<T> $$0) {
      return new akz.b<>($$0.p(), $$0.n(), $$0.e());
   }

   private static <T> akz.b<T> a(jp.b<T> $$0) {
      return new akz.b<>($$0, $$0, $$0.g());
   }

   private static void a(Map<ala<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alb, Map<alb, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ala)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ala)$$0x.getKey()).a(), Entry::getValue)));
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

   private static <E> void a(kj<E> $$0, Decoder<E> $$1, akz<JsonElement> $$2, ala<E> $$3, auq $$4, jz $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aus $$0, akz.c $$1, kj<E> $$2, Decoder<E> $$3, Map<ala<?>, Exception> $$4) {
      String $$5 = lv.c($$2.d());
      aku $$6 = aku.a($$5);
      akz<JsonElement> $$7 = akz.a(JsonOps.INSTANCE, $$1);

      for (Entry<alb, auq> $$8 : $$6.a($$0).entrySet()) {
         alb $$9 = $$8.getKey();
         ala<E> $$10 = ala.a($$2.d(), $$6.b($$9));
         auq $$11 = $$8.getValue();
         jz $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axj.a($$0, $$2);
   }

   static <E> void a(Map<ala<? extends ka<?>>, akw.c> $$0, auv $$1, akz.c $$2, kj<E> $$3, Decoder<E> $$4, Map<ala<?>, Exception> $$5) {
      akw.c $$6 = $$0.get($$3.d());
      if ($$6 != null) {
         akz<vc> $$7 = akz.a(ut.a, $$2);
         akz<JsonElement> $$8 = akz.a(JsonOps.INSTANCE, $$2);
         String $$9 = lv.c($$3.d());
         aku $$10 = aku.a($$9);

         for (ke.a $$11 : $$6.a) {
            ala<E> $$12 = ala.a($$3.d(), $$11.a());
            Optional<vc> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alb $$17 = $$10.a($$11.a());

               try {
                  auq $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axj.a($$6.b, $$3);
      }
   }

   static record a<T>(akw.d<T> a, kj<T> b, Map<ala<?>, Exception> c) {

      public void a(aus $$0, akz.c $$1) {
         akw.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ala<? extends ka<?>>, akw.c> $$0, auv $$1, akz.c $$2) {
         akw.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akw.a<?> var1, akz.c var2);
   }

   public static record c(List<ke.a> a, axk.a b) {
   }

   public static record d<T>(ala<? extends ka<T>> a, Codec<T> b, boolean c) {

      d(ala<? extends ka<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akw.a<T> a(Lifecycle $$0, Map<ala<?>, Exception> $$1) {
         kj<T> $$2 = new jv<>(this.a, $$0);
         return new akw.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ala<? extends ka<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

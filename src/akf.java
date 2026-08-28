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

public class akf {
   private static final Logger d = LogUtils.getLogger();
   private static final jv e = new jv(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atb>, jv> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atb::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jv($$0, $$1);
   });
   public static final List<akf.c<?>> a = List.of(
      new akf.c<>(lr.aJ, dvz.h),
      new akf.c<>(lr.aE, ddd.a),
      new akf.c<>(lr.aF, wq.a),
      new akf.c<>(lr.aG, ead.a),
      new akf.c<>(lr.aH, ear.a),
      new akf.c<>(lr.aP, ehu.a),
      new akf.c<>(lr.aQ, eiq.a),
      new akf.c<>(lr.aS, eiw.a),
      new akf.c<>(lr.aR, emp.c),
      new akf.c<>(lr.aT, ejz.a),
      new akf.c<>(lr.aN, dye.a),
      new akf.c<>(lr.aO, ene.a.a),
      new akf.c<>(lr.aI, dxs.b),
      new akf.c<>(lr.aX, eif.a),
      new akf.c<>(lr.aM, egr.a),
      new akf.c<>(lr.aW, cwh.a),
      new akf.c<>(lr.aV, cwf.a),
      new akf.c<>(lr.m, cfs.a, true),
      new akf.c<>(lr.W, cin.a, true),
      new akf.c<>(lr.s, bqy.a),
      new akf.c<>(lr.aY, ddr.a),
      new akf.c<>(lr.d, dpd.a),
      new akf.c<>(lr.aK, czj.a),
      new akf.c<>(lr.aL, daq.a)
   );
   public static final List<akf.c<?>> b = List.of(new akf.c<>(lr.ba, dwa.a));
   public static final List<akf.c<?>> c = List.of(
      new akf.c<>(lr.aE, ddd.b),
      new akf.c<>(lr.aF, wq.a),
      new akf.c<>(lr.aW, cwh.a),
      new akf.c<>(lr.aV, cwf.a),
      new akf.c<>(lr.m, cfs.a, true),
      new akf.c<>(lr.W, cin.a, true),
      new akf.c<>(lr.aJ, dvz.h),
      new akf.c<>(lr.s, bqy.a),
      new akf.c<>(lr.d, dpd.a),
      new akf.c<>(lr.aK, czj.a)
   );

   public static jx.b a(atu $$0, jx $$1, List<akf.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jx.b a(Map<akj<? extends jw<?>>, List<ka.a>> $$0, atx $$1, jx $$2, List<akf.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static jx.b a(akf.b $$0, jx $$1, List<akf.c<?>> $$2) {
      Map<akj<?>, Exception> $$3 = new HashMap<>();
      List<akf.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      aki.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jw<?> $$2x = $$1x.b();

         try {
            $$2x.m();
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
         return new jx.c($$4.stream().map(akf.a::b).toList()).d();
      }
   }

   private static aki.c a(jx $$0, List<akf.a<?>> $$1) {
      final Map<akj<? extends jw<?>>, aki.b<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.d(), a($$1x.b)));
      return new aki.c() {
         @Override
         public <T> Optional<aki.b<T>> a(akj<? extends jw<? extends T>> $$0) {
            return Optional.ofNullable((aki.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aki.b<T> a(kf<T> $$0) {
      return new aki.b<>($$0.q(), $$0.o(), $$0.e());
   }

   private static <T> aki.b<T> a(jw<T> $$0) {
      return new aki.b<>($$0.q(), $$0.v(), $$0.e());
   }

   private static void a(Map<akj<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akk, Map<akk, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akj)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akj)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(akk $$0) {
      return $$0.a();
   }

   private static <E> void a(kf<E> $$0, Decoder<E> $$1, aki<JsonElement> $$2, akj<E> $$3, ats $$4, jv $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(atu $$0, aki.c $$1, kf<E> $$2, Decoder<E> $$3, Map<akj<?>, Exception> $$4) {
      String $$5 = a($$2.d().a());
      akd $$6 = akd.a($$5);
      aki<JsonElement> $$7 = aki.a(JsonOps.INSTANCE, $$1);

      for (Entry<akk, ats> $$8 : $$6.a($$0).entrySet()) {
         akk $$9 = $$8.getKey();
         akj<E> $$10 = akj.a($$2.d(), $$6.b($$9));
         ats $$11 = $$8.getValue();
         jv $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<akj<? extends jw<?>>, List<ka.a>> $$0, atx $$1, aki.c $$2, kf<E> $$3, Decoder<E> $$4, Map<akj<?>, Exception> $$5) {
      List<ka.a> $$6 = $$0.get($$3.d());
      if ($$6 != null) {
         aki<uu> $$7 = aki.a(ul.a, $$2);
         aki<JsonElement> $$8 = aki.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.d().a());
         akd $$10 = akd.a($$9);

         for (ka.a $$11 : $$6) {
            akj<E> $$12 = akj.a($$3.d(), $$11.a());
            Optional<uu> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               akk $$17 = $$10.a($$11.a());

               try {
                  ats $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(akf.c<T> a, kf<T> b, Map<akj<?>, Exception> c) {

      public void a(atu $$0, aki.c $$1) {
         akf.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akj<? extends jw<?>>, List<ka.a>> $$0, atx $$1, aki.c $$2) {
         akf.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akf.a<?> var1, aki.c var2);
   }

   public static record c<T>(akj<? extends jw<T>> a, Codec<T> b, boolean c) {

      c(akj<? extends jw<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akf.a<T> a(Lifecycle $$0, Map<akj<?>, Exception> $$1) {
         kf<T> $$2 = new jr<>(this.a, $$0);
         return new akf.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akj<? extends jw<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

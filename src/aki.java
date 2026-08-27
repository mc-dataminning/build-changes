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

public class aki {
   private static final Logger d = LogUtils.getLogger();
   private static final jj e = new jj(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<ate>, jj> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(ate::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jj($$0, $$1);
   });
   public static final List<aki.c<?>> a = List.of(
      new aki.c<>(lf.aE, duv.h),
      new aki.c<>(lf.az, dby.a),
      new aki.c<>(lf.aA, wt.a),
      new aki.c<>(lf.aB, dyy.a),
      new aki.c<>(lf.aC, dzm.a),
      new aki.c<>(lf.aI, egp.a),
      new aki.c<>(lf.aJ, ehl.a),
      new aki.c<>(lf.aL, ehr.a),
      new aki.c<>(lf.aK, elk.c),
      new aki.c<>(lf.aM, eiu.a),
      new aki.c<>(lf.aG, dxa.a),
      new aki.c<>(lf.aH, elz.a.a),
      new aki.c<>(lf.aD, dwo.b),
      new aki.c<>(lf.aQ, eha.a),
      new aki.c<>(lf.aF, efm.a),
      new aki.c<>(lf.aP, cvx.a),
      new aki.c<>(lf.aO, cvv.a),
      new aki.c<>(lf.m, cfk.a),
      new aki.c<>(lf.s, bqr.a),
      new aki.c<>(lf.aR, dcm.a),
      new aki.c<>(lf.d, dny.a)
   );
   public static final List<aki.c<?>> b = List.of(new aki.c<>(lf.aT, duw.a));
   public static final List<aki.c<?>> c = List.of(
      new aki.c<>(lf.az, dby.b),
      new aki.c<>(lf.aA, wt.a),
      new aki.c<>(lf.aP, cvx.a),
      new aki.c<>(lf.aO, cvv.a),
      new aki.c<>(lf.m, cfk.a),
      new aki.c<>(lf.aE, duv.h),
      new aki.c<>(lf.s, bqr.a),
      new aki.c<>(lf.d, dny.a)
   );

   public static jl.b a(atx $$0, jl $$1, List<aki.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jl.b a(Map<akm<? extends jk<?>>, List<jo.a>> $$0, aua $$1, jl $$2, List<aki.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jl.b a(aki.b $$0, jl $$1, List<aki.c<?>> $$2) {
      Map<akm<?>, Exception> $$3 = new HashMap<>();
      List<aki.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akl.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jk<?> $$2x = $$1x.b();

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
         return new jl.c($$4.stream().map(aki.a::b).toList()).d();
      }
   }

   private static akl.b a(jl $$0, List<aki.a<?>> $$1) {
      final Map<akm<? extends jk<?>>, akl.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new akl.b() {
         @Override
         public <T> Optional<akl.a<T>> a(akm<? extends jk<? extends T>> $$0) {
            return Optional.ofNullable((akl.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akl.a<T> a(jt<T> $$0) {
      return new akl.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> akl.a<T> a(jk<T> $$0) {
      return new akl.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<akm<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akn, Map<akn, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akm)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akm)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(akn $$0) {
      return $$0.a();
   }

   private static <E> void a(jt<E> $$0, Decoder<E> $$1, akl<JsonElement> $$2, akm<E> $$3, atv $$4, jj $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(atx $$0, akl.b $$1, jt<E> $$2, Decoder<E> $$3, Map<akm<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      akg $$6 = akg.a($$5);
      akl<JsonElement> $$7 = akl.a(JsonOps.INSTANCE, $$1);

      for (Entry<akn, atv> $$8 : $$6.a($$0).entrySet()) {
         akn $$9 = $$8.getKey();
         akm<E> $$10 = akm.a($$2.c(), $$6.b($$9));
         atv $$11 = $$8.getValue();
         jj $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<akm<? extends jk<?>>, List<jo.a>> $$0, aua $$1, akl.b $$2, jt<E> $$3, Decoder<E> $$4, Map<akm<?>, Exception> $$5) {
      List<jo.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         akl<va> $$7 = akl.a(ur.a, $$2);
         akl<JsonElement> $$8 = akl.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         akg $$10 = akg.a($$9);

         for (jo.a $$11 : $$6) {
            akm<E> $$12 = akm.a($$3.c(), $$11.a());
            Optional<va> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               akn $$17 = $$10.a($$11.a());

               try {
                  atv $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(aki.c<T> a, jt<T> b, Map<akm<?>, Exception> c) {

      public void a(atx $$0, akl.b $$1) {
         aki.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akm<? extends jk<?>>, List<jo.a>> $$0, aua $$1, akl.b $$2) {
         aki.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(aki.a<?> var1, akl.b var2);
   }

   public static record c<T>(akm<? extends jk<T>> a, Codec<T> b) {

      aki.a<T> a(Lifecycle $$0, Map<akm<?>, Exception> $$1) {
         jt<T> $$2 = new jf<>(this.a, $$0);
         return new aki.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akm<? extends jk<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

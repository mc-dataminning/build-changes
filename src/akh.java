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

public class akh {
   private static final Logger d = LogUtils.getLogger();
   private static final jj e = new jj(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atd>, jj> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atd::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jj($$0, $$1);
   });
   public static final List<akh.c<?>> a = List.of(
      new akh.c<>(lf.aE, dut.h),
      new akh.c<>(lf.az, dbw.a),
      new akh.c<>(lf.aA, wt.a),
      new akh.c<>(lf.aB, dyw.a),
      new akh.c<>(lf.aC, dzk.a),
      new akh.c<>(lf.aI, egn.a),
      new akh.c<>(lf.aJ, ehj.a),
      new akh.c<>(lf.aL, ehp.a),
      new akh.c<>(lf.aK, eli.c),
      new akh.c<>(lf.aM, eis.a),
      new akh.c<>(lf.aG, dwy.a),
      new akh.c<>(lf.aH, elx.a.a),
      new akh.c<>(lf.aD, dwm.b),
      new akh.c<>(lf.aQ, egy.a),
      new akh.c<>(lf.aF, efk.a),
      new akh.c<>(lf.aP, cvv.a),
      new akh.c<>(lf.aO, cvt.a),
      new akh.c<>(lf.m, cfi.a),
      new akh.c<>(lf.s, bqp.a),
      new akh.c<>(lf.aR, dck.a),
      new akh.c<>(lf.d, dnw.a)
   );
   public static final List<akh.c<?>> b = List.of(new akh.c<>(lf.aT, duu.a));
   public static final List<akh.c<?>> c = List.of(
      new akh.c<>(lf.az, dbw.b),
      new akh.c<>(lf.aA, wt.a),
      new akh.c<>(lf.aP, cvv.a),
      new akh.c<>(lf.aO, cvt.a),
      new akh.c<>(lf.m, cfi.a),
      new akh.c<>(lf.aE, dut.h),
      new akh.c<>(lf.s, bqp.a),
      new akh.c<>(lf.d, dnw.a)
   );

   public static jl.b a(atw $$0, jl $$1, List<akh.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jl.b a(Map<akl<? extends jk<?>>, List<jo.a>> $$0, atz $$1, jl $$2, List<akh.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jl.b a(akh.b $$0, jl $$1, List<akh.c<?>> $$2) {
      Map<akl<?>, Exception> $$3 = new HashMap<>();
      List<akh.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akk.b $$5 = a($$1, $$4);
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
         return new jl.c($$4.stream().map(akh.a::b).toList()).d();
      }
   }

   private static akk.b a(jl $$0, List<akh.a<?>> $$1) {
      final Map<akl<? extends jk<?>>, akk.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new akk.b() {
         @Override
         public <T> Optional<akk.a<T>> a(akl<? extends jk<? extends T>> $$0) {
            return Optional.ofNullable((akk.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akk.a<T> a(jt<T> $$0) {
      return new akk.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> akk.a<T> a(jk<T> $$0) {
      return new akk.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<akl<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akm, Map<akm, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akl)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akl)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(akm $$0) {
      return $$0.a();
   }

   private static <E> void a(jt<E> $$0, Decoder<E> $$1, akk<JsonElement> $$2, akl<E> $$3, atu $$4, jj $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(atw $$0, akk.b $$1, jt<E> $$2, Decoder<E> $$3, Map<akl<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      akf $$6 = akf.a($$5);
      akk<JsonElement> $$7 = akk.a(JsonOps.INSTANCE, $$1);

      for (Entry<akm, atu> $$8 : $$6.a($$0).entrySet()) {
         akm $$9 = $$8.getKey();
         akl<E> $$10 = akl.a($$2.c(), $$6.b($$9));
         atu $$11 = $$8.getValue();
         jj $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<akl<? extends jk<?>>, List<jo.a>> $$0, atz $$1, akk.b $$2, jt<E> $$3, Decoder<E> $$4, Map<akl<?>, Exception> $$5) {
      List<jo.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         akk<va> $$7 = akk.a(ur.a, $$2);
         akk<JsonElement> $$8 = akk.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         akf $$10 = akf.a($$9);

         for (jo.a $$11 : $$6) {
            akl<E> $$12 = akl.a($$3.c(), $$11.a());
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
               akm $$17 = $$10.a($$11.a());

               try {
                  atu $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(akh.c<T> a, jt<T> b, Map<akl<?>, Exception> c) {

      public void a(atw $$0, akk.b $$1) {
         akh.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akl<? extends jk<?>>, List<jo.a>> $$0, atz $$1, akk.b $$2) {
         akh.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akh.a<?> var1, akk.b var2);
   }

   public static record c<T>(akl<? extends jk<T>> a, Codec<T> b) {

      akh.a<T> a(Lifecycle $$0, Map<akl<?>, Exception> $$1) {
         jt<T> $$2 = new jf<>(this.a, $$0);
         return new akh.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akl<? extends jk<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

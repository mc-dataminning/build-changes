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
import java.util.Comparator;
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

public class ald {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alh<?>> e = Comparator.<alh<?>, ali>comparing(alh::b).thenComparing(alh::a);
   private static final kc f = new kc(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auh>, kc> g = ae.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auh::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kc($$0, $$1);
   });
   public static final List<ald.d<?>> a = List.of(
      new ald.d<>(lz.aL, dzf.h),
      new ald.d<>(lz.aG, dgc.a),
      new ald.d<>(lz.aH, xe.a),
      new ald.d<>(lz.aI, edj.a),
      new ald.d<>(lz.aJ, edx.a),
      new ald.d<>(lz.aR, elb.a),
      new ald.d<>(lz.aS, elx.a),
      new ald.d<>(lz.aU, emd.a),
      new ald.d<>(lz.aT, epy.c),
      new ald.d<>(lz.aV, enh.a),
      new ald.d<>(lz.aP, ebk.a),
      new ald.d<>(lz.aQ, eqn.a.a),
      new ald.d<>(lz.aK, eay.b),
      new ald.d<>(lz.aZ, elm.a),
      new ald.d<>(lz.aO, ejy.a),
      new ald.d<>(lz.aY, dds.a),
      new ald.d<>(lz.aX, ddq.a),
      new ald.d<>(lz.aF, dum.b),
      new ald.d<>(lz.m, chv.a, true),
      new ald.d<>(lz.X, ckr.a, true),
      new ald.d<>(lz.s, bsw.a),
      new ald.d<>(lz.ba, dgq.a),
      new ald.d<>(lz.d, dsc.a),
      new ald.d<>(lz.aM, dbs.b),
      new ald.d<>(lz.aN, dda.a),
      new ald.d<>(lz.L, cwh.a),
      new ald.d<>(lz.I, cvu.a)
   );
   public static final List<ald.d<?>> b = List.of(new ald.d<>(lz.bc, dzg.a));
   public static final List<ald.d<?>> c = List.of(
      new ald.d<>(lz.aG, dgc.b),
      new ald.d<>(lz.aH, xe.a),
      new ald.d<>(lz.aY, dds.a),
      new ald.d<>(lz.aX, ddq.a),
      new ald.d<>(lz.m, chv.a, true),
      new ald.d<>(lz.X, ckr.a, true),
      new ald.d<>(lz.aL, dzf.h),
      new ald.d<>(lz.s, bsw.a),
      new ald.d<>(lz.d, dsc.a),
      new ald.d<>(lz.aM, dbs.b),
      new ald.d<>(lz.L, cwh.a),
      new ald.d<>(lz.I, cvu.a)
   );

   public static ke.b a(avb $$0, List<js.b<?>> $$1, List<ald.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ke.b a(Map<alh<? extends kd<?>>, ald.c> $$0, ave $$1, List<js.b<?>> $$2, List<ald.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ke.b a(ald.b $$0, List<js.b<?>> $$1, List<ald.d<?>> $$2) {
      Map<alh<?>, Exception> $$3 = new HashMap<>();
      List<ald.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alg.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         kd<?> $$2x = $$1x.b();

         try {
            $$2x.n();
         } catch (Exception var4x) {
            $$3.put($$2x.g(), var4x);
         }

         if ($$1x.a.c && $$2x.d() == 0) {
            $$3.put($$2x.g(), new IllegalStateException("Registry must be non-empty"));
         }
      });
      if (!$$3.isEmpty()) {
         throw a($$3);
      } else {
         return new ke.c($$4.stream().map(ald.a::b).toList()).e();
      }
   }

   private static alg.c a(List<js.b<?>> $$0, List<ald.a<?>> $$1) {
      final Map<alh<? extends kd<?>>, alg.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alg.c() {
         @Override
         public <T> Optional<alg.b<T>> a(alh<? extends kd<? extends T>> $$0) {
            return Optional.ofNullable((alg.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alg.b<T> a(km<T> $$0) {
      return new alg.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alg.b<T> a(js.b<T> $$0) {
      return new alg.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<alh<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alh<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ali, Map<ali, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alh)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alh)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alh<?>, Exception> $$0) {
      o $$1 = o.a(new IllegalStateException("Failed to load registries due to errors"), "Registry Loading");
      p $$2 = $$1.a("Loading info");
      $$2.a(
         "Errors",
         () -> {
            StringBuilder $$1x = new StringBuilder();
            $$0.entrySet()
               .stream()
               .sorted(Entry.comparingByKey(e))
               .forEach(
                  $$1xx -> $$1x.append("\n\t\t")
                        .append(((alh)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alh)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(km<E> $$0, Decoder<E> $$1, alg<JsonElement> $$2, alh<E> $$3, auz $$4, kc $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avb $$0, alg.c $$1, km<E> $$2, Decoder<E> $$3, Map<alh<?>, Exception> $$4) {
      String $$5 = lz.c($$2.g());
      alb $$6 = alb.a($$5);
      alg<JsonElement> $$7 = alg.a(JsonOps.INSTANCE, $$1);

      for (Entry<ali, auz> $$8 : $$6.a($$0).entrySet()) {
         ali $$9 = $$8.getKey();
         alh<E> $$10 = alh.a($$2.g(), $$6.b($$9));
         auz $$11 = $$8.getValue();
         kc $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axr.a($$0, $$2);
   }

   static <E> void a(Map<alh<? extends kd<?>>, ald.c> $$0, ave $$1, alg.c $$2, km<E> $$3, Decoder<E> $$4, Map<alh<?>, Exception> $$5) {
      ald.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alg<vh> $$7 = alg.a(uy.a, $$2);
         alg<JsonElement> $$8 = alg.a(JsonOps.INSTANCE, $$2);
         String $$9 = lz.c($$3.g());
         alb $$10 = alb.a($$9);

         for (kh.a $$11 : $$6.a) {
            alh<E> $$12 = alh.a($$3.g(), $$11.a());
            Optional<vh> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               ali $$17 = $$10.a($$11.a());

               try {
                  auz $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axr.a($$6.b, $$3);
      }
   }

   static record a<T>(ald.d<T> a, km<T> b, Map<alh<?>, Exception> c) {

      public void a(avb $$0, alg.c $$1) {
         ald.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alh<? extends kd<?>>, ald.c> $$0, ave $$1, alg.c $$2) {
         ald.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ald.a<?> var1, alg.c var2);
   }

   public static record c(List<kh.a> a, axs.a b) {
   }

   public static record d<T>(alh<? extends kd<T>> a, Codec<T> b, boolean c) {

      d(alh<? extends kd<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      ald.a<T> a(Lifecycle $$0, Map<alh<?>, Exception> $$1) {
         km<T> $$2 = new jy<>(this.a, $$0);
         return new ald.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alh<? extends kd<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

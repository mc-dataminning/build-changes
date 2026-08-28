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

public class akz {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<ald<?>> e = Comparator.<ald<?>, ale>comparing(ald::b).thenComparing(ald::a);
   private static final ka f = new ka(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auc>, ka> g = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auc::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ka($$0, $$1);
   });
   public static final List<akz.d<?>> a = List.of(
      new akz.d<>(lw.aM, dyo.h),
      new akz.d<>(lw.aH, dfk.a),
      new akz.d<>(lw.aI, xa.a),
      new akz.d<>(lw.aJ, ecs.a),
      new akz.d<>(lw.aK, edg.a),
      new akz.d<>(lw.aS, ekk.a),
      new akz.d<>(lw.aT, elg.a),
      new akz.d<>(lw.aV, elm.a),
      new akz.d<>(lw.aU, eph.c),
      new akz.d<>(lw.aW, emq.a),
      new akz.d<>(lw.aQ, eat.a),
      new akz.d<>(lw.aR, epw.a.a),
      new akz.d<>(lw.aL, eah.b),
      new akz.d<>(lw.ba, ekv.a),
      new akz.d<>(lw.aP, ejh.a),
      new akz.d<>(lw.aZ, cxx.a),
      new akz.d<>(lw.aY, cxv.a),
      new akz.d<>(lw.aG, dtv.b),
      new akz.d<>(lw.m, chh.a, true),
      new akz.d<>(lw.X, ckd.a, true),
      new akz.d<>(lw.s, bsl.a),
      new akz.d<>(lw.bb, dfy.a),
      new akz.d<>(lw.d, drl.a),
      new akz.d<>(lw.aN, dbn.b),
      new akz.d<>(lw.aO, dcv.a),
      new akz.d<>(lw.L, cvy.a),
      new akz.d<>(lw.I, cvk.a)
   );
   public static final List<akz.d<?>> b = List.of(new akz.d<>(lw.bd, dyp.a));
   public static final List<akz.d<?>> c = List.of(
      new akz.d<>(lw.aH, dfk.b),
      new akz.d<>(lw.aI, xa.a),
      new akz.d<>(lw.aZ, cxx.a),
      new akz.d<>(lw.aY, cxv.a),
      new akz.d<>(lw.m, chh.a, true),
      new akz.d<>(lw.X, ckd.a, true),
      new akz.d<>(lw.aM, dyo.h),
      new akz.d<>(lw.s, bsl.a),
      new akz.d<>(lw.d, drl.a),
      new akz.d<>(lw.aN, dbn.b),
      new akz.d<>(lw.L, cvy.a),
      new akz.d<>(lw.I, cvk.a)
   );

   public static kc.b a(auv $$0, List<jq.b<?>> $$1, List<akz.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kc.b a(Map<ald<? extends kb<?>>, akz.c> $$0, auz $$1, List<jq.b<?>> $$2, List<akz.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kc.b a(akz.b $$0, List<jq.b<?>> $$1, List<akz.d<?>> $$2) {
      Map<ald<?>, Exception> $$3 = new HashMap<>();
      List<akz.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alc.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         kb<?> $$2x = $$1x.b();

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
         return new kc.c($$4.stream().map(akz.a::b).toList()).e();
      }
   }

   private static alc.c a(List<jq.b<?>> $$0, List<akz.a<?>> $$1) {
      final Map<ald<? extends kb<?>>, alc.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alc.c() {
         @Override
         public <T> Optional<alc.b<T>> a(ald<? extends kb<? extends T>> $$0) {
            return Optional.ofNullable((alc.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alc.b<T> a(kk<T> $$0) {
      return new alc.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alc.b<T> a(jq.b<T> $$0) {
      return new alc.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<ald<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<ald<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ale, Map<ale, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ald)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ald)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<ald<?>, Exception> $$0) {
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
                        .append(((ald)$$1xx.getKey()).b())
                        .append("/")
                        .append(((ald)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(kk<E> $$0, Decoder<E> $$1, alc<JsonElement> $$2, ald<E> $$3, aut $$4, ka $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(auv $$0, alc.c $$1, kk<E> $$2, Decoder<E> $$3, Map<ald<?>, Exception> $$4) {
      String $$5 = lw.c($$2.g());
      akx $$6 = akx.a($$5);
      alc<JsonElement> $$7 = alc.a(JsonOps.INSTANCE, $$1);

      for (Entry<ale, aut> $$8 : $$6.a($$0).entrySet()) {
         ale $$9 = $$8.getKey();
         ald<E> $$10 = ald.a($$2.g(), $$6.b($$9));
         aut $$11 = $$8.getValue();
         ka $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axm.a($$0, $$2);
   }

   static <E> void a(Map<ald<? extends kb<?>>, akz.c> $$0, auz $$1, alc.c $$2, kk<E> $$3, Decoder<E> $$4, Map<ald<?>, Exception> $$5) {
      akz.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alc<vd> $$7 = alc.a(uu.a, $$2);
         alc<JsonElement> $$8 = alc.a(JsonOps.INSTANCE, $$2);
         String $$9 = lw.c($$3.g());
         akx $$10 = akx.a($$9);

         for (kf.a $$11 : $$6.a) {
            ald<E> $$12 = ald.a($$3.g(), $$11.a());
            Optional<vd> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               ale $$17 = $$10.a($$11.a());

               try {
                  aut $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axm.a($$6.b, $$3);
      }
   }

   static record a<T>(akz.d<T> a, kk<T> b, Map<ald<?>, Exception> c) {

      public void a(auv $$0, alc.c $$1) {
         akz.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ald<? extends kb<?>>, akz.c> $$0, auz $$1, alc.c $$2) {
         akz.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akz.a<?> var1, alc.c var2);
   }

   public static record c(List<kf.a> a, axn.a b) {
   }

   public static record d<T>(ald<? extends kb<T>> a, Codec<T> b, boolean c) {

      d(ald<? extends kb<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akz.a<T> a(Lifecycle $$0, Map<ald<?>, Exception> $$1) {
         kk<T> $$2 = new jw<>(this.a, $$0);
         return new akz.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ald<? extends kb<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

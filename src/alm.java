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

public class alm {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alq<?>> e = Comparator.<alq<?>, alr>comparing(alq::b).thenComparing(alq::a);
   private static final js f = new js(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auu>, js> g = ag.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auu::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new js($$0, $$1);
   });
   public static final List<alm.d<?>> a = List.of(
      new alm.d<>(mi.aP, efn.h),
      new alm.d<>(mi.aG, dlm.a),
      new alm.d<>(mi.aI, xc.a),
      new alm.d<>(mi.aK, ejt.a),
      new alm.d<>(mi.aL, ekh.a),
      new alm.d<>(mi.bb, err.a),
      new alm.d<>(mi.be, esn.a),
      new alm.d<>(mi.bd, est.a),
      new alm.d<>(mi.bc, ewo.c),
      new alm.d<>(mi.bf, etx.a),
      new alm.d<>(mi.aX, ehu.a),
      new alm.d<>(mi.aY, exd.a.a),
      new alm.d<>(mi.aO, ehi.b),
      new alm.d<>(mi.bo, esc.a),
      new alm.d<>(mi.aS, eqo.a),
      new alm.d<>(mi.bl, diz.a),
      new alm.d<>(mi.bk, dix.a),
      new alm.d<>(mi.bi, eas.b),
      new alm.d<>(mi.bm, cna.a, true),
      new alm.d<>(mi.bn, cmy.a, true),
      new alm.d<>(mi.ba, ckr.a, true),
      new alm.d<>(mi.aT, clu.a, true),
      new alm.d<>(mi.aH, cjz.a, true),
      new alm.d<>(mi.aM, ckg.a, true),
      new alm.d<>(mi.aJ, ckc.a, true),
      new alm.d<>(mi.aZ, coj.a, true),
      new alm.d<>(mi.aN, bvv.a),
      new alm.d<>(mi.aW, dma.a),
      new alm.d<>(mi.aF, dyd.a),
      new alm.d<>(mi.aR, dgx.b),
      new alm.d<>(mi.aQ, dif.a),
      new alm.d<>(mi.aV, daq.a),
      new alm.d<>(mi.aU, dad.a),
      new alm.d<>(mi.bg, tm.a),
      new alm.d<>(mi.bh, ss.b)
   );
   public static final List<alm.d<?>> b = List.of(new alm.d<>(mi.bq, efo.a));
   public static final List<alm.d<?>> c = List.of(
      new alm.d<>(mi.aG, dlm.b),
      new alm.d<>(mi.aI, xc.a),
      new alm.d<>(mi.bl, diz.a),
      new alm.d<>(mi.bk, dix.a),
      new alm.d<>(mi.bm, cna.b, true),
      new alm.d<>(mi.bn, cmy.b, true),
      new alm.d<>(mi.ba, ckr.b, true),
      new alm.d<>(mi.aT, clu.b, true),
      new alm.d<>(mi.aH, cjz.b, true),
      new alm.d<>(mi.aM, ckg.b, true),
      new alm.d<>(mi.aJ, ckc.b, true),
      new alm.d<>(mi.aZ, coj.a, true),
      new alm.d<>(mi.aP, efn.h),
      new alm.d<>(mi.aN, bvv.a),
      new alm.d<>(mi.aF, dyd.a),
      new alm.d<>(mi.aR, dgx.b),
      new alm.d<>(mi.aV, daq.a),
      new alm.d<>(mi.aU, dad.a),
      new alm.d<>(mi.bg, tm.a),
      new alm.d<>(mi.bh, ss.b)
   );

   public static ju.b a(avo $$0, List<ji.b<?>> $$1, List<alm.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ju.b a(Map<alq<? extends jt<?>>, alm.c> $$0, avr $$1, List<ji.b<?>> $$2, List<alm.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ju.b a(alm.b $$0, List<ji.b<?>> $$1, List<alm.d<?>> $$2) {
      Map<alq<?>, Exception> $$3 = new HashMap<>();
      List<alm.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alp.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jt<?> $$2x = $$1x.b();

         try {
            $$2x.n();
         } catch (Exception var4x) {
            $$3.put($$2x.g(), var4x);
         }

         if ($$1x.a.c && $$2x.d() == 0) {
            $$3.put($$2x.g(), new IllegalStateException("Registry must be non-empty: " + $$2x.g().a()));
         }
      });
      if (!$$3.isEmpty()) {
         throw a($$3);
      } else {
         return new ju.c($$4.stream().map(alm.a::b).toList()).e();
      }
   }

   private static alp.c a(List<ji.b<?>> $$0, List<alm.a<?>> $$1) {
      final Map<alq<? extends jt<?>>, alp.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alp.c() {
         @Override
         public <T> Optional<alp.b<T>> a(alq<? extends jt<? extends T>> $$0) {
            return Optional.ofNullable((alp.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alp.b<T> a(kc<T> $$0) {
      return new alp.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alp.b<T> a(ji.b<T> $$0) {
      return new alp.b<>($$0, $$0, $$0.h());
   }

   private static aa a(Map<alq<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alq<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alr, Map<alr, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alq)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alq)$$0x.getKey()).a(), Entry::getValue)));
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

   private static aa c(Map<alq<?>, Exception> $$0) {
      p $$1 = p.a(new IllegalStateException("Failed to load registries due to errors"), "Registry Loading");
      q $$2 = $$1.a("Loading info");
      $$2.a(
         "Errors",
         () -> {
            StringBuilder $$1x = new StringBuilder();
            $$0.entrySet()
               .stream()
               .sorted(Entry.comparingByKey(e))
               .forEach(
                  $$1xx -> $$1x.append("\n\t\t")
                        .append(((alq)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alq)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new aa($$1);
   }

   private static <E> void a(kc<E> $$0, Decoder<E> $$1, alp<JsonElement> $$2, alq<E> $$3, avm $$4, js $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avo $$0, alp.c $$1, kc<E> $$2, Decoder<E> $$3, Map<alq<?>, Exception> $$4) {
      alk $$5 = alk.a($$2.g());
      alp<JsonElement> $$6 = alp.a(JsonOps.INSTANCE, $$1);

      for (Entry<alr, avm> $$7 : $$5.a($$0).entrySet()) {
         alr $$8 = $$7.getKey();
         alq<E> $$9 = alq.a($$2.g(), $$5.b($$8));
         avm $$10 = $$7.getValue();
         js $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      ayd.a($$0, $$2);
   }

   static <E> void a(Map<alq<? extends jt<?>>, alm.c> $$0, avr $$1, alp.c $$2, kc<E> $$3, Decoder<E> $$4, Map<alq<?>, Exception> $$5) {
      alm.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alp<va> $$7 = alp.a(uo.a, $$2);
         alp<JsonElement> $$8 = alp.a(JsonOps.INSTANCE, $$2);
         alk $$9 = alk.a($$3.g());

         for (jx.a $$10 : $$6.a) {
            alq<E> $$11 = alq.a($$3.g(), $$10.a());
            Optional<va> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               alr $$16 = $$9.a($$10.a());

               try {
                  avm $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         ayd.a($$6.b, $$3);
      }
   }

   static record a<T>(alm.d<T> a, kc<T> b, Map<alq<?>, Exception> c) {

      public void a(avo $$0, alp.c $$1) {
         alm.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alq<? extends jt<?>>, alm.c> $$0, avr $$1, alp.c $$2) {
         alm.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alm.a<?> var1, alp.c var2);
   }

   public static record c(List<jx.a> a, aye.a b) {
   }

   public static record d<T>(alq<? extends jt<T>> a, Codec<T> b, boolean c) {

      d(alq<? extends jt<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alm.a<T> a(Lifecycle $$0, Map<alq<?>, Exception> $$1) {
         kc<T> $$2 = new jo<>(this.a, $$0);
         return new alm.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alq<? extends jt<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

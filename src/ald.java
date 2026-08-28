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
   private static final jr f = new jr(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<aul>, jr> g = ag.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(aul::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jr($$0, $$1);
   });
   public static final List<ald.d<?>> a = List.of(
      new ald.d<>(mh.aP, efb.h),
      new ald.d<>(mh.aG, dla.a),
      new ald.d<>(mh.aI, ww.a),
      new ald.d<>(mh.aK, ejh.a),
      new ald.d<>(mh.aL, ejv.a),
      new ald.d<>(mh.bb, erf.a),
      new ald.d<>(mh.be, esb.a),
      new ald.d<>(mh.bd, esh.a),
      new ald.d<>(mh.bc, ewc.c),
      new ald.d<>(mh.bf, etl.a),
      new ald.d<>(mh.aX, ehi.a),
      new ald.d<>(mh.aY, ewr.a.a),
      new ald.d<>(mh.aO, egw.b),
      new ald.d<>(mh.bo, erq.a),
      new ald.d<>(mh.aS, eqc.a),
      new ald.d<>(mh.bl, din.a),
      new ald.d<>(mh.bk, dil.a),
      new ald.d<>(mh.bi, eag.b),
      new ald.d<>(mh.bm, cmp.a, true),
      new ald.d<>(mh.bn, cmn.a, true),
      new ald.d<>(mh.ba, ckg.a, true),
      new ald.d<>(mh.aT, clj.a, true),
      new ald.d<>(mh.aH, cjo.a, true),
      new ald.d<>(mh.aM, cjv.a, true),
      new ald.d<>(mh.aJ, cjr.a, true),
      new ald.d<>(mh.aZ, cny.a, true),
      new ald.d<>(mh.aN, bvk.a),
      new ald.d<>(mh.aW, dlo.a),
      new ald.d<>(mh.aF, dxr.a),
      new ald.d<>(mh.aR, dgl.b),
      new ald.d<>(mh.aQ, dht.a),
      new ald.d<>(mh.aV, dae.a),
      new ald.d<>(mh.aU, czr.a),
      new ald.d<>(mh.bg, tl.a),
      new ald.d<>(mh.bh, sr.b)
   );
   public static final List<ald.d<?>> b = List.of(new ald.d<>(mh.bq, efc.a));
   public static final List<ald.d<?>> c = List.of(
      new ald.d<>(mh.aG, dla.b),
      new ald.d<>(mh.aI, ww.a),
      new ald.d<>(mh.bl, din.a),
      new ald.d<>(mh.bk, dil.a),
      new ald.d<>(mh.bm, cmp.b, true),
      new ald.d<>(mh.bn, cmn.b, true),
      new ald.d<>(mh.ba, ckg.b, true),
      new ald.d<>(mh.aT, clj.b, true),
      new ald.d<>(mh.aH, cjo.b, true),
      new ald.d<>(mh.aM, cjv.b, true),
      new ald.d<>(mh.aJ, cjr.b, true),
      new ald.d<>(mh.aZ, cny.a, true),
      new ald.d<>(mh.aP, efb.h),
      new ald.d<>(mh.aN, bvk.a),
      new ald.d<>(mh.aF, dxr.a),
      new ald.d<>(mh.aR, dgl.b),
      new ald.d<>(mh.aV, dae.a),
      new ald.d<>(mh.aU, czr.a),
      new ald.d<>(mh.bg, tl.a),
      new ald.d<>(mh.bh, sr.b)
   );

   public static jt.b a(avf $$0, List<jh.b<?>> $$1, List<ald.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jt.b a(Map<alh<? extends js<?>>, ald.c> $$0, avi $$1, List<jh.b<?>> $$2, List<ald.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static jt.b a(ald.b $$0, List<jh.b<?>> $$1, List<ald.d<?>> $$2) {
      Map<alh<?>, Exception> $$3 = new HashMap<>();
      List<ald.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alg.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         js<?> $$2x = $$1x.b();

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
         return new jt.c($$4.stream().map(ald.a::b).toList()).e();
      }
   }

   private static alg.c a(List<jh.b<?>> $$0, List<ald.a<?>> $$1) {
      final Map<alh<? extends js<?>>, alg.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alg.c() {
         @Override
         public <T> Optional<alg.b<T>> a(alh<? extends js<? extends T>> $$0) {
            return Optional.ofNullable((alg.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alg.b<T> a(kb<T> $$0) {
      return new alg.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alg.b<T> a(jh.b<T> $$0) {
      return new alg.b<>($$0, $$0, $$0.h());
   }

   private static aa a(Map<alh<?>, Exception> $$0) {
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

   private static aa c(Map<alh<?>, Exception> $$0) {
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
                        .append(((alh)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alh)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new aa($$1);
   }

   private static <E> void a(kb<E> $$0, Decoder<E> $$1, alg<JsonElement> $$2, alh<E> $$3, avd $$4, jr $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avf $$0, alg.c $$1, kb<E> $$2, Decoder<E> $$3, Map<alh<?>, Exception> $$4) {
      alb $$5 = alb.a($$2.g());
      alg<JsonElement> $$6 = alg.a(JsonOps.INSTANCE, $$1);

      for (Entry<ali, avd> $$7 : $$5.a($$0).entrySet()) {
         ali $$8 = $$7.getKey();
         alh<E> $$9 = alh.a($$2.g(), $$5.b($$8));
         avd $$10 = $$7.getValue();
         jr $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axu.a($$0, $$2);
   }

   static <E> void a(Map<alh<? extends js<?>>, ald.c> $$0, avi $$1, alg.c $$2, kb<E> $$3, Decoder<E> $$4, Map<alh<?>, Exception> $$5) {
      ald.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alg<uy> $$7 = alg.a(un.a, $$2);
         alg<JsonElement> $$8 = alg.a(JsonOps.INSTANCE, $$2);
         alb $$9 = alb.a($$3.g());

         for (jw.a $$10 : $$6.a) {
            alh<E> $$11 = alh.a($$3.g(), $$10.a());
            Optional<uy> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               ali $$16 = $$9.a($$10.a());

               try {
                  avd $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axu.a($$6.b, $$3);
      }
   }

   static record a<T>(ald.d<T> a, kb<T> b, Map<alh<?>, Exception> c) {

      public void a(avf $$0, alg.c $$1) {
         ald.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alh<? extends js<?>>, ald.c> $$0, avi $$1, alg.c $$2) {
         ald.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ald.a<?> var1, alg.c var2);
   }

   public static record c(List<jw.a> a, axv.a b) {
   }

   public static record d<T>(alh<? extends js<T>> a, Codec<T> b, boolean c) {

      d(alh<? extends js<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      ald.a<T> a(Lifecycle $$0, Map<alh<?>, Exception> $$1) {
         kb<T> $$2 = new jn<>(this.a, $$0);
         return new ald.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alh<? extends js<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

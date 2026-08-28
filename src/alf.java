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

public class alf {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alj<?>> e = Comparator.<alj<?>, alk>comparing(alj::b).thenComparing(alj::a);
   private static final js f = new js(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<aun>, js> g = ag.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(aun::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new js($$0, $$1);
   });
   public static final List<alf.d<?>> a = List.of(
      new alf.d<>(mi.aP, efd.h),
      new alf.d<>(mi.aG, dlc.a),
      new alf.d<>(mi.aI, wy.a),
      new alf.d<>(mi.aK, ejj.a),
      new alf.d<>(mi.aL, ejx.a),
      new alf.d<>(mi.bb, erh.a),
      new alf.d<>(mi.be, esd.a),
      new alf.d<>(mi.bd, esj.a),
      new alf.d<>(mi.bc, ewe.c),
      new alf.d<>(mi.bf, etn.a),
      new alf.d<>(mi.aX, ehk.a),
      new alf.d<>(mi.aY, ewt.a.a),
      new alf.d<>(mi.aO, egy.b),
      new alf.d<>(mi.bo, ers.a),
      new alf.d<>(mi.aS, eqe.a),
      new alf.d<>(mi.bl, dip.a),
      new alf.d<>(mi.bk, din.a),
      new alf.d<>(mi.bi, eai.b),
      new alf.d<>(mi.bm, cmr.a, true),
      new alf.d<>(mi.bn, cmp.a, true),
      new alf.d<>(mi.ba, cki.a, true),
      new alf.d<>(mi.aT, cll.a, true),
      new alf.d<>(mi.aH, cjq.a, true),
      new alf.d<>(mi.aM, cjx.a, true),
      new alf.d<>(mi.aJ, cjt.a, true),
      new alf.d<>(mi.aZ, coa.a, true),
      new alf.d<>(mi.aN, bvm.a),
      new alf.d<>(mi.aW, dlq.a),
      new alf.d<>(mi.aF, dxt.a),
      new alf.d<>(mi.aR, dgn.b),
      new alf.d<>(mi.aQ, dhv.a),
      new alf.d<>(mi.aV, dag.a),
      new alf.d<>(mi.aU, czt.a),
      new alf.d<>(mi.bg, tm.a),
      new alf.d<>(mi.bh, ss.b)
   );
   public static final List<alf.d<?>> b = List.of(new alf.d<>(mi.bq, efe.a));
   public static final List<alf.d<?>> c = List.of(
      new alf.d<>(mi.aG, dlc.b),
      new alf.d<>(mi.aI, wy.a),
      new alf.d<>(mi.bl, dip.a),
      new alf.d<>(mi.bk, din.a),
      new alf.d<>(mi.bm, cmr.b, true),
      new alf.d<>(mi.bn, cmp.b, true),
      new alf.d<>(mi.ba, cki.b, true),
      new alf.d<>(mi.aT, cll.b, true),
      new alf.d<>(mi.aH, cjq.b, true),
      new alf.d<>(mi.aM, cjx.b, true),
      new alf.d<>(mi.aJ, cjt.b, true),
      new alf.d<>(mi.aZ, coa.a, true),
      new alf.d<>(mi.aP, efd.h),
      new alf.d<>(mi.aN, bvm.a),
      new alf.d<>(mi.aF, dxt.a),
      new alf.d<>(mi.aR, dgn.b),
      new alf.d<>(mi.aV, dag.a),
      new alf.d<>(mi.aU, czt.a),
      new alf.d<>(mi.bg, tm.a),
      new alf.d<>(mi.bh, ss.b)
   );

   public static ju.b a(avh $$0, List<ji.b<?>> $$1, List<alf.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ju.b a(Map<alj<? extends jt<?>>, alf.c> $$0, avk $$1, List<ji.b<?>> $$2, List<alf.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ju.b a(alf.b $$0, List<ji.b<?>> $$1, List<alf.d<?>> $$2) {
      Map<alj<?>, Exception> $$3 = new HashMap<>();
      List<alf.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ali.c $$5 = a($$1, $$4);
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
         return new ju.c($$4.stream().map(alf.a::b).toList()).e();
      }
   }

   private static ali.c a(List<ji.b<?>> $$0, List<alf.a<?>> $$1) {
      final Map<alj<? extends jt<?>>, ali.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new ali.c() {
         @Override
         public <T> Optional<ali.b<T>> a(alj<? extends jt<? extends T>> $$0) {
            return Optional.ofNullable((ali.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ali.b<T> a(kc<T> $$0) {
      return new ali.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> ali.b<T> a(ji.b<T> $$0) {
      return new ali.b<>($$0, $$0, $$0.h());
   }

   private static aa a(Map<alj<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alj<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alk, Map<alk, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alj)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alj)$$0x.getKey()).a(), Entry::getValue)));
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

   private static aa c(Map<alj<?>, Exception> $$0) {
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
                        .append(((alj)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alj)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new aa($$1);
   }

   private static <E> void a(kc<E> $$0, Decoder<E> $$1, ali<JsonElement> $$2, alj<E> $$3, avf $$4, js $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avh $$0, ali.c $$1, kc<E> $$2, Decoder<E> $$3, Map<alj<?>, Exception> $$4) {
      ald $$5 = ald.a($$2.g());
      ali<JsonElement> $$6 = ali.a(JsonOps.INSTANCE, $$1);

      for (Entry<alk, avf> $$7 : $$5.a($$0).entrySet()) {
         alk $$8 = $$7.getKey();
         alj<E> $$9 = alj.a($$2.g(), $$5.b($$8));
         avf $$10 = $$7.getValue();
         js $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axw.a($$0, $$2);
   }

   static <E> void a(Map<alj<? extends jt<?>>, alf.c> $$0, avk $$1, ali.c $$2, kc<E> $$3, Decoder<E> $$4, Map<alj<?>, Exception> $$5) {
      alf.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         ali<va> $$7 = ali.a(uo.a, $$2);
         ali<JsonElement> $$8 = ali.a(JsonOps.INSTANCE, $$2);
         ald $$9 = ald.a($$3.g());

         for (jx.a $$10 : $$6.a) {
            alj<E> $$11 = alj.a($$3.g(), $$10.a());
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
               alk $$16 = $$9.a($$10.a());

               try {
                  avf $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axw.a($$6.b, $$3);
      }
   }

   static record a<T>(alf.d<T> a, kc<T> b, Map<alj<?>, Exception> c) {

      public void a(avh $$0, ali.c $$1) {
         alf.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alj<? extends jt<?>>, alf.c> $$0, avk $$1, ali.c $$2) {
         alf.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alf.a<?> var1, ali.c var2);
   }

   public static record c(List<jx.a> a, axx.a b) {
   }

   public static record d<T>(alj<? extends jt<T>> a, Codec<T> b, boolean c) {

      d(alj<? extends jt<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alf.a<T> a(Lifecycle $$0, Map<alj<?>, Exception> $$1) {
         kc<T> $$2 = new jo<>(this.a, $$0);
         return new alf.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alj<? extends jt<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

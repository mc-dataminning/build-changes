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

public class alb {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alf<?>> e = Comparator.<alf<?>, alg>comparing(alf::b).thenComparing(alf::a);
   private static final jq f = new jq(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auj>, jq> g = af.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auj::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jq($$0, $$1);
   });
   public static final List<alb.d<?>> a = List.of(
      new alb.d<>(mg.aP, eee.h),
      new alb.d<>(mg.aG, dkd.a),
      new alb.d<>(mg.aI, wu.a),
      new alb.d<>(mg.aK, eik.a),
      new alb.d<>(mg.aL, eiy.a),
      new alb.d<>(mg.bb, eqf.a),
      new alb.d<>(mg.be, erb.a),
      new alb.d<>(mg.bd, erh.a),
      new alb.d<>(mg.bc, evc.c),
      new alb.d<>(mg.bf, esl.a),
      new alb.d<>(mg.aX, egl.a),
      new alb.d<>(mg.aY, evr.a.a),
      new alb.d<>(mg.aO, efz.b),
      new alb.d<>(mg.bn, eqq.a),
      new alb.d<>(mg.aS, epc.a),
      new alb.d<>(mg.bl, dhs.a),
      new alb.d<>(mg.bk, dhq.a),
      new alb.d<>(mg.bi, dzj.b),
      new alb.d<>(mg.bm, ckf.a, true),
      new alb.d<>(mg.ba, cjq.a, true),
      new alb.d<>(mg.aT, ckx.a, true),
      new alb.d<>(mg.aH, ciy.a, true),
      new alb.d<>(mg.aM, cjf.a, true),
      new alb.d<>(mg.aJ, cjb.a, true),
      new alb.d<>(mg.aZ, cnd.a, true),
      new alb.d<>(mg.aN, buw.a),
      new alb.d<>(mg.aW, dkr.a),
      new alb.d<>(mg.aF, dwu.a),
      new alb.d<>(mg.aR, dfq.b),
      new alb.d<>(mg.aQ, dgy.a),
      new alb.d<>(mg.aV, czj.a),
      new alb.d<>(mg.aU, cyw.a),
      new alb.d<>(mg.bg, tl.a),
      new alb.d<>(mg.bh, sr.b)
   );
   public static final List<alb.d<?>> b = List.of(new alb.d<>(mg.bp, eef.a));
   public static final List<alb.d<?>> c = List.of(
      new alb.d<>(mg.aG, dkd.b),
      new alb.d<>(mg.aI, wu.a),
      new alb.d<>(mg.bl, dhs.a),
      new alb.d<>(mg.bk, dhq.a),
      new alb.d<>(mg.bm, ckf.b, true),
      new alb.d<>(mg.ba, cjq.b, true),
      new alb.d<>(mg.aT, ckx.b, true),
      new alb.d<>(mg.aH, ciy.b, true),
      new alb.d<>(mg.aM, cjf.b, true),
      new alb.d<>(mg.aJ, cjb.b, true),
      new alb.d<>(mg.aZ, cnd.a, true),
      new alb.d<>(mg.aP, eee.h),
      new alb.d<>(mg.aN, buw.a),
      new alb.d<>(mg.aF, dwu.a),
      new alb.d<>(mg.aR, dfq.b),
      new alb.d<>(mg.aV, czj.a),
      new alb.d<>(mg.aU, cyw.a),
      new alb.d<>(mg.bg, tl.a),
      new alb.d<>(mg.bh, sr.b)
   );

   public static js.b a(avd $$0, List<jg.b<?>> $$1, List<alb.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static js.b a(Map<alf<? extends jr<?>>, alb.c> $$0, avg $$1, List<jg.b<?>> $$2, List<alb.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static js.b a(alb.b $$0, List<jg.b<?>> $$1, List<alb.d<?>> $$2) {
      Map<alf<?>, Exception> $$3 = new HashMap<>();
      List<alb.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ale.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jr<?> $$2x = $$1x.b();

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
         return new js.c($$4.stream().map(alb.a::b).toList()).e();
      }
   }

   private static ale.c a(List<jg.b<?>> $$0, List<alb.a<?>> $$1) {
      final Map<alf<? extends jr<?>>, ale.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new ale.c() {
         @Override
         public <T> Optional<ale.b<T>> a(alf<? extends jr<? extends T>> $$0) {
            return Optional.ofNullable((ale.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ale.b<T> a(ka<T> $$0) {
      return new ale.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> ale.b<T> a(jg.b<T> $$0) {
      return new ale.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<alf<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alf<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alg, Map<alg, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alf)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alf)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alf<?>, Exception> $$0) {
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
                        .append(((alf)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alf)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(ka<E> $$0, Decoder<E> $$1, ale<JsonElement> $$2, alf<E> $$3, avb $$4, jq $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avd $$0, ale.c $$1, ka<E> $$2, Decoder<E> $$3, Map<alf<?>, Exception> $$4) {
      akz $$5 = akz.a($$2.g());
      ale<JsonElement> $$6 = ale.a(JsonOps.INSTANCE, $$1);

      for (Entry<alg, avb> $$7 : $$5.a($$0).entrySet()) {
         alg $$8 = $$7.getKey();
         alf<E> $$9 = alf.a($$2.g(), $$5.b($$8));
         avb $$10 = $$7.getValue();
         jq $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axs.a($$0, $$2);
   }

   static <E> void a(Map<alf<? extends jr<?>>, alb.c> $$0, avg $$1, ale.c $$2, ka<E> $$3, Decoder<E> $$4, Map<alf<?>, Exception> $$5) {
      alb.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         ale<uw> $$7 = ale.a(un.a, $$2);
         ale<JsonElement> $$8 = ale.a(JsonOps.INSTANCE, $$2);
         akz $$9 = akz.a($$3.g());

         for (jv.a $$10 : $$6.a) {
            alf<E> $$11 = alf.a($$3.g(), $$10.a());
            Optional<uw> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               alg $$16 = $$9.a($$10.a());

               try {
                  avb $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axs.a($$6.b, $$3);
      }
   }

   static record a<T>(alb.d<T> a, ka<T> b, Map<alf<?>, Exception> c) {

      public void a(avd $$0, ale.c $$1) {
         alb.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alf<? extends jr<?>>, alb.c> $$0, avg $$1, ale.c $$2) {
         alb.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alb.a<?> var1, ale.c var2);
   }

   public static record c(List<jv.a> a, axt.a b) {
   }

   public static record d<T>(alf<? extends jr<T>> a, Codec<T> b, boolean c) {

      d(alf<? extends jr<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alb.a<T> a(Lifecycle $$0, Map<alf<?>, Exception> $$1) {
         ka<T> $$2 = new jm<>(this.a, $$0);
         return new alb.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alf<? extends jr<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

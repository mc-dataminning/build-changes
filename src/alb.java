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
   private static final jr f = new jr(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auj>, jr> g = ag.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auj::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jr($$0, $$1);
   });
   public static final List<alb.d<?>> a = List.of(
      new alb.d<>(mh.aP, eel.h),
      new alb.d<>(mh.aG, dkk.a),
      new alb.d<>(mh.aI, wu.a),
      new alb.d<>(mh.aK, eir.a),
      new alb.d<>(mh.aL, ejf.a),
      new alb.d<>(mh.bb, eqm.a),
      new alb.d<>(mh.be, eri.a),
      new alb.d<>(mh.bd, ero.a),
      new alb.d<>(mh.bc, evj.c),
      new alb.d<>(mh.bf, ess.a),
      new alb.d<>(mh.aX, egs.a),
      new alb.d<>(mh.aY, evy.a.a),
      new alb.d<>(mh.aO, egg.b),
      new alb.d<>(mh.bn, eqx.a),
      new alb.d<>(mh.aS, epj.a),
      new alb.d<>(mh.bl, dhz.a),
      new alb.d<>(mh.bk, dhx.a),
      new alb.d<>(mh.bi, dzq.b),
      new alb.d<>(mh.bm, ckj.a, true),
      new alb.d<>(mh.ba, cjv.a, true),
      new alb.d<>(mh.aT, clb.a, true),
      new alb.d<>(mh.aH, cjd.a, true),
      new alb.d<>(mh.aM, cjk.a, true),
      new alb.d<>(mh.aJ, cjg.a, true),
      new alb.d<>(mh.aZ, cnk.a, true),
      new alb.d<>(mh.aN, buz.a),
      new alb.d<>(mh.aW, dky.a),
      new alb.d<>(mh.aF, dxb.a),
      new alb.d<>(mh.aR, dfx.b),
      new alb.d<>(mh.aQ, dhf.a),
      new alb.d<>(mh.aV, czq.a),
      new alb.d<>(mh.aU, czd.a),
      new alb.d<>(mh.bg, tl.a),
      new alb.d<>(mh.bh, sr.b)
   );
   public static final List<alb.d<?>> b = List.of(new alb.d<>(mh.bp, eem.a));
   public static final List<alb.d<?>> c = List.of(
      new alb.d<>(mh.aG, dkk.b),
      new alb.d<>(mh.aI, wu.a),
      new alb.d<>(mh.bl, dhz.a),
      new alb.d<>(mh.bk, dhx.a),
      new alb.d<>(mh.bm, ckj.b, true),
      new alb.d<>(mh.ba, cjv.b, true),
      new alb.d<>(mh.aT, clb.b, true),
      new alb.d<>(mh.aH, cjd.b, true),
      new alb.d<>(mh.aM, cjk.b, true),
      new alb.d<>(mh.aJ, cjg.b, true),
      new alb.d<>(mh.aZ, cnk.a, true),
      new alb.d<>(mh.aP, eel.h),
      new alb.d<>(mh.aN, buz.a),
      new alb.d<>(mh.aF, dxb.a),
      new alb.d<>(mh.aR, dfx.b),
      new alb.d<>(mh.aV, czq.a),
      new alb.d<>(mh.aU, czd.a),
      new alb.d<>(mh.bg, tl.a),
      new alb.d<>(mh.bh, sr.b)
   );

   public static jt.b a(avd $$0, List<jh.b<?>> $$1, List<alb.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jt.b a(Map<alf<? extends js<?>>, alb.c> $$0, avg $$1, List<jh.b<?>> $$2, List<alb.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static jt.b a(alb.b $$0, List<jh.b<?>> $$1, List<alb.d<?>> $$2) {
      Map<alf<?>, Exception> $$3 = new HashMap<>();
      List<alb.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ale.c $$5 = a($$1, $$4);
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
         return new jt.c($$4.stream().map(alb.a::b).toList()).e();
      }
   }

   private static ale.c a(List<jh.b<?>> $$0, List<alb.a<?>> $$1) {
      final Map<alf<? extends js<?>>, ale.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new ale.c() {
         @Override
         public <T> Optional<ale.b<T>> a(alf<? extends js<? extends T>> $$0) {
            return Optional.ofNullable((ale.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ale.b<T> a(kb<T> $$0) {
      return new ale.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> ale.b<T> a(jh.b<T> $$0) {
      return new ale.b<>($$0, $$0, $$0.h());
   }

   private static aa a(Map<alf<?>, Exception> $$0) {
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

   private static aa c(Map<alf<?>, Exception> $$0) {
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
                        .append(((alf)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alf)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new aa($$1);
   }

   private static <E> void a(kb<E> $$0, Decoder<E> $$1, ale<JsonElement> $$2, alf<E> $$3, avb $$4, jr $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avd $$0, ale.c $$1, kb<E> $$2, Decoder<E> $$3, Map<alf<?>, Exception> $$4) {
      akz $$5 = akz.a($$2.g());
      ale<JsonElement> $$6 = ale.a(JsonOps.INSTANCE, $$1);

      for (Entry<alg, avb> $$7 : $$5.a($$0).entrySet()) {
         alg $$8 = $$7.getKey();
         alf<E> $$9 = alf.a($$2.g(), $$5.b($$8));
         avb $$10 = $$7.getValue();
         jr $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axs.a($$0, $$2);
   }

   static <E> void a(Map<alf<? extends js<?>>, alb.c> $$0, avg $$1, ale.c $$2, kb<E> $$3, Decoder<E> $$4, Map<alf<?>, Exception> $$5) {
      alb.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         ale<uw> $$7 = ale.a(un.a, $$2);
         ale<JsonElement> $$8 = ale.a(JsonOps.INSTANCE, $$2);
         akz $$9 = akz.a($$3.g());

         for (jw.a $$10 : $$6.a) {
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

   static record a<T>(alb.d<T> a, kb<T> b, Map<alf<?>, Exception> c) {

      public void a(avd $$0, ale.c $$1) {
         alb.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alf<? extends js<?>>, alb.c> $$0, avg $$1, ale.c $$2) {
         alb.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alb.a<?> var1, ale.c var2);
   }

   public static record c(List<jw.a> a, axt.a b) {
   }

   public static record d<T>(alf<? extends js<T>> a, Codec<T> b, boolean c) {

      d(alf<? extends js<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alb.a<T> a(Lifecycle $$0, Map<alf<?>, Exception> $$1) {
         kb<T> $$2 = new jn<>(this.a, $$0);
         return new alb.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alf<? extends js<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

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

public class aky {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alc<?>> e = Comparator.<alc<?>, ald>comparing(alc::b).thenComparing(alc::a);
   private static final ke f = new ke(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<aug>, ke> g = af.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(aug::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ke($$0, $$1);
   });
   public static final List<aky.d<?>> a = List.of(
      new aky.d<>(me.aR, ecj.h),
      new aky.d<>(me.aM, dis.a),
      new aky.d<>(me.aN, wr.a),
      new aky.d<>(me.aO, egp.a),
      new aky.d<>(me.aP, ehd.a),
      new aky.d<>(me.aY, eok.a),
      new aky.d<>(me.aZ, epg.a),
      new aky.d<>(me.bb, epm.a),
      new aky.d<>(me.ba, eth.c),
      new aky.d<>(me.bc, eqq.a),
      new aky.d<>(me.aV, eeq.a),
      new aky.d<>(me.aW, etw.a.a),
      new aky.d<>(me.aQ, eee.b),
      new aky.d<>(me.bi, eov.a),
      new aky.d<>(me.aU, enh.a),
      new aky.d<>(me.bh, dgh.a),
      new aky.d<>(me.bg, dgf.a),
      new aky.d<>(me.bk, dxp.b),
      new aky.d<>(me.m, cjn.a, true),
      new aky.d<>(me.aX, ciy.a, true),
      new aky.d<>(me.X, cmj.a, true),
      new aky.d<>(me.s, buj.a),
      new aky.d<>(me.bj, djg.a),
      new aky.d<>(me.d, dva.a),
      new aky.d<>(me.aS, deh.b),
      new aky.d<>(me.aT, dfp.a),
      new aky.d<>(me.L, cye.a),
      new aky.d<>(me.I, cxr.a),
      new aky.d<>(me.be, tj.a),
      new aky.d<>(me.bf, sp.b)
   );
   public static final List<aky.d<?>> b = List.of(new aky.d<>(me.bm, eck.a));
   public static final List<aky.d<?>> c = List.of(
      new aky.d<>(me.aM, dis.b),
      new aky.d<>(me.aN, wr.a),
      new aky.d<>(me.bh, dgh.a),
      new aky.d<>(me.bg, dgf.a),
      new aky.d<>(me.m, cjn.a, true),
      new aky.d<>(me.aX, ciy.a, true),
      new aky.d<>(me.X, cmj.a, true),
      new aky.d<>(me.aR, ecj.h),
      new aky.d<>(me.s, buj.a),
      new aky.d<>(me.d, dva.a),
      new aky.d<>(me.aS, deh.b),
      new aky.d<>(me.L, cye.a),
      new aky.d<>(me.I, cxr.a),
      new aky.d<>(me.be, tj.a),
      new aky.d<>(me.bf, sp.b)
   );

   public static kg.b a(ava $$0, List<ju.b<?>> $$1, List<aky.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kg.b a(Map<alc<? extends kf<?>>, aky.c> $$0, avd $$1, List<ju.b<?>> $$2, List<aky.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kg.b a(aky.b $$0, List<ju.b<?>> $$1, List<aky.d<?>> $$2) {
      Map<alc<?>, Exception> $$3 = new HashMap<>();
      List<aky.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alb.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         kf<?> $$2x = $$1x.b();

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
         return new kg.c($$4.stream().map(aky.a::b).toList()).e();
      }
   }

   private static alb.c a(List<ju.b<?>> $$0, List<aky.a<?>> $$1) {
      final Map<alc<? extends kf<?>>, alb.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alb.c() {
         @Override
         public <T> Optional<alb.b<T>> a(alc<? extends kf<? extends T>> $$0) {
            return Optional.ofNullable((alb.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alb.b<T> a(ko<T> $$0) {
      return new alb.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alb.b<T> a(ju.b<T> $$0) {
      return new alb.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<alc<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alc<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ald, Map<ald, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alc)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alc)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alc<?>, Exception> $$0) {
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
                        .append(((alc)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alc)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(ko<E> $$0, Decoder<E> $$1, alb<JsonElement> $$2, alc<E> $$3, auy $$4, ke $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(ava $$0, alb.c $$1, ko<E> $$2, Decoder<E> $$3, Map<alc<?>, Exception> $$4) {
      akw $$5 = akw.a($$2.g());
      alb<JsonElement> $$6 = alb.a(JsonOps.INSTANCE, $$1);

      for (Entry<ald, auy> $$7 : $$5.a($$0).entrySet()) {
         ald $$8 = $$7.getKey();
         alc<E> $$9 = alc.a($$2.g(), $$5.b($$8));
         auy $$10 = $$7.getValue();
         ke $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axq.a($$0, $$2);
   }

   static <E> void a(Map<alc<? extends kf<?>>, aky.c> $$0, avd $$1, alb.c $$2, ko<E> $$3, Decoder<E> $$4, Map<alc<?>, Exception> $$5) {
      aky.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alb<ut> $$7 = alb.a(uk.a, $$2);
         alb<JsonElement> $$8 = alb.a(JsonOps.INSTANCE, $$2);
         akw $$9 = akw.a($$3.g());

         for (kj.a $$10 : $$6.a) {
            alc<E> $$11 = alc.a($$3.g(), $$10.a());
            Optional<ut> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               ald $$16 = $$9.a($$10.a());

               try {
                  auy $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axq.a($$6.b, $$3);
      }
   }

   static record a<T>(aky.d<T> a, ko<T> b, Map<alc<?>, Exception> c) {

      public void a(ava $$0, alb.c $$1) {
         aky.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alc<? extends kf<?>>, aky.c> $$0, avd $$1, alb.c $$2) {
         aky.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(aky.a<?> var1, alb.c var2);
   }

   public static record c(List<kj.a> a, axr.a b) {
   }

   public static record d<T>(alc<? extends kf<T>> a, Codec<T> b, boolean c) {

      d(alc<? extends kf<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      aky.a<T> a(Lifecycle $$0, Map<alc<?>, Exception> $$1) {
         ko<T> $$2 = new ka<>(this.a, $$0);
         return new aky.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alc<? extends kf<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

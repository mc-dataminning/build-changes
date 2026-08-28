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

public class alc {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alg<?>> e = Comparator.<alg<?>, alh>comparing(alg::b).thenComparing(alg::a);
   private static final kb f = new kb(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<aug>, kb> g = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(aug::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kb($$0, $$1);
   });
   public static final List<alc.d<?>> a = List.of(
      new alc.d<>(ly.aL, dyz.h),
      new alc.d<>(ly.aG, dfw.a),
      new alc.d<>(ly.aH, xd.a),
      new alc.d<>(ly.aI, edd.a),
      new alc.d<>(ly.aJ, edr.a),
      new alc.d<>(ly.aR, ekv.a),
      new alc.d<>(ly.aS, elr.a),
      new alc.d<>(ly.aU, elx.a),
      new alc.d<>(ly.aT, eps.c),
      new alc.d<>(ly.aV, enb.a),
      new alc.d<>(ly.aP, ebe.a),
      new alc.d<>(ly.aQ, eqh.a.a),
      new alc.d<>(ly.aK, eas.b),
      new alc.d<>(ly.aZ, elg.a),
      new alc.d<>(ly.aO, ejs.a),
      new alc.d<>(ly.aY, ddm.a),
      new alc.d<>(ly.aX, ddk.a),
      new alc.d<>(ly.aF, dug.b),
      new alc.d<>(ly.m, chq.a, true),
      new alc.d<>(ly.X, ckm.a, true),
      new alc.d<>(ly.s, bsr.a),
      new alc.d<>(ly.ba, dgk.a),
      new alc.d<>(ly.d, drw.a),
      new alc.d<>(ly.aM, dbm.b),
      new alc.d<>(ly.aN, dcu.a),
      new alc.d<>(ly.L, cwd.a),
      new alc.d<>(ly.I, cvq.a)
   );
   public static final List<alc.d<?>> b = List.of(new alc.d<>(ly.bc, dza.a));
   public static final List<alc.d<?>> c = List.of(
      new alc.d<>(ly.aG, dfw.b),
      new alc.d<>(ly.aH, xd.a),
      new alc.d<>(ly.aY, ddm.a),
      new alc.d<>(ly.aX, ddk.a),
      new alc.d<>(ly.m, chq.a, true),
      new alc.d<>(ly.X, ckm.a, true),
      new alc.d<>(ly.aL, dyz.h),
      new alc.d<>(ly.s, bsr.a),
      new alc.d<>(ly.d, drw.a),
      new alc.d<>(ly.aM, dbm.b),
      new alc.d<>(ly.L, cwd.a),
      new alc.d<>(ly.I, cvq.a)
   );

   public static kd.b a(ava $$0, List<jr.b<?>> $$1, List<alc.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kd.b a(Map<alg<? extends kc<?>>, alc.c> $$0, avd $$1, List<jr.b<?>> $$2, List<alc.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kd.b a(alc.b $$0, List<jr.b<?>> $$1, List<alc.d<?>> $$2) {
      Map<alg<?>, Exception> $$3 = new HashMap<>();
      List<alc.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alf.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         kc<?> $$2x = $$1x.b();

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
         return new kd.c($$4.stream().map(alc.a::b).toList()).e();
      }
   }

   private static alf.c a(List<jr.b<?>> $$0, List<alc.a<?>> $$1) {
      final Map<alg<? extends kc<?>>, alf.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alf.c() {
         @Override
         public <T> Optional<alf.b<T>> a(alg<? extends kc<? extends T>> $$0) {
            return Optional.ofNullable((alf.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alf.b<T> a(kl<T> $$0) {
      return new alf.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alf.b<T> a(jr.b<T> $$0) {
      return new alf.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<alg<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alg<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alh, Map<alh, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alg)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alg)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alg<?>, Exception> $$0) {
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
                        .append(((alg)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alg)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(kl<E> $$0, Decoder<E> $$1, alf<JsonElement> $$2, alg<E> $$3, auy $$4, kb $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(ava $$0, alf.c $$1, kl<E> $$2, Decoder<E> $$3, Map<alg<?>, Exception> $$4) {
      String $$5 = ly.c($$2.g());
      ala $$6 = ala.a($$5);
      alf<JsonElement> $$7 = alf.a(JsonOps.INSTANCE, $$1);

      for (Entry<alh, auy> $$8 : $$6.a($$0).entrySet()) {
         alh $$9 = $$8.getKey();
         alg<E> $$10 = alg.a($$2.g(), $$6.b($$9));
         auy $$11 = $$8.getValue();
         kb $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axq.a($$0, $$2);
   }

   static <E> void a(Map<alg<? extends kc<?>>, alc.c> $$0, avd $$1, alf.c $$2, kl<E> $$3, Decoder<E> $$4, Map<alg<?>, Exception> $$5) {
      alc.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alf<vg> $$7 = alf.a(ux.a, $$2);
         alf<JsonElement> $$8 = alf.a(JsonOps.INSTANCE, $$2);
         String $$9 = ly.c($$3.g());
         ala $$10 = ala.a($$9);

         for (kg.a $$11 : $$6.a) {
            alg<E> $$12 = alg.a($$3.g(), $$11.a());
            Optional<vg> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alh $$17 = $$10.a($$11.a());

               try {
                  auy $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axq.a($$6.b, $$3);
      }
   }

   static record a<T>(alc.d<T> a, kl<T> b, Map<alg<?>, Exception> c) {

      public void a(ava $$0, alf.c $$1) {
         alc.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alg<? extends kc<?>>, alc.c> $$0, avd $$1, alf.c $$2) {
         alc.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alc.a<?> var1, alf.c var2);
   }

   public static record c(List<kg.a> a, axr.a b) {
   }

   public static record d<T>(alg<? extends kc<T>> a, Codec<T> b, boolean c) {

      d(alg<? extends kc<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alc.a<T> a(Lifecycle $$0, Map<alg<?>, Exception> $$1) {
         kl<T> $$2 = new jx<>(this.a, $$0);
         return new alc.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alg<? extends kc<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

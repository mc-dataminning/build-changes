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

public class akp {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<akt<?>> e = Comparator.<akt<?>, aku>comparing(akt::b).thenComparing(akt::a);
   private static final kd f = new kd(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atw>, kd> g = af.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atw::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kd($$0, $$1);
   });
   public static final List<akp.d<?>> a = List.of(
      new akp.d<>(mc.aO, ebm.h),
      new akp.d<>(mc.aJ, dic.a),
      new akp.d<>(mc.aK, wl.a),
      new akp.d<>(mc.aL, efs.a),
      new akp.d<>(mc.aM, egg.a),
      new akp.d<>(mc.aV, enn.a),
      new akp.d<>(mc.aW, eoj.a),
      new akp.d<>(mc.aY, eop.a),
      new akp.d<>(mc.aX, esk.c),
      new akp.d<>(mc.aZ, ept.a),
      new akp.d<>(mc.aS, edt.a),
      new akp.d<>(mc.aT, esz.a.a),
      new akp.d<>(mc.aN, edh.b),
      new akp.d<>(mc.bd, eny.a),
      new akp.d<>(mc.aR, emk.a),
      new akp.d<>(mc.bc, dfr.a),
      new akp.d<>(mc.bb, dfp.a),
      new akp.d<>(mc.bf, dwt.b),
      new akp.d<>(mc.m, ciw.a, true),
      new akp.d<>(mc.aU, cih.a, true),
      new akp.d<>(mc.X, cls.a, true),
      new akp.d<>(mc.s, btr.a),
      new akp.d<>(mc.be, diq.a),
      new akp.d<>(mc.d, dui.a),
      new akp.d<>(mc.aP, ddr.b),
      new akp.d<>(mc.aQ, dez.a),
      new akp.d<>(mc.L, cxn.a),
      new akp.d<>(mc.I, cxa.a)
   );
   public static final List<akp.d<?>> b = List.of(new akp.d<>(mc.bh, ebn.a));
   public static final List<akp.d<?>> c = List.of(
      new akp.d<>(mc.aJ, dic.b),
      new akp.d<>(mc.aK, wl.a),
      new akp.d<>(mc.bc, dfr.a),
      new akp.d<>(mc.bb, dfp.a),
      new akp.d<>(mc.m, ciw.a, true),
      new akp.d<>(mc.aU, cih.a, true),
      new akp.d<>(mc.X, cls.a, true),
      new akp.d<>(mc.aO, ebm.h),
      new akp.d<>(mc.s, btr.a),
      new akp.d<>(mc.d, dui.a),
      new akp.d<>(mc.aP, ddr.b),
      new akp.d<>(mc.L, cxn.a),
      new akp.d<>(mc.I, cxa.a)
   );

   public static kf.b a(aup $$0, List<jt.b<?>> $$1, List<akp.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kf.b a(Map<akt<? extends ke<?>>, akp.c> $$0, aus $$1, List<jt.b<?>> $$2, List<akp.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kf.b a(akp.b $$0, List<jt.b<?>> $$1, List<akp.d<?>> $$2) {
      Map<akt<?>, Exception> $$3 = new HashMap<>();
      List<akp.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      aks.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ke<?> $$2x = $$1x.b();

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
         return new kf.c($$4.stream().map(akp.a::b).toList()).e();
      }
   }

   private static aks.c a(List<jt.b<?>> $$0, List<akp.a<?>> $$1) {
      final Map<akt<? extends ke<?>>, aks.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new aks.c() {
         @Override
         public <T> Optional<aks.b<T>> a(akt<? extends ke<? extends T>> $$0) {
            return Optional.ofNullable((aks.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aks.b<T> a(kn<T> $$0) {
      return new aks.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> aks.b<T> a(jt.b<T> $$0) {
      return new aks.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<akt<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<akt<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aku, Map<aku, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akt)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akt)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<akt<?>, Exception> $$0) {
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
                        .append(((akt)$$1xx.getKey()).b())
                        .append("/")
                        .append(((akt)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(kn<E> $$0, Decoder<E> $$1, aks<JsonElement> $$2, akt<E> $$3, aun $$4, kd $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aup $$0, aks.c $$1, kn<E> $$2, Decoder<E> $$3, Map<akt<?>, Exception> $$4) {
      akn $$5 = akn.a($$2.g());
      aks<JsonElement> $$6 = aks.a(JsonOps.INSTANCE, $$1);

      for (Entry<aku, aun> $$7 : $$5.a($$0).entrySet()) {
         aku $$8 = $$7.getKey();
         akt<E> $$9 = akt.a($$2.g(), $$5.b($$8));
         aun $$10 = $$7.getValue();
         kd $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axg.a($$0, $$2);
   }

   static <E> void a(Map<akt<? extends ke<?>>, akp.c> $$0, aus $$1, aks.c $$2, kn<E> $$3, Decoder<E> $$4, Map<akt<?>, Exception> $$5) {
      akp.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         aks<un> $$7 = aks.a(ue.a, $$2);
         aks<JsonElement> $$8 = aks.a(JsonOps.INSTANCE, $$2);
         akn $$9 = akn.a($$3.g());

         for (ki.a $$10 : $$6.a) {
            akt<E> $$11 = akt.a($$3.g(), $$10.a());
            Optional<un> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               aku $$16 = $$9.a($$10.a());

               try {
                  aun $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axg.a($$6.b, $$3);
      }
   }

   static record a<T>(akp.d<T> a, kn<T> b, Map<akt<?>, Exception> c) {

      public void a(aup $$0, aks.c $$1) {
         akp.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akt<? extends ke<?>>, akp.c> $$0, aus $$1, aks.c $$2) {
         akp.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akp.a<?> var1, aks.c var2);
   }

   public static record c(List<ki.a> a, axh.a b) {
   }

   public static record d<T>(akt<? extends ke<T>> a, Codec<T> b, boolean c) {

      d(akt<? extends ke<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akp.a<T> a(Lifecycle $$0, Map<akt<?>, Exception> $$1) {
         kn<T> $$2 = new jz<>(this.a, $$0);
         return new akp.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akt<? extends ke<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

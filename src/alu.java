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

public class alu {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<aly<?>> e = Comparator.<aly<?>, alz>comparing(aly::b).thenComparing(aly::a);
   private static final kc f = new kc(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<avc>, kc> g = ae.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(avc::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kc($$0, $$1);
   });
   public static final List<alu.d<?>> a = List.of(
      new alu.d<>(mb.aN, ebp.h),
      new alu.d<>(mb.aI, dij.a),
      new alu.d<>(mb.aJ, xr.a),
      new alu.d<>(mb.aK, eft.a),
      new alu.d<>(mb.aL, egh.a),
      new alu.d<>(mb.aT, enn.a),
      new alu.d<>(mb.aU, eoj.a),
      new alu.d<>(mb.aW, eop.a),
      new alu.d<>(mb.aV, esk.c),
      new alu.d<>(mb.aX, ept.a),
      new alu.d<>(mb.aR, edu.a),
      new alu.d<>(mb.aS, esz.a.a),
      new alu.d<>(mb.aM, edi.b),
      new alu.d<>(mb.bb, eny.a),
      new alu.d<>(mb.aQ, emk.a),
      new alu.d<>(mb.ba, dfy.a),
      new alu.d<>(mb.aZ, dfw.a),
      new alu.d<>(mb.bd, dwx.b),
      new alu.d<>(mb.m, cja.a, true),
      new alu.d<>(mb.X, clw.a, true),
      new alu.d<>(mb.s, bub.a),
      new alu.d<>(mb.bc, dix.a),
      new alu.d<>(mb.d, dum.a),
      new alu.d<>(mb.aO, ddy.b),
      new alu.d<>(mb.aP, dfg.a),
      new alu.d<>(mb.L, cxu.a),
      new alu.d<>(mb.I, cxh.a)
   );
   public static final List<alu.d<?>> b = List.of(new alu.d<>(mb.bf, ebq.a));
   public static final List<alu.d<?>> c = List.of(
      new alu.d<>(mb.aI, dij.b),
      new alu.d<>(mb.aJ, xr.a),
      new alu.d<>(mb.ba, dfy.a),
      new alu.d<>(mb.aZ, dfw.a),
      new alu.d<>(mb.m, cja.a, true),
      new alu.d<>(mb.X, clw.a, true),
      new alu.d<>(mb.aN, ebp.h),
      new alu.d<>(mb.s, bub.a),
      new alu.d<>(mb.d, dum.a),
      new alu.d<>(mb.aO, ddy.b),
      new alu.d<>(mb.L, cxu.a),
      new alu.d<>(mb.I, cxh.a)
   );

   public static ke.b a(avv $$0, List<js.b<?>> $$1, List<alu.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ke.b a(Map<aly<? extends kd<?>>, alu.c> $$0, avy $$1, List<js.b<?>> $$2, List<alu.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ke.b a(alu.b $$0, List<js.b<?>> $$1, List<alu.d<?>> $$2) {
      Map<aly<?>, Exception> $$3 = new HashMap<>();
      List<alu.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alx.c $$5 = a($$1, $$4);
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
         return new ke.c($$4.stream().map(alu.a::b).toList()).e();
      }
   }

   private static alx.c a(List<js.b<?>> $$0, List<alu.a<?>> $$1) {
      final Map<aly<? extends kd<?>>, alx.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alx.c() {
         @Override
         public <T> Optional<alx.b<T>> a(aly<? extends kd<? extends T>> $$0) {
            return Optional.ofNullable((alx.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alx.b<T> a(km<T> $$0) {
      return new alx.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alx.b<T> a(js.b<T> $$0) {
      return new alx.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<aly<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<aly<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alz, Map<alz, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aly)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aly)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<aly<?>, Exception> $$0) {
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
                        .append(((aly)$$1xx.getKey()).b())
                        .append("/")
                        .append(((aly)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(km<E> $$0, Decoder<E> $$1, alx<JsonElement> $$2, aly<E> $$3, avt $$4, kc $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avv $$0, alx.c $$1, km<E> $$2, Decoder<E> $$3, Map<aly<?>, Exception> $$4) {
      String $$5 = mb.c($$2.g());
      als $$6 = als.a($$5);
      alx<JsonElement> $$7 = alx.a(JsonOps.INSTANCE, $$1);

      for (Entry<alz, avt> $$8 : $$6.a($$0).entrySet()) {
         alz $$9 = $$8.getKey();
         aly<E> $$10 = aly.a($$2.g(), $$6.b($$9));
         avt $$11 = $$8.getValue();
         kc $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      ayl.a($$0, $$2);
   }

   static <E> void a(Map<aly<? extends kd<?>>, alu.c> $$0, avy $$1, alx.c $$2, km<E> $$3, Decoder<E> $$4, Map<aly<?>, Exception> $$5) {
      alu.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alx<vu> $$7 = alx.a(vl.a, $$2);
         alx<JsonElement> $$8 = alx.a(JsonOps.INSTANCE, $$2);
         String $$9 = mb.c($$3.g());
         als $$10 = als.a($$9);

         for (kh.a $$11 : $$6.a) {
            aly<E> $$12 = aly.a($$3.g(), $$11.a());
            Optional<vu> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alz $$17 = $$10.a($$11.a());

               try {
                  avt $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         ayl.a($$6.b, $$3);
      }
   }

   static record a<T>(alu.d<T> a, km<T> b, Map<aly<?>, Exception> c) {

      public void a(avv $$0, alx.c $$1) {
         alu.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<aly<? extends kd<?>>, alu.c> $$0, avy $$1, alx.c $$2) {
         alu.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alu.a<?> var1, alx.c var2);
   }

   public static record c(List<kh.a> a, aym.a b) {
   }

   public static record d<T>(aly<? extends kd<T>> a, Codec<T> b, boolean c) {

      d(aly<? extends kd<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alu.a<T> a(Lifecycle $$0, Map<aly<?>, Exception> $$1) {
         km<T> $$2 = new jy<>(this.a, $$0);
         return new alu.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<aly<? extends kd<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

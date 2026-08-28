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

public class akx {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alb<?>> e = Comparator.<alb<?>, alc>comparing(alb::b).thenComparing(alb::a);
   private static final jz f = new jz(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<aua>, jz> g = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(aua::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jz($$0, $$1);
   });
   public static final List<akx.d<?>> a = List.of(
      new akx.d<>(lv.aL, dyk.h),
      new akx.d<>(lv.aG, dfh.a),
      new akx.d<>(lv.aH, wz.a),
      new akx.d<>(lv.aI, eco.a),
      new akx.d<>(lv.aJ, edc.a),
      new akx.d<>(lv.aR, ekg.a),
      new akx.d<>(lv.aS, elc.a),
      new akx.d<>(lv.aU, eli.a),
      new akx.d<>(lv.aT, epd.c),
      new akx.d<>(lv.aV, emm.a),
      new akx.d<>(lv.aP, eap.a),
      new akx.d<>(lv.aQ, eps.a.a),
      new akx.d<>(lv.aK, ead.b),
      new akx.d<>(lv.aZ, ekr.a),
      new akx.d<>(lv.aO, ejd.a),
      new akx.d<>(lv.aY, cxu.a),
      new akx.d<>(lv.aX, cxs.a),
      new akx.d<>(lv.m, che.a, true),
      new akx.d<>(lv.X, cka.a, true),
      new akx.d<>(lv.s, bsi.a),
      new akx.d<>(lv.ba, dfv.a),
      new akx.d<>(lv.d, dri.a),
      new akx.d<>(lv.aM, dbk.b),
      new akx.d<>(lv.aN, dcs.a),
      new akx.d<>(lv.L, cvv.a),
      new akx.d<>(lv.I, cvh.a)
   );
   public static final List<akx.d<?>> b = List.of(new akx.d<>(lv.bc, dyl.a));
   public static final List<akx.d<?>> c = List.of(
      new akx.d<>(lv.aG, dfh.b),
      new akx.d<>(lv.aH, wz.a),
      new akx.d<>(lv.aY, cxu.a),
      new akx.d<>(lv.aX, cxs.a),
      new akx.d<>(lv.m, che.a, true),
      new akx.d<>(lv.X, cka.a, true),
      new akx.d<>(lv.aL, dyk.h),
      new akx.d<>(lv.s, bsi.a),
      new akx.d<>(lv.d, dri.a),
      new akx.d<>(lv.aM, dbk.b),
      new akx.d<>(lv.L, cvv.a),
      new akx.d<>(lv.I, cvh.a)
   );

   public static kb.b a(aut $$0, List<jp.b<?>> $$1, List<akx.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kb.b a(Map<alb<? extends ka<?>>, akx.c> $$0, auw $$1, List<jp.b<?>> $$2, List<akx.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kb.b a(akx.b $$0, List<jp.b<?>> $$1, List<akx.d<?>> $$2) {
      Map<alb<?>, Exception> $$3 = new HashMap<>();
      List<akx.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ala.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ka<?> $$2x = $$1x.b();

         try {
            $$2x.l();
         } catch (Exception var4x) {
            $$3.put($$2x.d(), var4x);
         }

         if ($$1x.a.c && $$2x.c() == 0) {
            $$3.put($$2x.d(), new IllegalStateException("Registry must be non-empty"));
         }
      });
      if (!$$3.isEmpty()) {
         throw a($$3);
      } else {
         return new kb.c($$4.stream().map(akx.a::b).toList()).f();
      }
   }

   private static ala.c a(List<jp.b<?>> $$0, List<akx.a<?>> $$1) {
      final Map<alb<? extends ka<?>>, ala.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.f(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.d(), a($$1x.b)));
      return new ala.c() {
         @Override
         public <T> Optional<ala.b<T>> a(alb<? extends ka<? extends T>> $$0) {
            return Optional.ofNullable((ala.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ala.b<T> a(kj<T> $$0) {
      return new ala.b<>($$0.p(), $$0.n(), $$0.e());
   }

   private static <T> ala.b<T> a(jp.b<T> $$0) {
      return new ala.b<>($$0, $$0, $$0.g());
   }

   private static z a(Map<alb<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alb<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alc, Map<alc, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alb)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alb)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alb<?>, Exception> $$0) {
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
                        .append(((alb)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alb)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(kj<E> $$0, Decoder<E> $$1, ala<JsonElement> $$2, alb<E> $$3, aur $$4, jz $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aut $$0, ala.c $$1, kj<E> $$2, Decoder<E> $$3, Map<alb<?>, Exception> $$4) {
      String $$5 = lv.c($$2.d());
      akv $$6 = akv.a($$5);
      ala<JsonElement> $$7 = ala.a(JsonOps.INSTANCE, $$1);

      for (Entry<alc, aur> $$8 : $$6.a($$0).entrySet()) {
         alc $$9 = $$8.getKey();
         alb<E> $$10 = alb.a($$2.d(), $$6.b($$9));
         aur $$11 = $$8.getValue();
         jz $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axk.a($$0, $$2);
   }

   static <E> void a(Map<alb<? extends ka<?>>, akx.c> $$0, auw $$1, ala.c $$2, kj<E> $$3, Decoder<E> $$4, Map<alb<?>, Exception> $$5) {
      akx.c $$6 = $$0.get($$3.d());
      if ($$6 != null) {
         ala<vc> $$7 = ala.a(ut.a, $$2);
         ala<JsonElement> $$8 = ala.a(JsonOps.INSTANCE, $$2);
         String $$9 = lv.c($$3.d());
         akv $$10 = akv.a($$9);

         for (ke.a $$11 : $$6.a) {
            alb<E> $$12 = alb.a($$3.d(), $$11.a());
            Optional<vc> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alc $$17 = $$10.a($$11.a());

               try {
                  aur $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axk.a($$6.b, $$3);
      }
   }

   static record a<T>(akx.d<T> a, kj<T> b, Map<alb<?>, Exception> c) {

      public void a(aut $$0, ala.c $$1) {
         akx.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alb<? extends ka<?>>, akx.c> $$0, auw $$1, ala.c $$2) {
         akx.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akx.a<?> var1, ala.c var2);
   }

   public static record c(List<ke.a> a, axl.a b) {
   }

   public static record d<T>(alb<? extends ka<T>> a, Codec<T> b, boolean c) {

      d(alb<? extends ka<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akx.a<T> a(Lifecycle $$0, Map<alb<?>, Exception> $$1) {
         kj<T> $$2 = new jv<>(this.a, $$0);
         return new akx.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alb<? extends ka<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

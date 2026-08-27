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

public class ako {
   private static final Logger d = LogUtils.getLogger();
   private static final jm e = new jm(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atk>, jm> f = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atk::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jm($$0, $$1);
   });
   public static final List<ako.c<?>> a = List.of(
      new ako.c<>(li.aE, dwu.h),
      new ako.c<>(li.az, dcz.a),
      new ako.c<>(li.aA, xa.a),
      new ako.c<>(li.aB, eax.a),
      new ako.c<>(li.aC, ebm.a),
      new ako.c<>(li.aI, eix.a),
      new ako.c<>(li.aJ, ejt.a),
      new ako.c<>(li.aL, ejz.a),
      new ako.c<>(li.aK, ens.c),
      new ako.c<>(li.aM, elc.a),
      new ako.c<>(li.aG, dyz.a),
      new ako.c<>(li.aH, eoh.a.a),
      new ako.c<>(li.aD, dyn.b),
      new ako.c<>(li.aQ, eji.a),
      new ako.c<>(li.aF, eht.a),
      new ako.c<>(li.aP, cwx.a),
      new ako.c<>(li.aO, cwv.a),
      new ako.c<>(li.m, cfi.a),
      new ako.c<>(li.s, bqv.a),
      new ako.c<>(li.aR, ddn.a),
      new ako.c<>(li.d, dpr.a)
   );
   public static final List<ako.c<?>> b = List.of(new ako.c<>(li.aT, dwv.a));
   public static final List<ako.c<?>> c = List.of(
      new ako.c<>(li.az, dcz.b),
      new ako.c<>(li.aA, xa.a),
      new ako.c<>(li.aP, cwx.a),
      new ako.c<>(li.aO, cwv.a),
      new ako.c<>(li.m, cfi.a),
      new ako.c<>(li.aE, dwu.h),
      new ako.c<>(li.s, bqv.a),
      new ako.c<>(li.d, dpr.a)
   );

   public static jo.b a(aud $$0, jo $$1, List<ako.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jo.b a(Map<aks<? extends jn<?>>, List<jr.a>> $$0, aug $$1, jo $$2, List<ako.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jo.b a(ako.b $$0, jo $$1, List<ako.c<?>> $$2) {
      Map<aks<?>, Exception> $$3 = new HashMap<>();
      List<ako.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akr.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jn<?> $$2x = $$1x.b();

         try {
            $$2x.l();
         } catch (Exception var4x) {
            $$3.put($$2x.c(), var4x);
         }
      });
      if (!$$3.isEmpty()) {
         a($$3);
         throw new IllegalStateException("Failed to load registries due to above errors");
      } else {
         return new jo.c($$4.stream().map(ako.a::b).toList()).d();
      }
   }

   private static akr.b a(jo $$0, List<ako.a<?>> $$1) {
      final Map<aks<? extends jn<?>>, akr.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new akr.b() {
         @Override
         public <T> Optional<akr.a<T>> a(aks<? extends jn<? extends T>> $$0) {
            return Optional.ofNullable((akr.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akr.a<T> a(jw<T> $$0) {
      return new akr.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> akr.a<T> a(jn<T> $$0) {
      return new akr.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aks<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akt, Map<akt, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aks)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aks)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(akt $$0) {
      return $$0.a();
   }

   private static <E> void a(jw<E> $$0, Decoder<E> $$1, akr<JsonElement> $$2, aks<E> $$3, aub $$4, jm $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow(false, $$0x -> {
         });
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aud $$0, akr.b $$1, jw<E> $$2, Decoder<E> $$3, Map<aks<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      akm $$6 = akm.a($$5);
      akr<JsonElement> $$7 = akr.a(JsonOps.INSTANCE, $$1);

      for (Entry<akt, aub> $$8 : $$6.a($$0).entrySet()) {
         akt $$9 = $$8.getKey();
         aks<E> $$10 = aks.a($$2.c(), $$6.b($$9));
         aub $$11 = $$8.getValue();
         jm $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<aks<? extends jn<?>>, List<jr.a>> $$0, aug $$1, akr.b $$2, jw<E> $$3, Decoder<E> $$4, Map<aks<?>, Exception> $$5) {
      List<jr.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         akr<vh> $$7 = akr.a(uy.a, $$2);
         akr<JsonElement> $$8 = akr.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         akm $$10 = akm.a($$9);

         for (jr.a $$11 : $$6) {
            aks<E> $$12 = aks.a($$3.c(), $$11.a());
            Optional<vh> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow(false, $$0x -> {
                  });
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               akt $$17 = $$10.a($$11.a());

               try {
                  aub $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(ako.c<T> a, jw<T> b, Map<aks<?>, Exception> c) {

      public void a(aud $$0, akr.b $$1) {
         ako.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<aks<? extends jn<?>>, List<jr.a>> $$0, aug $$1, akr.b $$2) {
         ako.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ako.a<?> var1, akr.b var2);
   }

   public static record c<T>(aks<? extends jn<T>> a, Codec<T> b) {

      ako.a<T> a(Lifecycle $$0, Map<aks<?>, Exception> $$1) {
         jw<T> $$2 = new ji<>(this.a, $$0);
         return new ako.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<aks<? extends jn<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

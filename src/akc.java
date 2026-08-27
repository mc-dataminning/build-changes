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

public class akc {
   private static final Logger d = LogUtils.getLogger();
   private static final ji e = new ji(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<asy>, ji> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(asy::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ji($$0, $$1);
   });
   public static final List<akc.c<?>> a = List.of(
      new akc.c<>(le.aE, dtz.h),
      new akc.c<>(le.az, dbc.a),
      new akc.c<>(le.aA, wq.a),
      new akc.c<>(le.aB, dyc.a),
      new akc.c<>(le.aC, dyq.a),
      new akc.c<>(le.aI, eft.a),
      new akc.c<>(le.aJ, egp.a),
      new akc.c<>(le.aL, egv.a),
      new akc.c<>(le.aK, eko.c),
      new akc.c<>(le.aM, ehy.a),
      new akc.c<>(le.aG, dwe.a),
      new akc.c<>(le.aH, eld.a.a),
      new akc.c<>(le.aD, dvs.b),
      new akc.c<>(le.aQ, ege.a),
      new akc.c<>(le.aF, eeq.a),
      new akc.c<>(le.aP, cve.a),
      new akc.c<>(le.aO, cvc.a),
      new akc.c<>(le.m, cet.a),
      new akc.c<>(le.s, bqh.a),
      new akc.c<>(le.aR, dbq.a),
      new akc.c<>(le.d, dnc.a)
   );
   public static final List<akc.c<?>> b = List.of(new akc.c<>(le.aT, dua.a));
   public static final List<akc.c<?>> c = List.of(
      new akc.c<>(le.az, dbc.b),
      new akc.c<>(le.aA, wq.a),
      new akc.c<>(le.aP, cve.a),
      new akc.c<>(le.aO, cvc.a),
      new akc.c<>(le.m, cet.a),
      new akc.c<>(le.aE, dtz.h),
      new akc.c<>(le.s, bqh.a),
      new akc.c<>(le.d, dnc.a)
   );

   public static jk.b a(atr $$0, jk $$1, List<akc.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jk.b a(Map<akg<? extends jj<?>>, List<jn.a>> $$0, atu $$1, jk $$2, List<akc.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jk.b a(akc.b $$0, jk $$1, List<akc.c<?>> $$2) {
      Map<akg<?>, Exception> $$3 = new HashMap<>();
      List<akc.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akf.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jj<?> $$2x = $$1x.b();

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
         return new jk.c($$4.stream().map(akc.a::b).toList()).d();
      }
   }

   private static akf.b a(jk $$0, List<akc.a<?>> $$1) {
      final Map<akg<? extends jj<?>>, akf.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new akf.b() {
         @Override
         public <T> Optional<akf.a<T>> a(akg<? extends jj<? extends T>> $$0) {
            return Optional.ofNullable((akf.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akf.a<T> a(js<T> $$0) {
      return new akf.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> akf.a<T> a(jj<T> $$0) {
      return new akf.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<akg<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akh, Map<akh, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akg)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akg)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(akh $$0) {
      return $$0.a();
   }

   private static <E> void a(js<E> $$0, Decoder<E> $$1, akf<JsonElement> $$2, akg<E> $$3, atp $$4, ji $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow(false, $$0x -> {
         });
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(atr $$0, akf.b $$1, js<E> $$2, Decoder<E> $$3, Map<akg<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      aka $$6 = aka.a($$5);
      akf<JsonElement> $$7 = akf.a(JsonOps.INSTANCE, $$1);

      for (Entry<akh, atp> $$8 : $$6.a($$0).entrySet()) {
         akh $$9 = $$8.getKey();
         akg<E> $$10 = akg.a($$2.c(), $$6.b($$9));
         atp $$11 = $$8.getValue();
         ji $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<akg<? extends jj<?>>, List<jn.a>> $$0, atu $$1, akf.b $$2, js<E> $$3, Decoder<E> $$4, Map<akg<?>, Exception> $$5) {
      List<jn.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         akf<ux> $$7 = akf.a(uo.a, $$2);
         akf<JsonElement> $$8 = akf.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         aka $$10 = aka.a($$9);

         for (jn.a $$11 : $$6) {
            akg<E> $$12 = akg.a($$3.c(), $$11.a());
            Optional<ux> $$13 = $$11.b();
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
               akh $$17 = $$10.a($$11.a());

               try {
                  atp $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(akc.c<T> a, js<T> b, Map<akg<?>, Exception> c) {

      public void a(atr $$0, akf.b $$1) {
         akc.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akg<? extends jj<?>>, List<jn.a>> $$0, atu $$1, akf.b $$2) {
         akc.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akc.a<?> var1, akf.b var2);
   }

   public static record c<T>(akg<? extends jj<T>> a, Codec<T> b) {

      akc.a<T> a(Lifecycle $$0, Map<akg<?>, Exception> $$1) {
         js<T> $$2 = new je<>(this.a, $$0);
         return new akc.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akg<? extends jj<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

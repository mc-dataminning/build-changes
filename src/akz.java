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

public class akz {
   private static final Logger d = LogUtils.getLogger();
   private static final ju e = new ju(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atv>, ju> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atv::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ju($$0, $$1);
   });
   public static final List<akz.c<?>> a = List.of(
      new akz.c<>(lq.aE, dvt.h),
      new akz.c<>(lq.az, dcw.a),
      new akz.c<>(lq.aA, xk.a),
      new akz.c<>(lq.aB, dzw.a),
      new akz.c<>(lq.aC, eak.a),
      new akz.c<>(lq.aI, ehn.a),
      new akz.c<>(lq.aJ, eij.a),
      new akz.c<>(lq.aL, eip.a),
      new akz.c<>(lq.aK, emi.c),
      new akz.c<>(lq.aM, ejs.a),
      new akz.c<>(lq.aG, dxy.a),
      new akz.c<>(lq.aH, emx.a.a),
      new akz.c<>(lq.aD, dxm.b),
      new akz.c<>(lq.aQ, ehy.a),
      new akz.c<>(lq.aF, egk.a),
      new akz.c<>(lq.aP, cwv.a),
      new akz.c<>(lq.aO, cwt.a),
      new akz.c<>(lq.m, cgi.a),
      new akz.c<>(lq.s, bro.a),
      new akz.c<>(lq.aR, ddk.a),
      new akz.c<>(lq.d, dow.a)
   );
   public static final List<akz.c<?>> b = List.of(new akz.c<>(lq.aT, dvu.a));
   public static final List<akz.c<?>> c = List.of(
      new akz.c<>(lq.az, dcw.b),
      new akz.c<>(lq.aA, xk.a),
      new akz.c<>(lq.aP, cwv.a),
      new akz.c<>(lq.aO, cwt.a),
      new akz.c<>(lq.m, cgi.a),
      new akz.c<>(lq.aE, dvt.h),
      new akz.c<>(lq.s, bro.a),
      new akz.c<>(lq.d, dow.a)
   );

   public static jw.b a(auo $$0, jw $$1, List<akz.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jw.b a(Map<ald<? extends jv<?>>, List<jz.a>> $$0, aur $$1, jw $$2, List<akz.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jw.b a(akz.b $$0, jw $$1, List<akz.c<?>> $$2) {
      Map<ald<?>, Exception> $$3 = new HashMap<>();
      List<akz.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alc.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jv<?> $$2x = $$1x.b();

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
         return new jw.c($$4.stream().map(akz.a::b).toList()).d();
      }
   }

   private static alc.c a(jw $$0, List<akz.a<?>> $$1) {
      final Map<ald<? extends jv<?>>, alc.b<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new alc.c() {
         @Override
         public <T> Optional<alc.b<T>> a(ald<? extends jv<? extends T>> $$0) {
            return Optional.ofNullable((alc.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alc.b<T> a(ke<T> $$0) {
      return new alc.b<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> alc.b<T> a(jv<T> $$0) {
      return new alc.b<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ald<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ale, Map<ale, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ald)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ald)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ale $$0) {
      return $$0.a();
   }

   private static <E> void a(ke<E> $$0, Decoder<E> $$1, alc<JsonElement> $$2, ald<E> $$3, aum $$4, ju $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(auo $$0, alc.c $$1, ke<E> $$2, Decoder<E> $$3, Map<ald<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      akx $$6 = akx.a($$5);
      alc<JsonElement> $$7 = alc.a(JsonOps.INSTANCE, $$1);

      for (Entry<ale, aum> $$8 : $$6.a($$0).entrySet()) {
         ale $$9 = $$8.getKey();
         ald<E> $$10 = ald.a($$2.c(), $$6.b($$9));
         aum $$11 = $$8.getValue();
         ju $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<ald<? extends jv<?>>, List<jz.a>> $$0, aur $$1, alc.c $$2, ke<E> $$3, Decoder<E> $$4, Map<ald<?>, Exception> $$5) {
      List<jz.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         alc<vo> $$7 = alc.a(vf.a, $$2);
         alc<JsonElement> $$8 = alc.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         akx $$10 = akx.a($$9);

         for (jz.a $$11 : $$6) {
            ald<E> $$12 = ald.a($$3.c(), $$11.a());
            Optional<vo> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               ale $$17 = $$10.a($$11.a());

               try {
                  aum $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(akz.c<T> a, ke<T> b, Map<ald<?>, Exception> c) {

      public void a(auo $$0, alc.c $$1) {
         akz.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ald<? extends jv<?>>, List<jz.a>> $$0, aur $$1, alc.c $$2) {
         akz.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akz.a<?> var1, alc.c var2);
   }

   public static record c<T>(ald<? extends jv<T>> a, Codec<T> b) {

      akz.a<T> a(Lifecycle $$0, Map<ald<?>, Exception> $$1) {
         ke<T> $$2 = new jq<>(this.a, $$0);
         return new akz.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ald<? extends jv<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

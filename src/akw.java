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

public class akw {
   private static final Logger d = LogUtils.getLogger();
   private static final ju e = new ju(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<ats>, ju> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(ats::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ju($$0, $$1);
   });
   public static final List<akw.c<?>> a = List.of(
      new akw.c<>(lq.aE, dvp.h),
      new akw.c<>(lq.az, dcs.a),
      new akw.c<>(lq.aA, xh.a),
      new akw.c<>(lq.aB, dzs.a),
      new akw.c<>(lq.aC, eag.a),
      new akw.c<>(lq.aI, ehj.a),
      new akw.c<>(lq.aJ, eif.a),
      new akw.c<>(lq.aL, eil.a),
      new akw.c<>(lq.aK, eme.c),
      new akw.c<>(lq.aM, ejo.a),
      new akw.c<>(lq.aG, dxu.a),
      new akw.c<>(lq.aH, emt.a.a),
      new akw.c<>(lq.aD, dxi.b),
      new akw.c<>(lq.aQ, ehu.a),
      new akw.c<>(lq.aF, egg.a),
      new akw.c<>(lq.aP, cwr.a),
      new akw.c<>(lq.aO, cwp.a),
      new akw.c<>(lq.m, cge.a),
      new akw.c<>(lq.s, brk.a),
      new akw.c<>(lq.aR, ddg.a),
      new akw.c<>(lq.d, dos.a)
   );
   public static final List<akw.c<?>> b = List.of(new akw.c<>(lq.aT, dvq.a));
   public static final List<akw.c<?>> c = List.of(
      new akw.c<>(lq.az, dcs.b),
      new akw.c<>(lq.aA, xh.a),
      new akw.c<>(lq.aP, cwr.a),
      new akw.c<>(lq.aO, cwp.a),
      new akw.c<>(lq.m, cge.a),
      new akw.c<>(lq.aE, dvp.h),
      new akw.c<>(lq.s, brk.a),
      new akw.c<>(lq.d, dos.a)
   );

   public static jw.b a(aul $$0, jw $$1, List<akw.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jw.b a(Map<ala<? extends jv<?>>, List<jz.a>> $$0, auo $$1, jw $$2, List<akw.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jw.b a(akw.b $$0, jw $$1, List<akw.c<?>> $$2) {
      Map<ala<?>, Exception> $$3 = new HashMap<>();
      List<akw.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akz.b $$5 = a($$1, $$4);
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
         return new jw.c($$4.stream().map(akw.a::b).toList()).d();
      }
   }

   private static akz.b a(jw $$0, List<akw.a<?>> $$1) {
      final Map<ala<? extends jv<?>>, akz.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new akz.b() {
         @Override
         public <T> Optional<akz.a<T>> a(ala<? extends jv<? extends T>> $$0) {
            return Optional.ofNullable((akz.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akz.a<T> a(ke<T> $$0) {
      return new akz.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> akz.a<T> a(jv<T> $$0) {
      return new akz.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ala<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alb, Map<alb, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ala)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ala)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(alb $$0) {
      return $$0.a();
   }

   private static <E> void a(ke<E> $$0, Decoder<E> $$1, akz<JsonElement> $$2, ala<E> $$3, auj $$4, ju $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aul $$0, akz.b $$1, ke<E> $$2, Decoder<E> $$3, Map<ala<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      aku $$6 = aku.a($$5);
      akz<JsonElement> $$7 = akz.a(JsonOps.INSTANCE, $$1);

      for (Entry<alb, auj> $$8 : $$6.a($$0).entrySet()) {
         alb $$9 = $$8.getKey();
         ala<E> $$10 = ala.a($$2.c(), $$6.b($$9));
         auj $$11 = $$8.getValue();
         ju $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<ala<? extends jv<?>>, List<jz.a>> $$0, auo $$1, akz.b $$2, ke<E> $$3, Decoder<E> $$4, Map<ala<?>, Exception> $$5) {
      List<jz.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         akz<vo> $$7 = akz.a(vf.a, $$2);
         akz<JsonElement> $$8 = akz.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         aku $$10 = aku.a($$9);

         for (jz.a $$11 : $$6) {
            ala<E> $$12 = ala.a($$3.c(), $$11.a());
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
               alb $$17 = $$10.a($$11.a());

               try {
                  auj $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(akw.c<T> a, ke<T> b, Map<ala<?>, Exception> c) {

      public void a(aul $$0, akz.b $$1) {
         akw.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ala<? extends jv<?>>, List<jz.a>> $$0, auo $$1, akz.b $$2) {
         akw.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akw.a<?> var1, akz.b var2);
   }

   public static record c<T>(ala<? extends jv<T>> a, Codec<T> b) {

      akw.a<T> a(Lifecycle $$0, Map<ala<?>, Exception> $$1) {
         ke<T> $$2 = new jq<>(this.a, $$0);
         return new akw.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ala<? extends jv<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

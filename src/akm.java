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

public class akm {
   private static final Logger d = LogUtils.getLogger();
   private static final jy e = new jy(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atl>, jy> f = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atl::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jy($$0, $$1);
   });
   public static final List<akm.c<?>> a = List.of(
      new akm.c<>(lu.aK, dwy.h),
      new akm.c<>(lu.aF, ddw.a),
      new akm.c<>(lu.aG, wv.a),
      new akm.c<>(lu.aH, ebc.a),
      new akm.c<>(lu.aI, ebq.a),
      new akm.c<>(lu.aQ, eit.a),
      new akm.c<>(lu.aR, ejp.a),
      new akm.c<>(lu.aT, ejv.a),
      new akm.c<>(lu.aS, enq.c),
      new akm.c<>(lu.aU, ekz.a),
      new akm.c<>(lu.aO, dzd.a),
      new akm.c<>(lu.aP, eof.a.a),
      new akm.c<>(lu.aJ, dyr.b),
      new akm.c<>(lu.aY, eje.a),
      new akm.c<>(lu.aN, ehq.a),
      new akm.c<>(lu.aX, cxa.a),
      new akm.c<>(lu.aW, cwy.a),
      new akm.c<>(lu.m, cgi.a, true),
      new akm.c<>(lu.X, cjd.a, true),
      new akm.c<>(lu.s, brm.a),
      new akm.c<>(lu.aZ, dek.a),
      new akm.c<>(lu.d, dpx.a),
      new akm.c<>(lu.aL, dac.b),
      new akm.c<>(lu.aM, dbj.a),
      new akm.c<>(lu.L, cuv.a)
   );
   public static final List<akm.c<?>> b = List.of(new akm.c<>(lu.bb, dwz.a));
   public static final List<akm.c<?>> c = List.of(
      new akm.c<>(lu.aF, ddw.b),
      new akm.c<>(lu.aG, wv.a),
      new akm.c<>(lu.aX, cxa.a),
      new akm.c<>(lu.aW, cwy.a),
      new akm.c<>(lu.m, cgi.a, true),
      new akm.c<>(lu.X, cjd.a, true),
      new akm.c<>(lu.aK, dwy.h),
      new akm.c<>(lu.s, brm.a),
      new akm.c<>(lu.d, dpx.a),
      new akm.c<>(lu.aL, dac.b),
      new akm.c<>(lu.L, cuv.a)
   );

   public static ka.b a(aue $$0, ka $$1, List<akm.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ka.b a(Map<akq<? extends jz<?>>, List<kd.a>> $$0, auh $$1, ka $$2, List<akm.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ka.b a(akm.b $$0, ka $$1, List<akm.c<?>> $$2) {
      Map<akq<?>, Exception> $$3 = new HashMap<>();
      List<akm.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akp.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jz<?> $$2x = $$1x.b();

         try {
            $$2x.m();
         } catch (Exception var4x) {
            $$3.put($$2x.d(), var4x);
         }

         if ($$1x.a.c && $$2x.c() == 0) {
            $$3.put($$2x.d(), new IllegalStateException("Registry must be non-empty"));
         }
      });
      if (!$$3.isEmpty()) {
         a($$3);
         throw new IllegalStateException("Failed to load registries due to above errors");
      } else {
         return new ka.c($$4.stream().map(akm.a::b).toList()).d();
      }
   }

   private static akp.c a(ka $$0, List<akm.a<?>> $$1) {
      final Map<akq<? extends jz<?>>, akp.b<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.d(), a($$1x.b)));
      return new akp.c() {
         @Override
         public <T> Optional<akp.b<T>> a(akq<? extends jz<? extends T>> $$0) {
            return Optional.ofNullable((akp.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akp.b<T> a(ki<T> $$0) {
      return new akp.b<>($$0.q(), $$0.o(), $$0.e());
   }

   private static <T> akp.b<T> a(jz<T> $$0) {
      return new akp.b<>($$0.q(), $$0.v(), $$0.e());
   }

   private static void a(Map<akq<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akr, Map<akr, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akq)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akq)$$0x.getKey()).a(), Entry::getValue)));
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

   private static <E> void a(ki<E> $$0, Decoder<E> $$1, akp<JsonElement> $$2, akq<E> $$3, auc $$4, jy $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aue $$0, akp.c $$1, ki<E> $$2, Decoder<E> $$3, Map<akq<?>, Exception> $$4) {
      String $$5 = lu.c($$2.d());
      akk $$6 = akk.a($$5);
      akp<JsonElement> $$7 = akp.a(JsonOps.INSTANCE, $$1);

      for (Entry<akr, auc> $$8 : $$6.a($$0).entrySet()) {
         akr $$9 = $$8.getKey();
         akq<E> $$10 = akq.a($$2.d(), $$6.b($$9));
         auc $$11 = $$8.getValue();
         jy $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<akq<? extends jz<?>>, List<kd.a>> $$0, auh $$1, akp.c $$2, ki<E> $$3, Decoder<E> $$4, Map<akq<?>, Exception> $$5) {
      List<kd.a> $$6 = $$0.get($$3.d());
      if ($$6 != null) {
         akp<uy> $$7 = akp.a(up.a, $$2);
         akp<JsonElement> $$8 = akp.a(JsonOps.INSTANCE, $$2);
         String $$9 = lu.c($$3.d());
         akk $$10 = akk.a($$9);

         for (kd.a $$11 : $$6) {
            akq<E> $$12 = akq.a($$3.d(), $$11.a());
            Optional<uy> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               akr $$17 = $$10.a($$11.a());

               try {
                  auc $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(akm.c<T> a, ki<T> b, Map<akq<?>, Exception> c) {

      public void a(aue $$0, akp.c $$1) {
         akm.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akq<? extends jz<?>>, List<kd.a>> $$0, auh $$1, akp.c $$2) {
         akm.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akm.a<?> var1, akp.c var2);
   }

   public static record c<T>(akq<? extends jz<T>> a, Codec<T> b, boolean c) {

      c(akq<? extends jz<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akm.a<T> a(Lifecycle $$0, Map<akq<?>, Exception> $$1) {
         ki<T> $$2 = new ju<>(this.a, $$0);
         return new akm.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akq<? extends jz<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

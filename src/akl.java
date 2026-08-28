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

public class akl {
   private static final Logger d = LogUtils.getLogger();
   private static final jy e = new jy(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atk>, jy> f = ad.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atk::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jy($$0, $$1);
   });
   public static final List<akl.c<?>> a = List.of(
      new akl.c<>(lu.aK, dwv.h),
      new akl.c<>(lu.aF, ddu.a),
      new akl.c<>(lu.aG, wu.a),
      new akl.c<>(lu.aH, eaz.a),
      new akl.c<>(lu.aI, ebn.a),
      new akl.c<>(lu.aQ, eiq.a),
      new akl.c<>(lu.aR, ejm.a),
      new akl.c<>(lu.aT, ejs.a),
      new akl.c<>(lu.aS, enm.c),
      new akl.c<>(lu.aU, ekw.a),
      new akl.c<>(lu.aO, dza.a),
      new akl.c<>(lu.aP, eob.a.a),
      new akl.c<>(lu.aJ, dyo.b),
      new akl.c<>(lu.aY, ejb.a),
      new akl.c<>(lu.aN, ehn.a),
      new akl.c<>(lu.aX, cwy.a),
      new akl.c<>(lu.aW, cww.a),
      new akl.c<>(lu.m, cgg.a, true),
      new akl.c<>(lu.X, cjb.a, true),
      new akl.c<>(lu.s, brl.a),
      new akl.c<>(lu.aZ, dei.a),
      new akl.c<>(lu.d, dpv.a),
      new akl.c<>(lu.aL, daa.b),
      new akl.c<>(lu.aM, dbh.a),
      new akl.c<>(lu.L, cut.a)
   );
   public static final List<akl.c<?>> b = List.of(new akl.c<>(lu.bb, dww.a));
   public static final List<akl.c<?>> c = List.of(
      new akl.c<>(lu.aF, ddu.b),
      new akl.c<>(lu.aG, wu.a),
      new akl.c<>(lu.aX, cwy.a),
      new akl.c<>(lu.aW, cww.a),
      new akl.c<>(lu.m, cgg.a, true),
      new akl.c<>(lu.X, cjb.a, true),
      new akl.c<>(lu.aK, dwv.h),
      new akl.c<>(lu.s, brl.a),
      new akl.c<>(lu.d, dpv.a),
      new akl.c<>(lu.aL, daa.b),
      new akl.c<>(lu.L, cut.a)
   );

   public static ka.b a(aud $$0, ka $$1, List<akl.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ka.b a(Map<akp<? extends jz<?>>, List<kd.a>> $$0, aug $$1, ka $$2, List<akl.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ka.b a(akl.b $$0, ka $$1, List<akl.c<?>> $$2) {
      Map<akp<?>, Exception> $$3 = new HashMap<>();
      List<akl.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ako.c $$5 = a($$1, $$4);
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
         return new ka.c($$4.stream().map(akl.a::b).toList()).d();
      }
   }

   private static ako.c a(ka $$0, List<akl.a<?>> $$1) {
      final Map<akp<? extends jz<?>>, ako.b<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.d(), a($$1x.b)));
      return new ako.c() {
         @Override
         public <T> Optional<ako.b<T>> a(akp<? extends jz<? extends T>> $$0) {
            return Optional.ofNullable((ako.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ako.b<T> a(ki<T> $$0) {
      return new ako.b<>($$0.q(), $$0.o(), $$0.e());
   }

   private static <T> ako.b<T> a(jz<T> $$0) {
      return new ako.b<>($$0.q(), $$0.v(), $$0.e());
   }

   private static void a(Map<akp<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akq, Map<akq, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((akp)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((akp)$$0x.getKey()).a(), Entry::getValue)));
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

   private static <E> void a(ki<E> $$0, Decoder<E> $$1, ako<JsonElement> $$2, akp<E> $$3, aub $$4, jy $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aud $$0, ako.c $$1, ki<E> $$2, Decoder<E> $$3, Map<akp<?>, Exception> $$4) {
      String $$5 = lu.c($$2.d());
      akj $$6 = akj.a($$5);
      ako<JsonElement> $$7 = ako.a(JsonOps.INSTANCE, $$1);

      for (Entry<akq, aub> $$8 : $$6.a($$0).entrySet()) {
         akq $$9 = $$8.getKey();
         akp<E> $$10 = akp.a($$2.d(), $$6.b($$9));
         aub $$11 = $$8.getValue();
         jy $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<akp<? extends jz<?>>, List<kd.a>> $$0, aug $$1, ako.c $$2, ki<E> $$3, Decoder<E> $$4, Map<akp<?>, Exception> $$5) {
      List<kd.a> $$6 = $$0.get($$3.d());
      if ($$6 != null) {
         ako<ux> $$7 = ako.a(uo.a, $$2);
         ako<JsonElement> $$8 = ako.a(JsonOps.INSTANCE, $$2);
         String $$9 = lu.c($$3.d());
         akj $$10 = akj.a($$9);

         for (kd.a $$11 : $$6) {
            akp<E> $$12 = akp.a($$3.d(), $$11.a());
            Optional<ux> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, e);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               akq $$17 = $$10.a($$11.a());

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

   static record a<T>(akl.c<T> a, ki<T> b, Map<akp<?>, Exception> c) {

      public void a(aud $$0, ako.c $$1) {
         akl.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<akp<? extends jz<?>>, List<kd.a>> $$0, aug $$1, ako.c $$2) {
         akl.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akl.a<?> var1, ako.c var2);
   }

   public static record c<T>(akp<? extends jz<T>> a, Codec<T> b, boolean c) {

      c(akp<? extends jz<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akl.a<T> a(Lifecycle $$0, Map<akp<?>, Exception> $$1) {
         ki<T> $$2 = new ju<>(this.a, $$0);
         return new akl.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<akp<? extends jz<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

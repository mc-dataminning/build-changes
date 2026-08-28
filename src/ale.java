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

public class ale {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<ali<?>> e = Comparator.<ali<?>, alj>comparing(ali::b).thenComparing(ali::a);
   private static final kc f = new kc(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auj>, kc> g = ae.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auj::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kc($$0, $$1);
   });
   public static final List<ale.d<?>> a = List.of(
      new ale.d<>(ma.aL, dzq.h),
      new ale.d<>(ma.aG, dgo.a),
      new ale.d<>(ma.aH, xf.a),
      new ale.d<>(ma.aI, edu.a),
      new ale.d<>(ma.aJ, eei.a),
      new ale.d<>(ma.aR, elm.a),
      new ale.d<>(ma.aS, emi.a),
      new ale.d<>(ma.aU, emo.a),
      new ale.d<>(ma.aT, eqj.c),
      new ale.d<>(ma.aV, ens.a),
      new ale.d<>(ma.aP, ebv.a),
      new ale.d<>(ma.aQ, eqy.a.a),
      new ale.d<>(ma.aK, ebj.b),
      new ale.d<>(ma.aZ, elx.a),
      new ale.d<>(ma.aO, ekj.a),
      new ale.d<>(ma.aY, ded.a),
      new ale.d<>(ma.aX, deb.a),
      new ale.d<>(ma.aF, duy.b),
      new ale.d<>(ma.m, cic.a, true),
      new ale.d<>(ma.X, cky.a, true),
      new ale.d<>(ma.s, btd.a),
      new ale.d<>(ma.ba, dhc.a),
      new ale.d<>(ma.d, dso.a),
      new ale.d<>(ma.aM, dcd.b),
      new ale.d<>(ma.aN, ddl.a),
      new ale.d<>(ma.L, cws.a),
      new ale.d<>(ma.I, cwf.a)
   );
   public static final List<ale.d<?>> b = List.of(new ale.d<>(ma.bc, dzr.a));
   public static final List<ale.d<?>> c = List.of(
      new ale.d<>(ma.aG, dgo.b),
      new ale.d<>(ma.aH, xf.a),
      new ale.d<>(ma.aY, ded.a),
      new ale.d<>(ma.aX, deb.a),
      new ale.d<>(ma.m, cic.a, true),
      new ale.d<>(ma.X, cky.a, true),
      new ale.d<>(ma.aL, dzq.h),
      new ale.d<>(ma.s, btd.a),
      new ale.d<>(ma.d, dso.a),
      new ale.d<>(ma.aM, dcd.b),
      new ale.d<>(ma.L, cws.a),
      new ale.d<>(ma.I, cwf.a)
   );

   public static ke.b a(avd $$0, List<js.b<?>> $$1, List<ale.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ke.b a(Map<ali<? extends kd<?>>, ale.c> $$0, avg $$1, List<js.b<?>> $$2, List<ale.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ke.b a(ale.b $$0, List<js.b<?>> $$1, List<ale.d<?>> $$2) {
      Map<ali<?>, Exception> $$3 = new HashMap<>();
      List<ale.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alh.c $$5 = a($$1, $$4);
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
         return new ke.c($$4.stream().map(ale.a::b).toList()).e();
      }
   }

   private static alh.c a(List<js.b<?>> $$0, List<ale.a<?>> $$1) {
      final Map<ali<? extends kd<?>>, alh.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alh.c() {
         @Override
         public <T> Optional<alh.b<T>> a(ali<? extends kd<? extends T>> $$0) {
            return Optional.ofNullable((alh.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alh.b<T> a(km<T> $$0) {
      return new alh.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alh.b<T> a(js.b<T> $$0) {
      return new alh.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<ali<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<ali<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alj, Map<alj, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ali)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ali)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<ali<?>, Exception> $$0) {
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
                        .append(((ali)$$1xx.getKey()).b())
                        .append("/")
                        .append(((ali)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(km<E> $$0, Decoder<E> $$1, alh<JsonElement> $$2, ali<E> $$3, avb $$4, kc $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avd $$0, alh.c $$1, km<E> $$2, Decoder<E> $$3, Map<ali<?>, Exception> $$4) {
      String $$5 = ma.c($$2.g());
      alc $$6 = alc.a($$5);
      alh<JsonElement> $$7 = alh.a(JsonOps.INSTANCE, $$1);

      for (Entry<alj, avb> $$8 : $$6.a($$0).entrySet()) {
         alj $$9 = $$8.getKey();
         ali<E> $$10 = ali.a($$2.g(), $$6.b($$9));
         avb $$11 = $$8.getValue();
         kc $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axt.a($$0, $$2);
   }

   static <E> void a(Map<ali<? extends kd<?>>, ale.c> $$0, avg $$1, alh.c $$2, km<E> $$3, Decoder<E> $$4, Map<ali<?>, Exception> $$5) {
      ale.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alh<vi> $$7 = alh.a(uz.a, $$2);
         alh<JsonElement> $$8 = alh.a(JsonOps.INSTANCE, $$2);
         String $$9 = ma.c($$3.g());
         alc $$10 = alc.a($$9);

         for (kh.a $$11 : $$6.a) {
            ali<E> $$12 = ali.a($$3.g(), $$11.a());
            Optional<vi> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alj $$17 = $$10.a($$11.a());

               try {
                  avb $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axt.a($$6.b, $$3);
      }
   }

   static record a<T>(ale.d<T> a, km<T> b, Map<ali<?>, Exception> c) {

      public void a(avd $$0, alh.c $$1) {
         ale.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ali<? extends kd<?>>, ale.c> $$0, avg $$1, alh.c $$2) {
         ale.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ale.a<?> var1, alh.c var2);
   }

   public static record c(List<kh.a> a, axu.a b) {
   }

   public static record d<T>(ali<? extends kd<T>> a, Codec<T> b, boolean c) {

      d(ali<? extends kd<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      ale.a<T> a(Lifecycle $$0, Map<ali<?>, Exception> $$1) {
         km<T> $$2 = new jy<>(this.a, $$0);
         return new ale.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ali<? extends kd<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

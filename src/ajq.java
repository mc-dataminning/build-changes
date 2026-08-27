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

public class ajq {
   private static final Logger d = LogUtils.getLogger();
   private static final iz e = new iz(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<asl>, iz> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(asl::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new iz($$0, $$1);
   });
   public static final List<ajq.c<?>> a = List.of(
      new ajq.c<>(ku.aB, dta.h),
      new ajq.c<>(ku.aw, daf.a),
      new ajq.c<>(ku.ax, we.a),
      new ajq.c<>(ku.ay, dxd.a),
      new ajq.c<>(ku.az, dxr.a),
      new ajq.c<>(ku.aF, eeu.a),
      new ajq.c<>(ku.aG, efq.a),
      new ajq.c<>(ku.aI, efw.a),
      new ajq.c<>(ku.aH, ejp.c),
      new ajq.c<>(ku.aJ, egz.a),
      new ajq.c<>(ku.aD, dvf.a),
      new ajq.c<>(ku.aE, eke.a.a),
      new ajq.c<>(ku.aA, dut.b),
      new ajq.c<>(ku.aN, eff.a),
      new ajq.c<>(ku.aC, edr.a),
      new ajq.c<>(ku.aM, ctw.a),
      new ajq.c<>(ku.aL, ctu.a),
      new ajq.c<>(ku.m, cdm.a),
      new ajq.c<>(ku.s, bpa.a),
      new ajq.c<>(ku.aO, dat.a),
      new ajq.c<>(ku.d, dme.a)
   );
   public static final List<ajq.c<?>> b = List.of(new ajq.c<>(ku.aQ, dtb.a));
   public static final List<ajq.c<?>> c = List.of(
      new ajq.c<>(ku.aw, daf.b),
      new ajq.c<>(ku.ax, we.a),
      new ajq.c<>(ku.aM, ctw.a),
      new ajq.c<>(ku.aL, ctu.a),
      new ajq.c<>(ku.m, cdm.a),
      new ajq.c<>(ku.aB, dta.h),
      new ajq.c<>(ku.s, bpa.a),
      new ajq.c<>(ku.d, dme.a)
   );

   public static jb.b a(ate $$0, jb $$1, List<ajq.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jb.b a(Map<aju<? extends ja<?>>, List<je.a>> $$0, ath $$1, jb $$2, List<ajq.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static jb.b a(ajq.b $$0, jb $$1, List<ajq.c<?>> $$2) {
      Map<aju<?>, Exception> $$3 = new HashMap<>();
      List<ajq.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ajt.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ja<?> $$2x = $$1x.b();

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
         return new jb.c($$4.stream().map(ajq.a::b).toList()).d();
      }
   }

   private static ajt.b a(jb $$0, List<ajq.a<?>> $$1) {
      final Map<aju<? extends ja<?>>, ajt.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new ajt.b() {
         @Override
         public <T> Optional<ajt.a<T>> a(aju<? extends ja<? extends T>> $$0) {
            return Optional.ofNullable((ajt.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ajt.a<T> a(jj<T> $$0) {
      return new ajt.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ajt.a<T> a(ja<T> $$0) {
      return new ajt.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aju<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ajv, Map<ajv, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aju)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aju)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ajv $$0) {
      return $$0.a();
   }

   private static <E> void a(jj<E> $$0, Decoder<E> $$1, ajt<JsonElement> $$2, aju<E> $$3, atc $$4, iz $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow(false, $$0x -> {
         });
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(ate $$0, ajt.b $$1, jj<E> $$2, Decoder<E> $$3, Map<aju<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      ajo $$6 = ajo.a($$5);
      ajt<JsonElement> $$7 = ajt.a(JsonOps.INSTANCE, $$1);

      for (Entry<ajv, atc> $$8 : $$6.a($$0).entrySet()) {
         ajv $$9 = $$8.getKey();
         aju<E> $$10 = aju.a($$2.c(), $$6.b($$9));
         atc $$11 = $$8.getValue();
         iz $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<aju<? extends ja<?>>, List<je.a>> $$0, ath $$1, ajt.b $$2, jj<E> $$3, Decoder<E> $$4, Map<aju<?>, Exception> $$5) {
      List<je.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         ajt<ul> $$7 = ajt.a(uc.a, $$2);
         ajt<JsonElement> $$8 = ajt.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         ajo $$10 = ajo.a($$9);

         for (je.a $$11 : $$6) {
            aju<E> $$12 = aju.a($$3.c(), $$11.a());
            Optional<ul> $$13 = $$11.b();
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
               ajv $$17 = $$10.a($$11.a());

               try {
                  atc $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(ajq.c<T> a, jj<T> b, Map<aju<?>, Exception> c) {

      public void a(ate $$0, ajt.b $$1) {
         ajq.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<aju<? extends ja<?>>, List<je.a>> $$0, ath $$1, ajt.b $$2) {
         ajq.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ajq.a<?> var1, ajt.b var2);
   }

   public static record c<T>(aju<? extends ja<T>> a, Codec<T> b) {

      ajq.a<T> a(Lifecycle $$0, Map<aju<?>, Exception> $$1) {
         jj<T> $$2 = new iv<>(this.a, $$0);
         return new ajq.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<aju<? extends ja<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

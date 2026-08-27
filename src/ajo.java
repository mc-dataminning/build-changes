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

public class ajo {
   private static final Logger d = LogUtils.getLogger();
   private static final ix e = new ix(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<asj>, ix> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(asj::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ix($$0, $$1);
   });
   public static final List<ajo.c<?>> a = List.of(
      new ajo.c<>(ks.aA, dsr.h),
      new ajo.c<>(ks.av, czw.a),
      new ajo.c<>(ks.aw, wc.a),
      new ajo.c<>(ks.ax, dwu.a),
      new ajo.c<>(ks.ay, dxi.a),
      new ajo.c<>(ks.aE, eel.a),
      new ajo.c<>(ks.aF, efh.a),
      new ajo.c<>(ks.aH, efn.a),
      new ajo.c<>(ks.aG, ejg.c),
      new ajo.c<>(ks.aI, egq.a),
      new ajo.c<>(ks.aC, duw.a),
      new ajo.c<>(ks.aD, ejv.a.a),
      new ajo.c<>(ks.az, duk.b),
      new ajo.c<>(ks.aM, eew.a),
      new ajo.c<>(ks.aB, edi.a),
      new ajo.c<>(ks.aL, ctn.a),
      new ajo.c<>(ks.aK, ctl.a),
      new ajo.c<>(ks.r, bov.a),
      new ajo.c<>(ks.aN, dak.a)
   );
   public static final List<ajo.c<?>> b = List.of(new ajo.c<>(ks.aP, dss.a));
   public static final List<ajo.c<?>> c = List.of(
      new ajo.c<>(ks.av, czw.b),
      new ajo.c<>(ks.aw, wc.a),
      new ajo.c<>(ks.aL, ctn.a),
      new ajo.c<>(ks.aK, ctl.a),
      new ajo.c<>(ks.aA, dsr.h),
      new ajo.c<>(ks.r, bov.a)
   );

   public static iz.b a(atc $$0, iz $$1, List<ajo.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static iz.b a(Map<ajs<? extends iy<?>>, List<jc.a>> $$0, atf $$1, iz $$2, List<ajo.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static iz.b a(ajo.b $$0, iz $$1, List<ajo.c<?>> $$2) {
      Map<ajs<?>, Exception> $$3 = new HashMap<>();
      List<ajo.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ajr.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         iy<?> $$2x = $$1x.b();

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
         return new iz.c($$4.stream().map(ajo.a::b).toList()).d();
      }
   }

   private static ajr.b a(iz $$0, List<ajo.a<?>> $$1) {
      final Map<ajs<? extends iy<?>>, ajr.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new ajr.b() {
         @Override
         public <T> Optional<ajr.a<T>> a(ajs<? extends iy<? extends T>> $$0) {
            return Optional.ofNullable((ajr.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ajr.a<T> a(jh<T> $$0) {
      return new ajr.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ajr.a<T> a(iy<T> $$0) {
      return new ajr.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ajs<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ajt, Map<ajt, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ajs)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ajs)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ajt $$0) {
      return $$0.a();
   }

   private static <E> void a(jh<E> $$0, Decoder<E> $$1, ajr<JsonElement> $$2, ajs<E> $$3, ata $$4, ix $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow(false, $$0x -> {
         });
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(atc $$0, ajr.b $$1, jh<E> $$2, Decoder<E> $$3, Map<ajs<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      ajm $$6 = ajm.a($$5);
      ajr<JsonElement> $$7 = ajr.a(JsonOps.INSTANCE, $$1);

      for (Entry<ajt, ata> $$8 : $$6.a($$0).entrySet()) {
         ajt $$9 = $$8.getKey();
         ajs<E> $$10 = ajs.a($$2.c(), $$6.b($$9));
         ata $$11 = $$8.getValue();
         ix $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<ajs<? extends iy<?>>, List<jc.a>> $$0, atf $$1, ajr.b $$2, jh<E> $$3, Decoder<E> $$4, Map<ajs<?>, Exception> $$5) {
      List<jc.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         ajr<uj> $$7 = ajr.a(ua.a, $$2);
         ajr<JsonElement> $$8 = ajr.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         ajm $$10 = ajm.a($$9);

         for (jc.a $$11 : $$6) {
            ajs<E> $$12 = ajs.a($$3.c(), $$11.a());
            Optional<uj> $$13 = $$11.b();
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
               ajt $$17 = $$10.a($$11.a());

               try {
                  ata $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(ajo.c<T> a, jh<T> b, Map<ajs<?>, Exception> c) {

      public void a(atc $$0, ajr.b $$1) {
         ajo.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ajs<? extends iy<?>>, List<jc.a>> $$0, atf $$1, ajr.b $$2) {
         ajo.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ajo.a<?> var1, ajr.b var2);
   }

   public static record c<T>(ajs<? extends iy<T>> a, Codec<T> b) {

      ajo.a<T> a(Lifecycle $$0, Map<ajs<?>, Exception> $$1) {
         jh<T> $$2 = new it<>(this.a, $$0);
         return new ajo.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ajs<? extends iy<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

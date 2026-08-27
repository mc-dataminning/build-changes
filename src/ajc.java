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

public class ajc {
   private static final Logger d = LogUtils.getLogger();
   private static final ix e = new ix(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<arv>, ix> f = ac.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(arv::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new ix($$0, $$1);
   });
   public static final List<ajc.c<?>> a = List.of(
      new ajc.c<>(kj.az, dqm.h),
      new ajc.c<>(kj.au, cxy.a),
      new ajc.c<>(kj.av, vq.a),
      new ajc.c<>(kj.aw, dup.a),
      new ajc.c<>(kj.ax, dvd.a),
      new ajc.c<>(kj.aD, ecg.a),
      new ajc.c<>(kj.aE, edc.a),
      new ajc.c<>(kj.aG, edi.a),
      new ajc.c<>(kj.aF, ehb.c),
      new ajc.c<>(kj.aH, eel.a),
      new ajc.c<>(kj.aB, dsr.a),
      new ajc.c<>(kj.aC, ehq.a.a),
      new ajc.c<>(kj.ay, dsf.b),
      new ajc.c<>(kj.aL, ecr.a),
      new ajc.c<>(kj.aA, ebd.a),
      new ajc.c<>(kj.aK, csp.a),
      new ajc.c<>(kj.aJ, csn.a),
      new ajc.c<>(kj.r, bnx.a),
      new ajc.c<>(kj.aM, cym.a)
   );
   public static final List<ajc.c<?>> b = List.of(new ajc.c<>(kj.aO, dqn.a));
   public static final List<ajc.c<?>> c = List.of(
      new ajc.c<>(kj.au, cxy.b),
      new ajc.c<>(kj.av, vq.a),
      new ajc.c<>(kj.aK, csp.a),
      new ajc.c<>(kj.aJ, csn.a),
      new ajc.c<>(kj.az, dqm.h),
      new ajc.c<>(kj.r, bnx.a)
   );

   public static iz.b a(aso $$0, iz $$1, List<ajc.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static iz.b a(Map<ajg<? extends iy<?>>, List<jc.a>> $$0, asr $$1, iz $$2, List<ajc.c<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   public static iz.b a(ajc.b $$0, iz $$1, List<ajc.c<?>> $$2) {
      Map<ajg<?>, Exception> $$3 = new HashMap<>();
      List<ajc.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      ajf.b $$5 = a($$1, $$4);
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
         return new iz.c($$4.stream().map(ajc.a::b).toList()).d();
      }
   }

   private static ajf.b a(iz $$0, List<ajc.a<?>> $$1) {
      final Map<ajg<? extends iy<?>>, ajf.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new ajf.b() {
         @Override
         public <T> Optional<ajf.a<T>> a(ajg<? extends iy<? extends T>> $$0) {
            return Optional.ofNullable((ajf.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> ajf.a<T> a(jh<T> $$0) {
      return new ajf.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> ajf.a<T> a(iy<T> $$0) {
      return new ajf.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ajg<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ajh, Map<ajh, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ajg)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ajg)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ajh $$0) {
      return $$0.a();
   }

   private static <E> void a(jh<E> $$0, Decoder<E> $$1, ajf<JsonElement> $$2, ajg<E> $$3, asm $$4, ix $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow(false, $$0x -> {
         });
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aso $$0, ajf.b $$1, jh<E> $$2, Decoder<E> $$3, Map<ajg<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      aja $$6 = aja.a($$5);
      ajf<JsonElement> $$7 = ajf.a(JsonOps.INSTANCE, $$1);

      for (Entry<ajh, asm> $$8 : $$6.a($$0).entrySet()) {
         ajh $$9 = $$8.getKey();
         ajg<E> $$10 = ajg.a($$2.c(), $$6.b($$9));
         asm $$11 = $$8.getValue();
         ix $$12 = f.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }
   }

   static <E> void a(Map<ajg<? extends iy<?>>, List<jc.a>> $$0, asr $$1, ajf.b $$2, jh<E> $$3, Decoder<E> $$4, Map<ajg<?>, Exception> $$5) {
      List<jc.a> $$6 = $$0.get($$3.c());
      if ($$6 != null) {
         ajf<tx> $$7 = ajf.a(to.a, $$2);
         ajf<JsonElement> $$8 = ajf.a(JsonOps.INSTANCE, $$2);
         String $$9 = a($$3.c().a());
         aja $$10 = aja.a($$9);

         for (jc.a $$11 : $$6) {
            ajg<E> $$12 = ajg.a($$3.c(), $$11.a());
            Optional<tx> $$13 = $$11.b();
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
               ajh $$17 = $$10.a($$11.a());

               try {
                  asm $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, e);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }
      }
   }

   static record a<T>(ajc.c<T> a, jh<T> b, Map<ajg<?>, Exception> c) {

      public void a(aso $$0, ajf.b $$1) {
         ajc.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ajg<? extends iy<?>>, List<jc.a>> $$0, asr $$1, ajf.b $$2) {
         ajc.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ajc.a<?> var1, ajf.b var2);
   }

   public static record c<T>(ajg<? extends iy<T>> a, Codec<T> b) {

      ajc.a<T> a(Lifecycle $$0, Map<ajg<?>, Exception> $$1) {
         jh<T> $$2 = new it<>(this.a, $$0);
         return new ajc.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ajg<? extends iy<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

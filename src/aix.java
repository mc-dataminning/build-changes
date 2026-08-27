import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
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
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class aix {
   private static final Logger d = LogUtils.getLogger();
   public static final List<aix.c<?>> a = List.of(
      new aix.c<>(ki.az, dpq.h),
      new aix.c<>(ki.au, cxd.a),
      new aix.c<>(ki.av, vo.a),
      new aix.c<>(ki.aw, dtt.a),
      new aix.c<>(ki.ax, duh.a),
      new aix.c<>(ki.aD, ebk.a),
      new aix.c<>(ki.aE, ecg.a),
      new aix.c<>(ki.aG, ecm.a),
      new aix.c<>(ki.aF, egf.c),
      new aix.c<>(ki.aH, edp.a),
      new aix.c<>(ki.aB, drv.a),
      new aix.c<>(ki.aC, egu.a.a),
      new aix.c<>(ki.ay, drj.b),
      new aix.c<>(ki.aL, ebv.a),
      new aix.c<>(ki.aA, eah.a),
      new aix.c<>(ki.aK, cru.a),
      new aix.c<>(ki.aJ, crs.a),
      new aix.c<>(ki.r, bng.a),
      new aix.c<>(ki.aM, cxr.a)
   );
   public static final List<aix.c<?>> b = List.of(new aix.c<>(ki.aO, dpr.a));
   public static final List<aix.c<?>> c = List.of(
      new aix.c<>(ki.au, cxd.b),
      new aix.c<>(ki.av, vo.a),
      new aix.c<>(ki.aK, cru.a),
      new aix.c<>(ki.aJ, crs.a),
      new aix.c<>(ki.az, dpq.h),
      new aix.c<>(ki.r, bng.a)
   );

   public static iy.b a(asf $$0, iy $$1, List<aix.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static iy.b a(Map<ajb<? extends ix<?>>, List<jb.a>> $$0, iy $$1, List<aix.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static iy.b a(aix.b $$0, iy $$1, List<aix.c<?>> $$2) {
      Map<ajb<?>, Exception> $$3 = new HashMap<>();
      List<aix.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      aja.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ix<?> $$2x = $$1x.b();

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
         return new iy.c($$4.stream().map(aix.a::b).toList()).d();
      }
   }

   private static aja.b a(iy $$0, List<aix.a<?>> $$1) {
      final Map<ajb<? extends ix<?>>, aja.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new aja.b() {
         @Override
         public <T> Optional<aja.a<T>> a(ajb<? extends ix<? extends T>> $$0) {
            return Optional.ofNullable((aja.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aja.a<T> a(jg<T> $$0) {
      return new aja.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aja.a<T> a(ix<T> $$0) {
      return new aja.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ajb<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ajc, Map<ajc, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ajb)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ajb)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(ajc $$0) {
      return $$0.a();
   }

   static <E> void a(asf $$0, aja.b $$1, jg<E> $$2, Decoder<E> $$3, Map<ajb<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      aiv $$6 = aiv.a($$5);
      aja<JsonElement> $$7 = aja.a(JsonOps.INSTANCE, $$1);

      for (Entry<ajc, asd> $$8 : $$6.a($$0).entrySet()) {
         ajc $$9 = $$8.getKey();
         ajb<E> $$10 = ajb.a($$2.c(), $$6.b($$9));
         asd $$11 = $$8.getValue();

         try (Reader $$12 = $$11.e()) {
            JsonElement $$13 = JsonParser.parseReader($$12);
            DataResult<E> $$14 = $$3.parse($$7, $$13);
            E $$15 = (E)$$14.getOrThrow(false, $$0x -> {
            });
            $$2.a($$10, $$15, $$11.c() ? Lifecycle.stable() : $$14.lifecycle());
         } catch (Exception var19) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var19));
         }
      }
   }

   static <E> void a(Map<ajb<? extends ix<?>>, List<jb.a>> $$0, aja.b $$1, jg<E> $$2, Decoder<E> $$3, Map<ajb<?>, Exception> $$4) {
      List<jb.a> $$5 = $$0.get($$2.c());
      if ($$5 != null) {
         aja<tv> $$6 = aja.a(tm.a, $$1);

         for (jb.a $$7 : $$5) {
            ajb<E> $$8 = ajb.a($$2.c(), $$7.a());

            try {
               DataResult<E> $$9 = $$3.parse($$6, $$7.b());
               E $$10 = (E)$$9.getOrThrow(false, $$0x -> {
               });
               $$2.a($$8, $$10, Lifecycle.experimental());
            } catch (Exception var12) {
               $$4.put($$8, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$7.b()), var12));
            }
         }
      }
   }

   static record a<T>(aix.c<T> a, jg<T> b, Map<ajb<?>, Exception> c) {

      public void a(asf $$0, aja.b $$1) {
         aix.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ajb<? extends ix<?>>, List<jb.a>> $$0, aja.b $$1) {
         aix.a($$0, $$1, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(aix.a<?> var1, aja.b var2);
   }

   public static record c<T>(ajb<? extends ix<T>> a, Codec<T> b) {

      aix.a<T> a(Lifecycle $$0, Map<ajb<?>, Exception> $$1) {
         jg<T> $$2 = new it<>(this.a, $$0);
         return new aix.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ajb<? extends ix<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

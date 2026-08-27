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

public class ait {
   private static final Logger d = LogUtils.getLogger();
   public static final List<ait.c<?>> a = List.of(
      new ait.c<>(kg.ay, dov.h),
      new ait.c<>(kg.at, cwq.a),
      new ait.c<>(kg.au, vm.a),
      new ait.c<>(kg.av, dsy.a),
      new ait.c<>(kg.aw, dtm.a),
      new ait.c<>(kg.aC, eap.a),
      new ait.c<>(kg.aD, ebl.a),
      new ait.c<>(kg.aF, ebr.a),
      new ait.c<>(kg.aE, efk.c),
      new ait.c<>(kg.aG, ecu.a),
      new ait.c<>(kg.aA, dra.a),
      new ait.c<>(kg.aB, efz.a.a),
      new ait.c<>(kg.ax, dqo.b),
      new ait.c<>(kg.aK, eba.a),
      new ait.c<>(kg.az, dzm.a),
      new ait.c<>(kg.aJ, crh.a),
      new ait.c<>(kg.aI, crf.a),
      new ait.c<>(kg.r, bmr.a),
      new ait.c<>(kg.aL, cxe.a)
   );
   public static final List<ait.c<?>> b = List.of(new ait.c<>(kg.aN, dow.a));
   public static final List<ait.c<?>> c = List.of(
      new ait.c<>(kg.at, cwq.b),
      new ait.c<>(kg.au, vm.a),
      new ait.c<>(kg.aJ, crh.a),
      new ait.c<>(kg.aI, crf.a),
      new ait.c<>(kg.ay, dov.h),
      new ait.c<>(kg.r, bmr.a)
   );

   public static iw.b a(asb $$0, iw $$1, List<ait.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static iw.b a(Map<aix<? extends iv<?>>, List<iz.a>> $$0, iw $$1, List<ait.c<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static iw.b a(ait.b $$0, iw $$1, List<ait.c<?>> $$2) {
      Map<aix<?>, Exception> $$3 = new HashMap<>();
      List<ait.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      aiw.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         iv<?> $$2x = $$1x.b();

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
         return new iw.c($$4.stream().map(ait.a::b).toList()).d();
      }
   }

   private static aiw.b a(iw $$0, List<ait.a<?>> $$1) {
      final Map<aix<? extends iv<?>>, aiw.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put($$1x.b.c(), a($$1x.b)));
      return new aiw.b() {
         @Override
         public <T> Optional<aiw.a<T>> a(aix<? extends iv<? extends T>> $$0) {
            return Optional.ofNullable((aiw.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aiw.a<T> a(je<T> $$0) {
      return new aiw.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aiw.a<T> a(iv<T> $$0) {
      return new aiw.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aix<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aiy, Map<aiy, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aix)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aix)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aiy $$0) {
      return $$0.a();
   }

   static <E> void a(asb $$0, aiw.b $$1, je<E> $$2, Decoder<E> $$3, Map<aix<?>, Exception> $$4) {
      String $$5 = a($$2.c().a());
      air $$6 = air.a($$5);
      aiw<JsonElement> $$7 = aiw.a(JsonOps.INSTANCE, $$1);

      for (Entry<aiy, arz> $$8 : $$6.a($$0).entrySet()) {
         aiy $$9 = $$8.getKey();
         aix<E> $$10 = aix.a($$2.c(), $$6.b($$9));
         arz $$11 = $$8.getValue();

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

   static <E> void a(Map<aix<? extends iv<?>>, List<iz.a>> $$0, aiw.b $$1, je<E> $$2, Decoder<E> $$3, Map<aix<?>, Exception> $$4) {
      List<iz.a> $$5 = $$0.get($$2.c());
      if ($$5 != null) {
         aiw<tt> $$6 = aiw.a(tk.a, $$1);

         for (iz.a $$7 : $$5) {
            aix<E> $$8 = aix.a($$2.c(), $$7.a());

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

   static record a<T>(ait.c<T> a, je<T> b, Map<aix<?>, Exception> c) {

      public void a(asb $$0, aiw.b $$1) {
         ait.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<aix<? extends iv<?>>, List<iz.a>> $$0, aiw.b $$1) {
         ait.a($$0, $$1, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(ait.a<?> var1, aiw.b var2);
   }

   public static record c<T>(aix<? extends iv<T>> a, Codec<T> b) {

      ait.a<T> a(Lifecycle $$0, Map<aix<?>, Exception> $$1) {
         je<T> $$2 = new ir<>(this.a, $$0);
         return new ait.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<aix<? extends iv<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

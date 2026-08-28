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

public class akq {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<aku<?>> e = Comparator.<aku<?>, akv>comparing(aku::b).thenComparing(aku::a);
   private static final kd f = new kd(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<atw>, kd> g = af.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(atw::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kd($$0, $$1);
   });
   public static final List<akq.d<?>> a = List.of(
      new akq.d<>(mc.aN, ear.h),
      new akq.d<>(mc.aI, dhj.a),
      new akq.d<>(mc.aJ, wl.a),
      new akq.d<>(mc.aK, eev.a),
      new akq.d<>(mc.aL, efj.a),
      new akq.d<>(mc.aT, emp.a),
      new akq.d<>(mc.aU, enl.a),
      new akq.d<>(mc.aW, enr.a),
      new akq.d<>(mc.aV, erm.c),
      new akq.d<>(mc.aX, eov.a),
      new akq.d<>(mc.aR, ecw.a),
      new akq.d<>(mc.aS, esb.a.a),
      new akq.d<>(mc.aM, eck.b),
      new akq.d<>(mc.bb, ena.a),
      new akq.d<>(mc.aQ, elm.a),
      new akq.d<>(mc.ba, dey.a),
      new akq.d<>(mc.aZ, dew.a),
      new akq.d<>(mc.bd, dvz.b),
      new akq.d<>(mc.m, cib.a, true),
      new akq.d<>(mc.X, ckx.a, true),
      new akq.d<>(mc.s, btc.a),
      new akq.d<>(mc.bc, dhx.a),
      new akq.d<>(mc.d, dto.a),
      new akq.d<>(mc.aO, dcy.b),
      new akq.d<>(mc.aP, deg.a),
      new akq.d<>(mc.L, cwu.a),
      new akq.d<>(mc.I, cwh.a)
   );
   public static final List<akq.d<?>> b = List.of(new akq.d<>(mc.bf, eas.a));
   public static final List<akq.d<?>> c = List.of(
      new akq.d<>(mc.aI, dhj.b),
      new akq.d<>(mc.aJ, wl.a),
      new akq.d<>(mc.ba, dey.a),
      new akq.d<>(mc.aZ, dew.a),
      new akq.d<>(mc.m, cib.a, true),
      new akq.d<>(mc.X, ckx.a, true),
      new akq.d<>(mc.aN, ear.h),
      new akq.d<>(mc.s, btc.a),
      new akq.d<>(mc.d, dto.a),
      new akq.d<>(mc.aO, dcy.b),
      new akq.d<>(mc.L, cwu.a),
      new akq.d<>(mc.I, cwh.a)
   );

   public static kf.b a(aup $$0, List<jt.b<?>> $$1, List<akq.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static kf.b a(Map<aku<? extends ke<?>>, akq.c> $$0, aus $$1, List<jt.b<?>> $$2, List<akq.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static kf.b a(akq.b $$0, List<jt.b<?>> $$1, List<akq.d<?>> $$2) {
      Map<aku<?>, Exception> $$3 = new HashMap<>();
      List<akq.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      akt.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         ke<?> $$2x = $$1x.b();

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
         return new kf.c($$4.stream().map(akq.a::b).toList()).e();
      }
   }

   private static akt.c a(List<jt.b<?>> $$0, List<akq.a<?>> $$1) {
      final Map<aku<? extends ke<?>>, akt.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new akt.c() {
         @Override
         public <T> Optional<akt.b<T>> a(aku<? extends ke<? extends T>> $$0) {
            return Optional.ofNullable((akt.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> akt.b<T> a(kn<T> $$0) {
      return new akt.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> akt.b<T> a(jt.b<T> $$0) {
      return new akt.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<aku<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<aku<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<akv, Map<akv, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aku)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aku)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<aku<?>, Exception> $$0) {
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
                        .append(((aku)$$1xx.getKey()).b())
                        .append("/")
                        .append(((aku)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(kn<E> $$0, Decoder<E> $$1, akt<JsonElement> $$2, aku<E> $$3, aun $$4, kd $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(aup $$0, akt.c $$1, kn<E> $$2, Decoder<E> $$3, Map<aku<?>, Exception> $$4) {
      ako $$5 = ako.a($$2.g());
      akt<JsonElement> $$6 = akt.a(JsonOps.INSTANCE, $$1);

      for (Entry<akv, aun> $$7 : $$5.a($$0).entrySet()) {
         akv $$8 = $$7.getKey();
         aku<E> $$9 = aku.a($$2.g(), $$5.b($$8));
         aun $$10 = $$7.getValue();
         kd $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axg.a($$0, $$2);
   }

   static <E> void a(Map<aku<? extends ke<?>>, akq.c> $$0, aus $$1, akt.c $$2, kn<E> $$3, Decoder<E> $$4, Map<aku<?>, Exception> $$5) {
      akq.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         akt<un> $$7 = akt.a(ue.a, $$2);
         akt<JsonElement> $$8 = akt.a(JsonOps.INSTANCE, $$2);
         ako $$9 = ako.a($$3.g());

         for (ki.a $$10 : $$6.a) {
            aku<E> $$11 = aku.a($$3.g(), $$10.a());
            Optional<un> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               akv $$16 = $$9.a($$10.a());

               try {
                  aun $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axg.a($$6.b, $$3);
      }
   }

   static record a<T>(akq.d<T> a, kn<T> b, Map<aku<?>, Exception> c) {

      public void a(aup $$0, akt.c $$1) {
         akq.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<aku<? extends ke<?>>, akq.c> $$0, aus $$1, akt.c $$2) {
         akq.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akq.a<?> var1, akt.c var2);
   }

   public static record c(List<ki.a> a, axh.a b) {
   }

   public static record d<T>(aku<? extends ke<T>> a, Codec<T> b, boolean c) {

      d(aku<? extends ke<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akq.a<T> a(Lifecycle $$0, Map<aku<?>, Exception> $$1) {
         kn<T> $$2 = new jz<>(this.a, $$0);
         return new akq.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<aku<? extends ke<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

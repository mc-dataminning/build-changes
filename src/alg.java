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

public class alg {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alk<?>> e = Comparator.<alk<?>, all>comparing(alk::b).thenComparing(alk::a);
   private static final kc f = new kc(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auk>, kc> g = ae.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auk::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kc($$0, $$1);
   });
   public static final List<alg.d<?>> a = List.of(
      new alg.d<>(ma.aL, dzj.h),
      new alg.d<>(ma.aG, dgh.a),
      new alg.d<>(ma.aH, xh.a),
      new alg.d<>(ma.aI, edn.a),
      new alg.d<>(ma.aJ, eeb.a),
      new alg.d<>(ma.aR, elf.a),
      new alg.d<>(ma.aS, emb.a),
      new alg.d<>(ma.aU, emh.a),
      new alg.d<>(ma.aT, eqc.c),
      new alg.d<>(ma.aV, enl.a),
      new alg.d<>(ma.aP, ebo.a),
      new alg.d<>(ma.aQ, eqr.a.a),
      new alg.d<>(ma.aK, ebc.b),
      new alg.d<>(ma.aZ, elq.a),
      new alg.d<>(ma.aO, ekc.a),
      new alg.d<>(ma.aY, ddw.a),
      new alg.d<>(ma.aX, ddu.a),
      new alg.d<>(ma.aF, dur.b),
      new alg.d<>(ma.m, chz.a, true),
      new alg.d<>(ma.X, ckv.a, true),
      new alg.d<>(ma.s, bta.a),
      new alg.d<>(ma.ba, dgv.a),
      new alg.d<>(ma.d, dsh.a),
      new alg.d<>(ma.aM, dbw.b),
      new alg.d<>(ma.aN, dde.a),
      new alg.d<>(ma.L, cwl.a),
      new alg.d<>(ma.I, cvy.a)
   );
   public static final List<alg.d<?>> b = List.of(new alg.d<>(ma.bc, dzk.a));
   public static final List<alg.d<?>> c = List.of(
      new alg.d<>(ma.aG, dgh.b),
      new alg.d<>(ma.aH, xh.a),
      new alg.d<>(ma.aY, ddw.a),
      new alg.d<>(ma.aX, ddu.a),
      new alg.d<>(ma.m, chz.a, true),
      new alg.d<>(ma.X, ckv.a, true),
      new alg.d<>(ma.aL, dzj.h),
      new alg.d<>(ma.s, bta.a),
      new alg.d<>(ma.d, dsh.a),
      new alg.d<>(ma.aM, dbw.b),
      new alg.d<>(ma.L, cwl.a),
      new alg.d<>(ma.I, cvy.a)
   );

   public static ke.b a(ave $$0, List<js.b<?>> $$1, List<alg.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ke.b a(Map<alk<? extends kd<?>>, alg.c> $$0, avh $$1, List<js.b<?>> $$2, List<alg.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ke.b a(alg.b $$0, List<js.b<?>> $$1, List<alg.d<?>> $$2) {
      Map<alk<?>, Exception> $$3 = new HashMap<>();
      List<alg.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alj.c $$5 = a($$1, $$4);
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
         return new ke.c($$4.stream().map(alg.a::b).toList()).e();
      }
   }

   private static alj.c a(List<js.b<?>> $$0, List<alg.a<?>> $$1) {
      final Map<alk<? extends kd<?>>, alj.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alj.c() {
         @Override
         public <T> Optional<alj.b<T>> a(alk<? extends kd<? extends T>> $$0) {
            return Optional.ofNullable((alj.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alj.b<T> a(km<T> $$0) {
      return new alj.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alj.b<T> a(js.b<T> $$0) {
      return new alj.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<alk<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alk<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<all, Map<all, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alk)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alk)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alk<?>, Exception> $$0) {
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
                        .append(((alk)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alk)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(km<E> $$0, Decoder<E> $$1, alj<JsonElement> $$2, alk<E> $$3, avc $$4, kc $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(ave $$0, alj.c $$1, km<E> $$2, Decoder<E> $$3, Map<alk<?>, Exception> $$4) {
      String $$5 = ma.c($$2.g());
      ale $$6 = ale.a($$5);
      alj<JsonElement> $$7 = alj.a(JsonOps.INSTANCE, $$1);

      for (Entry<all, avc> $$8 : $$6.a($$0).entrySet()) {
         all $$9 = $$8.getKey();
         alk<E> $$10 = alk.a($$2.g(), $$6.b($$9));
         avc $$11 = $$8.getValue();
         kc $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      axu.a($$0, $$2);
   }

   static <E> void a(Map<alk<? extends kd<?>>, alg.c> $$0, avh $$1, alj.c $$2, km<E> $$3, Decoder<E> $$4, Map<alk<?>, Exception> $$5) {
      alg.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alj<vk> $$7 = alj.a(vb.a, $$2);
         alj<JsonElement> $$8 = alj.a(JsonOps.INSTANCE, $$2);
         String $$9 = ma.c($$3.g());
         ale $$10 = ale.a($$9);

         for (kh.a $$11 : $$6.a) {
            alk<E> $$12 = alk.a($$3.g(), $$11.a());
            Optional<vk> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               all $$17 = $$10.a($$11.a());

               try {
                  avc $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         axu.a($$6.b, $$3);
      }
   }

   static record a<T>(alg.d<T> a, km<T> b, Map<alk<?>, Exception> c) {

      public void a(ave $$0, alj.c $$1) {
         alg.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alk<? extends kd<?>>, alg.c> $$0, avh $$1, alj.c $$2) {
         alg.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alg.a<?> var1, alj.c var2);
   }

   public static record c(List<kh.a> a, axv.a b) {
   }

   public static record d<T>(alk<? extends kd<T>> a, Codec<T> b, boolean c) {

      d(alk<? extends kd<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alg.a<T> a(Lifecycle $$0, Map<alk<?>, Exception> $$1) {
         km<T> $$2 = new jy<>(this.a, $$0);
         return new alg.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alk<? extends kd<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

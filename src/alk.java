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

public class alk {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<alo<?>> e = Comparator.<alo<?>, alp>comparing(alo::b).thenComparing(alo::a);
   private static final kc f = new kc(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<aur>, kc> g = ae.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(aur::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new kc($$0, $$1);
   });
   public static final List<alk.d<?>> a = List.of(
      new alk.d<>(mb.aN, ebj.h),
      new alk.d<>(mb.aI, dib.a),
      new alk.d<>(mb.aJ, xg.a),
      new alk.d<>(mb.aK, efn.a),
      new alk.d<>(mb.aL, egb.a),
      new alk.d<>(mb.aT, enh.a),
      new alk.d<>(mb.aU, eod.a),
      new alk.d<>(mb.aW, eoj.a),
      new alk.d<>(mb.aV, ese.c),
      new alk.d<>(mb.aX, epn.a),
      new alk.d<>(mb.aR, edo.a),
      new alk.d<>(mb.aS, est.a.a),
      new alk.d<>(mb.aM, edc.b),
      new alk.d<>(mb.bb, ens.a),
      new alk.d<>(mb.aQ, eme.a),
      new alk.d<>(mb.ba, dfq.a),
      new alk.d<>(mb.aZ, dfo.a),
      new alk.d<>(mb.bd, dwr.b),
      new alk.d<>(mb.m, cis.a, true),
      new alk.d<>(mb.X, clo.a, true),
      new alk.d<>(mb.s, btt.a),
      new alk.d<>(mb.bc, dip.a),
      new alk.d<>(mb.d, dug.a),
      new alk.d<>(mb.aO, ddq.b),
      new alk.d<>(mb.aP, dey.a),
      new alk.d<>(mb.L, cxm.a),
      new alk.d<>(mb.I, cwz.a)
   );
   public static final List<alk.d<?>> b = List.of(new alk.d<>(mb.bf, ebk.a));
   public static final List<alk.d<?>> c = List.of(
      new alk.d<>(mb.aI, dib.b),
      new alk.d<>(mb.aJ, xg.a),
      new alk.d<>(mb.ba, dfq.a),
      new alk.d<>(mb.aZ, dfo.a),
      new alk.d<>(mb.m, cis.a, true),
      new alk.d<>(mb.X, clo.a, true),
      new alk.d<>(mb.aN, ebj.h),
      new alk.d<>(mb.s, btt.a),
      new alk.d<>(mb.d, dug.a),
      new alk.d<>(mb.aO, ddq.b),
      new alk.d<>(mb.L, cxm.a),
      new alk.d<>(mb.I, cwz.a)
   );

   public static ke.b a(avl $$0, List<js.b<?>> $$1, List<alk.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static ke.b a(Map<alo<? extends kd<?>>, alk.c> $$0, avo $$1, List<js.b<?>> $$2, List<alk.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static ke.b a(alk.b $$0, List<js.b<?>> $$1, List<alk.d<?>> $$2) {
      Map<alo<?>, Exception> $$3 = new HashMap<>();
      List<alk.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      aln.c $$5 = a($$1, $$4);
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
         return new ke.c($$4.stream().map(alk.a::b).toList()).e();
      }
   }

   private static aln.c a(List<js.b<?>> $$0, List<alk.a<?>> $$1) {
      final Map<alo<? extends kd<?>>, aln.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new aln.c() {
         @Override
         public <T> Optional<aln.b<T>> a(alo<? extends kd<? extends T>> $$0) {
            return Optional.ofNullable((aln.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aln.b<T> a(km<T> $$0) {
      return new aln.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> aln.b<T> a(js.b<T> $$0) {
      return new aln.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<alo<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<alo<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<alp, Map<alp, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((alo)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((alo)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<alo<?>, Exception> $$0) {
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
                        .append(((alo)$$1xx.getKey()).b())
                        .append("/")
                        .append(((alo)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(km<E> $$0, Decoder<E> $$1, aln<JsonElement> $$2, alo<E> $$3, avj $$4, kc $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avl $$0, aln.c $$1, km<E> $$2, Decoder<E> $$3, Map<alo<?>, Exception> $$4) {
      String $$5 = mb.c($$2.g());
      ali $$6 = ali.a($$5);
      aln<JsonElement> $$7 = aln.a(JsonOps.INSTANCE, $$1);

      for (Entry<alp, avj> $$8 : $$6.a($$0).entrySet()) {
         alp $$9 = $$8.getKey();
         alo<E> $$10 = alo.a($$2.g(), $$6.b($$9));
         avj $$11 = $$8.getValue();
         kc $$12 = g.apply($$11.c());

         try {
            a($$2, $$3, $$7, $$10, $$11, $$12);
         } catch (Exception var15) {
            $$4.put($$10, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$9, $$11.b()), var15));
         }
      }

      ayb.a($$0, $$2);
   }

   static <E> void a(Map<alo<? extends kd<?>>, alk.c> $$0, avo $$1, aln.c $$2, km<E> $$3, Decoder<E> $$4, Map<alo<?>, Exception> $$5) {
      alk.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         aln<vj> $$7 = aln.a(va.a, $$2);
         aln<JsonElement> $$8 = aln.a(JsonOps.INSTANCE, $$2);
         String $$9 = mb.c($$3.g());
         ali $$10 = ali.a($$9);

         for (kh.a $$11 : $$6.a) {
            alo<E> $$12 = alo.a($$3.g(), $$11.a());
            Optional<vj> $$13 = $$11.b();
            if ($$13.isPresent()) {
               try {
                  DataResult<E> $$14 = $$4.parse($$7, $$13.get());
                  E $$15 = (E)$$14.getOrThrow();
                  $$3.a($$12, $$15, f);
               } catch (Exception var17) {
                  $$5.put($$12, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$13.get()), var17));
               }
            } else {
               alp $$17 = $$10.a($$11.a());

               try {
                  avj $$18 = $$1.getResourceOrThrow($$17);
                  a($$3, $$4, $$8, $$12, $$18, f);
               } catch (Exception var18) {
                  $$5.put($$12, new IllegalStateException("Failed to parse local data", var18));
               }
            }
         }

         ayb.a($$6.b, $$3);
      }
   }

   static record a<T>(alk.d<T> a, km<T> b, Map<alo<?>, Exception> c) {

      public void a(avl $$0, aln.c $$1) {
         alk.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<alo<? extends kd<?>>, alk.c> $$0, avo $$1, aln.c $$2) {
         alk.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alk.a<?> var1, aln.c var2);
   }

   public static record c(List<kh.a> a, ayc.a b) {
   }

   public static record d<T>(alo<? extends kd<T>> a, Codec<T> b, boolean c) {

      d(alo<? extends kd<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alk.a<T> a(Lifecycle $$0, Map<alo<?>, Exception> $$1) {
         km<T> $$2 = new jy<>(this.a, $$0);
         return new alk.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<alo<? extends kd<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

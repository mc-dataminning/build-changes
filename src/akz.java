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

public class akz {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<ald<?>> e = Comparator.<ald<?>, ale>comparing(ald::b).thenComparing(ald::a);
   private static final jq f = new jq(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<auh>, jq> g = af.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(auh::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jq($$0, $$1);
   });
   public static final List<akz.d<?>> a = List.of(
      new akz.d<>(mg.aN, edl.h),
      new akz.d<>(mg.aG, djs.a),
      new akz.d<>(mg.aI, ws.a),
      new akz.d<>(mg.aJ, ehr.a),
      new akz.d<>(mg.aK, eif.a),
      new akz.d<>(mg.aZ, epm.a),
      new akz.d<>(mg.bc, eqi.a),
      new akz.d<>(mg.bb, eqo.a),
      new akz.d<>(mg.ba, euj.c),
      new akz.d<>(mg.bd, ers.a),
      new akz.d<>(mg.aV, efs.a),
      new akz.d<>(mg.aW, euy.a.a),
      new akz.d<>(mg.aM, efg.b),
      new akz.d<>(mg.bl, epx.a),
      new akz.d<>(mg.aQ, eoj.a),
      new akz.d<>(mg.bj, dhh.a),
      new akz.d<>(mg.bi, dhf.a),
      new akz.d<>(mg.bg, dyr.b),
      new akz.d<>(mg.bk, cjv.a, true),
      new akz.d<>(mg.aY, cjg.a, true),
      new akz.d<>(mg.aR, ckn.a, true),
      new akz.d<>(mg.aH, cis.a, true),
      new akz.d<>(mg.aX, cmt.a, true),
      new akz.d<>(mg.aL, bur.a),
      new akz.d<>(mg.aU, dkg.a),
      new akz.d<>(mg.aF, dwc.a),
      new akz.d<>(mg.aP, dff.b),
      new akz.d<>(mg.aO, dgn.a),
      new akz.d<>(mg.aT, cyy.a),
      new akz.d<>(mg.aS, cyl.a),
      new akz.d<>(mg.be, tk.a),
      new akz.d<>(mg.bf, sq.b)
   );
   public static final List<akz.d<?>> b = List.of(new akz.d<>(mg.bn, edm.a));
   public static final List<akz.d<?>> c = List.of(
      new akz.d<>(mg.aG, djs.b),
      new akz.d<>(mg.aI, ws.a),
      new akz.d<>(mg.bj, dhh.a),
      new akz.d<>(mg.bi, dhf.a),
      new akz.d<>(mg.bk, cjv.b, true),
      new akz.d<>(mg.aY, cjg.b, true),
      new akz.d<>(mg.aR, ckn.b, true),
      new akz.d<>(mg.aH, cis.b, true),
      new akz.d<>(mg.aX, cmt.a, true),
      new akz.d<>(mg.aN, edl.h),
      new akz.d<>(mg.aL, bur.a),
      new akz.d<>(mg.aF, dwc.a),
      new akz.d<>(mg.aP, dff.b),
      new akz.d<>(mg.aT, cyy.a),
      new akz.d<>(mg.aS, cyl.a),
      new akz.d<>(mg.be, tk.a),
      new akz.d<>(mg.bf, sq.b)
   );

   public static js.b a(avb $$0, List<jg.b<?>> $$1, List<akz.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static js.b a(Map<ald<? extends jr<?>>, akz.c> $$0, ave $$1, List<jg.b<?>> $$2, List<akz.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static js.b a(akz.b $$0, List<jg.b<?>> $$1, List<akz.d<?>> $$2) {
      Map<ald<?>, Exception> $$3 = new HashMap<>();
      List<akz.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      alc.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jr<?> $$2x = $$1x.b();

         try {
            $$2x.n();
         } catch (Exception var4x) {
            $$3.put($$2x.g(), var4x);
         }

         if ($$1x.a.c && $$2x.d() == 0) {
            $$3.put($$2x.g(), new IllegalStateException("Registry must be non-empty: " + $$2x.g().a()));
         }
      });
      if (!$$3.isEmpty()) {
         throw a($$3);
      } else {
         return new js.c($$4.stream().map(akz.a::b).toList()).e();
      }
   }

   private static alc.c a(List<jg.b<?>> $$0, List<akz.a<?>> $$1) {
      final Map<ald<? extends jr<?>>, alc.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new alc.c() {
         @Override
         public <T> Optional<alc.b<T>> a(ald<? extends jr<? extends T>> $$0) {
            return Optional.ofNullable((alc.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> alc.b<T> a(ka<T> $$0) {
      return new alc.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> alc.b<T> a(jg.b<T> $$0) {
      return new alc.b<>($$0, $$0, $$0.h());
   }

   private static z a(Map<ald<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<ald<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ale, Map<ale, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ald)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ald)$$0x.getKey()).a(), Entry::getValue)));
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

   private static z c(Map<ald<?>, Exception> $$0) {
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
                        .append(((ald)$$1xx.getKey()).b())
                        .append("/")
                        .append(((ald)$$1xx.getKey()).a())
                        .append(": ")
                        .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new z($$1);
   }

   private static <E> void a(ka<E> $$0, Decoder<E> $$1, alc<JsonElement> $$2, ald<E> $$3, auz $$4, jq $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = JsonParser.parseReader($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(avb $$0, alc.c $$1, ka<E> $$2, Decoder<E> $$3, Map<ald<?>, Exception> $$4) {
      akx $$5 = akx.a($$2.g());
      alc<JsonElement> $$6 = alc.a(JsonOps.INSTANCE, $$1);

      for (Entry<ale, auz> $$7 : $$5.a($$0).entrySet()) {
         ale $$8 = $$7.getKey();
         ald<E> $$9 = ald.a($$2.g(), $$5.b($$8));
         auz $$10 = $$7.getValue();
         jq $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      axq.a($$0, $$2);
   }

   static <E> void a(Map<ald<? extends jr<?>>, akz.c> $$0, ave $$1, alc.c $$2, ka<E> $$3, Decoder<E> $$4, Map<ald<?>, Exception> $$5) {
      akz.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         alc<uu> $$7 = alc.a(ul.a, $$2);
         alc<JsonElement> $$8 = alc.a(JsonOps.INSTANCE, $$2);
         akx $$9 = akx.a($$3.g());

         for (jv.a $$10 : $$6.a) {
            ald<E> $$11 = ald.a($$3.g(), $$10.a());
            Optional<uu> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               ale $$16 = $$9.a($$10.a());

               try {
                  auz $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         axq.a($$6.b, $$3);
      }
   }

   static record a<T>(akz.d<T> a, ka<T> b, Map<ald<?>, Exception> c) {

      public void a(avb $$0, alc.c $$1) {
         akz.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<ald<? extends jr<?>>, akz.c> $$0, ave $$1, alc.c $$2) {
         akz.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(akz.a<?> var1, alc.c var2);
   }

   public static record c(List<jv.a> a, axr.a b) {
   }

   public static record d<T>(ald<? extends jr<T>> a, Codec<T> b, boolean c) {

      d(ald<? extends jr<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      akz.a<T> a(Lifecycle $$0, Map<ald<?>, Exception> $$1) {
         ka<T> $$2 = new jm<>(this.a, $$0);
         return new akz.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<ald<? extends jr<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

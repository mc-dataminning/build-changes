import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Pair;
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

public class ago {
   private static final Logger c = LogUtils.getLogger();
   public static final List<ago.b<?>> a = List.of(
      new ago.b<>(kc.ax, dly.h),
      new ago.b<>(kc.as, ctx.a),
      new ago.b<>(kc.at, ux.a),
      new ago.b<>(kc.au, dqb.a),
      new ago.b<>(kc.av, dqp.a),
      new ago.b<>(kc.aB, dxs.a),
      new ago.b<>(kc.aC, dyo.a),
      new ago.b<>(kc.aE, dyu.a),
      new ago.b<>(kc.aD, ecn.c),
      new ago.b<>(kc.aF, dzx.a),
      new ago.b<>(kc.az, dod.a),
      new ago.b<>(kc.aA, edc.a.a),
      new ago.b<>(kc.aw, dnr.b),
      new ago.b<>(kc.aJ, dyd.a),
      new ago.b<>(kc.ay, dwp.a),
      new ago.b<>(kc.aI, com.a),
      new ago.b<>(kc.aH, cok.a),
      new ago.b<>(kc.r, bkf.a),
      new ago.b<>(kc.aK, cul.a)
   );
   public static final List<ago.b<?>> b = List.of(new ago.b<>(kc.aM, dlz.a));

   public static is.b a(aps $$0, is $$1, List<ago.b<?>> $$2) {
      Map<ags<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ja<?>, ago.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      agr.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((ago.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         ir<?> $$2x = (ir<?>)$$1x.getFirst();

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
         return new is.c($$4.stream().map(Pair::getFirst).toList()).d();
      }
   }

   private static agr.b a(is $$0, List<Pair<ja<?>, ago.a>> $$1) {
      final Map<ags<? extends ir<?>>, agr.a<?>> $$2 = new HashMap<>();
      $$0.c().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ja)$$1x.getFirst()).c(), a((ja)$$1x.getFirst())));
      return new agr.b() {
         @Override
         public <T> Optional<agr.a<T>> a(ags<? extends ir<? extends T>> $$0) {
            return Optional.ofNullable((agr.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> agr.a<T> a(ja<T> $$0) {
      return new agr.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> agr.a<T> a(ir<T> $$0) {
      return new agr.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<ags<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<agt, Map<agt, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((ags)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((ags)$$0x.getKey()).a(), Entry::getValue)));
      $$3.entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1x -> {
         $$2.printf("> Errors in registry %s:%n", $$1x.getKey());
         ((Map)$$1x.getValue()).entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1xx -> {
            $$2.printf(">> Errors in element %s:%n", $$1xx.getKey());
            ((Exception)$$1xx.getValue()).printStackTrace($$2);
         });
      });
      $$2.flush();
      c.error("Registry loading errors:\n{}", $$1);
   }

   private static String a(agt $$0) {
      return $$0.a();
   }

   static <E> void a(agr.b $$0, aps $$1, ags<? extends ir<E>> $$2, ja<E> $$3, Decoder<E> $$4, Map<ags<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      agm $$7 = agm.a($$6);
      agr<JsonElement> $$8 = agr.a(JsonOps.INSTANCE, $$0);

      for (Entry<agt, apq> $$9 : $$7.a($$1).entrySet()) {
         agt $$10 = $$9.getKey();
         ags<E> $$11 = ags.a($$2, $$7.b($$10));
         apq $$12 = $$9.getValue();

         try (Reader $$13 = $$12.e()) {
            JsonElement $$14 = JsonParser.parseReader($$13);
            DataResult<E> $$15 = $$4.parse($$8, $$14);
            E $$16 = (E)$$15.getOrThrow(false, $$0x -> {
            });
            $$3.a($$11, $$16, $$12.c() ? Lifecycle.stable() : $$15.lifecycle());
         } catch (Exception var20) {
            $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$10, $$12.b()), var20));
         }
      }
   }

   interface a {
      void load(aps var1, agr.b var2);
   }

   public static record b<T>(ags<? extends ir<T>> a, Codec<T> b) {
      Pair<ja<?>, ago.a> a(Lifecycle $$0, Map<ags<?>, Exception> $$1) {
         ja<T> $$2 = new in<>(this.a, $$0);
         ago.a $$3 = ($$2x, $$3x) -> ago.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }

      public void a(BiConsumer<ags<? extends ir<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}

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
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class agh {
   private static final Logger c = LogUtils.getLogger();
   public static final List<agh.b<?>> a = List.of(
      new agh.b<>(kd.aw, dkw.h),
      new agh.b<>(kd.ar, ctd.a),
      new agh.b<>(kd.as, ur.a),
      new agh.b<>(kd.at, doz.a),
      new agh.b<>(kd.au, dpn.a),
      new agh.b<>(kd.aA, dwq.a),
      new agh.b<>(kd.aB, dxm.a),
      new agh.b<>(kd.aD, dxs.a),
      new agh.b<>(kd.aC, ebl.c),
      new agh.b<>(kd.aE, dyv.a),
      new agh.b<>(kd.ay, dnb.a),
      new agh.b<>(kd.az, eca.a.a),
      new agh.b<>(kd.av, dmp.b),
      new agh.b<>(kd.aH, dxb.a),
      new agh.b<>(kd.ax, dvn.a),
      new agh.b<>(kd.aG, cnt.a),
      new agh.b<>(kd.aF, cnr.a),
      new agh.b<>(kd.q, bjv.a),
      new agh.b<>(kd.aI, ctr.a)
   );
   public static final List<agh.b<?>> b = List.of(new agh.b<>(kd.aK, dkx.a));

   public static it.b a(apl $$0, it $$1, List<agh.b<?>> $$2) {
      Map<agl<?>, Exception> $$3 = new HashMap<>();
      List<Pair<jb<?>, agh.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      agk.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((agh.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         is<?> $$2x = (is<?>)$$1x.getFirst();

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
         return new it.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static agk.b a(it $$0, List<Pair<jb<?>, agh.a>> $$1) {
      final Map<agl<? extends is<?>>, agk.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((jb)$$1x.getFirst()).c(), a((jb)$$1x.getFirst())));
      return new agk.b() {
         @Override
         public <T> Optional<agk.a<T>> a(agl<? extends is<? extends T>> $$0) {
            return Optional.ofNullable((agk.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> agk.a<T> a(jb<T> $$0) {
      return new agk.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> agk.a<T> a(is<T> $$0) {
      return new agk.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<agl<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<agm, Map<agm, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((agl)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((agl)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(agm $$0) {
      return $$0.a();
   }

   static <E> void a(agk.b $$0, apl $$1, agl<? extends is<E>> $$2, jb<E> $$3, Decoder<E> $$4, Map<agl<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      agf $$7 = agf.a($$6);
      agk<JsonElement> $$8 = agk.a(JsonOps.INSTANCE, $$0);

      for (Entry<agm, apj> $$9 : $$7.a($$1).entrySet()) {
         agm $$10 = $$9.getKey();
         agl<E> $$11 = agl.a($$2, $$7.b($$10));
         apj $$12 = $$9.getValue();

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
      void load(apl var1, agk.b var2);
   }

   public static record b<T>(agl<? extends is<T>> a, Codec<T> b) {
      Pair<jb<?>, agh.a> a(Lifecycle $$0, Map<agl<?>, Exception> $$1) {
         jb<T> $$2 = new io<>(this.a, $$0);
         agh.a $$3 = ($$2x, $$3x) -> agh.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

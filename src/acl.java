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

public class acl {
   private static final Logger c = LogUtils.getLogger();
   public static final List<acl.b<?>> a = List.of(
      new acl.b<>(jc.au, dfk.h),
      new acl.b<>(jc.ap, cnk.a),
      new acl.b<>(jc.aq, ss.a),
      new acl.b<>(jc.ar, djn.a),
      new acl.b<>(jc.as, dkb.a),
      new acl.b<>(jc.ay, dre.a),
      new acl.b<>(jc.az, dsa.a),
      new acl.b<>(jc.aB, dsg.a),
      new acl.b<>(jc.aA, dvs.c),
      new acl.b<>(jc.aC, dtj.a),
      new acl.b<>(jc.aw, dhp.a),
      new acl.b<>(jc.ax, dwh.a.a),
      new acl.b<>(jc.at, dhd.b),
      new acl.b<>(jc.aF, drp.a),
      new acl.b<>(jc.av, dqb.a),
      new acl.b<>(jc.aE, cie.a),
      new acl.b<>(jc.aD, cic.a),
      new acl.b<>(jc.p, bep.a),
      new acl.b<>(jc.aG, cny.a)
   );
   public static final List<acl.b<?>> b = List.of(new acl.b<>(jc.aI, dfl.a));

   public static hs.b a(akx $$0, hs $$1, List<acl.b<?>> $$2) {
      Map<acp<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ia<?>, acl.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aco.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((acl.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         hr<?> $$2x = (hr<?>)$$1x.getFirst();

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
         return new hs.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static aco.b a(hs $$0, List<Pair<ia<?>, acl.a>> $$1) {
      final Map<acp<? extends hr<?>>, aco.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ia)$$1x.getFirst()).c(), a((ia)$$1x.getFirst())));
      return new aco.b() {
         @Override
         public <T> Optional<aco.a<T>> a(acp<? extends hr<? extends T>> $$0) {
            return Optional.ofNullable((aco.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aco.a<T> a(ia<T> $$0) {
      return new aco.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aco.a<T> a(hr<T> $$0) {
      return new aco.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<acp<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<acq, Map<acq, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((acp)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((acp)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(acq $$0) {
      return $$0.a();
   }

   static <E> void a(aco.b $$0, akx $$1, acp<? extends hr<E>> $$2, ia<E> $$3, Decoder<E> $$4, Map<acp<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      acj $$7 = acj.a($$6);
      aco<JsonElement> $$8 = aco.a(JsonOps.INSTANCE, $$0);

      for (Entry<acq, akv> $$9 : $$7.a($$1).entrySet()) {
         acq $$10 = $$9.getKey();
         acp<E> $$11 = acp.a($$2, $$7.b($$10));
         akv $$12 = $$9.getValue();

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
      void load(akx var1, aco.b var2);
   }

   public static record b<T>(acp<? extends hr<T>> a, Codec<T> b) {
      Pair<ia<?>, acl.a> a(Lifecycle $$0, Map<acp<?>, Exception> $$1) {
         ia<T> $$2 = new hm<>(this.a, $$0);
         acl.a $$3 = ($$2x, $$3x) -> acl.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

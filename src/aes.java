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

public class aes {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aes.b<?>> a = List.of(
      new aes.b<>(je.au, dis.h),
      new aes.b<>(je.ap, cqt.a),
      new aes.b<>(je.aq, ti.a),
      new aes.b<>(je.ar, dmv.a),
      new aes.b<>(je.as, dnj.a),
      new aes.b<>(je.ay, dum.a),
      new aes.b<>(je.az, dvi.a),
      new aes.b<>(je.aB, dvo.a),
      new aes.b<>(je.aA, dza.c),
      new aes.b<>(je.aC, dwr.a),
      new aes.b<>(je.aw, dkx.a),
      new aes.b<>(je.ax, dzp.a.a),
      new aes.b<>(je.at, dkl.b),
      new aes.b<>(je.aF, dux.a),
      new aes.b<>(je.av, dtj.a),
      new aes.b<>(je.aE, clk.a),
      new aes.b<>(je.aD, cli.a),
      new aes.b<>(je.p, bhq.a),
      new aes.b<>(je.aG, crh.a)
   );
   public static final List<aes.b<?>> b = List.of(new aes.b<>(je.aI, dit.a));

   public static hu.b a(anu $$0, hu $$1, List<aes.b<?>> $$2) {
      Map<aew<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ic<?>, aes.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aev.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aes.a)$$2x.getSecond()).load($$0, $$5));
      $$4.forEach($$1x -> {
         ht<?> $$2x = (ht<?>)$$1x.getFirst();

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
         return new hu.c($$4.stream().map(Pair::getFirst).toList()).c();
      }
   }

   private static aev.b a(hu $$0, List<Pair<ic<?>, aes.a>> $$1) {
      final Map<aew<? extends ht<?>>, aev.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ic)$$1x.getFirst()).c(), a((ic)$$1x.getFirst())));
      return new aev.b() {
         @Override
         public <T> Optional<aev.a<T>> a(aew<? extends ht<? extends T>> $$0) {
            return Optional.ofNullable((aev.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aev.a<T> a(ic<T> $$0) {
      return new aev.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aev.a<T> a(ht<T> $$0) {
      return new aev.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aew<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aex, Map<aex, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aew)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aew)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aex $$0) {
      return $$0.a();
   }

   static <E> void a(aev.b $$0, anu $$1, aew<? extends ht<E>> $$2, ic<E> $$3, Decoder<E> $$4, Map<aew<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aeq $$7 = aeq.a($$6);
      aev<JsonElement> $$8 = aev.a(JsonOps.INSTANCE, $$0);

      for (Entry<aex, ans> $$9 : $$7.a($$1).entrySet()) {
         aex $$10 = $$9.getKey();
         aew<E> $$11 = aew.a($$2, $$7.b($$10));
         ans $$12 = $$9.getValue();

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
      void load(anu var1, aev.b var2);
   }

   public static record b<T>(aew<? extends ht<T>> a, Codec<T> b) {
      Pair<ic<?>, aes.a> a(Lifecycle $$0, Map<aew<?>, Exception> $$1) {
         ic<T> $$2 = new ho<>(this.a, $$0);
         aes.a $$3 = ($$2x, $$3x) -> aes.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

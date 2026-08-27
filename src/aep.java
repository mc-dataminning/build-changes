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

public class aep {
   private static final Logger c = LogUtils.getLogger();
   public static final List<aep.b<?>> a = List.of(
      new aep.b<>(je.au, din.h),
      new aep.b<>(je.ap, cqo.a),
      new aep.b<>(je.aq, te.a),
      new aep.b<>(je.ar, dmq.a),
      new aep.b<>(je.as, dne.a),
      new aep.b<>(je.ay, duh.a),
      new aep.b<>(je.az, dvd.a),
      new aep.b<>(je.aB, dvj.a),
      new aep.b<>(je.aA, dyv.c),
      new aep.b<>(je.aC, dwm.a),
      new aep.b<>(je.aw, dks.a),
      new aep.b<>(je.ax, dzk.a.a),
      new aep.b<>(je.at, dkg.b),
      new aep.b<>(je.aF, dus.a),
      new aep.b<>(je.av, dte.a),
      new aep.b<>(je.aE, clf.a),
      new aep.b<>(je.aD, cld.a),
      new aep.b<>(je.p, bhl.a),
      new aep.b<>(je.aG, crc.a)
   );
   public static final List<aep.b<?>> b = List.of(new aep.b<>(je.aI, dio.a));

   public static hu.b a(anp $$0, hu $$1, List<aep.b<?>> $$2) {
      Map<aet<?>, Exception> $$3 = new HashMap<>();
      List<Pair<ic<?>, aep.a>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).toList();
      aes.b $$5 = a($$1, $$4);
      $$4.forEach($$2x -> ((aep.a)$$2x.getSecond()).load($$0, $$5));
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

   private static aes.b a(hu $$0, List<Pair<ic<?>, aep.a>> $$1) {
      final Map<aet<? extends ht<?>>, aes.a<?>> $$2 = new HashMap<>();
      $$0.b().forEach($$1x -> $$2.put($$1x.a(), a($$1x.b())));
      $$1.forEach($$1x -> $$2.put(((ic)$$1x.getFirst()).c(), a((ic)$$1x.getFirst())));
      return new aes.b() {
         @Override
         public <T> Optional<aes.a<T>> a(aet<? extends ht<? extends T>> $$0) {
            return Optional.ofNullable((aes.a<T>)$$2.get($$0));
         }
      };
   }

   private static <T> aes.a<T> a(ic<T> $$0) {
      return new aes.a<>($$0.p(), $$0.n(), $$0.d());
   }

   private static <T> aes.a<T> a(ht<T> $$0) {
      return new aes.a<>($$0.p(), $$0.u(), $$0.d());
   }

   private static void a(Map<aet<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<aeu, Map<aeu, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((aet)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((aet)$$0x.getKey()).a(), Entry::getValue)));
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

   private static String a(aeu $$0) {
      return $$0.a();
   }

   static <E> void a(aes.b $$0, anp $$1, aet<? extends ht<E>> $$2, ic<E> $$3, Decoder<E> $$4, Map<aet<?>, Exception> $$5) {
      String $$6 = a($$2.a());
      aen $$7 = aen.a($$6);
      aes<JsonElement> $$8 = aes.a(JsonOps.INSTANCE, $$0);

      for (Entry<aeu, ann> $$9 : $$7.a($$1).entrySet()) {
         aeu $$10 = $$9.getKey();
         aet<E> $$11 = aet.a($$2, $$7.b($$10));
         ann $$12 = $$9.getValue();

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
      void load(anp var1, aes.b var2);
   }

   public static record b<T>(aet<? extends ht<T>> a, Codec<T> b) {
      Pair<ic<?>, aep.a> a(Lifecycle $$0, Map<aet<?>, Exception> $$1) {
         ic<T> $$2 = new ho<>(this.a, $$0);
         aep.a $$3 = ($$2x, $$3x) -> aep.a($$3x, $$2x, this.a, $$2, this.b, $$1);
         return Pair.of($$2, $$3);
      }
   }
}

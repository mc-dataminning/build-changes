import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ecm<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final ecm<efh> a = new ecm<>(ece.a().create(), a(efh.class, eck::a), "predicates", d());
   public static final ecm<edw> b = new ecm<>(ece.b().create(), a(edw.class, eck::a), "item_modifiers", d());
   public static final ecm<ecp> c = new ecm<>(ece.c().create(), a(ecp.class), "loot_tables", e());
   private final Gson e;
   private final BiFunction<aep, JsonElement, Optional<T>> f;
   private final String g;
   private final ecm.a<T> h;

   private ecm(Gson $$0, BiFunction<Gson, String, BiFunction<aep, JsonElement, Optional<T>>> $$1, String $$2, ecm.a<T> $$3) {
      this.e = $$0;
      this.g = $$2;
      this.h = $$3;
      this.f = $$1.apply($$0, $$2);
   }

   public Gson a() {
      return this.e;
   }

   public String b() {
      return this.g;
   }

   public void a(ecs $$0, ecj<T> $$1, T $$2) {
      this.h.run($$0, $$1, $$2);
   }

   public Optional<T> a(aep $$0, JsonElement $$1) {
      return this.f.apply($$0, $$1);
   }

   public static Stream<ecm<?>> c() {
      return Stream.of(a, b, c);
   }

   private static <T> BiFunction<Gson, String, BiFunction<aep, JsonElement, Optional<T>>> a(Class<T> $$0) {
      return ($$1, $$2) -> ($$3, $$4) -> {
            try {
               return Optional.of((T)$$1.fromJson($$4, $$0));
            } catch (Exception var6) {
               d.error("Couldn't parse element {}:{}", new Object[]{$$2, $$3, var6});
               return Optional.empty();
            }
         };
   }

   private static <T> BiFunction<Gson, String, BiFunction<aep, JsonElement, Optional<T>>> a(Class<T> $$0, Function<T[], T> $$1) {
      Class<T[]> $$2 = (Class<T[]>)$$0.arrayType();
      return ($$3, $$4) -> ($$5, $$6) -> {
            try {
               if ($$6.isJsonArray()) {
                  T[] $$7 = (T[])((Object[])$$3.fromJson($$6, $$2));
                  return Optional.of($$1.apply((T)$$7));
               } else {
                  return Optional.of((T)$$3.fromJson($$6, $$0));
               }
            } catch (Exception var8) {
               d.error("Couldn't parse element {}:{}", new Object[]{$$4, $$5, var8});
               return Optional.empty();
            }
         };
   }

   private static <T extends eci> ecm.a<T> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().g + ":" + $$1.b() + "}", $$1));
   }

   private static ecm.a<ecp> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().g + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ecs var1, ecj<T> var2, T var3);
   }
}

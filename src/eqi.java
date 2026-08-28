import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqi<T>(ald<jv<T>> d, Codec<T> e, String f, eqi.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqi<etq> a = new eqi<>(lq.aW, ets.a, "predicates", f());
   public static final eqi<ert> b = new eqi<>(lq.aV, erv.c, "item_modifiers", f());
   public static final eqi<eql> c = new eqi<>(lq.aU, eql.d, "loot_tables", g());

   public void a(eqm $$0, ald<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ale $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqi<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqh> eqi.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqi.a<eql> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ald<jv<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public eqi.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eqm var1, ald<T> var2, T var3);
   }
}

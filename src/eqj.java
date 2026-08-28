import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqj<T>(ald<jv<T>> d, Codec<T> e, String f, eqj.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqj<etr> a = new eqj<>(lq.aW, ett.a, "predicates", f());
   public static final eqj<eru> b = new eqj<>(lq.aV, erw.c, "item_modifiers", f());
   public static final eqj<eqm> c = new eqj<>(lq.aU, eqm.d, "loot_tables", g());

   public void a(eqn $$0, ald<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ale $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqj<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqi> eqj.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqj.a<eqm> g() {
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

   public eqj.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eqn var1, ald<T> var2, T var3);
   }
}

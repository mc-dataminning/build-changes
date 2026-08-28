import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqk<T>(ale<jv<T>> d, Codec<T> e, String f, eqk.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqk<ets> a = new eqk<>(lq.aW, etu.a, "predicates", f());
   public static final eqk<erv> b = new eqk<>(lq.aV, erx.c, "item_modifiers", f());
   public static final eqk<eqn> c = new eqk<>(lq.aU, eqn.d, "loot_tables", g());

   public void a(eqo $$0, ale<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(alf $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqk<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqj> eqk.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqk.a<eqn> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ale<jv<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public eqk.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eqo var1, ale<T> var2, T var3);
   }
}

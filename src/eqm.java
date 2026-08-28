import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqm<T>(ale<jv<T>> d, Codec<T> e, String f, eqm.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqm<etu> a = new eqm<>(lq.aW, etw.a, "predicates", f());
   public static final eqm<erx> b = new eqm<>(lq.aV, erz.c, "item_modifiers", f());
   public static final eqm<eqp> c = new eqm<>(lq.aU, eqp.d, "loot_tables", g());

   public void a(eqq $$0, ale<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(alf $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqm<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eql> eqm.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqm.a<eqp> g() {
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

   public eqm.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eqq var1, ale<T> var2, T var3);
   }
}

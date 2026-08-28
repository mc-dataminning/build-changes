import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqf<T>(ala<jv<T>> d, Codec<T> e, String f, eqf.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqf<etn> a = new eqf<>(lq.aW, etp.a, "predicates", f());
   public static final eqf<erq> b = new eqf<>(lq.aV, ers.c, "item_modifiers", f());
   public static final eqf<eqi> c = new eqf<>(lq.aU, eqi.d, "loot_tables", g());

   public void a(eqj $$0, ala<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(alb $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqf<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqe> eqf.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqf.a<eqi> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public ala<jv<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public eqf.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eqj var1, ala<T> var2, T var3);
   }
}

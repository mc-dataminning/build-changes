import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqq<T>(akj<jw<T>> d, Codec<T> e, String f, eqq.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqq<etz> a = new eqq<>(lr.bd, etz.e, "predicates", f());
   public static final eqq<esc> b = new eqq<>(lr.bc, ese.c, "item_modifiers", f());
   public static final eqq<eqt> c = new eqq<>(lr.bb, eqt.d, "loot_tables", g());

   public void a(equ $$0, akj<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akk $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqq<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqp> eqq.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqq.a<eqt> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public akj<jw<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public eqq.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(equ var1, akj<T> var2, T var3);
   }
}

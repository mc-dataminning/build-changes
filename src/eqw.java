import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqw<T>(akj<jw<T>> d, Codec<T> e, String f, eqw.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqw<euf> a = new eqw<>(lr.bd, euf.e, "predicates", f());
   public static final eqw<esi> b = new eqw<>(lr.bc, esk.c, "item_modifiers", f());
   public static final eqw<eqz> c = new eqw<>(lr.bb, eqz.d, "loot_tables", g());

   public void a(era $$0, akj<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akk $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqw<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqv> eqw.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqw.a<eqz> g() {
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

   public eqw.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(era var1, akj<T> var2, T var3);
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record eqy<T>(akj<jw<T>> d, Codec<T> e, String f, eqy.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final eqy<euh> a = new eqy<>(lr.bd, euh.e, "predicates", f());
   public static final eqy<esk> b = new eqy<>(lr.bc, esm.c, "item_modifiers", f());
   public static final eqy<erb> c = new eqy<>(lr.bb, erb.d, "loot_tables", g());

   public void a(erc $$0, akj<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akk $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eqy<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends eqx> eqy.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static eqy.a<erb> g() {
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

   public eqy.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(erc var1, akj<T> var2, T var3);
   }
}

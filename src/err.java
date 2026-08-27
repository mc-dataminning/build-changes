import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public record err<T>(aks<jn<T>> d, Codec<T> e, String f, err.a<T> g) {
   private static final Logger h = LogUtils.getLogger();
   public static final err<euu> a = new err<>(li.aW, euw.a, "predicates", f());
   public static final err<etb> b = new err<>(li.aV, etd.c, "item_modifiers", f());
   public static final err<eru> c = new err<>(li.aU, eru.d, "loot_tables", g());

   public void a(erv $$0, aks<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akt $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> h.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<err<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends erq> err.a<T> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static err.a<eru> g() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public aks<jn<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public err.a<T> e() {
      return this.g;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(erv var1, aks<T> var2, T var3);
   }
}

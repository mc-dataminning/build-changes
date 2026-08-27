import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eng<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final eng<eqc> a = new eng<>(eqe.a, "predicates", c());
   public static final eng<eop> b = new eng<>(eor.b, "item_modifiers", c());
   public static final eng<enj> c = new eng<>(enj.d, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final eng.a<T> g;

   private eng(Codec<T> $$0, String $$1, eng.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(enk $$0, end<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ajt $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eng<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends enc> eng.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static eng.a<enj> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(enk var1, end<T> var2, T var3);
   }
}

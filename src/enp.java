import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class enp<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final enp<eql> a = new enp<>(eqn.a, "predicates", c());
   public static final enp<eoy> b = new enp<>(epa.b, "item_modifiers", c());
   public static final enp<ens> c = new enp<>(ens.d, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final enp.a<T> g;

   private enp(Codec<T> $$0, String $$1, enp.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(ent $$0, enm<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ajv $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<enp<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends enl> enp.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static enp.a<ens> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ent var1, enm<T> var2, T var3);
   }
}

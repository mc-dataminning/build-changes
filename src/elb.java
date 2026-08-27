import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class elb<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final elb<env> a = new elb<>(enx.a, "predicates", c());
   public static final elb<emj> b = new elb<>(eml.b, "item_modifiers", c());
   public static final elb<ele> c = new elb<>(ele.c, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final elb.a<T> g;

   private elb(Codec<T> $$0, String $$1, elb.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(elf $$0, eky<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ajh $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<elb<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends ekx> elb.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static elb.a<ele> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(elf var1, eky<T> var2, T var3);
   }
}

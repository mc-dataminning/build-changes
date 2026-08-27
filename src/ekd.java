import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ekd<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final ekd<emx> a = new ekd<>(emz.a, "predicates", c());
   public static final ekd<ell> b = new ekd<>(eln.b, "item_modifiers", c());
   public static final ekd<ekg> c = new ekd<>(ekg.c, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final ekd.a<T> g;

   private ekd(Codec<T> $$0, String $$1, ekd.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(ekh $$0, eka<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(ajc $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<ekd<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends ejz> ekd.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static ekd.a<ekg> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ekh var1, eka<T> var2, T var3);
   }
}

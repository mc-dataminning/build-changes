import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eof<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final eof<erh> a = new eof<>(erj.a, "predicates", c());
   public static final eof<epp> b = new eof<>(epr.b, "item_modifiers", c());
   public static final eof<eoi> c = new eof<>(eoi.d, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final eof.a<T> g;

   private eof(Codec<T> $$0, String $$1, eof.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(eoj $$0, eoc<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public <V> Optional<T> a(akf $$0, DynamicOps<V> $$1, V $$2) {
      DataResult<T> $$3 = this.e.parse($$1, $$2);
      $$3.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$3.result();
   }

   public static Stream<eof<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends eob> eof.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static eof.a<eoi> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eoj var1, eoc<T> var2, T var3);
   }
}

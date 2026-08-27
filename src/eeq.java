import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eeq<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final eeq<ehk> a = new eeq<>(ehm.a, "predicates", c());
   public static final eeq<efy> b = new eeq<>(ega.b, "item_modifiers", c());
   public static final eeq<eet> c = new eeq<>(eet.c, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final eeq.a<T> g;

   private eeq(Codec<T> $$0, String $$1, eeq.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(eeu $$0, een<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public Optional<T> a(agg $$0, JsonElement $$1) {
      DataResult<T> $$2 = this.e.parse(JsonOps.INSTANCE, $$1);
      $$2.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$2.result();
   }

   public static Stream<eeq<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends eem> eeq.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static eeq.a<eet> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(eeu var1, een<T> var2, T var3);
   }
}

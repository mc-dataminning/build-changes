import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ejh<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final ejh<emb> a = new ejh<>(emd.a, "predicates", c());
   public static final ejh<ekp> b = new ejh<>(ekr.b, "item_modifiers", c());
   public static final ejh<ejk> c = new ejh<>(ejk.c, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final ejh.a<T> g;

   private ejh(Codec<T> $$0, String $$1, ejh.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(ejl $$0, eje<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public Optional<T> a(aiy $$0, JsonElement $$1) {
      DataResult<T> $$2 = this.e.parse(JsonOps.INSTANCE, $$1);
      $$2.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$2.result();
   }

   public static Stream<ejh<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends ejd> ejh.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static ejh.a<ejk> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ejl var1, eje<T> var2, T var3);
   }
}

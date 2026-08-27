import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ecq<T> {
   private static final Logger d = LogUtils.getLogger();
   public static final ecq<efk> a = new ecq<>(efm.a, "predicates", c());
   public static final ecq<edy> b = new ecq<>(eea.b, "item_modifiers", c());
   public static final ecq<ect> c = new ecq<>(ect.c, "loot_tables", d());
   private final Codec<T> e;
   private final String f;
   private final ecq.a<T> g;

   private ecq(Codec<T> $$0, String $$1, ecq.a<T> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public String a() {
      return this.f;
   }

   public void a(ecu $$0, ecn<T> $$1, T $$2) {
      this.g.run($$0, $$1, $$2);
   }

   public Optional<T> a(aeu $$0, JsonElement $$1) {
      DataResult<T> $$2 = this.e.parse(JsonOps.INSTANCE, $$1);
      $$2.error().ifPresent($$1x -> d.error("Couldn't parse element {}:{} - {}", new Object[]{this.f, $$0, $$1x.message()}));
      return $$2.result();
   }

   public static Stream<ecq<?>> b() {
      return Stream.of(a, b, c);
   }

   private static <T extends ecm> ecq.a<T> c() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   private static ecq.a<ect> d() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.a().f + ":" + $$1.b() + "}", $$1));
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ecu var1, ecn<T> var2, T var3);
   }
}

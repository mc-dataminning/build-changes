import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ass implements atb {
   private static final Logger c = LogUtils.getLogger();
   private final ata d;

   protected ass(ata $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public <T> T a(ato<T> $$0) throws IOException {
      aug<InputStream> $$1 = this.a(new String[]{"pack.mcmeta"});
      if ($$1 == null) {
         return null;
      } else {
         Object var4;
         try (InputStream $$2 = $$1.get()) {
            var4 = a($$0, $$2);
         }

         return (T)var4;
      }
   }

   @Nullable
   public static <T> T a(ato<T> $$0, InputStream $$1) {
      JsonObject $$3;
      try (BufferedReader $$2 = new BufferedReader(new InputStreamReader($$1, StandardCharsets.UTF_8))) {
         $$3 = ayo.a($$2);
      } catch (Exception var8) {
         c.error("Couldn't load {} metadata", $$0.a(), var8);
         return null;
      }

      return (T)(!$$3.has($$0.a())
         ? null
         : $$0.b().parse(JsonOps.INSTANCE, $$3.get($$0.a())).ifError($$1x -> c.error("Couldn't load {} metadata: {}", $$0.a(), $$1x)).result().orElse(null));
   }

   @Override
   public ata a() {
      return this.d;
   }
}

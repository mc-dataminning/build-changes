import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class asy implements ath {
   private static final Logger c = LogUtils.getLogger();
   private final atg d;

   protected asy(atg $$0) {
      this.d = $$0;
   }

   @Nullable
   @Override
   public <T> T a(atu<T> $$0) throws IOException {
      aun<InputStream> $$1 = this.a(new String[]{"pack.mcmeta"});
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
   public static <T> T a(atu<T> $$0, InputStream $$1) {
      JsonObject $$3;
      try (BufferedReader $$2 = new BufferedReader(new InputStreamReader($$1, StandardCharsets.UTF_8))) {
         $$3 = ayv.a($$2);
      } catch (Exception var9) {
         c.error("Couldn't load {} metadata", $$0.a(), var9);
         return null;
      }

      if (!$$3.has($$0.a())) {
         return null;
      } else {
         try {
            return $$0.a(ayv.u($$3, $$0.a()));
         } catch (Exception var7) {
            c.error("Couldn't load {} metadata", $$0.a(), var7);
            return null;
         }
      }
   }

   @Override
   public atg a() {
      return this.d;
   }
}

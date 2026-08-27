import com.mojang.logging.LogUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;
import org.slf4j.Logger;

public class aks {
   private static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final boolean c;

   public aks(Path $$0) {
      this.b = $$0;
      this.c = aa.aX || this.b();
   }

   private boolean b() {
      try {
         boolean var3;
         try (InputStream $$0 = Files.newInputStream(this.b)) {
            Properties $$1 = new Properties();
            $$1.load($$0);
            var3 = Boolean.parseBoolean($$1.getProperty("eula", "false"));
         }

         return var3;
      } catch (Exception var6) {
         a.warn("Failed to load {}", this.b);
         this.c();
         return false;
      }
   }

   public boolean a() {
      return this.c;
   }

   private void c() {
      if (!aa.aX) {
         try (OutputStream $$0 = Files.newOutputStream(this.b)) {
            Properties $$1 = new Properties();
            $$1.setProperty("eula", "false");
            $$1.store($$0, "By changing the setting below to TRUE you are indicating your agreement to our EULA (https://aka.ms/MinecraftEULA).");
         } catch (Exception var6) {
            a.warn("Failed to save {}", this.b, var6);
         }
      }
   }
}

import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fev {
   private static final String a = "realms_persistence.json";
   private static final fca b = new fca();
   private static final Logger c = LogUtils.getLogger();

   public fev.a a() {
      return b();
   }

   public void a(fev.a $$0) {
      b($$0);
   }

   public static fev.a b() {
      Path $$0 = c();

      try {
         String $$1 = Files.readString($$0, StandardCharsets.UTF_8);
         fev.a $$2 = b.a($$1, fev.a.class);
         if ($$2 != null) {
            return $$2;
         }
      } catch (NoSuchFileException var3) {
      } catch (Exception var4) {
         c.warn("Failed to read Realms storage {}", $$0, var4);
      }

      return new fev.a();
   }

   public static void b(fev.a $$0) {
      Path $$1 = c();

      try {
         Files.writeString($$1, b.a($$0), StandardCharsets.UTF_8);
      } catch (Exception var3) {
      }
   }

   private static Path c() {
      return fgi.Q().p.toPath().resolve("realms_persistence.json");
   }

   public static class a implements fcq {
      @SerializedName("newsLink")
      public String a;
      @SerializedName("hasUnreadNews")
      public boolean b;
   }
}

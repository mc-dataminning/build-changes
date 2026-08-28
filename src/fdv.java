import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fdv {
   private static final String a = "realms_persistence.json";
   private static final fay b = new fay();
   private static final Logger c = LogUtils.getLogger();

   public fdv.a a() {
      return b();
   }

   public void a(fdv.a $$0) {
      b($$0);
   }

   public static fdv.a b() {
      Path $$0 = c();

      try {
         String $$1 = Files.readString($$0, StandardCharsets.UTF_8);
         fdv.a $$2 = b.a($$1, fdv.a.class);
         if ($$2 != null) {
            return $$2;
         }
      } catch (NoSuchFileException var3) {
      } catch (Exception var4) {
         c.warn("Failed to read Realms storage {}", $$0, var4);
      }

      return new fdv.a();
   }

   public static void b(fdv.a $$0) {
      Path $$1 = c();

      try {
         Files.writeString($$1, b.a($$0), StandardCharsets.UTF_8);
      } catch (Exception var3) {
      }
   }

   private static Path c() {
      return ffh.Q().p.toPath().resolve("realms_persistence.json");
   }

   public static class a implements fbq {
      @SerializedName("newsLink")
      public String a;
      @SerializedName("hasUnreadNews")
      public boolean b;
   }
}

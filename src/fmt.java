import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.slf4j.Logger;

public class fmt {
   private static final String a = "realms_persistence.json";
   private static final fjy b = new fjy();
   private static final Logger c = LogUtils.getLogger();

   public fmt.a a() {
      return b();
   }

   public void a(fmt.a $$0) {
      b($$0);
   }

   public static fmt.a b() {
      Path $$0 = c();

      try {
         String $$1 = Files.readString($$0, StandardCharsets.UTF_8);
         fmt.a $$2 = b.a($$1, fmt.a.class);
         if ($$2 != null) {
            return $$2;
         }
      } catch (NoSuchFileException var3) {
      } catch (Exception var4) {
         c.warn("Failed to read Realms storage {}", $$0, var4);
      }

      return new fmt.a();
   }

   public static void b(fmt.a $$0) {
      Path $$1 = c();

      try {
         Files.writeString($$1, b.a($$0), StandardCharsets.UTF_8);
      } catch (Exception var3) {
      }
   }

   private static Path c() {
      return fof.Q().q.toPath().resolve("realms_persistence.json");
   }

   public static class a implements fkp {
      @SerializedName("newsLink")
      public String a;
      @SerializedName("hasUnreadNews")
      public boolean b;
   }
}

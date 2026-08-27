import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import org.slf4j.Logger;

public class esy {
   private static final String a = "realms_persistence.json";
   private static final eqb b = new eqb();
   private static final Logger c = LogUtils.getLogger();

   public esy.a a() {
      return b();
   }

   public void a(esy.a $$0) {
      b($$0);
   }

   public static esy.a b() {
      Path $$0 = c();

      try {
         String $$1 = Files.readString($$0, StandardCharsets.UTF_8);
         esy.a $$2 = b.a($$1, esy.a.class);
         if ($$2 != null) {
            return $$2;
         }
      } catch (NoSuchFileException var3) {
      } catch (Exception var4) {
         c.warn("Failed to read Realms storage {}", $$0, var4);
      }

      return new esy.a();
   }

   public static void b(esy.a $$0) {
      Path $$1 = c();

      try {
         Files.writeString($$1, b.a($$0), StandardCharsets.UTF_8);
      } catch (Exception var3) {
      }
   }

   private static Path c() {
      return euk.N().p.toPath().resolve("realms_persistence.json");
   }

   public static class a implements eqt {
      @SerializedName("newsLink")
      public String a;
      @SerializedName("hasUnreadNews")
      public boolean b;
   }
}

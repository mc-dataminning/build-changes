import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Objects;
import javax.annotation.Nullable;

public class fcp {
   private static final String a = "translationKey";
   private static final String b = "args";
   private final String c;
   @Nullable
   private final String[] d;

   private fcp(String $$0, @Nullable String[] $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public xe a(xe $$0) {
      return Objects.requireNonNullElse(this.a(), $$0);
   }

   @Nullable
   public xe a() {
      if (!gse.a(this.c)) {
         return null;
      } else {
         return this.d == null ? xe.c(this.c) : xe.a(this.c, this.d);
      }
   }

   public static fcp a(JsonObject $$0) {
      String $$1 = fev.a("translationKey", $$0);
      JsonElement $$2 = $$0.get("args");
      String[] $$5;
      if ($$2 != null && !$$2.isJsonNull()) {
         JsonArray $$4 = $$2.getAsJsonArray();
         $$5 = new String[$$4.size()];

         for (int $$6 = 0; $$6 < $$4.size(); $$6++) {
            $$5[$$6] = $$4.get($$6).getAsString();
         }
      } else {
         $$5 = null;
      }

      return new fcp($$1, $$5);
   }

   @Override
   public String toString() {
      return this.c;
   }
}

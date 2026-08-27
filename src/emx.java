import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class emx {
   private static final String a = "translationKey";
   private static final String b = "args";
   private final String c;
   @Nullable
   private final Object[] d;

   private emx(String $$0, @Nullable Object[] $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public ti a(ti $$0) {
      if (!gaf.a(this.c)) {
         return $$0;
      } else {
         return this.d == null ? ti.c(this.c) : ti.a(this.c, this.d);
      }
   }

   public static emx a(JsonObject $$0) {
      String $$1 = epd.a("translationKey", $$0);
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

      return new emx($$1, $$5);
   }
}

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;

public class fax {
   private final Gson a = new Gson();

   public String a(fbp $$0) {
      return this.a.toJson($$0);
   }

   public String a(JsonElement $$0) {
      return this.a.toJson($$0);
   }

   @Nullable
   public <T extends fbp> T a(String $$0, Class<T> $$1) {
      return (T)this.a.fromJson($$0, $$1);
   }
}

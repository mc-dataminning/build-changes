import com.google.gson.Gson;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;

public class eux {
   private final Gson a = new Gson();

   public String a(evp $$0) {
      return this.a.toJson($$0);
   }

   public String a(JsonElement $$0) {
      return this.a.toJson($$0);
   }

   @Nullable
   public <T extends evp> T a(String $$0, Class<T> $$1) {
      return (T)this.a.fromJson($$0, $$1);
   }
}

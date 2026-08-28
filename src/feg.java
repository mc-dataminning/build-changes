import com.google.gson.Gson;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;

public class feg {
   private final Gson a = new Gson();

   public String a(few $$0) {
      return this.a.toJson($$0);
   }

   public String a(JsonElement $$0) {
      return this.a.toJson($$0);
   }

   @Nullable
   public <T extends few> T a(String $$0, Class<T> $$1) {
      return (T)this.a.fromJson($$0, $$1);
   }
}

import com.google.gson.JsonObject;
import java.util.Date;
import javax.annotation.Nullable;

public class aup extends aum<String> {
   public aup(String $$0) {
      this($$0, null, null, null, null);
   }

   public aup(String $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public wz e() {
      return wz.b(String.valueOf(this.g()));
   }

   public aup(JsonObject $$0) {
      super(b($$0), $$0);
   }

   private static String b(JsonObject $$0) {
      return $$0.has("ip") ? $$0.get("ip").getAsString() : null;
   }

   @Override
   protected void a(JsonObject $$0) {
      if (this.g() != null) {
         $$0.addProperty("ip", this.g());
         super.a($$0);
      }
   }
}

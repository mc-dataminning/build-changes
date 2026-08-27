import com.google.gson.JsonObject;
import javax.annotation.Nullable;

public class cx implements bp {
   private final cj.d b;

   private cx(cj.d $$0) {
      this.b = $$0;
   }

   public static cx a(cj.d $$0) {
      return new cx($$0);
   }

   public static cx a(JsonObject $$0) {
      cj.d $$1 = cj.d.a($$0.get("size"));
      return new cx($$1);
   }

   @Override
   public JsonObject a() {
      JsonObject $$0 = new JsonObject();
      $$0.add("size", this.b.d());
      return $$0;
   }

   @Override
   public boolean a(bfj $$0, aif $$1, @Nullable eei $$2) {
      return $$0 instanceof bwl $$3 ? this.b.d($$3.ga()) : false;
   }

   @Override
   public bp.a c() {
      return bp.b.e;
   }
}

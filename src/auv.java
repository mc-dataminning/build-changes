import com.google.gson.JsonObject;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class auv {
   private static final String a = a("");

   public static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1) {
      String $$2 = a($$1);
      return new Dynamic($$0, $$0.createString($$2));
   }

   public static <T> Dynamic<T> a(DynamicOps<T> $$0) {
      return new Dynamic($$0, $$0.createString(a));
   }

   private static String a(String $$0) {
      JsonObject $$1 = new JsonObject();
      $$1.addProperty("text", $$0);
      return atg.e($$1);
   }

   public static <T> Dynamic<T> b(DynamicOps<T> $$0, String $$1) {
      JsonObject $$2 = new JsonObject();
      $$2.addProperty("translate", $$1);
      return new Dynamic($$0, $$0.createString(atg.e($$2)));
   }

   public static <T> Dynamic<T> a(Dynamic<T> $$0) {
      return (Dynamic<T>)DataFixUtils.orElse($$0.asString().map($$1 -> a($$0.getOps(), $$1)).result(), $$0);
   }
}

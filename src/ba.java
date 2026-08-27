import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ba {
   public static final ba a = new ba(new eck[0]);
   private final eck[] b;
   private final Predicate<dzk> c;

   ba(eck[] $$0) {
      this.b = $$0;
      this.c = ecm.a($$0);
   }

   public static ba a(eck... $$0) {
      return new ba($$0);
   }

   @Nullable
   public static ba a(String $$0, be $$1, @Nullable JsonElement $$2, ebu $$3) {
      if ($$2 != null && $$2.isJsonArray()) {
         eck[] $$4 = $$1.a($$2.getAsJsonArray(), $$1.a() + "/" + $$0, $$3);
         return new ba($$4);
      } else {
         return null;
      }
   }

   public boolean a(dzk $$0) {
      return this.c.test($$0);
   }

   public JsonElement a(ct $$0) {
      return (JsonElement)(this.b.length == 0 ? JsonNull.INSTANCE : $$0.a(this.b));
   }

   public static JsonElement a(ba[] $$0, ct $$1) {
      if ($$0.length == 0) {
         return JsonNull.INSTANCE;
      } else {
         JsonArray $$2 = new JsonArray();

         for (ba $$3 : $$0) {
            $$2.add($$3.a($$1));
         }

         return $$2;
      }
   }
}

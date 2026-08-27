import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import javax.annotation.Nullable;

public class bj {
   public static final bj a = new bj();
   public static final bj[] b = new bj[0];
   @Nullable
   private final cnd c;
   private final cj.d d;

   public bj() {
      this.c = null;
      this.d = cj.d.e;
   }

   public bj(@Nullable cnd $$0, cj.d $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public boolean a(Map<cnd, Integer> $$0) {
      if (this.c != null) {
         if (!$$0.containsKey(this.c)) {
            return false;
         }

         int $$1 = $$0.get(this.c);
         if (this.d != cj.d.e && !this.d.d($$1)) {
            return false;
         }
      } else if (this.d != cj.d.e) {
         for (Integer $$2 : $$0.values()) {
            if (this.d.d($$2)) {
               return true;
            }
         }

         return false;
      }

      return true;
   }

   public JsonElement a() {
      if (this == a) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject $$0 = new JsonObject();
         if (this.c != null) {
            $$0.addProperty("enchantment", jc.g.b(this.c).toString());
         }

         $$0.add("levels", this.d.d());
         return $$0;
      }
   }

   public static bj a(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonObject $$1 = arf.m($$0, "enchantment");
         cnd $$2 = null;
         if ($$1.has("enchantment")) {
            aep $$3 = new aep(arf.i($$1, "enchantment"));
            $$2 = jc.g.b($$3).orElseThrow(() -> new JsonSyntaxException("Unknown enchantment '" + $$3 + "'"));
         }

         cj.d $$4 = cj.d.a($$1.get("levels"));
         return new bj($$2, $$4);
      } else {
         return a;
      }
   }

   public static bj[] b(@Nullable JsonElement $$0) {
      if ($$0 != null && !$$0.isJsonNull()) {
         JsonArray $$1 = arf.n($$0, "enchantments");
         bj[] $$2 = new bj[$$1.size()];

         for (int $$3 = 0; $$3 < $$2.length; $$3++) {
            $$2[$$3] = a($$1.get($$3));
         }

         return $$2;
      } else {
         return b;
      }
   }
}

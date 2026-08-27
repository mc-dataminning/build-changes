import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class aj {
   @Nullable
   private final am a;

   public aj(am $$0) {
      this.a = $$0;
   }

   public aj() {
      this.a = null;
   }

   public void a(sh $$0) {
   }

   public static aj a(JsonObject $$0, be $$1) {
      aep $$2 = new aep(arf.i($$0, "trigger"));
      al<?> $$3 = ai.a($$2);
      if ($$3 == null) {
         throw new JsonSyntaxException("Invalid criterion trigger: " + $$2);
      } else {
         am $$4 = $$3.a(arf.a($$0, "conditions", new JsonObject()), $$1);
         return new aj($$4);
      }
   }

   public static aj b(sh $$0) {
      return new aj();
   }

   public static Map<String, aj> b(JsonObject $$0, be $$1) {
      Map<String, aj> $$2 = Maps.newHashMap();

      for (Entry<String, JsonElement> $$3 : $$0.entrySet()) {
         $$2.put($$3.getKey(), a(arf.m($$3.getValue(), "criterion"), $$1));
      }

      return $$2;
   }

   public static Map<String, aj> c(sh $$0) {
      return $$0.a(sh::r, aj::b);
   }

   public static void a(Map<String, aj> $$0, sh $$1) {
      $$1.a($$0, sh::a, ($$0x, $$1x) -> $$1x.a($$0x));
   }

   @Nullable
   public am a() {
      return this.a;
   }

   public JsonElement b() {
      if (this.a == null) {
         throw new JsonSyntaxException("Missing trigger");
      } else {
         JsonObject $$0 = new JsonObject();
         $$0.addProperty("trigger", this.a.a().toString());
         JsonObject $$1 = this.a.a(ct.a);
         if ($$1.size() != 0) {
            $$0.add("conditions", $$1);
         }

         return $$0;
      }
   }
}

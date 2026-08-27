import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class eel extends edv {
   final ckt a;

   eel(efh[] $$0, ckt $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public edx b() {
      return edy.y;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      ckv.a($$0, this.a);
      return $$0;
   }

   public static edv.a<?> a(ckt $$0) {
      return a($$1 -> new eel($$1, $$0));
   }

   public static class a extends edv.c<eel> {
      public void a(JsonObject $$0, eel $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("id", jc.j.b($$1.a).toString());
      }

      public eel a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         String $$3 = arf.i($$0, "id");
         ckt $$4 = jc.j.b(aep.a($$3)).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$3 + "'"));
         return new eel($$2, $$4);
      }
   }
}

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class eef extends edv {
   final apy<cio> a;

   eef(efh[] $$0, apy<cio> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public edx b() {
      return edy.z;
   }

   @Override
   public ciw a(ciw $$0, ech $$1) {
      cip.a($$0, this.a, $$1.b());
      return $$0;
   }

   public static edv.a<?> a(apy<cio> $$0) {
      return a($$1 -> new eef($$1, $$0));
   }

   public static class a extends edv.c<eef> {
      public void a(JsonObject $$0, eef $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("options", "#" + $$1.a.b());
      }

      public eef a(JsonObject $$0, JsonDeserializationContext $$1, efh[] $$2) {
         String $$3 = arf.i($$0, "options");
         if (!$$3.startsWith("#")) {
            throw new JsonSyntaxException("Inline tag value not supported: " + $$3);
         } else {
            return new eef($$2, apy.a(jd.B, new aep($$3.substring(1))));
         }
      }
   }
}

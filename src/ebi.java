import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class ebi extends eay {
   final anl<cfr> a;

   ebi(eck[] $$0, anl<cfr> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public eba b() {
      return ebb.z;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      cfs.a($$0, this.a, $$1.b());
      return $$0;
   }

   public static eay.a<?> a(anl<cfr> $$0) {
      return a($$1 -> new ebi($$1, $$0));
   }

   public static class a extends eay.c<ebi> {
      public void a(JsonObject $$0, ebi $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("options", "#" + $$1.a.b());
      }

      public ebi a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         String $$3 = aor.i($$0, "options");
         if (!$$3.startsWith("#")) {
            throw new JsonSyntaxException("Inline tag value not supported: " + $$3);
         } else {
            return new ebi($$2, anl.a(jc.B, new acq($$3.substring(1))));
         }
      }
   }
}

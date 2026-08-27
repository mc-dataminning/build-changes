import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;

public class ebo extends eay {
   final chw a;

   ebo(eck[] $$0, chw $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public eba b() {
      return ebb.y;
   }

   @Override
   public cfz a(cfz $$0, dzk $$1) {
      chy.a($$0, this.a);
      return $$0;
   }

   public static eay.a<?> a(chw $$0) {
      return a($$1 -> new ebo($$1, $$0));
   }

   public static class a extends eay.c<ebo> {
      public void a(JsonObject $$0, ebo $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("id", jb.j.b($$1.a).toString());
      }

      public ebo a(JsonObject $$0, JsonDeserializationContext $$1, eck[] $$2) {
         String $$3 = aor.i($$0, "id");
         chw $$4 = jb.j.b(acq.a($$3)).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$3 + "'"));
         return new ebo($$2, $$4);
      }
   }
}

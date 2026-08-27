import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import javax.annotation.Nullable;

public class av extends cv<av.a> {
   static final aep a = new aep("brewed_potion");

   @Override
   public aep a() {
      return a;
   }

   public av.a a(JsonObject $$0, ba $$1, be $$2) {
      ckt $$3 = null;
      if ($$0.has("potion")) {
         aep $$4 = new aep(arf.i($$0, "potion"));
         $$3 = jc.j.b($$4).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + $$4 + "'"));
      }

      return new av.a($$1, $$3);
   }

   public void a(akj $$0, ckt $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      @Nullable
      private final ckt a;

      public a(ba $$0, @Nullable ckt $$1) {
         super(av.a, $$0);
         this.a = $$1;
      }

      public static av.a c() {
         return new av.a(ba.a, null);
      }

      public boolean a(ckt $$0) {
         return this.a == null || this.a == $$0;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         if (this.a != null) {
            $$1.addProperty("potion", jc.j.b(this.a).toString());
         }

         return $$1;
      }
   }
}

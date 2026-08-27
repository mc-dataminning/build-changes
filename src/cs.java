import com.google.gson.JsonObject;

public class cs extends cv<cs.a> {
   static final acq a = new acq("recipe_unlocked");

   @Override
   public acq a() {
      return a;
   }

   public cs.a a(JsonObject $$0, ba $$1, be $$2) {
      acq $$3 = new acq(aor.i($$0, "recipe"));
      return new cs.a($$1, $$3);
   }

   public void a(aig $$0, cjc<?> $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static cs.a a(acq $$0) {
      return new cs.a(ba.a, $$0);
   }

   public static class a extends ar {
      private final acq a;

      public a(ba $$0, acq $$1) {
         super(cs.a, $$0);
         this.a = $$1;
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.addProperty("recipe", this.a.toString());
         return $$1;
      }

      public boolean a(cjc<?> $$0) {
         return this.a.equals($$0.e());
      }
   }
}

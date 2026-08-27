import com.google.gson.JsonObject;

public class bs extends cv<bs.a> {
   static final acq a = new acq("filled_bucket");

   @Override
   public acq a() {
      return a;
   }

   public bs.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("item"));
      return new bs.a($$1, $$3);
   }

   public void a(aig $$0, cfz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final bz a;

      public a(ba $$0, bz $$1) {
         super(bs.a, $$0);
         this.a = $$1;
      }

      public static bs.a a(bz $$0) {
         return new bs.a(ba.a, $$0);
      }

      public boolean a(cfz $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         return $$1;
      }
   }
}

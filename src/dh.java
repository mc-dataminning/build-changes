import com.google.gson.JsonObject;

public class dh extends cv<dh.a> {
   static final acq a = new acq("using_item");

   @Override
   public acq a() {
      return a;
   }

   public dh.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("item"));
      return new dh.a($$1, $$3);
   }

   public void a(aig $$0, cfz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static class a extends ar {
      private final bz a;

      public a(ba $$0, bz $$1) {
         super(dh.a, $$0);
         this.a = $$1;
      }

      public static dh.a a(bo.a $$0, bz.a $$1) {
         return new dh.a(bo.a($$0.b()), $$1.b());
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

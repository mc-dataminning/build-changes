import com.google.gson.JsonObject;

public class bi extends cv<bi.a> {
   static final acq a = new acq("enchanted_item");

   @Override
   public acq a() {
      return a;
   }

   public bi.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("item"));
      cj.d $$4 = cj.d.a($$0.get("levels"));
      return new bi.a($$1, $$3, $$4);
   }

   public void a(aig $$0, cfz $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static class a extends ar {
      private final bz a;
      private final cj.d b;

      public a(ba $$0, bz $$1, cj.d $$2) {
         super(bi.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bi.a c() {
         return new bi.a(ba.a, bz.a, cj.d.e);
      }

      public boolean a(cfz $$0, int $$1) {
         return !this.a.a($$0) ? false : this.b.d($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("levels", this.b.d());
         return $$1;
      }
   }
}

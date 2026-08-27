import com.google.gson.JsonObject;

public class dc extends cv<dc.a> {
   static final acq a = new acq("tame_animal");

   @Override
   public acq a() {
      return a;
   }

   public dc.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = bo.a($$0, "entity", $$2);
      return new dc.a($$1, $$3);
   }

   public void a(aig $$0, brl $$1) {
      dzk $$2 = bo.b($$0, $$1);
      this.a($$0, $$1x -> $$1x.a($$2));
   }

   public static class a extends ar {
      private final ba a;

      public a(ba $$0, ba $$1) {
         super(dc.a, $$0);
         this.a = $$1;
      }

      public static dc.a c() {
         return new dc.a(ba.a, ba.a);
      }

      public static dc.a a(bo $$0) {
         return new dc.a(ba.a, bo.a($$0));
      }

      public boolean a(dzk $$0) {
         return this.a.a($$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("entity", this.a.a($$0));
         return $$1;
      }
   }
}

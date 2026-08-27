import com.google.gson.JsonObject;

public class co extends cv<co.a> {
   static final acq a = new acq("player_interacted_with_entity");

   @Override
   public acq a() {
      return a;
   }

   protected co.a a(JsonObject $$0, ba $$1, be $$2) {
      bz $$3 = bz.a($$0.get("item"));
      ba $$4 = bo.a($$0, "entity", $$2);
      return new co.a($$1, $$3, $$4);
   }

   public void a(aig $$0, cfz $$1, bfj $$2) {
      dzk $$3 = bo.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$1, $$3));
   }

   public static class a extends ar {
      private final bz a;
      private final ba b;

      public a(ba $$0, bz $$1, ba $$2) {
         super(co.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static co.a a(ba $$0, bz.a $$1, ba $$2) {
         return new co.a($$0, $$1.b(), $$2);
      }

      public static co.a a(bz.a $$0, ba $$1) {
         return a(ba.a, $$0, $$1);
      }

      public boolean a(cfz $$0, dzk $$1) {
         return !this.a.a($$0) ? false : this.b.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.a.a());
         $$1.add("entity", this.b.a($$0));
         return $$1;
      }
   }
}

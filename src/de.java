import com.google.gson.JsonObject;

public class de extends cv<de.a> {
   static final acq a = new acq("villager_trade");

   @Override
   public acq a() {
      return a;
   }

   public de.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = bo.a($$0, "villager", $$2);
      bz $$4 = bz.a($$0.get("item"));
      return new de.a($$1, $$3, $$4);
   }

   public void a(aig $$0, bxw $$1, cfz $$2) {
      dzk $$3 = bo.b($$0, $$1);
      this.a($$0, $$2x -> $$2x.a($$3, $$2));
   }

   public static class a extends ar {
      private final ba a;
      private final bz b;

      public a(ba $$0, ba $$1, bz $$2) {
         super(de.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static de.a c() {
         return new de.a(ba.a, ba.a, bz.a);
      }

      public static de.a a(bo.a $$0) {
         return new de.a(bo.a($$0.b()), ba.a, bz.a);
      }

      public boolean a(dzk $$0, cfz $$1) {
         return !this.a.a($$0) ? false : this.b.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("item", this.b.a());
         $$1.add("villager", this.a.a($$0));
         return $$1;
      }
   }
}

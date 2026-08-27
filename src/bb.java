import com.google.gson.JsonObject;

public class bb extends cv<bb.a> {
   static final aep a = new aep("cured_zombie_villager");

   @Override
   public aep a() {
      return a;
   }

   public bb.a a(JsonObject $$0, ba $$1, be $$2) {
      ba $$3 = bo.a($$0, "zombie", $$2);
      ba $$4 = bo.a($$0, "villager", $$2);
      return new bb.a($$1, $$3, $$4);
   }

   public void a(akj $$0, bzs $$1, cay $$2) {
      ech $$3 = bo.b($$0, $$1);
      ech $$4 = bo.b($$0, $$2);
      this.a($$0, $$2x -> $$2x.a($$3, $$4));
   }

   public static class a extends ar {
      private final ba a;
      private final ba b;

      public a(ba $$0, ba $$1, ba $$2) {
         super(bb.a, $$0);
         this.a = $$1;
         this.b = $$2;
      }

      public static bb.a c() {
         return new bb.a(ba.a, ba.a, ba.a);
      }

      public boolean a(ech $$0, ech $$1) {
         return !this.a.a($$0) ? false : this.b.a($$1);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("zombie", this.a.a($$0));
         $$1.add("villager", this.b.a($$0));
         return $$1;
      }
   }
}

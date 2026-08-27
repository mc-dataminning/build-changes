import com.google.gson.JsonObject;

public class bg extends cv<bg.a> {
   final acq a;

   public bg(acq $$0) {
      this.a = $$0;
   }

   @Override
   public acq a() {
      return this.a;
   }

   public bg.a a(JsonObject $$0, ba $$1, be $$2) {
      ch $$3 = ch.a($$0.get("start_position"));
      bf $$4 = bf.a($$0.get("distance"));
      return new bg.a(this.a, $$1, $$3, $$4);
   }

   public void a(aig $$0, eei $$1) {
      eei $$2 = $$0.dg();
      this.a($$0, $$3 -> $$3.a($$0.x(), $$1, $$2));
   }

   public static class a extends ar {
      private final ch a;
      private final bf b;

      public a(acq $$0, ba $$1, ch $$2, bf $$3) {
         super($$0, $$1);
         this.a = $$2;
         this.b = $$3;
      }

      public static bg.a a(bo.a $$0, bf $$1, ch $$2) {
         return new bg.a(ai.U.a, bo.a($$0.b()), $$2, $$1);
      }

      public static bg.a a(bo.a $$0, bf $$1) {
         return new bg.a(ai.V.a, bo.a($$0.b()), ch.a, $$1);
      }

      public static bg.a a(bf $$0) {
         return new bg.a(ai.C.a, ba.a, ch.a, $$0);
      }

      @Override
      public JsonObject a(ct $$0) {
         JsonObject $$1 = super.a($$0);
         $$1.add("start_position", this.a.a());
         $$1.add("distance", this.b.a());
         return $$1;
      }

      public boolean a(aif $$0, eei $$1, eei $$2) {
         return !this.a.a($$0, $$1.c, $$1.d, $$1.e) ? false : this.b.a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
      }
   }
}

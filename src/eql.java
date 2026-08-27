public class eql extends ghr {
   private static final ur a = ur.c("mco.client.incompatible.title");
   private static final ur[] b = new ur[]{
      ur.c("mco.client.incompatible.msg.line1"), ur.c("mco.client.incompatible.msg.line2"), ur.c("mco.client.incompatible.msg.line3")
   };
   private static final ur[] c = new ur[]{ur.c("mco.client.incompatible.msg.line1"), ur.c("mco.client.incompatible.msg.line2")};
   private final fau v;

   public eql(fau $$0) {
      super(a);
      this.v = $$0;
   }

   @Override
   public void aP_() {
      this.d(euz.a(uq.k, $$0 -> this.f.a(this.v)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, h(3), -65536);
      ur[] $$4 = this.C();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, h(5) + $$5 * 12, -1);
      }
   }

   private ur[] C() {
      return aa.b().g() ? c : b;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 != 257 && $$0 != 335 && $$0 != 256) {
         return super.a($$0, $$1, $$2);
      } else {
         this.f.a(this.v);
         return true;
      }
   }
}

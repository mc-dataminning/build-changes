public class eoe extends gfb {
   private static final tm a = tm.c("mco.client.incompatible.title");
   private static final tm[] b = new tm[]{
      tm.c("mco.client.incompatible.msg.line1"), tm.c("mco.client.incompatible.msg.line2"), tm.c("mco.client.incompatible.msg.line3")
   };
   private static final tm[] c = new tm[]{tm.c("mco.client.incompatible.msg.line1"), tm.c("mco.client.incompatible.msg.line2")};
   private final eyk y;

   public eoe(eyk $$0) {
      super(a);
      this.y = $$0;
   }

   @Override
   public void aI_() {
      this.d(esq.a(tl.k, $$0 -> this.f.a(this.y)).a(this.g / 2 - 100, h(12), 200, 20).a());
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, h(3), -65536);
      tm[] $$4 = this.D();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, h(5) + $$5 * 12, -1);
      }
   }

   private tm[] D() {
      return aa.b().g() ? c : b;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 != 257 && $$0 != 335 && $$0 != 256) {
         return super.a($$0, $$1, $$2);
      } else {
         this.f.a(this.y);
         return true;
      }
   }
}

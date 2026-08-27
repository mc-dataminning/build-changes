public class euw extends gnd {
   private static final vq a = vq.c("mco.client.incompatible.title");
   private static final vq[] b = new vq[]{
      vq.c("mco.client.incompatible.msg.line1"), vq.c("mco.client.incompatible.msg.line2"), vq.c("mco.client.incompatible.msg.line3")
   };
   private static final vq[] c = new vq[]{vq.c("mco.client.incompatible.msg.line1"), vq.c("mco.client.incompatible.msg.line2")};
   private final ffl v;

   public euw(ffl $$0) {
      super(a);
      this.v = $$0;
   }

   @Override
   public void aQ_() {
      this.c(ezo.a(vp.k, $$0 -> this.f.a(this.v)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, g(3), -65536);
      vq[] $$4 = this.E();

      for (int $$5 = 0; $$5 < $$4.length; $$5++) {
         $$0.a(this.i, $$4[$$5], this.g / 2, g(5) + $$5 * 12, -1);
      }
   }

   private vq[] E() {
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

public class fre extends frh {
   private final flf a;
   private final fub b = fub.i(fyt.a);

   fre(foe $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3);
      this.a = new fkq(evr.O().aP().a(fni.R));
      this.u = 0.0F;
      this.t = 30;
   }

   @Override
   public frl b() {
      return frl.e;
   }

   @Override
   public void a(eqo $$0, evc $$1, float $$2) {
      float $$3 = ((float)this.s + $$2) / (float)this.t;
      float $$4 = 0.05F + 0.5F * aup.a($$3 * (float) Math.PI);
      eqk $$5 = new eqk();
      $$5.a($$1.f());
      $$5.a(a.b.rotationDegrees(150.0F * $$3 - 60.0F));
      $$5.b(-1.0F, -1.0F, 1.0F);
      $$5.a(0.0F, -1.101F, 1.5F);
      ftt.a $$6 = evr.O().aO().c();
      eqo $$7 = $$6.getBuffer(this.b);
      this.a.a($$5, $$7, 15728880, ges.d, 1.0F, 1.0F, 1.0F, $$4);
      $$6.b();
   }

   public static class a implements frk<ka> {
      public frh a(ka $$0, foe $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fre($$1, $$2, $$3, $$4);
      }
   }
}

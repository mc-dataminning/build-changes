public class cac extends caq {
   private static final int[] a = new int[]{0, 1, 4, 5, 6, 7};
   private final cfm b;
   private final int c;
   private boolean d;

   public cac(cfm $$0, int $$1) {
      this.b = $$0;
      this.c = b($$1);
   }

   @Override
   public boolean b() {
      if (this.b.dS().a(this.c) != 0) {
         return false;
      } else {
         ji $$0 = this.b.cJ();
         int $$1 = $$0.j();
         int $$2 = $$0.l();
         jd $$3 = this.b.dp();

         for (int $$4 : a) {
            if (!this.a($$3, $$1, $$2, $$4) || !this.b($$3, $$1, $$2, $$4)) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean a(jd $$0, int $$1, int $$2, int $$3) {
      jd $$4 = $$0.b($$1 * $$3, 0, $$2 * $$3);
      return this.b.dP().b_($$4).a(awk.a) && !this.b.dP().a_($$4).d();
   }

   private boolean b(jd $$0, int $$1, int $$2, int $$3) {
      return this.b.dP().a_($$0.b($$1 * $$3, 1, $$2 * $$3)).i() && this.b.dP().a_($$0.b($$1 * $$3, 2, $$2 * $$3)).i();
   }

   @Override
   public boolean c() {
      double $$0 = this.b.ds().d;
      return (!($$0 * $$0 < 0.03F) || this.b.dH() == 0.0F || !(Math.abs(this.b.dH()) < 10.0F) || !this.b.bf()) && !this.b.aF();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      ji $$0 = this.b.cJ();
      this.b.i(this.b.ds().b((double)$$0.j() * 0.6, 0.7, (double)$$0.l() * 0.6));
      this.b.N().n();
   }

   @Override
   public void e() {
      this.b.u(0.0F);
   }

   @Override
   public void a() {
      boolean $$0 = this.d;
      if (!$$0) {
         epc $$1 = this.b.dP().b_(this.b.dp());
         this.d = $$1.a(awk.a);
      }

      if (this.d && !$$0) {
         this.b.a(avp.hb, 1.0F, 1.0F);
      }

      exa $$2 = this.b.ds();
      if ($$2.d * $$2.d < 0.03F && this.b.dH() != 0.0F) {
         this.b.u(ayo.j(0.2F, this.b.dH(), 0.0F));
      } else if ($$2.f() > 1.0E-5F) {
         double $$3 = $$2.h();
         double $$4 = Math.atan2(-$$2.d, $$3) * 180.0F / (float)Math.PI;
         this.b.u((float)$$4);
      }
   }
}

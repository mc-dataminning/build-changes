import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cjo extends cjm implements buh {
   private static final int c = 50;
   private static final int d = 70;
   private static final akk<Boolean> e = ako.a(cjo.class, akm.k);
   public static final String b = "sheared";

   public static bux.a gt() {
      return cjm.s().a(buy.q, 16.0);
   }

   public cjo(btb<? extends cjo> $$0, dbz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("sheared", this.gu());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gu() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bqv b(cmy $$0, bqu $$1) {
      cuq $$2 = $$0.b($$1);
      if ($$2.a(cut.rV) && this.a()) {
         this.a(awb.h);
         this.a(dww.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqv.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz v() {
      return awa.cn;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.cp;
   }

   @Override
   protected avz o_() {
      return awa.co;
   }

   @Override
   protected avz u() {
      return awa.cr;
   }

   @Override
   protected cne b(cuq $$0, float $$1) {
      cne $$2 = super.b($$0, $$1);
      if ($$2 instanceof cng $$3) {
         $$3.a(new bsd(bsf.s, 100));
      }

      return $$2;
   }

   @Override
   protected int gq() {
      return 50;
   }

   @Override
   protected int gr() {
      return 70;
   }

   @Override
   public void a(awb $$0) {
      this.dP().a(null, this, awa.cq, $$0, 1.0F, 1.0F);
      this.gx();
      this.w(true);
   }

   private void gx() {
      if (this.dP() instanceof arf $$0 && $$0.ab().b(dbv.f)) {
         eqo $$1 = $$0.o().be().b(eqf.bc);
         eqm $$2 = new eqm.a($$0).a(etf.f, this.dn()).a(etf.a, this).a(ete.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuq $$3 = (cuq)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bD();
   }
}

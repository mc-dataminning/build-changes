import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cjp extends cjn implements bui {
   private static final int c = 50;
   private static final int d = 70;
   private static final akk<Boolean> e = ako.a(cjp.class, akm.k);
   public static final String b = "sheared";

   public static buy.a gt() {
      return cjn.s().a(buz.q, 16.0);
   }

   public cjp(btc<? extends cjp> $$0, dca $$1) {
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
   protected bqw b(cmz $$0, bqv $$1) {
      cur $$2 = $$0.b($$1);
      if ($$2.a(cuu.rV) && this.a()) {
         this.a(awb.h);
         this.a(dwx.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz v() {
      return awa.cn;
   }

   @Override
   protected avz d(brp $$0) {
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
   protected cnf b(cur $$0, float $$1) {
      cnf $$2 = super.b($$0, $$1);
      if ($$2 instanceof cnh $$3) {
         $$3.a(new bse(bsg.s, 100));
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
      if (this.dP() instanceof arf $$0 && $$0.ab().b(dbw.f)) {
         eqp $$1 = $$0.o().be().b(eqg.bc);
         eqn $$2 = new eqn.a($$0).a(etg.f, this.dn()).a(etg.a, this).a(etf.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cur $$3 = (cur)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bD();
   }
}

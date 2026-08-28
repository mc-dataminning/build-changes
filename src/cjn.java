import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cjn extends cjl implements bug {
   private static final int c = 50;
   private static final int d = 70;
   private static final akk<Boolean> e = ako.a(cjn.class, akm.k);
   public static final String b = "sheared";

   public static buw.a gt() {
      return cjl.s().a(bux.q, 16.0);
   }

   public cjn(bta<? extends cjn> $$0, dby $$1) {
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
   protected bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.rV) && this.a()) {
         this.a(awb.h);
         this.a(dwv.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avz v() {
      return awa.cn;
   }

   @Override
   protected avz d(brn $$0) {
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
   protected cnd b(cup $$0, float $$1) {
      cnd $$2 = super.b($$0, $$1);
      if ($$2 instanceof cnf $$3) {
         $$3.a(new bsc(bse.s, 100));
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
      if (this.dP() instanceof arf $$0 && $$0.ab().b(dbu.f)) {
         eqn $$1 = $$0.o().be().b(eqe.bc);
         eql $$2 = new eql.a($$0).a(ete.f, this.dn()).a(ete.a, this).a(etd.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cup $$3 = (cup)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bD();
   }
}

import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cjl extends cjj implements bue {
   private static final int c = 50;
   private static final int d = 70;
   private static final akj<Boolean> e = akn.a(cjl.class, akl.k);
   public static final String b = "sheared";

   public static buu.a gt() {
      return cjj.s().a(buv.q, 16.0);
   }

   public cjl(bsy<? extends cjl> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("sheared", this.gu());
   }

   @Override
   public void a(ur $$0) {
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
   protected bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ($$2.a(cuq.rV) && this.a()) {
         this.a(awa.h);
         this.a(dwt.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqs.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avy v() {
      return avz.cn;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.cp;
   }

   @Override
   protected avy o_() {
      return avz.co;
   }

   @Override
   protected avy u() {
      return avz.cr;
   }

   @Override
   protected cnb b(cun $$0, float $$1) {
      cnb $$2 = super.b($$0, $$1);
      if ($$2 instanceof cnd $$3) {
         $$3.a(new bsa(bsc.s, 100));
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
   public void a(awa $$0) {
      this.dP().a(null, this, avz.cq, $$0, 1.0F, 1.0F);
      this.gx();
      this.w(true);
   }

   private void gx() {
      if (this.dP() instanceof are $$0 && $$0.ab().b(dbs.f)) {
         eql $$1 = $$0.o().be().b(eqc.bc);
         eqj $$2 = new eqj.a($$0).a(etc.f, this.dn()).a(etc.a, this).a(etb.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cun $$3 = (cun)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bD();
   }
}

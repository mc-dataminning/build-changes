import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cji extends cjg implements bub {
   private static final int c = 50;
   private static final int d = 70;
   private static final akg<Boolean> e = akk.a(cji.class, aki.k);
   public static final String b = "sheared";

   public static bur.a gt() {
      return cjg.s().a(bus.q, 16.0);
   }

   public cji(bsv<? extends cji> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
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
   protected bqp b(cms $$0, bqo $$1) {
      cuk $$2 = $$0.b($$1);
      if ($$2.a(cun.rV) && this.a()) {
         this.a(avx.h);
         this.a(dwq.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqp.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avv v() {
      return avw.cn;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.cp;
   }

   @Override
   protected avv o_() {
      return avw.co;
   }

   @Override
   protected avv u() {
      return avw.cr;
   }

   @Override
   protected cmy b(cuk $$0, float $$1) {
      cmy $$2 = super.b($$0, $$1);
      if ($$2 instanceof cna $$3) {
         $$3.a(new brx(brz.s, 100));
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
   public void a(avx $$0) {
      this.dP().a(null, this, avw.cq, $$0, 1.0F, 1.0F);
      this.gx();
      this.w(true);
   }

   private void gx() {
      if (this.dP() instanceof arb $$0 && $$0.ab().b(dbp.f)) {
         eqi $$1 = $$0.o().be().b(epz.bc);
         eqg $$2 = new eqg.a($$0).a(esz.f, this.dn()).a(esz.a, this).a(esy.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuk $$3 = (cuk)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bD();
   }
}

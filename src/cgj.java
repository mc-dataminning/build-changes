import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cgj extends cgh implements bre {
   private static final int c = 50;
   private static final int d = 70;
   private static final aiy<Boolean> e = ajc.a(cgj.class, aja.k);
   public static final String b = "sheared";

   public static bru.a gq() {
      return cgh.r().a(brv.q, 16.0);
   }

   public cgj(bqb<? extends cgj> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("sheared", this.gr());
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gr() {
      return this.an.a(e);
   }

   public void w(boolean $$0) {
      this.an.a(e, $$0);
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if ($$2.a(crm.rU) && this.a()) {
         this.a(aun.h);
         this.a(dts.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return boa.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aul v() {
      return aum.cn;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.cp;
   }

   @Override
   protected aul o_() {
      return aum.co;
   }

   @Override
   protected aul u() {
      return aum.cr;
   }

   @Override
   protected cjz b(crj $$0, float $$1) {
      cjz $$2 = super.b($$0, $$1);
      if ($$2 instanceof ckb $$3) {
         $$3.a(new bph(bpj.s, 100));
      }

      return $$2;
   }

   @Override
   protected int gn() {
      return 50;
   }

   @Override
   protected int go() {
      return 70;
   }

   @Override
   public void a(aun $$0) {
      this.dM().a(null, this, aum.cq, $$0, 1.0F, 1.0F);
      this.gu();
      this.w(true);
   }

   private void gu() {
      if (this.dM() instanceof aps $$0 && $$0.aa().b(cyt.f)) {
         enj $$1 = $$0.o().aM().getLootTable(emz.aP);
         enh $$2 = new enh.a($$0).a(epo.f, this.dk()).a(epo.a, this).a(epn.r);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            crj $$3 = (crj)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gr() && this.bA();
   }
}

import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cjm extends cjk implements buf {
   private static final int c = 50;
   private static final int d = 70;
   private static final akj<Boolean> e = akn.a(cjm.class, akl.k);
   public static final String b = "sheared";

   public static buv.a gt() {
      return cjk.s().a(buw.q, 16.0);
   }

   public cjm(bsz<? extends cjm> $$0, dbx $$1) {
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
   protected bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.rV) && this.a()) {
         this.a(awa.h);
         this.a(dwu.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqt.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avy v() {
      return avz.cn;
   }

   @Override
   protected avy d(brm $$0) {
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
   protected cnc b(cuo $$0, float $$1) {
      cnc $$2 = super.b($$0, $$1);
      if ($$2 instanceof cne $$3) {
         $$3.a(new bsb(bsd.s, 100));
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
      if (this.dP() instanceof are $$0 && $$0.ab().b(dbt.f)) {
         eqm $$1 = $$0.o().be().b(eqd.bc);
         eqk $$2 = new eqk.a($$0).a(etd.f, this.dn()).a(etd.a, this).a(etc.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuo $$3 = (cuo)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gu() && this.bD();
   }
}

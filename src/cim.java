import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cim extends cik implements btf {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajr<Boolean> e = ajv.a(cim.class, ajt.k);
   public static final String b = "sheared";

   public static btv.a gs() {
      return cik.s().a(btw.q, 16.0);
   }

   public cim(bsa<? extends cim> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("sheared", this.gt());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gt() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   protected bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.rV) && this.a()) {
         this.a(avi.h);
         this.a(dvu.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avg v() {
      return avh.cn;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.cp;
   }

   @Override
   protected avg o_() {
      return avh.co;
   }

   @Override
   protected avg u() {
      return avh.cr;
   }

   @Override
   protected cmc b(cto $$0, float $$1) {
      cmc $$2 = super.b($$0, $$1);
      if ($$2 instanceof cme $$3) {
         $$3.a(new brc(bre.s, 100));
      }

      return $$2;
   }

   @Override
   protected int gp() {
      return 50;
   }

   @Override
   protected int gq() {
      return 70;
   }

   @Override
   public void a(avi $$0) {
      this.dP().a(null, this, avh.cq, $$0, 1.0F, 1.0F);
      this.gw();
      this.w(true);
   }

   private void gw() {
      if (this.dP() instanceof aqm $$0 && $$0.aa().b(dat.f)) {
         epk $$1 = $$0.o().be().b(epd.ba);
         epi $$2 = new epi.a($$0).a(erx.f, this.dn()).a(erx.a, this).a(erw.s);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cto $$3 = (cto)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gt() && this.bD();
   }
}

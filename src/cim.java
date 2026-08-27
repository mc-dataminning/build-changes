import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class cim extends cik implements bte {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajy<Boolean> e = akc.a(cim.class, aka.k);
   public static final String b = "sheared";

   public static btu.a gB() {
      return cik.r().a(btv.q, 16.0);
   }

   public cim(bsb<? extends cim> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("sheared", this.gC());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.w($$0.q("sheared"));
   }

   public boolean gC() {
      return this.as.a(e);
   }

   public void w(boolean $$0) {
      this.as.a(e, $$0);
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.ts) && this.a()) {
         this.a(avq.h);
         this.a(dxv.M, $$0);
         if (!this.dU().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bqa.a(this.dU().C);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avn u() {
      return avo.cs;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.cu;
   }

   @Override
   protected avn n_() {
      return avo.ct;
   }

   @Override
   protected avn t() {
      return avo.cw;
   }

   @Override
   protected cme b(cuh $$0, float $$1) {
      cme $$2 = super.b($$0, $$1);
      if ($$2 instanceof cmg $$3) {
         $$3.a(new brh(brj.s, 100));
      }

      return $$2;
   }

   @Override
   protected int gy() {
      return 50;
   }

   @Override
   protected int gz() {
      return 70;
   }

   @Override
   public void a(avq $$0) {
      this.dU().a(null, this, avo.cv, $$0, 1.0F, 1.0F);
      this.gD();
      this.w(true);
   }

   private void gD() {
      if (this.dU() instanceof aqt $$0 && $$0.ab().b(dbw.f)) {
         eru $$1 = $$0.o().be().b(ern.bl);
         ers $$2 = new ers.a($$0).a(eug.f, this.ds()).a(eug.a, this).a(euf.r);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            cuh $$3 = (cuh)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gC() && this.bI();
   }
}

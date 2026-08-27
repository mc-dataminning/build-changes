import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class chx extends chv implements bsq {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajm<Boolean> e = ajq.a(chx.class, ajo.k);
   public static final String b = "sheared";

   public static btg.a gs() {
      return chv.r().a(bth.q, 16.0);
   }

   public chx(brn<? extends chx> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("sheared", this.gt());
   }

   @Override
   public void a(ua $$0) {
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
   protected bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if ($$2.a(ctc.rV) && this.a()) {
         this.a(avd.h);
         this.a(dva.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avb v() {
      return avc.cn;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.cp;
   }

   @Override
   protected avb o_() {
      return avc.co;
   }

   @Override
   protected avb u() {
      return avc.cr;
   }

   @Override
   protected cln b(csz $$0, float $$1) {
      cln $$2 = super.b($$0, $$1);
      if ($$2 instanceof clp $$3) {
         $$3.a(new bqt(bqv.s, 100));
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
   public void a(avd $$0) {
      this.dN().a(null, this, avc.cq, $$0, 1.0F, 1.0F);
      this.gw();
      this.w(true);
   }

   private void gw() {
      if (this.dN() instanceof aqh $$0 && $$0.aa().b(czz.f)) {
         eoq $$1 = $$0.o().be().b(eoj.aS);
         eoo $$2 = new eoo.a($$0).a(erc.f, this.dl()).a(erc.a, this).a(erb.r);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            csz $$3 = (csz)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gt() && this.bB();
   }
}

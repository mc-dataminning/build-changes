import it.unimi.dsi.fastutil.objects.ObjectListIterator;

public class chb extends cgz implements bru {
   private static final int c = 50;
   private static final int d = 70;
   private static final ajk<Boolean> e = ajo.a(chb.class, ajm.k);
   public static final String b = "sheared";

   public static bsk.a gs() {
      return cgz.r().a(bsl.q, 16.0);
   }

   public chb(bqr<? extends chb> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("sheared", this.gt());
   }

   @Override
   public void a(ty $$0) {
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
   protected boq b(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      if ($$2.a(csg.rV) && this.a()) {
         this.a(ava.h);
         this.a(dur.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, d($$1));
         }

         return boq.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected auy v() {
      return auz.cn;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.cp;
   }

   @Override
   protected auy o_() {
      return auz.co;
   }

   @Override
   protected auy u() {
      return auz.cr;
   }

   @Override
   protected ckr b(csd $$0, float $$1) {
      ckr $$2 = super.b($$0, $$1);
      if ($$2 instanceof ckt $$3) {
         $$3.a(new bpx(bpz.s, 100));
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
   public void a(ava $$0) {
      this.dN().a(null, this, auz.cq, $$0, 1.0F, 1.0F);
      this.gw();
      this.w(true);
   }

   private void gw() {
      if (this.dN() instanceof aqe $$0 && $$0.aa().b(czq.f)) {
         eoi $$1 = $$0.o().aM().getLootTable(eny.aS);
         eog $$2 = new eog.a($$0).a(eqt.f, this.dl()).a(eqt.a, this).a(eqs.r);
         ObjectListIterator var4 = $$1.a($$2).iterator();

         while (var4.hasNext()) {
            csd $$3 = (csd)var4.next();
            this.b($$3);
         }
      }
   }

   @Override
   public boolean a() {
      return !this.gt() && this.bB();
   }
}

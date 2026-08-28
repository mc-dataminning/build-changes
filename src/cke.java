import javax.annotation.Nullable;

public class cke extends civ {
   public cke(bsj<? extends cke> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bV.a(3, new cbp<>(this, ckw.class, true));
      super.z();
   }

   @Override
   protected ave v() {
      return avf.CC;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.CE;
   }

   @Override
   protected ave o_() {
      return avf.CD;
   }

   @Override
   ave u() {
      return avf.CF;
   }

   @Override
   protected void a(bqw $$0, boolean $$1) {
      super.a($$0, $$1);
      if ($$0.d() instanceof ciz $$3 && $$3.go()) {
         $$3.gp();
         this.a((dcc)cud.um);
      }
   }

   @Override
   protected void a(aym $$0, bqb $$1) {
      this.a(bsk.a, new cua(cud.oQ));
   }

   @Override
   protected void b(aym $$0, bqb $$1) {
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      btr $$4 = super.a($$0, $$1, $$2, $$3);
      this.f(bug.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean D(bsd $$0) {
      if (!super.D($$0)) {
         return false;
      } else {
         if ($$0 instanceof bsy) {
            ((bsy)$$0).b(new brl(brn.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cmn a(cua $$0, float $$1, @Nullable cua $$2) {
      cmn $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean c(brl $$0) {
      return $$0.a(brn.t) ? false : super.c($$0);
   }
}

import javax.annotation.Nullable;

public class clu extends ckl {
   public clu(bty<? extends clu> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bT.a(3, new cdd<>(this, cmm.class, true));
      super.D();
   }

   @Override
   protected awf w() {
      return awg.CJ;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.CL;
   }

   @Override
   protected awf o_() {
      return awg.CK;
   }

   @Override
   awf t() {
      return awg.CM;
   }

   @Override
   protected void a(arj $$0, bsj $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof ckp $$4 && $$4.gq()) {
         $$4.gr();
         this.a((dei)cvw.uo);
      }
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      this.a(btz.a, new cvs(cvw.oS));
   }

   @Override
   protected void a(dez $$0, azn $$1, brq $$2) {
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      bvf $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bvu.c).a(4.0);
      this.y();
      return $$4;
   }

   @Override
   public boolean E(btr $$0) {
      if (!super.E($$0)) {
         return false;
      } else {
         if ($$0 instanceof bun) {
            ((bun)$$0).b(new bsy(bta.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected coe a(cvs $$0, float $$1, @Nullable cvs $$2) {
      coe $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bsy $$0) {
      return $$0.a(bta.t) ? false : super.b($$0);
   }
}

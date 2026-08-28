import javax.annotation.Nullable;

public class cok extends cnb {
   public cok(bwj<? extends cok> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bD.a(3, new cfo<>(this, cpg.class, true));
      super.D();
   }

   @Override
   protected awk u() {
      return awl.DB;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.DD;
   }

   @Override
   protected awk l_() {
      return awl.DC;
   }

   @Override
   awk m() {
      return awl.DE;
   }

   @Override
   public axp<cyo> Y() {
      return null;
   }

   @Override
   public boolean h(cys $$0) {
      return !$$0.a(axi.bW) && super.h($$0);
   }

   @Override
   protected void a(aro $$0, bup $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cnf $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, cyw.vp);
      }
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      this.a(bwk.a, new cys(cyw.pA));
   }

   @Override
   protected void a(djg $$0, azt $$1, btw $$2) {
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      bxr $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(byf.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(aro $$0, bwa $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bwz) {
            ((bwz)$$1).b(new bve(bvg.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cqz a(cys $$0, float $$1, @Nullable cys $$2) {
      cqz $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bve $$0) {
      return $$0.a(bvg.t) ? false : super.b($$0);
   }
}

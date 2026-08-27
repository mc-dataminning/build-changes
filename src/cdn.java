import javax.annotation.Nullable;

public class cdn extends ccf {
   public cdn(bmc<? extends cdn> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bQ.a(3, new bvd<>(this, cef.class, true));
      super.B();
   }

   @Override
   protected ars y() {
      return art.BF;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.BH;
   }

   @Override
   protected ars n_() {
      return art.BG;
   }

   @Override
   ars w() {
      return art.BI;
   }

   @Override
   protected void a(bkv $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cci $$4 && $$4.gg()) {
         $$4.gh();
         this.a((ctw)cnj.ui);
      }
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      this.a(bmd.a, new cng(cnj.oP));
   }

   @Override
   protected void b(auw $$0, bka $$1) {
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      bnh $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.f(bnu.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   public boolean B(blw $$0) {
      if (!super.B($$0)) {
         return false;
      } else {
         if ($$0 instanceof bmo) {
            ((bmo)$$0).b(new blj(bll.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cfw b(cng $$0, float $$1) {
      cfw $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(blj $$0) {
      return $$0.a(bll.t) ? false : super.c($$0);
   }
}

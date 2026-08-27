import javax.annotation.Nullable;

public class bzr extends byj {
   public bzr(bim<? extends bzr> $$0, cpl $$1) {
      super($$0, $$1);
      this.a(ean.i, 8.0F);
   }

   @Override
   protected void w() {
      this.bP.a(3, new brm<>(this, cab.class, true));
      super.w();
   }

   @Override
   protected aov r() {
      return aow.Ao;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Aq;
   }

   @Override
   protected aov h_() {
      return aow.Ap;
   }

   @Override
   aov q() {
      return aow.Ar;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bym $$4 && $$4.gb()) {
         $$4.gc();
         this.a((cpk)cja.ts);
      }
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new cix(cja.oc));
   }

   @Override
   protected void b(aru $$0, bgo $$1) {
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      bjr $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bke.f).a(4.0);
      this.t();
      return $$5;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bii $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bii $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof biy) {
            ((biy)$$0).b(new bhv(bhx.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cbs b(cix $$0, float $$1) {
      cbs $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bhv $$0) {
      return $$0.c() == bhx.t ? false : super.c($$0);
   }
}

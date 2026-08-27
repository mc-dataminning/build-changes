import javax.annotation.Nullable;

public class bzs extends byk {
   public bzs(bim<? extends bzs> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.i, 8.0F);
   }

   @Override
   protected void w() {
      this.bP.a(3, new brn<>(this, cac.class, true));
      super.w();
   }

   @Override
   protected aov r() {
      return aow.Ae;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.Ag;
   }

   @Override
   protected aov h_() {
      return aow.Af;
   }

   @Override
   aov q() {
      return aow.Ah;
   }

   @Override
   protected void a(bhg $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byn $$4 && $$4.ga()) {
         $$4.gb();
         this.a((cpl)cjb.ts);
      }
   }

   @Override
   protected void a(aru $$0, bgo $$1) {
      this.a(bin.a, new ciy(cjb.oc));
   }

   @Override
   protected void b(aru $$0, bgo $$1) {
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      bjs $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bkf.f).a(4.0);
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
   protected cbt b(ciy $$0, float $$1) {
      cbt $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bhv $$0) {
      return $$0.c() == bhx.t ? false : super.c($$0);
   }
}

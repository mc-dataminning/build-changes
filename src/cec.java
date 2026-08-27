import java.util.List;

public class cec extends cej {
   public static final float b = bnu.C.k() / bnu.X.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public cec(bnu<? extends cec> $$0, cvn $$1) {
      super($$0, $$1);
      this.fL();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bpk.a u() {
      return cej.gg().a(bpl.o, 0.3F).a(bpl.c, 8.0).a(bpl.n, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected atj y() {
      return this.bc() ? atk.hz : atk.hA;
   }

   @Override
   protected atj d(bmn $$0) {
      return this.bc() ? atk.hF : atk.hG;
   }

   @Override
   protected atj n_() {
      return this.bc() ? atk.hC : atk.hD;
   }

   @Override
   protected atj A() {
      return atk.hE;
   }

   @Override
   protected void aa() {
      super.aa();
      if ((this.ag + this.aj()) % 1200 == 0) {
         bnb $$0 = new bnb(bnd.d, 6000, 2);
         List<aow> $$1 = bnc.a((aov)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new abm(abm.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fS()) {
         this.a(this.dm(), 16);
      }
   }
}

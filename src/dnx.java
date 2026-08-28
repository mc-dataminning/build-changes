import com.mojang.serialization.MapCodec;

public class dnx extends dke implements dkh {
   public static final MapCodec<dnx> a = b(dnx::new);
   private static final fcr c = dke.b(14.0, 0.0, 16.0);
   private static final fcr d = dke.b(14.0, 2.0, 16.0);
   public static final dyh b = dyg.F;

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(b) ? d : c;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$3.a(500) == 0) {
         dxq $$4 = $$1.a_($$2.d());
         if ($$4.a(awp.w) || $$4.a(dkg.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.tc, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dxq $$0) {
      return true;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dgf $$0, ji $$1) {
      ji $$2 = $$1.a(jn.b);
      dxq $$3 = $$0.a_($$2);
      return dpi.a($$0, jn.b, $$2, $$3) || $$3.a(dkg.ua);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dxq $$0) {
      return $$0.l();
   }

   public ji a(dgf $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      dxq $$3;
      do {
         $$2.c(jn.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jn.b).j();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      ji $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

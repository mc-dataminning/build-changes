import com.mojang.serialization.MapCodec;

public class dnf extends djn implements djq {
   public static final MapCodec<dnf> a = b(dnf::new);
   private static final int c = 1;
   private static final fbv d = djn.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fbv e = djn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dxp b = dxo.G;

   @Override
   public MapCodec<dnf> a() {
      return a;
   }

   public dnf(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$3.a(500) == 0) {
         dwy $$4 = $$1.a_($$2.d());
         if ($$4.a(awp.w) || $$4.a(djp.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.sS, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dwy $$0) {
      return true;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dfo $$0, ji $$1) {
      ji $$2 = $$1.a(jn.b);
      dwy $$3 = $$0.a_($$2);
      return dop.a($$0, jn.b, $$2, $$3) || $$3.a(djp.tY);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dwy $$0) {
      return $$0.l();
   }

   public ji a(dfo $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      dwy $$3;
      do {
         $$2.c(jn.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jn.b).j();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      ji $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

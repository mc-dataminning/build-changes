import com.mojang.serialization.MapCodec;

public class dne extends djm implements djp {
   public static final MapCodec<dne> a = b(dne::new);
   private static final int c = 1;
   private static final fbu d = djm.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fbu e = djm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dxo b = dxn.G;

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$3.a(500) == 0) {
         dwx $$4 = $$1.a_($$2.d());
         if ($$4.a(awp.w) || $$4.a(djo.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awa.sS, awb.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dwx $$0) {
      return true;
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dfn $$0, ji $$1) {
      ji $$2 = $$1.a(jn.b);
      dwx $$3 = $$0.a_($$2);
      return doo.a($$0, jn.b, $$2, $$3) || $$3.a(djo.tY);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dwx $$0) {
      return $$0.l();
   }

   public ji a(dfn $$0, ji $$1) {
      ji.a $$2 = $$1.k();

      dwx $$3;
      do {
         $$2.c(jn.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jn.b).j();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      ji $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

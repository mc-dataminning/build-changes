import com.mojang.serialization.MapCodec;

public class doe extends dkm implements dkp {
   public static final MapCodec<doe> a = b(doe::new);
   private static final int c = 1;
   private static final fcs d = dkm.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fcs e = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dym b = dyl.s;

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   public doe(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      if ($$3.a(500) == 0) {
         dxv $$4 = $$1.a_($$2.d());
         if ($$4.a(dko.ae) || $$4.a(dko.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.sM, axg.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dxv $$0) {
      return true;
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dgn $$0, jh $$1) {
      jh $$2 = $$1.a(jm.b);
      dxv $$3 = $$0.a_($$2);
      return dpo.a($$0, jm.b, $$2, $$3) || $$3.a(dko.tR);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dxv $$0) {
      return $$0.l();
   }

   public jh a(dgn $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      dxv $$3;
      do {
         $$2.c(jm.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jm.b).j();
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      jh $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

import com.mojang.serialization.MapCodec;

public class dod extends dkl implements dko {
   public static final MapCodec<dod> a = b(dod::new);
   private static final int c = 1;
   private static final fcr d = dkl.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fcr e = dkl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dyl b = dyk.s;

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$3.a(500) == 0) {
         dxu $$4 = $$1.a_($$2.d());
         if ($$4.a(dkn.ae) || $$4.a(dkn.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.sM, axg.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dxu $$0) {
      return true;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dgm $$0, jh $$1) {
      jh $$2 = $$1.a(jm.b);
      dxu $$3 = $$0.a_($$2);
      return dpn.a($$0, jm.b, $$2, $$3) || $$3.a(dkn.tR);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dxu $$0) {
      return $$0.l();
   }

   public jh a(dgm $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      dxu $$3;
      do {
         $$2.c(jm.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jm.b).j();
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      jh $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

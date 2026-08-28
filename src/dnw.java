import com.mojang.serialization.MapCodec;

public class dnw extends dke implements dkh {
   public static final MapCodec<dnw> a = b(dnw::new);
   private static final int c = 1;
   private static final fcm d = dke.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fcm e = dke.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dye b = dyd.s;

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$3.a(500) == 0) {
         dxn $$4 = $$1.a_($$2.d());
         if ($$4.a(dkg.ae) || $$4.a(dkg.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), axf.sL, axg.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dxn $$0) {
      return true;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dgf $$0, jh $$1) {
      jh $$2 = $$1.a(jm.b);
      dxn $$3 = $$0.a_($$2);
      return dpg.a($$0, jm.b, $$2, $$3) || $$3.a(dkg.tR);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return !this.b($$1, $$3) ? dkg.a.m() : $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dxn $$0) {
      return $$0.l();
   }

   public jh a(dgf $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      dxn $$3;
      do {
         $$2.c(jm.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jm.b).j();
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      jh $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

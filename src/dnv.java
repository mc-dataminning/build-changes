import com.mojang.serialization.MapCodec;

public class dnv extends dkd implements dkg {
   public static final MapCodec<dnv> a = b(dnv::new);
   private static final int c = 1;
   private static final fcl d = dkd.a(1.0, 2.0, 1.0, 15.0, 16.0, 15.0);
   private static final fcl e = dkd.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   public static final dyf b = dye.G;

   @Override
   public MapCodec<dnv> a() {
      return a;
   }

   public dnv(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$0.c(b) ? d : e;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$3.a(500) == 0) {
         dxo $$4 = $$1.a_($$2.d());
         if ($$4.a(axk.w) || $$4.a(dkf.aR)) {
            $$1.a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), awv.sS, aww.e, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected boolean e_(dxo $$0) {
      return true;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return this.b($$1, $$2);
   }

   private boolean b(dge $$0, jh $$1) {
      jh $$2 = $$1.a(jm.b);
      dxo $$3 = $$0.a_($$2);
      return dpf.a($$0, jm.b, $$2, $$3) || $$3.a(dkf.tY);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!this.b($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return $$0.b(b, Boolean.valueOf(!$$1.a_($$3.e()).a(this)));
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!this.b($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return this.o($$0.a_(this.a($$0, $$1).e()));
   }

   private boolean o(dxo $$0) {
      return $$0.l();
   }

   public jh a(dge $$0, jh $$1) {
      jh.a $$2 = $$1.k();

      dxo $$3;
      do {
         $$2.c(jm.a);
         $$3 = $$0.a_($$2);
      } while ($$3.a(this));

      return $$2.a(jm.b).j();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      jh $$4 = this.a($$0, $$2).e();
      if (this.o($$0.a_($$4))) {
         $$0.b($$4, $$3.b(b, Boolean.valueOf(true)));
      }
   }
}

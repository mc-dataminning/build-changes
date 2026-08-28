import com.mojang.serialization.MapCodec;

public class djg extends dkd implements dkg {
   public static final MapCodec<djg> a = b(djg::new);
   protected static final float b = 4.0F;
   protected static final fcl c = dkd.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      fbr $$4 = $$0.a($$2);
      return c.a($$4.d, $$4.e, $$4.f);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$3.a(3) == 0 && $$1.u($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.e()).a(axk.ax);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkf.a.m();
      } else {
         return $$4 == jm.b && $$6.a(dkf.nB) ? dkf.nB.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(cxk.ed);
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      this.a($$0, $$2);
   }

   @Override
   protected float a(dxo $$0, cpo $$1, dge $$2, jh $$3) {
      return $$1.eZ().h() instanceof cyu ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(dgz $$0, jh $$1) {
      $$0.a($$1.d(), dkf.nB.m().b(djh.i, dya.b), 3);
   }
}

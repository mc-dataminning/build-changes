import com.mojang.serialization.MapCodec;

public abstract class dle extends dij implements dld {
   public dle(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dle> a();

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         cky $$4 = cky.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cky $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dvo $$0) {
      return $$0.l() || $$0.a(axd.aM) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azr.a($$1, $$2, $$3, new lk(ls.C, $$0));
         }
      }
   }

   public int b(dvo $$0, dek $$1, jh $$2) {
      return -16777216;
   }
}

import com.mojang.serialization.MapCodec;

public abstract class dna extends dkd implements dmz {
   public dna(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dna> a();

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clr $$4 = clr.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(clr $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dxo $$0) {
      return $$0.l() || $$0.a(axk.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azy.a($$1, $$2, $$3, new lk(ls.C, $$0));
         }
      }
   }

   public int b(dxo $$0, dge $$1, jh $$2) {
      return -16777216;
   }
}

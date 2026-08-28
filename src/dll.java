import com.mojang.serialization.MapCodec;

public abstract class dll extends diq implements dlk {
   public dll(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dll> a();

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.K_()) {
         clb $$4 = clb.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(clb $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dvv $$0) {
      return $$0.l() || $$0.a(axc.aM) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azq.a($$1, $$2, $$3, new lk(ls.C, $$0));
         }
      }
   }

   public int b(dvv $$0, der $$1, jh $$2) {
      return -16777216;
   }
}

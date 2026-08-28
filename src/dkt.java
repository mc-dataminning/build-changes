import com.mojang.serialization.MapCodec;

public abstract class dkt extends dhy implements dks {
   public dkt(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkt> a();

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         ckp $$4 = ckp.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(ckp $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dvd $$0) {
      return $$0.l() || $$0.a(awz.aL) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$3.a(16) == 0) {
         jg $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azn.a($$1, $$2, $$3, new li(lq.C, $$0));
         }
      }
   }

   public int b(dvd $$0, dea $$1, jg $$2) {
      return -16777216;
   }
}

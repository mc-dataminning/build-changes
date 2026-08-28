import com.mojang.serialization.MapCodec;

public abstract class dmh extends djk implements dmg {
   public dmh(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmh> a();

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         ckz $$4 = ckz.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(ckz $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dwv $$0) {
      return $$0.l() || $$0.a(awo.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azc.a($$1, $$2, $$3, new ll(lt.C, $$0));
         }
      }
   }

   public int b(dwv $$0, dfl $$1, ji $$2) {
      return -16777216;
   }
}

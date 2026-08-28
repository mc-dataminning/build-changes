import com.mojang.serialization.MapCodec;

public abstract class dmj extends djm implements dmi {
   public dmj(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmj> a();

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         cla $$4 = cla.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cla $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dwx $$0) {
      return $$0.l() || $$0.a(awp.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azd.a($$1, $$2, $$3, new ll(lt.C, $$0));
         }
      }
   }

   public int b(dwx $$0, dfn $$1, ji $$2) {
      return -16777216;
   }
}

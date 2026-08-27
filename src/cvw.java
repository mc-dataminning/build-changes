import com.mojang.serialization.MapCodec;

public abstract class cvw extends ctc implements cvv {
   public cvw(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvw> a();

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (h($$1.a_($$2.d())) && $$2.v() >= $$1.H_()) {
         bys $$4 = bys.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(bys $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean h(dfd $$0) {
      return $$0.i() || $$0.a(apv.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$3.a(16) == 0) {
         gw $$4 = $$2.d();
         if (h($$1.a_($$4))) {
            ase.a($$1, $$2, $$3, new in(iv.z, $$0));
         }
      }
   }

   public int d(dfd $$0, cph $$1, gw $$2) {
      return -16777216;
   }
}

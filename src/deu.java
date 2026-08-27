import com.mojang.serialization.MapCodec;

public abstract class deu extends dby implements det {
   public deu(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends deu> a();

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cgc $$4 = cgc.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cgc $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(doz $$0) {
      return $$0.i() || $$0.a(avc.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            axn.a($$1, $$2, $$3, new kd(kl.C, $$0));
         }
      }
   }

   public int b(doz $$0, cyd $$1, ib $$2) {
      return -16777216;
   }
}

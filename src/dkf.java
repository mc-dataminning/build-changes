import com.mojang.serialization.MapCodec;

public abstract class dkf extends dhj implements dke {
   public dkf(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkf> a();

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.G_()) {
         ckd $$4 = ckd.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(ckd $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(duo $$0) {
      return $$0.l() || $$0.a(awt.aL) || $$0.n() || $$0.v();
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$3.a(16) == 0) {
         je $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azh.a($$1, $$2, $$3, new lf(ln.C, $$0));
         }
      }
   }

   public int b(duo $$0, ddl $$1, je $$2) {
      return -16777216;
   }
}

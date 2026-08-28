import com.mojang.serialization.MapCodec;

public abstract class dhw extends dfa implements dhv {
   public dhw(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhw> a();

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjh $$4 = cjh.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cjh $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dsd $$0) {
      return $$0.i() || $$0.a(awp.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            azd.a($$1, $$2, $$3, new la(li.C, $$0));
         }
      }
   }

   public int b(dsd $$0, dbf $$1, iz $$2) {
      return -16777216;
   }
}

import com.mojang.serialization.MapCodec;

public abstract class dhv extends dez implements dhu {
   public dhv(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhv> a();

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjg $$4 = cjg.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cjg $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dsc $$0) {
      return $$0.i() || $$0.a(awp.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dsc $$0, dby $$1, iz $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            azd.a($$1, $$2, $$3, new la(li.C, $$0));
         }
      }
   }

   public int b(dsc $$0, dbe $$1, iz $$2) {
      return -16777216;
   }
}

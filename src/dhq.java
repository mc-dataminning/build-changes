import com.mojang.serialization.MapCodec;

public abstract class dhq extends deu implements dhp {
   public dhq(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhq> a();

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.I_()) {
         cjb $$4 = cjb.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cjb $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(drx $$0) {
      return $$0.i() || $$0.a(awl.aK) || $$0.k() || $$0.r();
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$3.a(16) == 0) {
         iz $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayy.a($$1, $$2, $$3, new la(lj.C, $$0));
         }
      }
   }

   public int b(drx $$0, daz $$1, iz $$2) {
      return -16777216;
   }
}

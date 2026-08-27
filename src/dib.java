import com.mojang.serialization.MapCodec;

public abstract class dib extends dfc implements dia {
   public dib(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dib> a();

   @Override
   protected void b(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cif $$4 = cif.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cif $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dtc $$0) {
      return $$0.i() || $$0.a(awe.aM) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$3.a(16) == 0) {
         ir $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            ayp.a($$1, $$2, $$3, new ks(lb.B, $$0));
         }
      }
   }

   public int b(dtc $$0, dbg $$1, ir $$2) {
      return -16777216;
   }
}

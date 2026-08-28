import com.mojang.serialization.MapCodec;

public abstract class diu extends dfy implements dit {
   public diu(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diu> a();

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (m($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         cjg $$4 = cjg.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cjg $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dtc $$0) {
      return $$0.i() || $$0.a(awe.aL) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$3.a(16) == 0) {
         jd $$4 = $$2.e();
         if (m($$1.a_($$4))) {
            ays.a($$1, $$2, $$3, new le(lm.C, $$0));
         }
      }
   }

   public int b(dtc $$0, dcc $$1, jd $$2) {
      return -16777216;
   }
}

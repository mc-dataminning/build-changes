import com.mojang.serialization.MapCodec;

public class cud extends cva implements cvd {
   public static final MapCodec<cud> a = b(cud::new);
   protected static final float b = 4.0F;
   protected static final ekn c = cva.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cud> a() {
      return a;
   }

   public cud(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      eju $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.d()).a(arg.at);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         if ($$1 == hx.b && $$2.a(cvc.mZ)) {
            $$3.a($$4, cvc.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(clm.dQ);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dhi $$0, cdu $$1, crg $$2, ht $$3) {
      return $$1.eU().d() instanceof cmu ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(csa $$0, ht $$1) {
      $$0.a($$1.c(), cvc.mZ.o().a(cue.i, dhu.b), 3);
   }
}

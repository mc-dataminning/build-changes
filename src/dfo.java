import com.mojang.serialization.MapCodec;

public abstract class dfo extends dgv {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final eyx h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final eyx b = eyu.a(
      eyu.b(), eyu.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), eyi.e
   );
   protected final kk.a c;

   @Override
   protected abstract MapCodec<? extends dfo> a();

   public dfo(dtz.d $$0, kk.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dua $$0) {
      return 0.0;
   }

   protected boolean a(dua $$0, je $$1, btj $$2) {
      return $$2.dz() < (double)$$1.v() + this.b($$0) && $$2.cO().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      kk $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2) {
      return h;
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   public abstract boolean d(dua var1);

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      je $$4 = dmn.a((dds)$$1, $$2);
      if ($$4 != null) {
         eqa $$5 = dmn.a($$1, $$4);
         if ($$5 != eqc.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eqa $$0) {
      return false;
   }

   protected void a(dua $$0, dds $$1, je $$2, eqa $$3) {
   }
}

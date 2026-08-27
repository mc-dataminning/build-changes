import com.mojang.serialization.MapCodec;

public abstract class ctt extends cva {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ekn h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ekn b = ekk.a(
      ekk.b(), ekk.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), ejy.e
   );
   protected final iy.a c;

   @Override
   protected abstract MapCodec<? extends ctt> a();

   public ctt(dhh.d $$0, iy.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dhi $$0) {
      return 0.0;
   }

   protected boolean a(dhi $$0, ht $$1, bkq $$2) {
      return $$2.du() < (double)$$1.v() + this.b($$0) && $$2.cH().e > (double)$$1.v() + 0.25;
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      iy $$7 = this.c.b().get($$6.d());
      return $$7.interact($$0, $$1, $$2, $$3, $$4, $$6);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2) {
      return h;
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   public abstract boolean d(dhi var1);

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      ht $$4 = dar.a((csa)$$1, $$2);
      if ($$4 != null) {
         ecr $$5 = dar.a($$1, $$4);
         if ($$5 != ect.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ecr $$0) {
      return false;
   }

   protected void a(dhi $$0, csa $$1, ht $$2, ecr $$3) {
   }
}

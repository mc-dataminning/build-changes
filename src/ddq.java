import com.mojang.serialization.MapCodec;

public abstract class ddq extends dex {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ewi h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ewi b = ewf.a(
      ewf.b(), ewf.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), evt.e
   );
   protected final kf.a c;

   @Override
   protected abstract MapCodec<? extends ddq> a();

   public ddq(drz.d $$0, kf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsa $$0) {
      return 0.0;
   }

   protected boolean a(dsa $$0, iz $$1, bss $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      kf $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   public abstract boolean d(dsa var1);

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      iz $$4 = dkp.a((dbw)$$1, $$2);
      if ($$4 != null) {
         ens $$5 = dkp.a($$1, $$4);
         if ($$5 != enu.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(ens $$0) {
      return false;
   }

   protected void a(dsa $$0, dbw $$1, iz $$2, ens $$3) {
   }
}

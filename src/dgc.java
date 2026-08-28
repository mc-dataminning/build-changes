import com.mojang.serialization.MapCodec;

public abstract class dgc extends dhj {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ezm h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ezm b = ezj.a(
      ezj.b(), ezj.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), eyw.e
   );
   protected final kk.a c;

   @Override
   protected abstract MapCodec<? extends dgc> a();

   public dgc(dun.d $$0, kk.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(duo $$0) {
      return 0.0;
   }

   protected boolean a(duo $$0, je $$1, bto $$2) {
      return $$2.dz() < (double)$$1.v() + this.b($$0) && $$2.cO().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      kk $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2) {
      return h;
   }

   @Override
   protected boolean c_(duo $$0) {
      return true;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }

   public abstract boolean d(duo var1);

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      je $$4 = dnb.a((deg)$$1, $$2);
      if ($$4 != null) {
         eqo $$5 = dnb.a($$1, $$4);
         if ($$5 != eqq.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eqo $$0) {
      return false;
   }

   protected void a(duo $$0, deg $$1, je $$2, eqo $$3) {
   }
}

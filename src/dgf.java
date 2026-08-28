import com.mojang.serialization.MapCodec;

public abstract class dgf extends dhm {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ezq h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ezq b = ezn.a(
      ezn.b(), ezn.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), eza.e
   );
   protected final kl.a c;

   @Override
   protected abstract MapCodec<? extends dgf> a();

   public dgf(dur.d $$0, kl.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dus $$0) {
      return 0.0;
   }

   protected boolean a(dus $$0, jf $$1, btr $$2) {
      return $$2.dz() < (double)$$1.v() + this.b($$0) && $$2.cO().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      kl $$7 = this.c.b().get($$0.h());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2) {
      return h;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   public abstract boolean d(dus var1);

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      jf $$4 = dne.a((dej)$$1, $$2);
      if ($$4 != null) {
         eqs $$5 = dne.a($$1, $$4);
         if ($$5 != equ.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(eqs $$0) {
      return false;
   }

   protected void a(dus $$0, dej $$1, jf $$2, eqs $$3) {
   }
}

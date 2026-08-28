import com.mojang.serialization.MapCodec;

public abstract class ddt extends dfa {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ewl h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ewl b = ewi.a(
      ewi.b(), ewi.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), evw.e
   );
   protected final kf.a c;

   @Override
   protected abstract MapCodec<? extends ddt> a();

   public ddt(dsc.d $$0, kf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(dsd $$0) {
      return 0.0;
   }

   protected boolean a(dsd $$0, iz $$1, bsv $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqx a(cuq $$0, dsd $$1, dbz $$2, iz $$3, cmy $$4, bqu $$5, evo $$6) {
      kf $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2) {
      return h;
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   public abstract boolean d(dsd var1);

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      iz $$4 = dks.a((dbz)$$1, $$2);
      if ($$4 != null) {
         env $$5 = dks.a($$1, $$4);
         if ($$5 != enx.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(env $$0) {
      return false;
   }

   protected void a(dsd $$0, dbz $$1, iz $$2, env $$3) {
   }
}

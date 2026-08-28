import com.mojang.serialization.MapCodec;

public abstract class ddn extends deu {
   private static final int d = 2;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = 2;
   protected static final int a = 4;
   private static final ewf h = a(2.0, 4.0, 2.0, 14.0, 16.0, 14.0);
   protected static final ewf b = ewc.a(
      ewc.b(), ewc.a(a(0.0, 0.0, 4.0, 16.0, 3.0, 12.0), a(4.0, 0.0, 0.0, 12.0, 3.0, 16.0), a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0), h), evq.e
   );
   protected final kf.a c;

   @Override
   protected abstract MapCodec<? extends ddn> a();

   public ddn(drw.d $$0, kf.a $$1) {
      super($$0);
      this.c = $$1;
   }

   protected double b(drx $$0) {
      return 0.0;
   }

   protected boolean a(drx $$0, iz $$1, bsp $$2) {
      return $$2.dw() < (double)$$1.v() + this.b($$0) && $$2.cK().e > (double)$$1.v() + 0.25;
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      kf $$7 = this.c.b().get($$0.g());
      return $$7.interact($$1, $$2, $$3, $$4, $$5, $$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2) {
      return h;
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   public abstract boolean d(drx var1);

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      iz $$4 = dkm.a((dbt)$$1, $$2);
      if ($$4 != null) {
         enp $$5 = dkm.a($$1, $$4);
         if ($$5 != enr.a && this.a($$5)) {
            this.a($$0, $$1, $$2, $$5);
         }
      }
   }

   protected boolean a(enp $$0) {
      return false;
   }

   protected void a(drx $$0, dbt $$1, iz $$2, enp $$3) {
   }
}

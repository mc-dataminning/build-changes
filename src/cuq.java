import com.mojang.serialization.MapCodec;

public abstract class cuq extends cva {
   protected static final int a = 2;
   protected static final ekn b = cva.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cuq(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cuq> a();

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !this.a($$0, $$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return a($$1, $$2.d(), hx.b);
   }
}

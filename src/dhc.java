import com.mojang.serialization.MapCodec;

public class dhc extends dey {
   public static final MapCodec<dhc> a = b(dhc::new);
   protected static final ewj b = dhv.c;

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   protected dhc(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   public dsb a(cxz $$0) {
      return !this.o().a((dca)$$0.q(), $$0.a()) ? dey.a(this.o(), dfa.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      dhv.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dhx;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}

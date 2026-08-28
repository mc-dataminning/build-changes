import com.mojang.serialization.MapCodec;

public class dhf extends dfb {
   public static final MapCodec<dhf> a = b(dhf::new);
   protected static final ewm b = dhy.c;

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   protected dhf(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dse $$0) {
      return true;
   }

   @Override
   public dse a(cyc $$0) {
      return !this.o().a((dcd)$$0.q(), $$0.a()) ? dfb.a(this.o(), dfd.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == je.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      dhy.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      dse $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dia;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}

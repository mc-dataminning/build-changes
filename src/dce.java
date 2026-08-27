import com.mojang.serialization.MapCodec;

public class dce extends daa {
   public static final MapCodec<dce> a = b(dce::new);
   protected static final eqk b = dcx.c;

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   protected dce(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   public dmz a(css $$0) {
      return !this.o().a((cxc)$$0.q(), $$0.a()) ? daa.a(this.o(), dac.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      dcx.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dcz;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}

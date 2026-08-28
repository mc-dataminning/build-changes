import com.mojang.serialization.MapCodec;

public class dhm extends dfi {
   public static final MapCodec<dhm> a = b(dhm::new);
   protected static final exa b = dif.c;

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   protected dhm(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsl $$0) {
      return true;
   }

   @Override
   public dsl a(cxn $$0) {
      return !this.o().a((dcj)$$0.q(), $$0.a()) ? dfi.a(this.o(), dfk.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      dif.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dih;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}

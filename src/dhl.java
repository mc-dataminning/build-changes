import com.mojang.serialization.MapCodec;

public class dhl extends dfh {
   public static final MapCodec<dhl> a = b(dhl::new);
   protected static final ewy b = die.c;

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   public dsk a(cxm $$0) {
      return !this.o().a((dci)$$0.q(), $$0.a()) ? dfh.a(this.o(), dfj.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      die.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      dsk $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dig;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}

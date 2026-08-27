import com.mojang.serialization.MapCodec;

public class dhh extends dfc {
   public static final MapCodec<dhh> a = b(dhh::new);
   protected static final exn b = dic.c;

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   protected dhh(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   public dtc a(cyd $$0) {
      return !this.n().a((dcd)$$0.q(), $$0.a()) ? dfc.a(this.n(), ($$0.q().z_() ? dfe.n : dfe.m).n(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      dic.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof die;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return b;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}

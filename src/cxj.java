import com.mojang.serialization.MapCodec;

public class cxj extends cvf {
   public static final MapCodec<cxj> a = b(cxj::new);
   protected static final eks b = cyc.c;

   @Override
   public MapCodec<cxj> a() {
      return a;
   }

   protected cxj(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public dhn a(cnw $$0) {
      return !this.o().a((csi)$$0.q(), $$0.a()) ? cvf.a(this.o(), cvh.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      cyc.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cye;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return b;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}

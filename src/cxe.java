import com.mojang.serialization.MapCodec;

public class cxe extends cva {
   public static final MapCodec<cxe> a = b(cxe::new);
   protected static final ekn b = cxx.c;

   @Override
   public MapCodec<cxe> a() {
      return a;
   }

   protected cxe(dhh.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public dhi a(cnr $$0) {
      return !this.o().a((csd)$$0.q(), $$0.a()) ? cva.a(this.o(), cvc.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      cxx.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cxz;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}

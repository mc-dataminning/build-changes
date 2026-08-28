import com.mojang.serialization.MapCodec;

public class dhj extends dff {
   public static final MapCodec<dhj> a = b(dhj::new);
   protected static final ews b = dic.c;

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   protected dhj(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   public dsh a(cxk $$0) {
      return !this.o().a((dcg)$$0.q(), $$0.a()) ? dff.a(this.o(), dfh.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      dic.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof die;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}

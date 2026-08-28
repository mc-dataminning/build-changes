import com.mojang.serialization.MapCodec;

public class dic extends dfy {
   public static final MapCodec<dic> a = b(dic::new);
   protected static final exv b = div.c;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   public dtc a(cyd $$0) {
      return !this.o().a((dcz)$$0.q(), $$0.a()) ? dfy.a(this.o(), dga.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      div.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dix;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}

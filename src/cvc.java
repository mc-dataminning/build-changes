import com.mojang.serialization.MapCodec;

public class cvc extends cvz implements cwc {
   public static final MapCodec<cvc> a = b(cvc::new);
   protected static final float b = 4.0F;
   protected static final elu c = cvz.a(4.0, 0.0, 4.0, 12.0, 12.0, 12.0);

   @Override
   public MapCodec<cvc> a() {
      return a;
   }

   public cvc(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      elb $$4 = $$0.n($$1, $$2);
      return c.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$3.a(3) == 0 && $$1.t($$2.c()) && $$1.b($$2.c(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.d()).a(arr.at);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!$$0.a($$3, $$4)) {
         return cwb.a.o();
      } else {
         if ($$1 == ia.b && $$2.a(cwb.mZ)) {
            $$3.a($$4, cwb.mZ.o(), 2);
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(cmk.dQ);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      this.a($$0, $$2);
   }

   @Override
   public float a(dip $$0, cer $$1, cse $$2, hv $$3) {
      return $$1.eT().d() instanceof cns ? 1.0F : super.a($$0, $$1, $$2, $$3);
   }

   protected void a(csy $$0, hv $$1) {
      $$0.a($$1.c(), cwb.mZ.o().a(cvd.i, djb.b), 3);
   }
}

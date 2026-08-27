import com.mojang.serialization.MapCodec;

public class cyd extends cvz {
   public static final MapCodec<cyd> a = b(cyd::new);
   protected static final elu b = cyw.c;

   @Override
   public MapCodec<cyd> a() {
      return a;
   }

   protected cyd(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public dip a(coq $$0) {
      return !this.o().a((ctb)$$0.q(), $$0.a()) ? cvz.a(this.o(), cwb.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      cyw.a(null, $$0, $$1, $$2);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cyy;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;

public class ddk extends cvz {
   public static final MapCodec<ddk> a = b(ddk::new);
   protected static final elu b = cvz.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<ddk> a() {
      return a;
   }

   public ddk(dio.d $$0) {
      super($$0);
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      return elr.b();
   }

   @Override
   public elu c(dip $$0, cse $$1, hv $$2, elg $$3) {
      return elr.b();
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      cwf.b($$1, $$2.c(), $$0);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.b && $$2.a(cwb.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public float d(dip $$0, cse $$1, hv $$2) {
      return 0.2F;
   }
}

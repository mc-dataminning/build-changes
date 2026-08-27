import com.mojang.serialization.MapCodec;

public class dcl extends cva {
   public static final MapCodec<dcl> a = b(dcl::new);
   protected static final ekn b = cva.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public dcl(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      return ekk.b();
   }

   @Override
   public ekn c(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.b();
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      cvg.b($$1, $$2.c(), $$0);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && $$2.a(cvc.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public float d(dhi $$0, crg $$1, ht $$2) {
      return 0.2F;
   }
}

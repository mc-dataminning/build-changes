import com.mojang.serialization.MapCodec;

public class czs extends cva {
   public static final MapCodec<czs> a = b(czs::new);
   private static final int b = 20;

   @Override
   public MapCodec<czs> a() {
      return a;
   }

   public czs(dhh.d $$0) {
      super($$0);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, bkq $$3) {
      if (!$$3.bT() && $$3 instanceof blg && !cpw.j((blg)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}

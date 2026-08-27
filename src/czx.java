import com.mojang.serialization.MapCodec;

public class czx extends cvf {
   public static final MapCodec<czx> a = b(czx::new);
   private static final int b = 20;

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   public czx(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
      if (!$$3.bT() && $$3 instanceof bll && !cqb.j((bll)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      cvl.b($$1, $$2.c(), $$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$1 == ib.b && $$2.a(cvh.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}

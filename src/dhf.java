import com.mojang.serialization.MapCodec;

public class dhf extends dds {
   public static final MapCodec<dhf> a = b(dhf::new);

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dna.d $$0) {
      super($$0);
   }

   @Override
   public void a(cxb $$0, dnb $$1, ib $$2, box $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ah().k());
      }
   }

   @Override
   public void a(cwh $$0, box $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(box $$0) {
      ept $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bpp ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, box $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}

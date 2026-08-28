import com.mojang.serialization.MapCodec;

public class dui extends dmm {
   public static final MapCodec<dui> a = b(dui::new);
   private static final ffr b = dmm.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dui> a() {
      return a;
   }

   public dui(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected ffr b_(eao $$0, din $$1, iv $$2) {
      return ffo.b();
   }

   @Override
   protected ffr c(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.b();
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      dmt.b($$1, $$2.d(), $$0);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.b && $$6.a(dmo.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }

   @Override
   protected float c(eao $$0, din $$1, iv $$2) {
      return 0.2F;
   }
}

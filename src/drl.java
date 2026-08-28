import com.mojang.serialization.MapCodec;

public class drl extends dmm {
   public static final MapCodec<drl> a = b(drl::new);
   private static final int b = 20;

   @Override
   public MapCodec<drl> a() {
      return a;
   }

   public drl(ean.d $$0) {
      super($$0);
   }

   @Override
   public void a(djh $$0, iv $$1, eao $$2, bwi $$3) {
      if (!$$3.cc() && $$3 instanceof bxj) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}

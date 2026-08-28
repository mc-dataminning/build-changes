import com.mojang.serialization.MapCodec;

public class dmy extends dmm {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final ebo b = ebe.az;
   public static final int c = 15;
   private static final ffr d = dmm.b(14.0, 0.0, 16.0);
   private static final ffr e = dmm.b(14.0, 0.0, 15.0);
   private static final int f = 3;
   private static final int g = 8;
   private static final double h = 0.1;
   private static final double i = 0.25;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   protected dmy(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      iv $$4 = $$2.d();
      if ($$1.v($$4)) {
         int $$5 = 1;
         int $$6 = $$0.c(b);

         while ($$1.a_($$2.c($$5)).a(this)) {
            if (++$$5 == 3 && $$6 == 15) {
               return;
            }
         }

         if ($$6 == 8 && this.a(this.m(), $$1, $$2.d())) {
            double $$7 = $$5 >= 3 ? 0.25 : 0.1;
            if ($$3.j() <= $$7) {
               $$1.b($$4, dmo.eh.m());
            }
         } else if ($$6 == 15 && $$5 < 3) {
            $$1.b($$4, this.m());
            eao $$8 = $$0.b(b, Integer.valueOf(0));
            $$1.a($$2, $$8, 260);
            $$1.a($$8, $$4, this, null, false);
         }

         if ($$6 < 15) {
            $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
         }
      }
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return e;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      for (jb $$3 : jb.c.a) {
         eao $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axh.b)) {
            return false;
         }
      }

      eao $$5 = $$1.a_($$2.e());
      return ($$5.a(dmo.eg) || $$5.a(axc.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}

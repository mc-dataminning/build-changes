import com.mojang.serialization.MapCodec;

public class duw extends dmm {
   public static final MapCodec<duw> a = b(duw::new);
   public static final ebo b = ebe.az;
   private static final ffr c = dmm.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<duw> a() {
      return a;
   }

   protected duw(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return c;
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.v($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 260);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 260);
            }
         }
      }
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
      eao $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axc.ah) || $$3.a(axc.J)) {
            iv $$4 = $$2.e();

            for (jb $$5 : jb.c.a) {
               eao $$6 = $$1.a_($$4.a($$5));
               ewv $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axh.a) || $$6.a(dmo.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}

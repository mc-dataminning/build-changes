import com.mojang.serialization.MapCodec;

public class dui extends dma {
   public static final MapCodec<dui> a = b(dui::new);
   public static final eaz b = eap.az;
   private static final ffc c = dma.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dui> a() {
      return a;
   }

   protected dui(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return c;
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dzz $$0, arq $$1, iu $$2, azv $$3) {
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
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axc.ah) || $$3.a(axc.J)) {
            iu $$4 = $$2.e();

            for (ja $$5 : ja.c.a) {
               dzz $$6 = $$1.a_($$4.a($$5));
               ewg $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axh.a) || $$6.a(dmc.ll)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }
}

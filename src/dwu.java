import com.mojang.serialization.MapCodec;

public class dwu extends dmm {
   public static final MapCodec<dwu> a = b(dwu::new);

   @Override
   public MapCodec<dwu> a() {
      return a;
   }

   protected dwu(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if ($$1.B_().i()) {
         $$1.a($$2, dmo.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awn.Dp, awo.e, 1.0F, (1.0F + $$1.C_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      jb $$4 = jb.b($$3);
      if ($$4 != jb.b) {
         iv $$5 = $$2.a($$4);
         eao $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jb.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jb.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jb.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jb.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(ly.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}

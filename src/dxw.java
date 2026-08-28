import com.mojang.serialization.MapCodec;

public class dxw extends dno {
   public static final MapCodec<dxw> a = b(dxw::new);

   @Override
   public MapCodec<dxw> a() {
      return a;
   }

   protected dxw(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if ($$1.F_().i()) {
         $$1.a($$2, dnq.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awy.Dp, awz.e, 1.0F, (1.0F + $$1.G_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bai $$3) {
      jc $$4 = jc.b($$3);
      if ($$4 != jc.b) {
         iw $$5 = $$2.a($$4);
         ebq $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jc.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jc.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jc.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jc.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lz.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}

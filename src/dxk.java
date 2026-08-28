import com.mojang.serialization.MapCodec;

public class dxk extends dnc {
   public static final MapCodec<dxk> a = b(dxk::new);

   @Override
   public MapCodec<dxk> a() {
      return a;
   }

   protected dxk(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if ($$1.F_().i()) {
         $$1.a($$2, dne.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awp.Dp, awq.e, 1.0F, (1.0F + $$1.G_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      jb $$4 = jb.b($$3);
      if ($$4 != jb.b) {
         iv $$5 = $$2.a($$4);
         ebe $$6 = $$1.a_($$5);
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

import com.mojang.serialization.MapCodec;

public class dwf extends dma {
   public static final MapCodec<dwf> a = b(dwf::new);

   @Override
   public MapCodec<dwf> a() {
      return a;
   }

   protected dwf(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if ($$1.B_().i()) {
         $$1.a($$2, dmc.aV.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awn.Dm, awo.e, 1.0F, (1.0F + $$1.C_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      ja $$4 = ja.b($$3);
      if ($$4 != ja.b) {
         iu $$5 = $$2.a($$4);
         dzz $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == ja.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == ja.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == ja.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == ja.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lx.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}

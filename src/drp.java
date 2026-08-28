import com.mojang.serialization.MapCodec;

public class drp extends dhy {
   public static final MapCodec<drp> a = b(drp::new);

   @Override
   public MapCodec<drp> a() {
      return a;
   }

   protected drp(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if ($$1.D_().i()) {
         $$1.a($$2, dia.aO.m(), 3);
         $$1.c(2009, $$2, 0);
         $$1.a(null, $$2, awk.Cp, awl.e, 1.0F, (1.0F + $$1.E_().i() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      jl $$4 = jl.b($$3);
      if ($$4 != jl.b) {
         jg $$5 = $$2.a($$4);
         dvd $$6 = $$1.a_($$5);
         if (!$$0.t() || !$$6.c($$1, $$5, $$4.g())) {
            double $$7 = (double)$$2.u();
            double $$8 = (double)$$2.v();
            double $$9 = (double)$$2.w();
            if ($$4 == jl.a) {
               $$8 -= 0.05;
               $$7 += $$3.j();
               $$9 += $$3.j();
            } else {
               $$8 += $$3.j() * 0.8;
               if ($$4.o() == jl.a.a) {
                  $$9 += $$3.j();
                  if ($$4 == jl.f) {
                     $$7++;
                  } else {
                     $$7 += 0.05;
                  }
               } else {
                  $$7 += $$3.j();
                  if ($$4 == jl.d) {
                     $$9++;
                  } else {
                     $$9 += 0.05;
                  }
               }
            }

            $$1.a(lq.l, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }
}

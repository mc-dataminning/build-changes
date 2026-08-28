import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djw extends dgv implements dnc {
   public static final MapCodec<djw> a = b(djw::new);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(dun.d $$0) {
      super($$0);
   }

   @Override
   public drs a(je $$0, duo $$1) {
      return new dtk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drs> drt<T> a(deg $$0, duo $$1, dru<T> $$2) {
      return a($$2, dru.v, $$0.B ? dtk::a : dtk::b);
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      drs $$4 = $$1.c_($$2);
      if ($$4 instanceof dtk) {
         int $$5 = ((dtk)$$4).f();

         for (int $$6 = 0; $$6 < $$5; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j();
            double $$9 = (double)$$2.w() + $$3.j();
            double $$10 = ($$3.j() - 0.5) * 0.5;
            double $$11 = ($$3.j() - 0.5) * 0.5;
            double $$12 = ($$3.j() - 0.5) * 0.5;
            int $$13 = $$3.a(2) * 2 - 1;
            if ($$3.h()) {
               $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$13;
               $$12 = (double)($$3.i() * 2.0F * (float)$$13);
            } else {
               $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$13;
               $$10 = (double)($$3.i() * 2.0F * (float)$$13);
            }

            $$1.a(ln.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return cvp.k;
   }

   @Override
   protected boolean a(duo $$0, eqo $$1) {
      return false;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3.o(false) && !$$1.B && $$1.c_($$2) instanceof dtk $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dtk.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public ern a(arh $$0, bto $$1, je $$2) {
      if ($$0.c_($$2) instanceof dtk $$4) {
         eys $$6 = $$4.a($$0, $$2);
         return $$6 != null ? new ern($$0, $$6, a($$1), $$1.dI(), $$1.dK(), ern.c) : null;
      } else {
         return null;
      }
   }

   private static eys a(bto $$0) {
      return $$0 instanceof coy ? new eys(0.0, -1.0, 0.0) : $$0.dv();
   }
}

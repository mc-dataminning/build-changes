import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dji extends dgh implements dmo {
   public static final MapCodec<dji> a = b(dji::new);

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dtz.d $$0) {
      super($$0);
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new dsw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return a($$2, drg.v, $$0.B ? dsw::a : dsw::b);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      dre $$4 = $$1.c_($$2);
      if ($$4 instanceof dsw) {
         int $$5 = ((dsw)$$4).f();

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
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return cvl.k;
   }

   @Override
   protected boolean a(dua $$0, eqa $$1) {
      return false;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3.o(false) && !$$1.B && $$1.c_($$2) instanceof dsw $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dsw.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public eqz a(arg $$0, btj $$1, je $$2) {
      if ($$0.c_($$2) instanceof dsw $$4) {
         eye $$6 = $$4.a($$0, $$2);
         return $$6 != null ? new eqz($$0, $$6, a($$1), $$1.dI(), $$1.dK(), eqz.c) : null;
      } else {
         return null;
      }
   }

   private static eye a(btj $$0) {
      return $$0 instanceof cot ? new eye(0.0, -1.0, 0.0) : $$0.dv();
   }
}

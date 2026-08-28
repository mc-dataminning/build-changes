import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djz extends dgy implements dnf {
   public static final MapCodec<djz> a = b(djz::new);

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   protected djz(dur.d $$0) {
      super($$0);
   }

   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return a($$2, drx.v, $$0.B ? dtn::a : dtn::b);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      drv $$4 = $$1.c_($$2);
      if ($$4 instanceof dtn) {
         int $$5 = ((dtn)$$4).f();

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

            $$1.a(lo.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return cvs.k;
   }

   @Override
   protected boolean a(dus $$0, eqs $$1) {
      return false;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3.o(false) && !$$1.B && $$1.c_($$2) instanceof dtn $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dtn.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public err a(arj $$0, btr $$1, jf $$2) {
      if ($$0.c_($$2) instanceof dtn $$4) {
         eyw $$6 = $$4.a($$0, $$2);
         return $$6 != null ? new err($$0, $$6, a($$1), $$1.dI(), $$1.dK(), err.c) : null;
      } else {
         return null;
      }
   }

   private static eyw a(btr $$0) {
      return $$0 instanceof cpb ? new eyw(0.0, -1.0, 0.0) : $$0.dv();
   }
}

import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cym extends cvl {
   public static final MapCodec<cym> a = b(cym::new);

   @Override
   public MapCodec<cym> a() {
      return a;
   }

   protected cym(dio.d $$0) {
      super($$0);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.v, $$0.B ? dhs::a : dhs::b);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      dgd $$4 = $$1.c_($$2);
      if ($$4 instanceof dhs) {
         int $$5 = ((dhs)$$4).g();

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

            $$1.a(jv.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return cmh.f;
   }

   @Override
   public boolean a(dip $$0, edy $$1) {
      return false;
   }
}

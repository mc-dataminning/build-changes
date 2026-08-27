import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbf extends cye {
   public static final MapCodec<dbf> a = b(dbf::new);

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   protected dbf(dli.d $$0) {
      super($$0);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dkm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dix> diy<T> a(cvr $$0, dlj $$1, diz<T> $$2) {
      return a($$2, diz.v, $$0.B ? dkm::a : dkm::b);
   }

   @Override
   public void a(dlj $$0, cvr $$1, hz $$2, awp $$3) {
      dix $$4 = $$1.c_($$2);
      if ($$4 instanceof dkm) {
         int $$5 = ((dkm)$$4).g();

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

            $$1.a(jz.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return cpd.h;
   }

   @Override
   protected boolean a(dlj $$0, egv $$1) {
      return false;
   }
}

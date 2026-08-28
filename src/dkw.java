import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dkw extends dhv implements dob {
   public static final MapCodec<dkw> a = b(dkw::new);

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   protected dkw(dvn.d $$0) {
      super($$0);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new duj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return a($$2, dst.v, $$0.C ? duj::a : duj::b);
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      dsr $$4 = $$1.c_($$2);
      if ($$4 instanceof duj) {
         int $$5 = ((duj)$$4).f();

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

            $$1.a(ls.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return cwf.k;
   }

   @Override
   protected boolean a(dvo $$0, ern $$1) {
      return false;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof duj $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         duj.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public esm a(arq $$0, bui $$1, jh $$2) {
      if ($$0.c_($$2) instanceof duj $$4) {
         ezr $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cpu
               ? new esm($$0, $$6, ezr.c, 0.0F, 0.0F, Set.of(), esm.c)
               : new esm($$0, $$6, ezr.c, 0.0F, 0.0F, bvs.a(bvs.l, bvs.k), esm.c);
         }
      } else {
         return null;
      }
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dld extends dic implements doi {
   public static final MapCodec<dld> a = b(dld::new);

   @Override
   public MapCodec<dld> a() {
      return a;
   }

   protected dld(dvu.d $$0) {
      super($$0);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$2, dta.v, $$0.C ? duq::a : duq::b);
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      dsy $$4 = $$1.c_($$2);
      if ($$4 instanceof duq) {
         int $$5 = ((duq)$$4).f();

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
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return cwm.k;
   }

   @Override
   protected boolean a(dvv $$0, eru $$1) {
      return false;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof duq $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         duq.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public est a(arp $$0, bul $$1, jh $$2) {
      if ($$0.c_($$2) instanceof duq $$4) {
         ezy $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cpx
               ? new est($$0, $$6, ezy.c, 0.0F, 0.0F, Set.of(), est.c)
               : new est($$0, $$6, ezy.c, 0.0F, 0.0F, bvv.a(bvv.l, bvv.k), est.c);
         }
      } else {
         return null;
      }
   }
}

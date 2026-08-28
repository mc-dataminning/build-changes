import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dly extends diw implements dph {
   public static final MapCodec<dly> a = b(dly::new);

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   protected dly(dwu.d $$0) {
      super($$0);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dvq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return a($$2, dtz.w, $$0.C ? dvq::a : dvq::b);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      dtx $$4 = $$1.c_($$2);
      if ($$4 instanceof dvq) {
         int $$5 = ((dvq)$$4).f();

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

            $$1.a(lt.ae, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return cwn.j;
   }

   @Override
   protected boolean a(dwv $$0, esw $$1) {
      return false;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof dvq $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dvq.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public etx a(arc $$0, buj $$1, ji $$2) {
      if ($$0.c_($$2) instanceof dvq $$4) {
         fay $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cpy
               ? new etx($$0, $$6, fay.c, 0.0F, 0.0F, Set.of(), etx.c)
               : new etx($$0, $$6, fay.c, 0.0F, 0.0F, bvt.a(bvt.l, bvt.k), etx.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected dpv a_(dwv $$0) {
      return dpv.a;
   }
}

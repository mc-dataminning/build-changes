import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dni extends dkg implements dqr {
   public static final MapCodec<dni> a = b(dni::new);

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   protected dni(dyl.d $$0) {
      super($$0);
   }

   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dxh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return a($$2, dvn.w, $$0.C ? dxh::a : dxh::b);
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      dvl $$4 = $$1.c_($$2);
      if ($$4 instanceof dxh) {
         int $$5 = ((dxh)$$4).f();

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

            $$1.a(lv.af, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return cxy.k;
   }

   @Override
   protected boolean a(dym $$0, eus $$1) {
      return false;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$3.n(false) && !$$1.C && $$1.c_($$2) instanceof dxh $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dxh.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public evt a(arn $$0, bvs $$1, jj $$2) {
      if ($$0.c_($$2) instanceof dxh $$4) {
         fcu $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof crl
               ? new evt($$0, $$6, fcu.c, 0.0F, 0.0F, Set.of(), evt.c)
               : new evt($$0, $$6, fcu.c, 0.0F, 0.0F, bxf.a(bxf.l, bxf.k), evt.c);
         }
      } else {
         return null;
      }
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }
}

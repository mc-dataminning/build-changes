import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfr extends dcq {
   public static final MapCodec<dfr> a = b(dfr::new);

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   protected dfr(dqg.d $$0) {
      super($$0);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.v, $$0.B ? dpc::a : dpc::b);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      dnm $$4 = $$1.c_($$2);
      if ($$4 instanceof dpc) {
         int $$5 = ((dpc)$$4).f();

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

            $$1.a(kx.Z, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return csz.i;
   }

   @Override
   protected boolean a(dqh $$0, elz $$1) {
      return false;
   }
}

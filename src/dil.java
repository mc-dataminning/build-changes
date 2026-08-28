import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dil extends dfk implements dlr {
   public static final MapCodec<dil> a = b(dil::new);
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dry($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.v, $$0.B ? dry::a : dry::b);
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      dqh $$4 = $$1.c_($$2);
      if ($$4 instanceof dry) {
         int $$5 = ((dry)$$4).f();

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

            $$1.a(lm.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return cuq.l;
   }

   @Override
   protected boolean a(dtc $$0, epb $$1) {
      return false;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3.cx() && !$$1.B && $$1.c_($$2) instanceof dry $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         dry.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public eqa a(aqu $$0, bsr $$1, jd $$2) {
      if ($$0.c_($$2) instanceof dry $$4) {
         exa $$6 = $$4.a($$0, $$2);
         return $$6 != null ? new eqa($$0, $$6, a($$1), $$1.dF(), $$1.dH(), eqa.c) : null;
      } else {
         return null;
      }
   }

   private static exa a(bsr $$0) {
      return $$0 instanceof cnz ? new exa(0.0, -1.0, 0.0) : $$0.ds();
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Set;
import javax.annotation.Nullable;

public class dkr extends dhq implements dnw {
   public static final MapCodec<dkr> a = b(dkr::new);

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dvi.d $$0) {
      super($$0);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new due($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$2, dso.v, $$0.C ? due::a : due::b);
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      dsm $$4 = $$1.c_($$2);
      if ($$4 instanceof due) {
         int $$5 = ((due)$$4).f();

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

            $$1.a(lr.ac, $$7, $$8, $$9, $$10, $$11, $$12);
         }
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return cwb.k;
   }

   @Override
   protected boolean a(dvj $$0, erj $$1) {
      return false;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3.o(false) && !$$1.C && $$1.c_($$2) instanceof due $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         due.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public esi a(arn $$0, bue $$1, jh $$2) {
      if ($$0.c_($$2) instanceof due $$4) {
         ezn $$6 = $$4.a($$0, $$2);
         if ($$6 == null) {
            return null;
         } else {
            return $$1 instanceof cpq
               ? new esi($$0, $$6, ezn.c, 0.0F, 0.0F, Set.of(), esi.c)
               : new esi($$0, $$6, ezn.c, 0.0F, 0.0F, bvo.a(bvo.l, bvo.k), esi.c);
         }
      } else {
         return null;
      }
   }
}

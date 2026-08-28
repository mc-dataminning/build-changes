import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dij extends dfi implements dlp {
   public static final MapCodec<dij> a = b(dij::new);
   private static final Logger b = LogUtils.getLogger();
   private static final int c = 10;

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   protected dij(dsz.d $$0) {
      super($$0);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.v, $$0.B ? drw::a : drw::b);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      dqf $$4 = $$1.c_($$2);
      if ($$4 instanceof drw) {
         int $$5 = ((drw)$$4).f();

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
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return cuo.l;
   }

   @Override
   protected boolean a(dta $$0, eox $$1) {
      return false;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$3.cx() && !$$1.B && $$1.c_($$2) instanceof drw $$5 && !$$5.c()) {
         $$3.a(this, $$2);
         drw.c($$1, $$2, $$0, $$5);
      }
   }

   @Nullable
   @Override
   public epw a(aqt $$0, bsq $$1, jd $$2) {
      if ($$0.c_($$2) instanceof drw $$4) {
         eww $$6 = $$4.a($$0, $$2);
         return $$6 != null ? new epw($$0, $$6, $$1.dt(), $$1.dG(), $$1.dI()) : null;
      } else {
         return null;
      }
   }
}

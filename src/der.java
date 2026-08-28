import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class der extends dfi {
   public static final dtu a = djs.aE;
   public static final dtr b = dtq.r;

   protected der(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ji.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected abstract MapCodec<? extends der> a();

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         this.a($$1, $$2, $$3);
         return bqq.c;
      }
   }

   protected abstract void a(dcu var1, jd var2, cmv var3);

   @Override
   public dta a(cyb $$0) {
      return this.o().a(a, $$0.g().g());
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dpt) {
            if ($$1 instanceof aqt) {
               bqm.a($$1, $$2, (dpt)$$5);
               ((dpt)$$5).a((aqt)$$1, eww.b($$2));
            }

            super.a($$0, $$1, $$2, $$3, $$4);
            $$1.c($$2, this);
         } else {
            super.a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a, b);
   }

   @Nullable
   protected static <T extends dqf> dqg<T> a(dcu $$0, dqh<T> $$1, dqh<? extends dpt> $$2) {
      return $$0.B ? null : a($$1, $$2, dpt::a);
   }
}

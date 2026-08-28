import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfg extends dfw implements dmy {
   public static final dtr d = dtq.C;
   private static final exp a = dfw.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dfg(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dfg> a();

   protected void a(dta $$0, dcv $$1, jd $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dta $$0, dca $$1, jd $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ji $$3 : ji.values()) {
            if ($$1.b_($$2.a($$3)).a(awj.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return this.o().a(d, Boolean.valueOf($$1.a(awj.a) && $$1.e() == 8));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return a;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return $$1 == ji.a && !this.a($$0, (dcx)$$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ji.b);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(d);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }
}

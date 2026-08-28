import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfc extends dfi {
   public static final MapCodec<dfc> a = b(dfc::new);
   public static final dtu b = dtq.P;
   public static final dtr c = dtq.u;

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   public dfc(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dpy) {
            $$3.a((dpy)$$5);
            $$3.a(avy.ar);
            clm.a($$3, true);
         }

         return bqq.c;
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      dqf $$4 = $$1.c_($$2);
      if ($$4 instanceof dpy) {
         ((dpy)$$4).l();
      }
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dpy($$0, $$1);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
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
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(b, $$0.d().g());
   }
}

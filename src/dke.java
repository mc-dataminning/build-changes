import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dke extends dcv {
   public static final MapCodec<dke> a = b(dke::new);
   public static final int b = 8;
   public static final dqy c = dqo.aF;
   protected static final ety[] d = new ety[]{
      etv.a(),
      dcv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   protected dke(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected ety c(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected float d(dpy $$0, cza $$1, im $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.d());
      if ($$3.a(avo.ci)) {
         return false;
      } else {
         return $$3.a(avo.cj) ? true : dcv.a($$3.k($$1, $$2.d()), ir.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.a(dad.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dpy $$0, cvl $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.p()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ir.b : true;
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }
}

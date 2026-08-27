import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dcf extends dcv implements djw {
   public static final dqp d = dqo.C;
   private static final ety a = dcv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   protected dcf(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dcf> a();

   protected void a(dpy $$0, czv $$1, im $$2) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this, 60 + $$1.E_().a(40));
      }
   }

   protected static boolean e(dpy $$0, cza $$1, im $$2) {
      if ($$0.c(d)) {
         return true;
      } else {
         for (ir $$3 : ir.values()) {
            if ($$1.b_($$2.a($$3)).a(avt.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return this.n().a(d, Boolean.valueOf($$1.a(avt.a) && $$1.e() == 8));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return a;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return $$1 == ir.a && !this.a($$0, (czx)$$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      return $$1.a_($$3).d($$1, $$3, ir.b);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }
}

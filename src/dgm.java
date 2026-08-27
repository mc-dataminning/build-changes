import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgm extends dcv implements djw {
   public static final MapCodec<dgm> a = b(dgm::new);
   private static final dqp c = dqo.C;
   protected static final ety b = dcv.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   protected dgm(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = super.a($$0);
      if ($$1 != null) {
         elr $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == els.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.c();
      dpy $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ir.a);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return b;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == ir.b && !this.a($$0, $$3, $$4)) {
         return dcx.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, els.c, els.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}

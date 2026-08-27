import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends dcv implements djw {
   public static final MapCodec<dhc> a = b(dhc::new);
   public static final dqp b = dqo.j;
   public static final dqp c = dqo.C;
   protected static final ety d = etv.a(dcv.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dcv.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final ety e = etv.a(dcv.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dcv.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());

      for (ir $$2 : $$0.f()) {
         if ($$2.o() == ir.a.b) {
            dpy $$3 = this.n().a(b, Boolean.valueOf($$2 == ir.b));
            if ($$3.a((czx)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == els.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      ir $$3 = m($$0).g();
      return dcv.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ir m(dpy $$0) {
      return $$0.c(b) ? ir.a : ir.b;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}

import com.mojang.serialization.MapCodec;
import java.util.OptionalInt;

public class dhf extends dcv implements djw {
   public static final MapCodec<dhf> b = b(dhf::new);
   public static final int c = 7;
   public static final dqy d = dqo.aC;
   public static final dqp e = dqo.v;
   public static final dqp f = dqo.C;
   private static final int a = 1;

   @Override
   public MapCodec<? extends dhf> a() {
      return b;
   }

   public dhf(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(7)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      return etv.a();
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.c(d) == 7 && !$$0.c(e);
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if (this.m($$0)) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   protected boolean m(dpy $$0) {
      return !$$0.c(e) && $$0.c(d) == 7;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      $$1.a($$2, a($$0, $$1, $$2), 3);
   }

   @Override
   protected int g(dpy $$0, cza $$1, im $$2) {
      return 1;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      int $$6 = o($$2) + 1;
      if ($$6 != 1 || $$0.c(d) != $$6) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   private static dpy a(dpy $$0, czv $$1, im $$2) {
      int $$3 = 7;
      im.a $$4 = new im.a();

      for (ir $$5 : ir.values()) {
         $$4.a($$2, $$5);
         $$3 = Math.min($$3, o($$1.a_($$4)) + 1);
         if ($$3 == 1) {
            break;
         }
      }

      return $$0.a(d, Integer.valueOf($$3));
   }

   private static int o(dpy $$0) {
      return n($$0).orElse(7);
   }

   public static OptionalInt n(dpy $$0) {
      if ($$0.a(avo.t)) {
         return OptionalInt.of(0);
      } else {
         return $$0.b(d) ? OptionalInt.of($$0.c(d)) : OptionalInt.empty();
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(f) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      if ($$1.r($$2.c())) {
         if ($$3.a(15) == 1) {
            im $$4 = $$2.d();
            dpy $$5 = $$1.a_($$4);
            if (!$$5.p() || !$$5.d($$1, $$4, ir.b)) {
               axz.a($$1, $$2, $$3, kw.l);
            }
         }
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      dpy $$2 = this.n().a(e, Boolean.valueOf(true)).a(f, Boolean.valueOf($$1.a() == els.c));
      return a($$2, $$0.q(), $$0.a());
   }
}

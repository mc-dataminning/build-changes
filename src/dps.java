import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dps extends dey {
   public static final MapCodec<dps> b = b(dps::new);
   public static final dqw<dra> c = dqo.bg;
   public static final dqp d = dqo.x;
   public static final float e = 4.0F;
   protected static final ety f = dcv.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ety g = dcv.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ety h = dcv.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ety i = dcv.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ety j = dcv.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ety k = dcv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final ety o = dcv.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ety F = dcv.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ety G = dcv.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ety H = dcv.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ety I = dcv.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ety J = dcv.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ety K = dcv.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ety L = dcv.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ety M = dcv.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ety N = dcv.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ety O = dcv.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ety P = dcv.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ety[] Q = a(true);
   private static final ety[] R = a(false);

   @Override
   protected MapCodec<dps> a() {
      return b;
   }

   private static ety[] a(boolean $$0) {
      return Arrays.stream(ir.values()).map($$1 -> a($$1, $$0)).toArray(ety[]::new);
   }

   private static ety a(ir $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return etv.a(k, $$1 ? L : F);
         case b:
            return etv.a(j, $$1 ? K : o);
         case c:
            return etv.a(i, $$1 ? N : H);
         case d:
            return etv.a(h, $$1 ? M : G);
         case e:
            return etv.a(g, $$1 ? P : J);
         case f:
            return etv.a(f, $$1 ? O : I);
      }
   }

   public dps(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ir.c).a(c, dra.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dpy $$0, dpy $$1) {
      dcv $$2 = $$0.c(c) == dra.a ? dcx.by : dcx.br;
      return $$1.a($$2) && $$1.c(dpr.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.B && $$3.gb().d) {
         im $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         im $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(dcx.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if ($$0.a((czx)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return new csd($$2.c(c) == dra.b ? dcx.br : dcx.by);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}

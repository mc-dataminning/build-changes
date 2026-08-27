import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddb extends dcv implements ddc {
   public static final MapCodec<ddb> a = b(ddb::new);
   public static final dqp b = dqo.e;
   private static final int c = 5;

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ddb(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, bql $$3) {
      dpy $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqe $$5 = (aqe)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(kw.aj, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(kw.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected elr c_(dpy $$0) {
      return els.c.a(false);
   }

   public static void b(czv $$0, im $$1, dpy $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(czv $$0, im $$1, dpy $$2, dpy $$3) {
      if (m($$2)) {
         dpy $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         im.a $$5 = $$1.j().c(ir.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ir.b);
         }
      }
   }

   private static boolean m(dpy $$0) {
      return $$0.a(dcx.nd) || $$0.a(dcx.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dpy n(dpy $$0) {
      if ($$0.a(dcx.nd)) {
         return $$0;
      } else if ($$0.a(dcx.dW)) {
         return dcx.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dcx.kJ) ? dcx.nd.n().a(b, Boolean.valueOf(true)) : dcx.G.n();
      }
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kw.am, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, auz.da, ava.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kw.an, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kw.an, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, auz.cY, ava.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      $$3.a($$4, els.c, els.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ir.a || $$1 == ir.b && !$$2.a(dcx.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      dpy $$3 = $$1.a_($$2.d());
      return $$3.a(dcx.nd) || $$3.a(dcx.kJ) || $$3.a(dcx.dW);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.a();
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.a;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   public csd a(@Nullable ckl $$0, czv $$1, im $$2, dpy $$3) {
      $$1.a($$2, dcx.a.n(), 11);
      return new csd(csg.qz);
   }

   @Override
   public Optional<auy> as_() {
      return els.c.j();
   }
}

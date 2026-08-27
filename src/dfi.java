import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfi extends dfc implements dfj {
   public static final MapCodec<dfi> a = b(dfi::new);
   public static final dtt b = dts.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public dfi(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      dtc $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            aqt $$5 = (aqt)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lb.ak, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lb.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }

   public static void b(dcb $$0, ir $$1, dtc $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dcb $$0, ir $$1, dtc $$2, dtc $$3) {
      if (m($$2)) {
         dtc $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ir.a $$5 = $$1.j().d(iw.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.d(iw.b);
         }
      }
   }

   private static boolean m(dtc $$0) {
      return $$0.a(dfe.ob) || $$0.a(dfe.al) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dtc n(dtc $$0) {
      if ($$0.a(dfe.ob)) {
         return $$0;
      } else if ($$0.a(dfe.eK)) {
         return dfe.ob.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfe.lH) ? dfe.ob.n().a(b, Boolean.valueOf(true)) : dfe.al.n();
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lb.an, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avo.df, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lb.ao, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lb.ao, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avo.dd, avq.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      $$3.a($$4, epf.c, epf.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == iw.a || $$1 == iw.b && !$$2.a(dfe.ob) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2.d());
      return $$3.a(dfe.ob) || $$3.a(dfe.lH) || $$3.a(dfe.eK);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return exk.a();
   }

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.a;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public cuh a(@Nullable cly $$0, dcb $$1, ir $$2, dtc $$3) {
      $$1.a($$2, dfe.a.n(), 11);
      return new cuh(cuk.rW);
   }

   @Override
   public Optional<avn> as_() {
      return epf.c.j();
   }
}

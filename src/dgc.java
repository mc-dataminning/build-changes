import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgc extends dfw implements dgd {
   public static final MapCodec<dgc> a = b(dgc::new);
   public static final dtr b = dtq.e;
   private static final int c = 5;

   @Override
   public MapCodec<dgc> a() {
      return a;
   }

   public dgc(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      dta $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.m($$0.c(b));
         if (!$$1.B) {
            aqt $$5 = (aqt)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lm.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lm.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.n($$0.c(b));
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected eoy b_(dta $$0) {
      return eoz.c.a(false);
   }

   public static void b(dcv $$0, jd $$1, dta $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dcv $$0, jd $$1, dta $$2, dta $$3) {
      if (m($$2)) {
         dta $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         jd.a $$5 = $$1.j().c(ji.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ji.b);
         }
      }
   }

   private static boolean m(dta $$0) {
      return $$0.a(dfy.nd) || $$0.a(dfy.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dta n(dta $$0) {
      if ($$0.a(dfy.nd)) {
         return $$0;
      } else if ($$0.a(dfy.dW)) {
         return dfy.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfy.kJ) ? dfy.nd.o().a(b, Boolean.valueOf(true)) : dfy.G.o();
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lm.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avo.da, avp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lm.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lm.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avo.cY, avp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      $$3.a($$4, eoz.c, eoz.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ji.a || $$1 == ji.b && !$$2.a(dfy.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      dta $$3 = $$1.a_($$2.d());
      return $$3.a(dfy.nd) || $$3.a(dfy.kJ) || $$3.a(dfy.dW);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return exm.a();
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.a;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   public cuo a(@Nullable cmv $$0, dcv $$1, jd $$2, dta $$3) {
      $$1.a($$2, dfy.a.o(), 11);
      return new cuo(cur.qz);
   }

   @Override
   public Optional<avn> as_() {
      return eoz.c.j();
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvg extends cva implements cvh {
   public static final MapCodec<cvg> a = b(cvg::new);
   public static final dhz b = dhy.e;
   private static final int c = 5;

   @Override
   public MapCodec<cvg> a() {
      return a;
   }

   public cvg(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      dhi $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            ame $$5 = (ame)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(js.ah, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(js.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   public ecs c_(dhi $$0) {
      return ect.c.a(false);
   }

   public static void b(csb $$0, ht $$1, dhi $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(csb $$0, ht $$1, dhi $$2, dhi $$3) {
      if (h($$2)) {
         dhi $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ht.a $$5 = $$1.j().c(hx.b);

         while (h($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(hx.b);
         }
      }
   }

   private static boolean h(dhi $$0) {
      return $$0.a(cvc.nd) || $$0.a(cvc.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dhi n(dhi $$0) {
      if ($$0.a(cvc.nd)) {
         return $$0;
      } else if ($$0.a(cvc.dW)) {
         return cvc.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(cvc.kJ) ? cvc.nd.o().a(b, Boolean.valueOf(true)) : cvc.G.o();
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(js.ak, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqr.ct, aqs.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(js.al, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(js.al, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aqr.cr, aqs.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      $$3.a($$4, ect.c, ect.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == hx.a || $$1 == hx.b && !$$2.a(cvc.nd) && h($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.d());
      return $$3.a(cvc.nd) || $$3.a(cvc.kJ) || $$3.a(cvc.dW);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.a();
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.a;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public clj a(@Nullable cdu $$0, csb $$1, ht $$2, dhi $$3) {
      $$1.a($$2, cvc.a.o(), 11);
      return new clj(clm.qw);
   }

   @Override
   public Optional<aqq> at_() {
      return ect.c.j();
   }
}

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dce extends dby implements dcf {
   public static final MapCodec<dce> a = b(dce::new);
   public static final dpq b = dpp.e;
   private static final int c = 5;

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   public dce(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      doz $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.k($$0.c(b));
         if (!$$1.B) {
            aps $$5 = (aps)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(kl.ak, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(kl.e, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected eks c_(doz $$0) {
      return ekt.c.a(false);
   }

   public static void b(cyy $$0, ib $$1, doz $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(cyy $$0, ib $$1, doz $$2, doz $$3) {
      if (m($$2)) {
         doz $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ib.a $$5 = $$1.j().c(ih.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ih.b);
         }
      }
   }

   private static boolean m(doz $$0) {
      return $$0.a(dca.nd) || $$0.a(dca.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static doz n(doz $$0) {
      if ($$0.a(dca.nd)) {
         return $$0;
      } else if ($$0.a(dca.dW)) {
         return dca.nd.n().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dca.kJ) ? dca.nd.n().a(b, Boolean.valueOf(true)) : dca.G.n();
      }
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(kl.an, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aum.da, aun.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(kl.ao, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(kl.ao, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, aum.cY, aun.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      $$3.a($$4, ekt.c, ekt.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == ih.a || $$1 == ih.b && !$$2.a(dca.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.d());
      return $$3.a(dca.nd) || $$3.a(dca.kJ) || $$3.a(dca.dW);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.a();
   }

   @Override
   protected did b_(doz $$0) {
      return did.a;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b);
   }

   @Override
   public crj a(@Nullable cjt $$0, cyy $$1, ib $$2, doz $$3) {
      $$1.a($$2, dca.a.n(), 11);
      return new crj(crm.qy);
   }

   @Override
   public Optional<aul> at_() {
      return ekt.c.j();
   }
}

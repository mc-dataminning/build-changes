import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dju extends djn implements djv {
   public static final MapCodec<dju> a = b(dju::new);
   public static final dxp b = dxo.i;
   private static final int c = 5;

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   public dju(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      dwy $$4 = $$1.a_($$2.d());
      if ($$4.l()) {
         $$3.l($$0.c(b));
         if (!$$1.C) {
            ard $$5 = (ard)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lt.ao, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lt.d, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected eta b_(dwy $$0) {
      return etb.c.a(false);
   }

   public static void b(dgk $$0, ji $$1, dwy $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dgk $$0, ji $$1, dwy $$2, dwy $$3) {
      if (o($$2)) {
         dwy $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         ji.a $$5 = $$1.k().c(jn.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jn.b);
         }
      }
   }

   private static boolean o(dwy $$0) {
      return $$0.a(djp.nF) || $$0.a(djp.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dwy q(dwy $$0) {
      if ($$0.a(djp.nF)) {
         return $$0;
      } else if ($$0.a(djp.ej)) {
         return djp.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(djp.ll) ? djp.nF.m().b(b, Boolean.valueOf(true)) : djp.J.m();
      }
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lt.ar, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.da, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lt.as, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lt.as, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awa.cY, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      $$2.a($$3, etb.c, etb.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jn.a || $$4 == jn.b && !$$6.a(djp.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.e());
      return $$3.a(djp.nF) || $$3.a(djp.ll) || $$3.a(djp.ej);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.a();
   }

   @Override
   protected dpy a_(dwy $$0) {
      return dpy.a;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   public cwq a(@Nullable coy $$0, dgk $$1, ji $$2, dwy $$3) {
      $$1.a($$2, djp.a.m(), 11);
      return new cwq(cwu.rg);
   }

   @Override
   public Optional<avz> as_() {
      return etb.c.j();
   }
}

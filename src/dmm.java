import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmm extends dmf implements dmn {
   public static final MapCodec<dmm> a = b(dmm::new);
   public static final eay b = eax.h;
   private static final int c = 5;

   @Override
   public MapCodec<dmm> a() {
      return a;
   }

   public dmm(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      eah $$4 = $$1.a_($$2.d());
      boolean $$5 = $$4.g($$1, $$2).c() && $$4.y().c();
      if ($$5) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected ewo b_(eah $$0) {
      return ewp.c.a(false);
   }

   public static void b(djb $$0, iu $$1, eah $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(djb $$0, iu $$1, eah $$2, eah $$3) {
      if (o($$2)) {
         eah $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iu.a $$5 = $$1.k().c(ja.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(ja.b);
         }
      }
   }

   private static boolean o(eah $$0) {
      return $$0.a(dmh.nJ) || $$0.a(dmh.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static eah q(eah $$0) {
      if ($$0.a(dmh.nJ)) {
         return $$0;
      } else if ($$0.a(dmh.en)) {
         return dmh.nJ.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dmh.lp) ? dmh.nJ.m().b(b, Boolean.valueOf(true)) : dmh.J.m();
      }
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lx.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.da, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lx.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lx.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.cY, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      $$2.a($$3, ewp.c, ewp.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == ja.a || $$4 == ja.b && !$$6.a(dmh.nJ) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.e());
      return $$3.a(dmh.nJ) || $$3.a(dmh.lp) || $$3.a(dmh.en);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ffh.a();
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   public czd a(@Nullable bxe $$0, djb $$1, iu $$2, eah $$3) {
      $$1.a($$2, dmh.a.m(), 11);
      return new czd(czh.rp);
   }

   @Override
   public Optional<awm> ap_() {
      return ewp.c.j();
   }
}

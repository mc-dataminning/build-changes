import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlb extends dku implements dlc {
   public static final MapCodec<dlb> a = b(dlb::new);
   public static final dzd b = dzc.h;
   private static final int c = 5;

   @Override
   public MapCodec<dlb> a() {
      return a;
   }

   public dlb(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      dym $$4 = $$1.a_($$2.d());
      boolean $$5 = $$4.g($$1, $$2).c() && $$4.y().c();
      if ($$5) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected eut b_(dym $$0) {
      return euu.c.a(false);
   }

   public static void b(dhq $$0, jj $$1, dym $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dhq $$0, jj $$1, dym $$2, dym $$3) {
      if (o($$2)) {
         dym $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         jj.a $$5 = $$1.k().c(jo.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jo.b);
         }
      }
   }

   private static boolean o(dym $$0) {
      return $$0.a(dkw.nF) || $$0.a(dkw.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static dym q(dym $$0) {
      if ($$0.a(dkw.nF)) {
         return $$0;
      } else if ($$0.a(dkw.ej)) {
         return dkw.nF.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dkw.ll) ? dkw.nF.m().b(b, Boolean.valueOf(true)) : dkw.J.m();
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lv.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awk.da, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lv.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lv.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awk.cY, awl.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      $$2.a($$3, euu.c, euu.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jo.a || $$4 == jo.b && !$$6.a(dkw.nF) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.e());
      return $$3.a(dkw.nF) || $$3.a(dkw.ll) || $$3.a(dkw.ej);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return fdl.a();
   }

   @Override
   protected drf a_(dym $$0) {
      return drf.a;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   public cxy a(@Nullable bwr $$0, dhq $$1, jj $$2, dym $$3) {
      $$1.a($$2, dkw.a.m(), 11);
      return new cxy(cyc.rk);
   }

   @Override
   public Optional<awj> ao_() {
      return euu.c.j();
   }
}

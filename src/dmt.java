import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dmt extends dmm implements dmu {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final ebf b = ebe.h;
   private static final int c = 5;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   public dmt(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      eao $$5 = $$1.a_($$2.d());
      boolean $$6 = $$5.g($$1, $$2).c() && $$5.y().c();
      if ($$6) {
         $$3.a($$0.c(b), $$2);
      } else {
         $$3.l($$0.c(b));
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.e()));
   }

   @Override
   protected ewv b_(eao $$0) {
      return eww.c.a(false);
   }

   public static void b(dji $$0, iv $$1, eao $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dji $$0, iv $$1, eao $$2, eao $$3) {
      if (o($$2)) {
         eao $$4 = q($$3);
         $$0.a($$1, $$4, 2);
         iv.a $$5 = $$1.k().c(jb.b);

         while (o($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jb.b);
         }
      }
   }

   private static boolean o(eao $$0) {
      return $$0.a(dmo.nJ) || $$0.a(dmo.J) && $$0.y().e() >= 8 && $$0.y().b();
   }

   private static eao q(eao $$0) {
      if ($$0.a(dmo.nJ)) {
         return $$0;
      } else if ($$0.a(dmo.en)) {
         return dmo.nJ.m().b(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dmo.lp) ? dmo.nJ.m().b(b, Boolean.valueOf(true)) : dmo.J.m();
      }
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(ly.as, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.da, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(ly.at, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(ly.at, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, awn.cY, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      $$2.a($$3, eww.c, eww.c.a($$1));
      if (!$$0.a($$1, $$3) || $$4 == jb.a || $$4 == jb.b && !$$6.a(dmo.nJ) && o($$6)) {
         $$2.a($$3, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.e());
      return $$3.a(dmo.nJ) || $$3.a(dmo.lp) || $$3.a(dmo.en);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.a();
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   public czk a(@Nullable bxj $$0, dji $$1, iv $$2, eao $$3) {
      $$1.a($$2, dmo.a.m(), 11);
      return new czk(czo.rp);
   }

   @Override
   public Optional<awm> ap_() {
      return eww.c.j();
   }
}

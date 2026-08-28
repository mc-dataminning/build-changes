import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtk extends dvr implements dmi, dtq {
   public static final MapCodec<dtk> a = b(dtk::new);
   public static final int b = 4;
   public static final ebh c = eax.aV;
   public static final eay d = eax.I;
   private static final ffk e = dmf.b(4.0, 0.0, 6.0);
   private static final ffk f = dmf.b(10.0, 0.0, 6.0);
   private static final ffk g = dmf.b(12.0, 0.0, 6.0);
   private static final ffk h = dmf.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<dtk> a() {
      return a;
   }

   protected dtk(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ewo $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ewp.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(eah $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return !$$0.g($$1, $$2).a(ja.b).c() || $$0.c($$1, $$2, ja.b);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmh.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eah $$0, dcw $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(d) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axc.at);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      int $$4 = 5;
      int $$5 = 1;
      int $$6 = 2;
      int $$7 = 0;
      int $$8 = $$2.u() - 2;
      int $$9 = 0;

      for (int $$10 = 0; $$10 < 5; $$10++) {
         for (int $$11 = 0; $$11 < $$5; $$11++) {
            int $$12 = 2 + $$2.v() - 1;

            for (int $$13 = $$12 - 2; $$13 < $$12; $$13++) {
               iu $$14 = new iu($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dmh.J)) {
                  eah $$15 = $$0.a_($$14.e());
                  if ($$15.a(axc.at)) {
                     $$0.a($$14, dmh.nB.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
                  }
               }
            }
         }

         if ($$7 < 2) {
            $$5 += 2;
            $$9++;
         } else {
            $$5 -= 2;
            $$9--;
         }

         $$7++;
      }

      $$0.a($$2, $$3.b(c, Integer.valueOf(4)), 2);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}

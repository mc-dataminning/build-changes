import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doh extends dhs implements dhm, dol {
   public static final MapCodec<doh> a = b(doh::new);
   public static final int b = 4;
   public static final dvo c = dve.aS;
   public static final dvf d = dve.C;
   protected static final ezm e = dhj.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ezm f = dhj.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ezm g = dhj.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ezm h = dhj.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   protected doh(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eqp $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eqq.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(duo $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return !$$0.g($$1, $$2).a(jj.b).c() || $$0.c($$1, $$2, jj.b);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         return dhl.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(duo $$0, czk $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      switch ($$0.c(c)) {
         case 1:
         default:
            return e;
         case 2:
            return f;
         case 3:
            return g;
         case 4:
            return h;
      }
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(d) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awt.ar);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
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
               je $$14 = new je($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dhl.G)) {
                  duo $$15 = $$0.a_($$14.e());
                  if ($$15.a(awt.ar)) {
                     $$0.a($$14, dhl.mV.o().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}

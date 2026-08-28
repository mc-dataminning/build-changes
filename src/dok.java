import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dok extends dhv implements dhp, doo {
   public static final MapCodec<dok> a = b(dok::new);
   public static final int b = 4;
   public static final dvs c = dvi.aS;
   public static final dvj d = dvi.C;
   protected static final ezq e = dhm.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ezq f = dhm.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ezq g = dhm.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ezq h = dhm.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   protected dok(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eqt $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == equ.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dus $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return !$$0.g($$1, $$2).a(jk.b).c() || $$0.c($$1, $$2, jk.b);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!$$0.a($$3, $$4)) {
         return dho.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dus $$0, czn $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
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
   protected eqt b_(dus $$0) {
      return $$0.c(d) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awv.ar);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
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
               jf $$14 = new jf($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dho.G)) {
                  dus $$15 = $$0.a_($$14.e());
                  if ($$15.a(awv.ar)) {
                     $$0.a($$14, dho.mV.n().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}

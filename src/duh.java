import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duh extends dwo implements dnf, dun {
   public static final MapCodec<duh> a = b(duh::new);
   public static final int b = 4;
   public static final ece c = ebu.aV;
   public static final ebv d = ebu.I;
   private static final fgk e = dnc.b(4.0, 0.0, 6.0);
   private static final fgk f = dnc.b(10.0, 0.0, 6.0);
   private static final fgk g = dnc.b(12.0, 0.0, 6.0);
   private static final fgk h = dnc.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<duh> a() {
      return a;
   }

   protected duh(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         exo $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == exp.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(ebe $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return !$$0.g($$1, $$2).a(jb.b).c() || $$0.c($$1, $$2, jb.b);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      iv $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         return dne.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, exp.c, exp.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected exo b_(ebe $$0) {
      return $$0.c(d) ? exp.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(axe.at);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
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
               iv $$14 = new iv($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dne.J)) {
                  ebe $$15 = $$0.a_($$14.e());
                  if ($$15.a(axe.at)) {
                     $$0.a($$14, dne.nB.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}

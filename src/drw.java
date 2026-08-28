import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drw extends dle implements dkx, dsb {
   public static final MapCodec<drw> a = b(drw::new);
   public static final int b = 4;
   public static final dzm c = dzc.aV;
   public static final dzd d = dzc.I;
   private static final fdo e = dku.b(4.0, 0.0, 6.0);
   private static final fdo f = dku.b(10.0, 0.0, 6.0);
   private static final fdo g = dku.b(12.0, 0.0, 6.0);
   private static final fdo h = dku.b(12.0, 0.0, 7.0);

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   protected drw(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(1)).b(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eut $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == euu.c;
         return super.a($$0).b(d, Boolean.valueOf($$3));
      }
   }

   public static boolean o(dym $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return !$$0.g($$1, $$2).a(jo.b).c() || $$0.c($$1, $$2, jo.b);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkw.a.m();
      } else {
         if ($$0.c(d)) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      return !$$1.h() && $$1.n().a(this.i()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return switch ($$0.c(c)) {
         case 2 -> f;
         case 3 -> g;
         case 4 -> h;
         default -> e;
      };
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(d) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return !o($$2) && $$0.a_($$1.e()).a(awz.at);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
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
               jj $$14 = new jj($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
               if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dkw.J)) {
                  dym $$15 = $$0.a_($$14.e());
                  if ($$15.a(awz.at)) {
                     $$0.a($$14, dkw.nx.m().b(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}

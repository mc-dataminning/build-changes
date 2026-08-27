import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czx extends ctl implements ctf, dab {
   public static final MapCodec<czx> a = b(czx::new);
   public static final int b = 4;
   public static final dgd c = dft.aS;
   public static final dfu d = dft.C;
   protected static final eia e = ctc.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eia f = ctc.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eia g = ctc.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eia h = ctc.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<czx> a() {
      return a;
   }

   protected czx(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eag $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eah.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dfd $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return !$$0.k($$1, $$2).a(ha.b).c() || $$0.d($$1, $$2, ha.b);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         return cte.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfd $$0, clt $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
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
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(apv.ap)) {
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
                  gw $$14 = new gw($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cte.G)) {
                     dfd $$15 = $$0.a_($$14.d());
                     if ($$15.a(apv.ap)) {
                        $$0.a($$14, cte.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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

         $$0.a($$2, $$3.a(c, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}

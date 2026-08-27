import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbw extends cvj implements cvd, dca {
   public static final MapCodec<dbw> a = b(dbw::new);
   public static final int b = 4;
   public static final dii c = dhy.aS;
   public static final dhz d = dhy.C;
   protected static final ekn e = cva.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ekn f = cva.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ekn g = cva.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ekn h = cva.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   protected dbw(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ecs $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ect.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dhi $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return !$$0.k($$1, $$2).a(hx.b).c() || $$0.d($$1, $$2, hx.b);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dhi $$0, cnr $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
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
   public ecs c_(dhi $$0) {
      return $$0.c(d) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      return true;
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(arg.ap)) {
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
                  ht $$14 = new ht($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cvc.G)) {
                     dhi $$15 = $$0.a_($$14.d());
                     if ($$15.a(arg.ap)) {
                        $$0.a($$14, cvc.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}

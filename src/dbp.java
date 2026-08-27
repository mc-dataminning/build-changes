import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbp extends cvc implements cuw, dbt {
   public static final MapCodec<dbp> a = b(dbp::new);
   public static final int b = 4;
   public static final dhw c = dhm.aS;
   public static final dhn d = dhm.C;
   protected static final ekb e = cut.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ekb f = cut.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ekb g = cut.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ekb h = cut.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   protected dbp(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ecg $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ech.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dgw $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return !$$0.k($$1, $$2).a(hx.b).c() || $$0.d($$1, $$2, hx.b);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         return cuv.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
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
   public ecg c_(dgw $$0) {
      return $$0.c(d) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return true;
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(arc.ap)) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cuv.G)) {
                     dgw $$15 = $$0.a_($$14.d());
                     if ($$15.a(arc.ap)) {
                        $$0.a($$14, cuv.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}

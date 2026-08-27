import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddm extends cwz implements cwt, ddq {
   public static final MapCodec<ddm> a = b(ddm::new);
   public static final int b = 4;
   public static final dkh c = djx.aS;
   public static final djy d = djx.C;
   protected static final emm e = cwq.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final emm f = cwq.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final emm g = cwq.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final emm h = cwq.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   protected ddm(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eer $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == ees.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(djh $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return !$$0.k($$1, $$2).a(ic.b).c() || $$0.d($$1, $$2, ic.b);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cws.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(djh $$0, cph $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
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
   public eer c_(djh $$0) {
      return $$0.c(d) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      return true;
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(ash.ap)) {
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
                  hx $$14 = new hx($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cws.G)) {
                     djh $$15 = $$0.a_($$14.d());
                     if ($$15.a(ash.ap)) {
                        $$0.a($$14, cws.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}

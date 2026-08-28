import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlu extends dfg implements dfa, dly {
   public static final MapCodec<dlu> a = b(dlu::new);
   public static final int b = 4;
   public static final dta c = dsq.aS;
   public static final dsr d = dsq.C;
   protected static final ewi e = dex.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ewi f = dex.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ewi g = dex.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ewi h = dex.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dlu> a() {
      return a;
   }

   protected dlu(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ent $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == enu.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dsa $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return !$$0.k($$1, $$2).a(je.b).c() || $$0.d($$1, $$2, je.b);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dez.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, enu.c, enu.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
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
   protected ent b_(dsa $$0) {
      return $$0.c(d) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return true;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(awo.aq)) {
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
                  iz $$14 = new iz($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dez.G)) {
                     dsa $$15 = $$0.a_($$14.d());
                     if ($$15.a(awo.aq)) {
                        $$0.a($$14, dez.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}

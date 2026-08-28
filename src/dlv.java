import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlv extends dfh implements dfb, dlz {
   public static final MapCodec<dlv> a = b(dlv::new);
   public static final int b = 4;
   public static final dtb c = dsr.aS;
   public static final dss d = dsr.C;
   protected static final ewj e = dey.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ewj f = dey.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ewj g = dey.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ewj h = dey.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dlv> a() {
      return a;
   }

   protected dlv(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         enu $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == env.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dsb $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return !$$0.k($$1, $$2).a(je.b).c() || $$0.d($$1, $$2, je.b);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         return dfa.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   protected enu b_(dsb $$0) {
      return $$0.c(d) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dfa.G)) {
                     dsb $$15 = $$0.a_($$14.d());
                     if ($$15.a(awo.aq)) {
                        $$0.a($$14, dfa.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}

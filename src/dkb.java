import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkb extends ddn implements ddh, dkf {
   public static final MapCodec<dkb> a = b(dkb::new);
   public static final int b = 4;
   public static final drh c = dqx.aS;
   public static final dqy d = dqx.C;
   protected static final eui e = dde.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eui f = dde.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eui g = dde.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eui h = dde.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ema $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == emb.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dqh $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return !$$0.k($$1, $$2).a(is.b).c() || $$0.d($$1, $$2, is.b);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      in $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!$$0.a($$3, $$4)) {
         return ddg.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, emb.c, emb.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      return !$$1.h() && $$1.n().a(this.q()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
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
   protected ema b_(dqh $$0) {
      return $$0.c(d) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return true;
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(avr.aq)) {
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
                  in $$14 = new in($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(ddg.G)) {
                     dqh $$15 = $$0.a_($$14.d());
                     if ($$15.a(avr.aq)) {
                        $$0.a($$14, ddg.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}

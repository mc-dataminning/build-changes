import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddu extends cxh implements cxb, ddy {
   public static final MapCodec<ddu> a = b(ddu::new);
   public static final int b = 4;
   public static final dkp c = dkf.aS;
   public static final dkg d = dkf.C;
   protected static final emv e = cwy.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final emv f = cwy.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final emv g = cwy.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final emv h = cwy.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<ddu> a() {
      return a;
   }

   protected ddu(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      djp $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         eez $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == efa.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean h(djp $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return !$$0.k($$1, $$2).a(ic.b).c() || $$0.d($$1, $$2, ic.b);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         return cxa.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, efa.c, efa.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
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
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(asi.ap)) {
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
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(cxa.G)) {
                     djp $$15 = $$0.a_($$14.d());
                     if ($$15.a(asi.ap)) {
                        $$0.a($$14, cxa.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}

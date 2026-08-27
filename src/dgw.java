import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgw extends daj implements dad, dha {
   public static final MapCodec<dgw> a = b(dgw::new);
   public static final int b = 4;
   public static final dnz c = dnp.aS;
   public static final dnq d = dnp.C;
   protected static final eqk e = daa.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final eqk f = daa.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final eqk g = daa.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final eqk h = daa.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   protected dgw(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         ein $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eio.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(dmz $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return !$$0.k($$1, $$2).a(ih.b).c() || $$0.d($$1, $$2, ih.b);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         return dac.a.o();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, eio.c, eio.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      return !$$1.h() && $$1.n().a(this.l()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
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
   protected ein c_(dmz $$0) {
      return $$0.c(d) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return true;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(aun.aq)) {
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
                  ib $$14 = new ib($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dac.G)) {
                     dmz $$15 = $$0.a_($$14.d());
                     if ($$15.a(aun.aq)) {
                        $$0.a($$14, dac.mV.o().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}

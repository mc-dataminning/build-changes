import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkx extends dej implements ded, dlb {
   public static final MapCodec<dkx> a = b(dkx::new);
   public static final int b = 4;
   public static final dsd c = drt.aS;
   public static final dru d = drt.C;
   protected static final evf e = dea.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final evf f = dea.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final evf g = dea.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final evf h = dea.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   @Override
   public MapCodec<dkx> a() {
      return a;
   }

   protected dkx(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)).a(d, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1)));
      } else {
         emw $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == emx.c;
         return super.a($$0).a(d, Boolean.valueOf($$3));
      }
   }

   public static boolean m(drd $$0) {
      return !$$0.c(d);
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return !$$0.k($$1, $$2).a(it.b).c() || $$0.d($$1, $$2, it.b);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         return dec.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(drd $$0, cxb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
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
   protected emw b_(drd $$0) {
      return $$0.c(d) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      return true;
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      if (!m($$3) && $$0.a_($$2.d()).a(avx.aq)) {
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
                  io $$14 = new io($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(dec.G)) {
                     drd $$15 = $$0.a_($$14.d());
                     if ($$15.a(avx.aq)) {
                        $$0.a($$14, dec.mV.n().a(c, Integer.valueOf($$1.a(4) + 1)), 3);
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
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}

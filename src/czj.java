import javax.annotation.Nullable;

public class czj extends csu implements cso, czn {
   public static final int a = 4;
   public static final dga b = dfq.aS;
   public static final dfr c = dfq.C;
   protected static final ehx d = csm.a(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   protected static final ehx e = csm.a(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   protected static final ehx f = csm.a(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   protected static final ehx g = csm.a(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   protected czj(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(1)).a(c, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         return $$1.a(b, Integer.valueOf(Math.min(4, $$1.c(b) + 1)));
      } else {
         ead $$2 = $$0.q().b_($$0.a());
         boolean $$3 = $$2.a() == eae.c;
         return super.a($$0).a(c, Boolean.valueOf($$3));
      }
   }

   public static boolean h(dfa $$0) {
      return !$$0.c(c);
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return !$$0.k($$1, $$2).a(ha.b).c() || $$0.d($$1, $$2, ha.b);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         return csn.a.n();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eae.c, eae.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(b) < 4 ? true : super.a($$0, $$1);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ($$0.c(b)) {
         case 1:
         default:
            return d;
         case 2:
            return e;
         case 3:
            return f;
         case 4:
            return g;
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(c) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return true;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      if (!h($$3) && $$0.a_($$2.d()).a(apl.ap)) {
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
                  gu $$14 = new gu($$8 + $$10, $$13, $$2.w() - $$9 + $$11);
                  if ($$14 != $$2 && $$1.a(6) == 0 && $$0.a_($$14).a(csn.G)) {
                     dfa $$15 = $$0.a_($$14.d());
                     if ($$15.a(apl.ap)) {
                        $$0.a($$14, csn.mV.n().a(b, Integer.valueOf($$1.a(4) + 1)), 3);
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

         $$0.a($$2, $$3.a(b, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}

import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;

public class dba extends csk {
   public static final dfs a = cwd.aC;
   public static final dfp b = dfo.w;
   public static final dfp c = dfo.a;
   protected static final int d = 1;
   protected static final int e = 42;
   private static final int k = 10;
   protected static final int f = 3;
   protected static final ehy g = csk.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final ehy h = csk.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final ehy i = csk.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final ehy j = csk.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   public dba(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb)$$0.c(a)) {
         case f:
         default:
            return j;
         case e:
            return i;
         case d:
            return h;
         case c:
            return g;
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      hb $$3 = $$0.c(a);
      gv $$4 = $$2.a($$3.g());
      dey $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = this.n().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
      cpn $$2 = $$0.q();
      gv $$3 = $$0.a();
      hb[] $$4 = $$0.f();

      for (hb $$5 : $$4) {
         if ($$5.o().d()) {
            hb $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      this.a($$0, $$1, $$2, false, false, -1, null);
   }

   public void a(cpk $$0, gv $$1, dey $$2, boolean $$3, boolean $$4, int $$5, @Nullable dey $$6) {
      hb $$7 = $$2.c(a);
      boolean $$8 = $$2.c(c);
      boolean $$9 = $$2.c(b);
      boolean $$10 = !$$3;
      boolean $$11 = false;
      int $$12 = 0;
      dey[] $$13 = new dey[42];

      for (int $$14 = 1; $$14 < 42; $$14++) {
         gv $$15 = $$1.a($$7, $$14);
         dey $$16 = $$0.a_($$15);
         if ($$16.a(csl.fH)) {
            if ($$16.c(a) == $$7.g()) {
               $$12 = $$14;
            }
            break;
         }

         if (!$$16.a(csl.fI) && $$14 != $$5) {
            $$13[$$14] = null;
            $$10 = false;
         } else {
            if ($$14 == $$5) {
               $$16 = (dey)MoreObjects.firstNonNull($$6, $$16);
            }

            boolean $$17 = !$$16.c(daz.c);
            boolean $$18 = $$16.c(daz.a);
            $$11 |= $$17 && $$18;
            $$13[$$14] = $$16;
            if ($$14 == $$5) {
               $$0.a($$1, this, 10);
               $$10 &= $$17;
            }
         }
      }

      $$10 &= $$12 > 1;
      $$11 &= $$10;
      dey $$19 = this.n().a(c, Boolean.valueOf($$10)).a(b, Boolean.valueOf($$11));
      if ($$12 > 0) {
         gv $$20 = $$1.a($$7, $$12);
         hb $$21 = $$7.g();
         $$0.a($$20, $$19.a(a, $$21), 3);
         this.a($$0, $$20, $$21);
         this.a($$0, $$20, $$10, $$11, $$8, $$9);
      }

      this.a($$0, $$1, $$10, $$11, $$8, $$9);
      if (!$$3) {
         $$0.a($$1, $$19.a(a, $$7), 3);
         if ($$4) {
            this.a($$0, $$1, $$7);
         }
      }

      if ($$8 != $$10) {
         for (int $$22 = 1; $$22 < $$12; $$22++) {
            gv $$23 = $$1.a($$7, $$22);
            dey $$24 = $$13[$$22];
            if ($$24 != null) {
               $$0.a($$23, $$24.a(c, Boolean.valueOf($$10)), 3);
               if (!$$0.a_($$23).i()) {
               }
            }
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      this.a($$1, $$2, $$0, false, true, -1, null);
   }

   private void a(cpk $$0, gv $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, aou.xS, aov.e, 0.4F, 0.6F);
         $$0.a(null, dji.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, aou.xR, aov.e, 0.4F, 0.5F);
         $$0.a(null, dji.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, aou.xQ, aov.e, 0.4F, 0.7F);
         $$0.a(null, dji.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, aou.xT, aov.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dji.g, $$1);
      }
   }

   private void a(cpk $$0, gv $$1, hb $$2) {
      $$0.a($$1, this);
      $$0.a($$1.a($$2.g()), this);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         boolean $$5 = $$0.c(c);
         boolean $$6 = $$0.c(b);
         if ($$5 || $$6) {
            this.a($$1, $$2, $$0, true, false, -1, null);
         }

         if ($$6) {
            $$1.a($$2, this);
            $$1.a($$2.a($$0.c(a).g()), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      if (!$$0.c(b)) {
         return 0;
      } else {
         return $$0.c(a) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c);
   }
}

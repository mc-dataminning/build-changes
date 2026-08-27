import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;

public class dbn extends csx {
   public static final dgf a = cwq.aC;
   public static final dgc b = dgb.w;
   public static final dgc c = dgb.a;
   protected static final int d = 1;
   protected static final int e = 42;
   private static final int k = 10;
   protected static final int f = 3;
   protected static final eii g = csx.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final eii h = csx.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final eii i = csx.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final eii j = csx.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   public dbn(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc)$$0.c(a)) {
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
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3.g());
      dfl $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = this.n().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
      cqa $$2 = $$0.q();
      gw $$3 = $$0.a();
      hc[] $$4 = $$0.f();

      for (hc $$5 : $$4) {
         if ($$5.o().d()) {
            hc $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      this.a($$0, $$1, $$2, false, false, -1, null);
   }

   public void a(cpx $$0, gw $$1, dfl $$2, boolean $$3, boolean $$4, int $$5, @Nullable dfl $$6) {
      hc $$7 = $$2.c(a);
      boolean $$8 = $$2.c(c);
      boolean $$9 = $$2.c(b);
      boolean $$10 = !$$3;
      boolean $$11 = false;
      int $$12 = 0;
      dfl[] $$13 = new dfl[42];

      for (int $$14 = 1; $$14 < 42; $$14++) {
         gw $$15 = $$1.a($$7, $$14);
         dfl $$16 = $$0.a_($$15);
         if ($$16.a(csy.fH)) {
            if ($$16.c(a) == $$7.g()) {
               $$12 = $$14;
            }
            break;
         }

         if (!$$16.a(csy.fI) && $$14 != $$5) {
            $$13[$$14] = null;
            $$10 = false;
         } else {
            if ($$14 == $$5) {
               $$16 = (dfl)MoreObjects.firstNonNull($$6, $$16);
            }

            boolean $$17 = !$$16.c(dbm.c);
            boolean $$18 = $$16.c(dbm.a);
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
      dfl $$19 = this.n().a(c, Boolean.valueOf($$10)).a(b, Boolean.valueOf($$11));
      if ($$12 > 0) {
         gw $$20 = $$1.a($$7, $$12);
         hc $$21 = $$7.g();
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
            gw $$23 = $$1.a($$7, $$22);
            dfl $$24 = $$13[$$22];
            if ($$24 != null) {
               $$0.a($$23, $$24.a(c, Boolean.valueOf($$10)), 3);
               if (!$$0.a_($$23).i()) {
               }
            }
         }
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      this.a($$1, $$2, $$0, false, true, -1, null);
   }

   private void a(cpx $$0, gw $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, apf.xX, apg.e, 0.4F, 0.6F);
         $$0.a(null, djv.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, apf.xW, apg.e, 0.4F, 0.5F);
         $$0.a(null, djv.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, apf.xV, apg.e, 0.4F, 0.7F);
         $$0.a(null, djv.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, apf.xY, apg.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, djv.g, $$1);
      }
   }

   private void a(cpx $$0, gw $$1, hc $$2) {
      $$0.a($$1, this);
      $$0.a($$1.a($$2.g()), this);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
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
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      if (!$$0.c(b)) {
         return 0;
      } else {
         return $$0.c(a) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c);
   }
}

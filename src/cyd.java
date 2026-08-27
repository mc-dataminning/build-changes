import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;

public class cyd extends cpn {
   public static final dcv a = ctg.aC;
   public static final dcs b = dcr.w;
   public static final dcs c = dcr.a;
   protected static final int d = 1;
   protected static final int e = 42;
   private static final int k = 10;
   protected static final int f = 3;
   protected static final efb g = cpn.a(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   protected static final efb h = cpn.a(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   protected static final efb i = cpn.a(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   protected static final efb j = cpn.a(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   public cyd(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      switch ((ha)$$0.c(a)) {
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
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3.g());
      dcb $$5 = $$1.a_($$4);
      return $$3.o().d() && $$5.d($$1, $$4, $$3);
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dcb a(cih $$0) {
      dcb $$1 = this.n().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false));
      cmp $$2 = $$0.q();
      gu $$3 = $$0.a();
      ha[] $$4 = $$0.f();

      for (ha $$5 : $$4) {
         if ($$5.o().d()) {
            ha $$6 = $$5.g();
            $$1 = $$1.a(a, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      this.a($$0, $$1, $$2, false, false, -1, null);
   }

   public void a(cmm $$0, gu $$1, dcb $$2, boolean $$3, boolean $$4, int $$5, @Nullable dcb $$6) {
      ha $$7 = $$2.c(a);
      boolean $$8 = $$2.c(c);
      boolean $$9 = $$2.c(b);
      boolean $$10 = !$$3;
      boolean $$11 = false;
      int $$12 = 0;
      dcb[] $$13 = new dcb[42];

      for (int $$14 = 1; $$14 < 42; $$14++) {
         gu $$15 = $$1.a($$7, $$14);
         dcb $$16 = $$0.a_($$15);
         if ($$16.a(cpo.fH)) {
            if ($$16.c(a) == $$7.g()) {
               $$12 = $$14;
            }
            break;
         }

         if (!$$16.a(cpo.fI) && $$14 != $$5) {
            $$13[$$14] = null;
            $$10 = false;
         } else {
            if ($$14 == $$5) {
               $$16 = (dcb)MoreObjects.firstNonNull($$6, $$16);
            }

            boolean $$17 = !$$16.c(cyc.c);
            boolean $$18 = $$16.c(cyc.a);
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
      dcb $$19 = this.n().a(c, Boolean.valueOf($$10)).a(b, Boolean.valueOf($$11));
      if ($$12 > 0) {
         gu $$20 = $$1.a($$7, $$12);
         ha $$21 = $$7.g();
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
            gu $$23 = $$1.a($$7, $$22);
            dcb $$24 = $$13[$$22];
            if ($$24 != null) {
               $$0.a($$23, $$24.a(c, Boolean.valueOf($$10)), 3);
               if (!$$0.a_($$23).i()) {
               }
            }
         }
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.a($$1, $$2, $$0, false, true, -1, null);
   }

   private void a(cmm $$0, gu $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5) {
      if ($$3 && !$$5) {
         $$0.a(null, $$1, amh.xR, ami.e, 0.4F, 0.6F);
         $$0.a(null, dgl.a, $$1);
      } else if (!$$3 && $$5) {
         $$0.a(null, $$1, amh.xQ, ami.e, 0.4F, 0.5F);
         $$0.a(null, dgl.e, $$1);
      } else if ($$2 && !$$4) {
         $$0.a(null, $$1, amh.xP, ami.e, 0.4F, 0.7F);
         $$0.a(null, dgl.b, $$1);
      } else if (!$$2 && $$4) {
         $$0.a(null, $$1, amh.xS, ami.e, 0.4F, 1.2F / ($$0.z.i() * 0.2F + 0.9F));
         $$0.a(null, dgl.g, $$1);
      }
   }

   private void a(cmm $$0, gu $$1, ha $$2) {
      $$0.a($$1, this);
      $$0.a($$1.a($$2.g()), this);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
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
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      if (!$$0.c(b)) {
         return 0;
      } else {
         return $$0.c(a) == $$3 ? 15 : 0;
      }
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c);
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class des extends cuk {
   public static final dfq b = dfp.g;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   public static final float f = 4.0F;
   protected static final ehw g = csl.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ehw h = csl.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehw i = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ehw j = csl.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ehw k = csl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ehw l = csl.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean m;

   public des(boolean $$0, dey.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.m = $$0;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      if ($$0.c(b)) {
         switch ((ha)$$0.c(a)) {
            case a:
               return l;
            case b:
            default:
               return k;
            case c:
               return j;
            case d:
               return i;
            case e:
               return h;
            case f:
               return g;
         }
      } else {
         return eht.b();
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, biy $$3, cix $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.d().g()).a(b, Boolean.valueOf(false));
   }

   private void a(cpl $$0, gu $$1, dez $$2) {
      ha $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(b)) {
         if (new dew($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(b)) {
         gu $$5 = $$1.a($$3, 2);
         dez $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(csm.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dev $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((akk)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cqb $$0, gu $$1, ha $$2) {
      for (ha $$3 : ha.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ha.a)) {
         return true;
      } else {
         gu $$4 = $$1.c();

         for (ha $$5 : ha.values()) {
            if ($$5 != ha.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dez $$0, cpl $$1, gu $$2, int $$3, int $$4) {
      ha $$5 = $$0.c(a);
      dez $$6 = $$0.a(b, Boolean.valueOf(true));
      if (!$$1.B) {
         boolean $$7 = this.a($$1, $$2, $$5);
         if ($$7 && ($$3 == 1 || $$3 == 2)) {
            $$1.a($$2, $$6, 2);
            return false;
         }

         if (!$$7 && $$3 == 0) {
            return false;
         }
      }

      if ($$3 == 0) {
         if (!this.a($$1, $$2, $$5, true)) {
            return false;
         }

         $$1.a($$2, $$6, 67);
         $$1.a(null, $$2, aow.so, aox.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(djj.a, $$2, djj.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dcl $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dev) {
            ((dev)$$8).j();
         }

         dez $$9 = csm.bQ.n().a(der.a, $$5).a(der.b, this.m ? dgb.b : dgb.a);
         $$1.a($$2, $$9, 20);
         $$1.a(der.a($$2, $$9, this.n().a(a, ha.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.m) {
            gu $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dez $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(csm.bQ) && $$1.c_($$10) instanceof dev $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eah.a && !$$11.a(csm.by) && !$$11.a(csm.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aow.sn, aox.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(djj.e, $$2, djj.a.a($$9));
      }

      return true;
   }

   public static boolean a(dez $$0, cpl $$1, gu $$2, ha $$3, boolean $$4, ha $$5) {
      if ($$2.v() < $$1.C_() || $$2.v() > $$1.aj() - 1 || !$$1.w_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(csm.co) || $$0.a(csm.pk) || $$0.a(csm.pl) || $$0.a(csm.sn)) {
         return false;
      } else if ($$3 == ha.a && $$2.v() == $$1.C_()) {
         return false;
      } else if ($$3 == ha.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(csm.by) && !$$0.a(csm.br)) {
            if ($$0.h($$1, $$2) == -1.0F) {
               return false;
            }

            switch ($$0.o()) {
               case c:
                  return false;
               case b:
                  return $$4;
               case e:
                  return $$3 == $$5;
            }
         } else if ($$0.c(b)) {
            return false;
         }

         return !$$0.t();
      }
   }

   private boolean a(cpl $$0, gu $$1, ha $$2, boolean $$3) {
      gu $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(csm.bz)) {
         $$0.a($$4, csm.a.n(), 20);
      }

      dew $$5 = new dew($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gu, dez> $$6 = Maps.newHashMap();
         List<gu> $$7 = $$5.c();
         List<dez> $$8 = Lists.newArrayList();

         for (gu $$9 : $$7) {
            dez $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<gu> $$11 = $$5.d();
         dez[] $$12 = new dez[$$7.size() + $$11.size()];
         ha $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            gu $$16 = $$11.get($$15);
            dez $$17 = $$0.a_($$16);
            dcl $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, csm.a.n(), 18);
            $$0.a(djj.f, $$16, djj.a.a($$17));
            if (!$$17.a(apl.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            gu $$20 = $$7.get($$19);
            dez $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dez $$22 = csm.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(der.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dgb $$23 = this.m ? dgb.b : dgb.a;
            dez $$24 = csm.bz.n().a(det.a, $$2).a(det.b, $$23);
            dez $$25 = csm.bQ.n().a(der.a, $$2).a(der.b, this.m ? dgb.b : dgb.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(der.a($$4, $$25, $$24, $$2, true, true));
         }

         dez $$26 = csm.a.n();

         for (gu $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<gu, dez> $$28 : $$6.entrySet()) {
            gu $$29 = $$28.getKey();
            dez $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dez $$32 = $$12[$$14++];
            gu $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, csm.bz);
         }

         return true;
      }
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean g_(dez $$0) {
      return $$0.c(b);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}

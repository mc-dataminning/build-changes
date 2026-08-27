import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dfc extends cuu {
   public static final dga b = dfz.g;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   public static final float f = 4.0F;
   protected static final eig g = csv.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eig h = csv.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eig i = csv.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eig j = csv.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eig k = csv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eig l = csv.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean m;

   public dfc(boolean $$0, dfi.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.m = $$0;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
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
         return eid.b();
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, bjg $$3, cjf $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dfj a(cln $$0) {
      return this.n().a(a, $$0.d().g()).a(b, Boolean.valueOf(false));
   }

   private void a(cpv $$0, gw $$1, dfj $$2) {
      ha $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(b)) {
         if (new dfg($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(b)) {
         gw $$5 = $$1.a($$3, 2);
         dfj $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(csw.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dff $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((akq)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cql $$0, gw $$1, ha $$2) {
      for (ha $$3 : ha.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ha.a)) {
         return true;
      } else {
         gw $$4 = $$1.c();

         for (ha $$5 : ha.values()) {
            if ($$5 != ha.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dfj $$0, cpv $$1, gw $$2, int $$3, int $$4) {
      ha $$5 = $$0.c(a);
      dfj $$6 = $$0.a(b, Boolean.valueOf(true));
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
         $$1.a(null, $$2, apd.so, ape.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(djt.a, $$2, djt.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dcv $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dff) {
            ((dff)$$8).j();
         }

         dfj $$9 = csw.bQ.n().a(dfb.a, $$5).a(dfb.b, this.m ? dgl.b : dgl.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dfb.a($$2, $$9, this.n().a(a, ha.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.m) {
            gw $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dfj $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(csw.bQ) && $$1.c_($$10) instanceof dff $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != ear.a && !$$11.a(csw.by) && !$$11.a(csw.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, apd.sn, ape.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(djt.e, $$2, djt.a.a($$9));
      }

      return true;
   }

   public static boolean a(dfj $$0, cpv $$1, gw $$2, ha $$3, boolean $$4, ha $$5) {
      if ($$2.v() < $$1.H_() || $$2.v() > $$1.aj() - 1 || !$$1.B_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(csw.co) || $$0.a(csw.pk) || $$0.a(csw.pl) || $$0.a(csw.sn)) {
         return false;
      } else if ($$3 == ha.a && $$2.v() == $$1.H_()) {
         return false;
      } else if ($$3 == ha.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(csw.by) && !$$0.a(csw.br)) {
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

   private boolean a(cpv $$0, gw $$1, ha $$2, boolean $$3) {
      gw $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(csw.bz)) {
         $$0.a($$4, csw.a.n(), 20);
      }

      dfg $$5 = new dfg($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gw, dfj> $$6 = Maps.newHashMap();
         List<gw> $$7 = $$5.c();
         List<dfj> $$8 = Lists.newArrayList();

         for (gw $$9 : $$7) {
            dfj $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<gw> $$11 = $$5.d();
         dfj[] $$12 = new dfj[$$7.size() + $$11.size()];
         ha $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            gw $$16 = $$11.get($$15);
            dfj $$17 = $$0.a_($$16);
            dcv $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, csw.a.n(), 18);
            $$0.a(djt.f, $$16, djt.a.a($$17));
            if (!$$17.a(aps.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            gw $$20 = $$7.get($$19);
            dfj $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dfj $$22 = csw.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dfb.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dgl $$23 = this.m ? dgl.b : dgl.a;
            dfj $$24 = csw.bz.n().a(dfd.a, $$2).a(dfd.b, $$23);
            dfj $$25 = csw.bQ.n().a(dfb.a, $$2).a(dfb.b, this.m ? dgl.b : dgl.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dfb.a($$4, $$25, $$24, $$2, true, true));
         }

         dfj $$26 = csw.a.n();

         for (gw $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<gw, dfj> $$28 : $$6.entrySet()) {
            gw $$29 = $$28.getKey();
            dfj $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dfj $$32 = $$12[$$14++];
            gw $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, csw.bz);
         }

         return true;
      }
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean g_(dfj $$0) {
      return $$0.c(b);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}

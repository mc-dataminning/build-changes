import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dbu extends crm {
   public static final dcs b = dcr.g;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   public static final float f = 4.0F;
   protected static final efb g = cpn.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final efb h = cpn.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final efb i = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final efb j = cpn.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final efb k = cpn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final efb l = cpn.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean m;

   public dbu(boolean $$0, dca.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
      this.m = $$0;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
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
         return eey.b();
      }
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, bfz $$3, cfz $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dcb a(cih $$0) {
      return this.n().a(a, $$0.d().g()).a(b, Boolean.valueOf(false));
   }

   private void a(cmm $$0, gu $$1, dcb $$2) {
      ha $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(b)) {
         if (new dby($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(b)) {
         gu $$5 = $$1.a($$3, 2);
         dcb $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cpo.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dbx $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((aif)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cnc $$0, gu $$1, ha $$2) {
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
   public boolean a(dcb $$0, cmm $$1, gu $$2, int $$3, int $$4) {
      ha $$5 = $$0.c(a);
      dcb $$6 = $$0.a(b, Boolean.valueOf(true));
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
         $$1.a(null, $$2, amh.so, ami.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dgl.a, $$2, dgl.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         czn $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dbx) {
            ((dbx)$$8).j();
         }

         dcb $$9 = cpo.bQ.n().a(dbt.a, $$5).a(dbt.b, this.m ? ddd.b : ddd.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dbt.a($$2, $$9, this.n().a(a, ha.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.m) {
            gu $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dcb $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cpo.bQ) && $$1.c_($$10) instanceof dbx $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != dxj.a && !$$11.a(cpo.by) && !$$11.a(cpo.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, amh.sn, ami.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dgl.e, $$2, dgl.a.a($$9));
      }

      return true;
   }

   public static boolean a(dcb $$0, cmm $$1, gu $$2, ha $$3, boolean $$4, ha $$5) {
      if ($$2.v() < $$1.C_() || $$2.v() > $$1.aj() - 1 || !$$1.w_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cpo.co) || $$0.a(cpo.pk) || $$0.a(cpo.pl) || $$0.a(cpo.sn)) {
         return false;
      } else if ($$3 == ha.a && $$2.v() == $$1.C_()) {
         return false;
      } else if ($$3 == ha.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(cpo.by) && !$$0.a(cpo.br)) {
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

   private boolean a(cmm $$0, gu $$1, ha $$2, boolean $$3) {
      gu $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cpo.bz)) {
         $$0.a($$4, cpo.a.n(), 20);
      }

      dby $$5 = new dby($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gu, dcb> $$6 = Maps.newHashMap();
         List<gu> $$7 = $$5.c();
         List<dcb> $$8 = Lists.newArrayList();

         for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
            gu $$10 = $$7.get($$9);
            dcb $$11 = $$0.a_($$10);
            $$8.add($$11);
            $$6.put($$10, $$11);
         }

         List<gu> $$12 = $$5.d();
         dcb[] $$13 = new dcb[$$7.size() + $$12.size()];
         ha $$14 = $$3 ? $$2 : $$2.g();
         int $$15 = 0;

         for (int $$16 = $$12.size() - 1; $$16 >= 0; $$16--) {
            gu $$17 = $$12.get($$16);
            dcb $$18 = $$0.a_($$17);
            czn $$19 = $$18.t() ? $$0.c_($$17) : null;
            a($$18, $$0, $$17, $$19);
            $$0.a($$17, cpo.a.n(), 18);
            $$0.a(dgl.f, $$17, dgl.a.a($$18));
            if (!$$18.a(amw.aI)) {
               $$0.a($$17, $$18);
            }

            $$13[$$15++] = $$18;
         }

         for (int $$20 = $$7.size() - 1; $$20 >= 0; $$20--) {
            gu $$21 = $$7.get($$20);
            dcb $$22 = $$0.a_($$21);
            $$21 = $$21.a($$14);
            $$6.remove($$21);
            dcb $$23 = cpo.bQ.n().a(a, $$2);
            $$0.a($$21, $$23, 68);
            $$0.a(dbt.a($$21, $$23, $$8.get($$20), $$2, $$3, false));
            $$13[$$15++] = $$22;
         }

         if ($$3) {
            ddd $$24 = this.m ? ddd.b : ddd.a;
            dcb $$25 = cpo.bz.n().a(dbv.a, $$2).a(dbv.b, $$24);
            dcb $$26 = cpo.bQ.n().a(dbt.a, $$2).a(dbt.b, this.m ? ddd.b : ddd.a);
            $$6.remove($$4);
            $$0.a($$4, $$26, 68);
            $$0.a(dbt.a($$4, $$26, $$25, $$2, true, true));
         }

         dcb $$27 = cpo.a.n();

         for (gu $$28 : $$6.keySet()) {
            $$0.a($$28, $$27, 82);
         }

         for (Entry<gu, dcb> $$29 : $$6.entrySet()) {
            gu $$30 = $$29.getKey();
            dcb $$31 = $$29.getValue();
            $$31.b($$0, $$30, 2);
            $$27.a($$0, $$30, 2);
            $$27.b($$0, $$30, 2);
         }

         $$15 = 0;

         for (int $$32 = $$12.size() - 1; $$32 >= 0; $$32--) {
            dcb $$33 = $$13[$$15++];
            gu $$34 = $$12.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b());
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$13[$$15++].b());
         }

         if ($$3) {
            $$0.a($$4, cpo.bz);
         }

         return true;
      }
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
      $$0.a(a, b);
   }

   @Override
   public boolean g_(dcb $$0) {
      return $$0.c(b);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}

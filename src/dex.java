import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dex extends cup {
   public static final dfv b = dfu.g;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   public static final float f = 4.0F;
   protected static final eib g = csq.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eib h = csq.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eib i = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eib j = csq.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eib k = csq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eib l = csq.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean m;

   public dex(boolean $$0, dfd.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, hc.c).a(b, Boolean.valueOf(false)));
      this.m = $$0;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$0.c(b)) {
         switch ((hc)$$0.c(a)) {
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
         return ehy.b();
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dfe a(cli $$0) {
      return this.n().a(a, $$0.d().g()).a(b, Boolean.valueOf(false));
   }

   private void a(cpq $$0, gw $$1, dfe $$2) {
      hc $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(b)) {
         if (new dfb($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(b)) {
         gw $$5 = $$1.a($$3, 2);
         dfe $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(csr.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dfa $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((akn)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cqg $$0, gw $$1, hc $$2) {
      for (hc $$3 : hc.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, hc.a)) {
         return true;
      } else {
         gw $$4 = $$1.c();

         for (hc $$5 : hc.values()) {
            if ($$5 != hc.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dfe $$0, cpq $$1, gw $$2, int $$3, int $$4) {
      hc $$5 = $$0.c(a);
      dfe $$6 = $$0.a(b, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aoz.so, apa.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(djo.a, $$2, djo.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dcq $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dfa) {
            ((dfa)$$8).j();
         }

         dfe $$9 = csr.bQ.n().a(dew.a, $$5).a(dew.b, this.m ? dgg.b : dgg.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dew.a($$2, $$9, this.n().a(a, hc.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.m) {
            gw $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dfe $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(csr.bQ) && $$1.c_($$10) instanceof dfa $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eam.a && !$$11.a(csr.by) && !$$11.a(csr.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aoz.sn, apa.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(djo.e, $$2, djo.a.a($$9));
      }

      return true;
   }

   public static boolean a(dfe $$0, cpq $$1, gw $$2, hc $$3, boolean $$4, hc $$5) {
      if ($$2.v() < $$1.C_() || $$2.v() > $$1.aj() - 1 || !$$1.w_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(csr.co) || $$0.a(csr.pk) || $$0.a(csr.pl) || $$0.a(csr.sn)) {
         return false;
      } else if ($$3 == hc.a && $$2.v() == $$1.C_()) {
         return false;
      } else if ($$3 == hc.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(csr.by) && !$$0.a(csr.br)) {
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

   private boolean a(cpq $$0, gw $$1, hc $$2, boolean $$3) {
      gw $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(csr.bz)) {
         $$0.a($$4, csr.a.n(), 20);
      }

      dfb $$5 = new dfb($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gw, dfe> $$6 = Maps.newHashMap();
         List<gw> $$7 = $$5.c();
         List<dfe> $$8 = Lists.newArrayList();

         for (gw $$9 : $$7) {
            dfe $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<gw> $$11 = $$5.d();
         dfe[] $$12 = new dfe[$$7.size() + $$11.size()];
         hc $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            gw $$16 = $$11.get($$15);
            dfe $$17 = $$0.a_($$16);
            dcq $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, csr.a.n(), 18);
            $$0.a(djo.f, $$16, djo.a.a($$17));
            if (!$$17.a(apo.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            gw $$20 = $$7.get($$19);
            dfe $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dfe $$22 = csr.bQ.n().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dew.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dgg $$23 = this.m ? dgg.b : dgg.a;
            dfe $$24 = csr.bz.n().a(dey.a, $$2).a(dey.b, $$23);
            dfe $$25 = csr.bQ.n().a(dew.a, $$2).a(dew.b, this.m ? dgg.b : dgg.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dew.a($$4, $$25, $$24, $$2, true, true));
         }

         dfe $$26 = csr.a.n();

         for (gw $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<gw, dfe> $$28 : $$6.entrySet()) {
            gw $$29 = $$28.getKey();
            dfe $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dfe $$32 = $$12[$$14++];
            gw $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, csr.bz);
         }

         return true;
      }
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b);
   }

   @Override
   public boolean g_(dfe $$0) {
      return $$0.c(b);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class der extends cuj {
   public static final dfp b = dfo.g;
   public static final int c = 0;
   public static final int d = 1;
   public static final int e = 2;
   public static final float f = 4.0F;
   protected static final ehy g = csk.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ehy h = csk.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehy i = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ehy j = csk.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ehy k = csk.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ehy l = csk.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean m;

   public der(boolean $$0, dex.d $$1) {
      super($$1);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
      this.m = $$0;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$0.c(b)) {
         switch ((hb)$$0.c(a)) {
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
         return ehv.b();
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.d().g()).a(b, Boolean.valueOf(false));
   }

   private void a(cpk $$0, gv $$1, dey $$2) {
      hb $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(b)) {
         if (new dev($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(b)) {
         gv $$5 = $$1.a($$3, 2);
         dey $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(csl.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof deu $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((aki)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cqa $$0, gv $$1, hb $$2) {
      for (hb $$3 : hb.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, hb.a)) {
         return true;
      } else {
         gv $$4 = $$1.c();

         for (hb $$5 : hb.values()) {
            if ($$5 != hb.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, int $$3, int $$4) {
      hb $$5 = $$0.c(a);
      dey $$6 = $$0.a(b, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aou.so, aov.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dji.a, $$2, dji.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dck $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof deu) {
            ((deu)$$8).j();
         }

         dey $$9 = csl.bQ.n().a(deq.a, $$5).a(deq.b, this.m ? dga.b : dga.a);
         $$1.a($$2, $$9, 20);
         $$1.a(deq.a($$2, $$9, this.n().a(a, hb.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.m) {
            gv $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dey $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(csl.bQ) && $$1.c_($$10) instanceof deu $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eag.a && !$$11.a(csl.by) && !$$11.a(csl.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aou.sn, aov.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dji.e, $$2, dji.a.a($$9));
      }

      return true;
   }

   public static boolean a(dey $$0, cpk $$1, gv $$2, hb $$3, boolean $$4, hb $$5) {
      if ($$2.v() < $$1.C_() || $$2.v() > $$1.aj() - 1 || !$$1.w_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(csl.co) || $$0.a(csl.pk) || $$0.a(csl.pl) || $$0.a(csl.sn)) {
         return false;
      } else if ($$3 == hb.a && $$2.v() == $$1.C_()) {
         return false;
      } else if ($$3 == hb.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(csl.by) && !$$0.a(csl.br)) {
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

   private boolean a(cpk $$0, gv $$1, hb $$2, boolean $$3) {
      gv $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(csl.bz)) {
         $$0.a($$4, csl.a.n(), 20);
      }

      dev $$5 = new dev($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<gv, dey> $$6 = Maps.newHashMap();
         List<gv> $$7 = $$5.c();
         List<dey> $$8 = Lists.newArrayList();

         for (int $$9 = 0; $$9 < $$7.size(); $$9++) {
            gv $$10 = $$7.get($$9);
            dey $$11 = $$0.a_($$10);
            $$8.add($$11);
            $$6.put($$10, $$11);
         }

         List<gv> $$12 = $$5.d();
         dey[] $$13 = new dey[$$7.size() + $$12.size()];
         hb $$14 = $$3 ? $$2 : $$2.g();
         int $$15 = 0;

         for (int $$16 = $$12.size() - 1; $$16 >= 0; $$16--) {
            gv $$17 = $$12.get($$16);
            dey $$18 = $$0.a_($$17);
            dck $$19 = $$18.t() ? $$0.c_($$17) : null;
            a($$18, $$0, $$17, $$19);
            $$0.a($$17, csl.a.n(), 18);
            $$0.a(dji.f, $$17, dji.a.a($$18));
            if (!$$18.a(apj.aJ)) {
               $$0.a($$17, $$18);
            }

            $$13[$$15++] = $$18;
         }

         for (int $$20 = $$7.size() - 1; $$20 >= 0; $$20--) {
            gv $$21 = $$7.get($$20);
            dey $$22 = $$0.a_($$21);
            $$21 = $$21.a($$14);
            $$6.remove($$21);
            dey $$23 = csl.bQ.n().a(a, $$2);
            $$0.a($$21, $$23, 68);
            $$0.a(deq.a($$21, $$23, $$8.get($$20), $$2, $$3, false));
            $$13[$$15++] = $$22;
         }

         if ($$3) {
            dga $$24 = this.m ? dga.b : dga.a;
            dey $$25 = csl.bz.n().a(des.a, $$2).a(des.b, $$24);
            dey $$26 = csl.bQ.n().a(deq.a, $$2).a(deq.b, this.m ? dga.b : dga.a);
            $$6.remove($$4);
            $$0.a($$4, $$26, 68);
            $$0.a(deq.a($$4, $$26, $$25, $$2, true, true));
         }

         dey $$27 = csl.a.n();

         for (gv $$28 : $$6.keySet()) {
            $$0.a($$28, $$27, 82);
         }

         for (Entry<gv, dey> $$29 : $$6.entrySet()) {
            gv $$30 = $$29.getKey();
            dey $$31 = $$29.getValue();
            $$31.b($$0, $$30, 2);
            $$27.a($$0, $$30, 2);
            $$27.b($$0, $$30, 2);
         }

         $$15 = 0;

         for (int $$32 = $$12.size() - 1; $$32 >= 0; $$32--) {
            dey $$33 = $$13[$$15++];
            gv $$34 = $$12.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b());
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$13[$$15++].b());
         }

         if ($$3) {
            $$0.a($$4, csl.bz);
         }

         return true;
      }
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
      $$0.a(a, b);
   }

   @Override
   public boolean g_(dey $$0) {
      return $$0.c(b);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}

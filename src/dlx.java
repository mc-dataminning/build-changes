import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dlx extends dbi {
   public static final MapCodec<dlx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dlx::new)
   );
   public static final dmv c = dmu.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final epo h = czf.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final epo i = czf.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final epo j = czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final epo k = czf.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final epo l = czf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final epo m = czf.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dlx> a() {
      return b;
   }

   public dlx(boolean $$0, dmd.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ih.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$0.c(c)) {
         switch ((ih)$$0.c(a)) {
            case a:
               return m;
            case b:
            default:
               return l;
            case c:
               return k;
            case d:
               return j;
            case e:
               return i;
            case f:
               return h;
         }
      } else {
         return epl.b();
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dme a(crx $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      ih $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dmb($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ib $$5 = $$1.a($$3, 2);
         dme $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(czh.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dma $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.X() == $$9.l() || ((apa)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cwu $$0, ib $$1, ih $$2) {
      for (ih $$3 : ih.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ih.a)) {
         return true;
      } else {
         ib $$4 = $$1.c();

         for (ih $$5 : ih.values()) {
            if ($$5 != ih.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dme $$0, cwe $$1, ib $$2, int $$3, int $$4) {
      ih $$5 = $$0.c(a);
      dme $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, atp.tt, atq.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dqr.a, $$2, dqr.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         djl $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dma) {
            ((dma)$$8).k();
         }

         dme $$9 = czh.bQ.o().a(dlw.b, $$5).a(dlw.c, this.n ? dng.b : dng.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dlw.a($$2, $$9, this.o().a(a, ih.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ib $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dme $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(czh.bQ) && $$1.c_($$10) instanceof dma $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != ehw.a && !$$11.a(czh.by) && !$$11.a(czh.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, atp.ts, atq.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dqr.e, $$2, dqr.a.a($$9));
      }

      return true;
   }

   public static boolean a(dme $$0, cwe $$1, ib $$2, ih $$3, boolean $$4, ih $$5) {
      if ($$2.v() < $$1.J_() || $$2.v() > $$1.ak() - 1 || !$$1.D_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(czh.co) || $$0.a(czh.pk) || $$0.a(czh.pl) || $$0.a(czh.to)) {
         return false;
      } else if ($$3 == ih.a && $$2.v() == $$1.J_()) {
         return false;
      } else if ($$3 == ih.b && $$2.v() == $$1.ak() - 1) {
         return false;
      } else {
         if (!$$0.a(czh.by) && !$$0.a(czh.br)) {
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
         } else if ($$0.c(c)) {
            return false;
         }

         return !$$0.t();
      }
   }

   private boolean a(cwe $$0, ib $$1, ih $$2, boolean $$3) {
      ib $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(czh.bz)) {
         $$0.a($$4, czh.a.o(), 20);
      }

      dmb $$5 = new dmb($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ib, dme> $$6 = Maps.newHashMap();
         List<ib> $$7 = $$5.c();
         List<dme> $$8 = Lists.newArrayList();

         for (ib $$9 : $$7) {
            dme $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ib> $$11 = $$5.d();
         dme[] $$12 = new dme[$$7.size() + $$11.size()];
         ih $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ib $$16 = $$11.get($$15);
            dme $$17 = $$0.a_($$16);
            djl $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, czh.a.o(), 18);
            $$0.a(dqr.f, $$16, dqr.a.a($$17));
            if (!$$17.a(aue.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ib $$20 = $$7.get($$19);
            dme $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dme $$22 = czh.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dlw.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dng $$23 = this.n ? dng.b : dng.a;
            dme $$24 = czh.bz.o().a(dly.a, $$2).a(dly.c, $$23);
            dme $$25 = czh.bQ.o().a(dlw.b, $$2).a(dlw.c, this.n ? dng.b : dng.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dlw.a($$4, $$25, $$24, $$2, true, true));
         }

         dme $$26 = czh.a.o();

         for (ib $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ib, dme> $$28 : $$6.entrySet()) {
            ib $$29 = $$28.getKey();
            dme $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dme $$32 = $$12[$$14++];
            ib $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, czh.bz);
         }

         return true;
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dme $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}

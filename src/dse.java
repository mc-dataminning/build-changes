import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dse extends dhl {
   public static final MapCodec<dse> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dse::new)
   );
   public static final dtc c = dtb.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final exa h = dfi.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final exa i = dfi.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exa j = dfi.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final exa k = dfi.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final exa l = dfi.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final exa m = dfi.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dse> a() {
      return b;
   }

   public dse(boolean $$0, dsk.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, jf.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      if ($$0.c(c)) {
         switch ((jf)$$0.c(a)) {
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
         return ewx.b();
      }
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, btc $$3, cud $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dsl a(cxn $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dcg $$0, ja $$1, dsl $$2) {
      jf $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dsi($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ja $$5 = $$1.a($$3, 2);
         dsl $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dfk.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dsh $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((aqm)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dcw $$0, ja $$1, jf $$2) {
      for (jf $$3 : jf.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jf.a)) {
         return true;
      } else {
         ja $$4 = $$1.c();

         for (jf $$5 : jf.values()) {
            if ($$5 != jf.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dsl $$0, dcg $$1, ja $$2, int $$3, int $$4) {
      jf $$5 = $$0.c(a);
      dsl $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avh.ua, avi.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dxh.a, $$2, dxh.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dpq $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dsh) {
            ((dsh)$$8).k();
         }

         dsl $$9 = dfk.bQ.o().a(dsd.b, $$5).a(dsd.c, this.n ? dtn.b : dtn.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dsd.a($$2, $$9, this.o().a(a, jf.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ja $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dsl $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dfk.bQ) && $$1.c_($$10) instanceof dsh $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eoo.a && !$$11.a(dfk.by) && !$$11.a(dfk.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avh.tZ, avi.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dxh.e, $$2, dxh.a.a($$9));
      }

      return true;
   }

   public static boolean a(dsl $$0, dcg $$1, ja $$2, jf $$3, boolean $$4, jf $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dfk.co) || $$0.a(dfk.pk) || $$0.a(dfk.pl) || $$0.a(dfk.to)) {
         return false;
      } else if ($$3 == jf.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == jf.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dfk.by) && !$$0.a(dfk.br)) {
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

   private boolean a(dcg $$0, ja $$1, jf $$2, boolean $$3) {
      ja $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dfk.bz)) {
         $$0.a($$4, dfk.a.o(), 20);
      }

      dsi $$5 = new dsi($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ja, dsl> $$6 = Maps.newHashMap();
         List<ja> $$7 = $$5.c();
         List<dsl> $$8 = Lists.newArrayList();

         for (ja $$9 : $$7) {
            dsl $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ja> $$11 = $$5.d();
         dsl[] $$12 = new dsl[$$7.size() + $$11.size()];
         jf $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ja $$16 = $$11.get($$15);
            dsl $$17 = $$0.a_($$16);
            dpq $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dfk.a.o(), 18);
            $$0.a(dxh.f, $$16, dxh.a.a($$17));
            if (!$$17.a(avw.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ja $$20 = $$7.get($$19);
            dsl $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dsl $$22 = dfk.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dsd.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dtn $$23 = this.n ? dtn.b : dtn.a;
            dsl $$24 = dfk.bz.o().a(dsf.a, $$2).a(dsf.c, $$23);
            dsl $$25 = dfk.bQ.o().a(dsd.b, $$2).a(dsd.c, this.n ? dtn.b : dtn.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dsd.a($$4, $$25, $$24, $$2, true, true));
         }

         dsl $$26 = dfk.a.o();

         for (ja $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ja, dsl> $$28 : $$6.entrySet()) {
            ja $$29 = $$28.getKey();
            dsl $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dsl $$32 = $$12[$$14++];
            ja $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dfk.bz);
         }

         return true;
      }
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dsl $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dsd extends dhk {
   public static final MapCodec<dsd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dsd::new)
   );
   public static final dtb c = dta.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ewy h = dfh.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ewy i = dfh.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewy j = dfh.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ewy k = dfh.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ewy l = dfh.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ewy m = dfh.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dsd> a() {
      return b;
   }

   public dsd(boolean $$0, dsj.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, jf.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
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
         return ewv.b();
      }
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, btb $$3, cuc $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dcf $$0, ja $$1, dsk $$2) {
      jf $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dsh($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ja $$5 = $$1.a($$3, 2);
         dsk $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dfj.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dsg $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((aqm)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dcv $$0, ja $$1, jf $$2) {
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
   protected boolean a(dsk $$0, dcf $$1, ja $$2, int $$3, int $$4) {
      jf $$5 = $$0.c(a);
      dsk $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(dxg.a, $$2, dxg.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dpp $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dsg) {
            ((dsg)$$8).k();
         }

         dsk $$9 = dfj.bQ.o().a(dsc.b, $$5).a(dsc.c, this.n ? dtm.b : dtm.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dsc.a($$2, $$9, this.o().a(a, jf.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ja $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dsk $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dfj.bQ) && $$1.c_($$10) instanceof dsg $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eom.a && !$$11.a(dfj.by) && !$$11.a(dfj.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avh.tZ, avi.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dxg.e, $$2, dxg.a.a($$9));
      }

      return true;
   }

   public static boolean a(dsk $$0, dcf $$1, ja $$2, jf $$3, boolean $$4, jf $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dfj.co) || $$0.a(dfj.pk) || $$0.a(dfj.pl) || $$0.a(dfj.to)) {
         return false;
      } else if ($$3 == jf.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == jf.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dfj.by) && !$$0.a(dfj.br)) {
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

   private boolean a(dcf $$0, ja $$1, jf $$2, boolean $$3) {
      ja $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dfj.bz)) {
         $$0.a($$4, dfj.a.o(), 20);
      }

      dsh $$5 = new dsh($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ja, dsk> $$6 = Maps.newHashMap();
         List<ja> $$7 = $$5.c();
         List<dsk> $$8 = Lists.newArrayList();

         for (ja $$9 : $$7) {
            dsk $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ja> $$11 = $$5.d();
         dsk[] $$12 = new dsk[$$7.size() + $$11.size()];
         jf $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ja $$16 = $$11.get($$15);
            dsk $$17 = $$0.a_($$16);
            dpp $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dfj.a.o(), 18);
            $$0.a(dxg.f, $$16, dxg.a.a($$17));
            if (!$$17.a(avw.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ja $$20 = $$7.get($$19);
            dsk $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dsk $$22 = dfj.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dsc.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dtm $$23 = this.n ? dtm.b : dtm.a;
            dsk $$24 = dfj.bz.o().a(dse.a, $$2).a(dse.c, $$23);
            dsk $$25 = dfj.bQ.o().a(dsc.b, $$2).a(dsc.c, this.n ? dtm.b : dtm.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dsc.a($$4, $$25, $$24, $$2, true, true));
         }

         dsk $$26 = dfj.a.o();

         for (ja $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ja, dsk> $$28 : $$6.entrySet()) {
            ja $$29 = $$28.getKey();
            dsk $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dsk $$32 = $$12[$$14++];
            ja $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dfj.bz);
         }

         return true;
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dsk $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}

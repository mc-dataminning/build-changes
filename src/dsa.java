import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dsa extends dhi {
   public static final MapCodec<dsa> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dsa::new)
   );
   public static final dsy c = dsx.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ews h = dff.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ews i = dff.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ews j = dff.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ews k = dff.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ews l = dff.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ews m = dff.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dsa> a() {
      return b;
   }

   public dsa(boolean $$0, dsg.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, jf.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
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
         return ewp.b();
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsy $$3, cua $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dsh a(cxk $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dcd $$0, ja $$1, dsh $$2) {
      jf $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dse($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ja $$5 = $$1.a($$3, 2);
         dsh $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dfh.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dsd $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((aqk)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dct $$0, ja $$1, jf $$2) {
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
   protected boolean a(dsh $$0, dcd $$1, ja $$2, int $$3, int $$4) {
      jf $$5 = $$0.c(a);
      dsh $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avf.ua, avg.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dxa.a, $$2, dxa.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dpn $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dsd) {
            ((dsd)$$8).k();
         }

         dsh $$9 = dfh.bQ.o().a(drz.b, $$5).a(drz.c, this.n ? dtj.b : dtj.a);
         $$1.a($$2, $$9, 20);
         $$1.a(drz.a($$2, $$9, this.o().a(a, jf.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ja $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dsh $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dfh.bQ) && $$1.c_($$10) instanceof dsd $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eog.a && !$$11.a(dfh.by) && !$$11.a(dfh.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avf.tZ, avg.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dxa.e, $$2, dxa.a.a($$9));
      }

      return true;
   }

   public static boolean a(dsh $$0, dcd $$1, ja $$2, jf $$3, boolean $$4, jf $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dfh.co) || $$0.a(dfh.pk) || $$0.a(dfh.pl) || $$0.a(dfh.to)) {
         return false;
      } else if ($$3 == jf.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == jf.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dfh.by) && !$$0.a(dfh.br)) {
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

   private boolean a(dcd $$0, ja $$1, jf $$2, boolean $$3) {
      ja $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dfh.bz)) {
         $$0.a($$4, dfh.a.o(), 20);
      }

      dse $$5 = new dse($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ja, dsh> $$6 = Maps.newHashMap();
         List<ja> $$7 = $$5.c();
         List<dsh> $$8 = Lists.newArrayList();

         for (ja $$9 : $$7) {
            dsh $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ja> $$11 = $$5.d();
         dsh[] $$12 = new dsh[$$7.size() + $$11.size()];
         jf $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ja $$16 = $$11.get($$15);
            dsh $$17 = $$0.a_($$16);
            dpn $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dfh.a.o(), 18);
            $$0.a(dxa.f, $$16, dxa.a.a($$17));
            if (!$$17.a(avu.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ja $$20 = $$7.get($$19);
            dsh $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dsh $$22 = dfh.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(drz.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dtj $$23 = this.n ? dtj.b : dtj.a;
            dsh $$24 = dfh.bz.o().a(dsb.a, $$2).a(dsb.c, $$23);
            dsh $$25 = dfh.bQ.o().a(drz.b, $$2).a(drz.c, this.n ? dtj.b : dtj.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(drz.a($$4, $$25, $$24, $$2, true, true));
         }

         dsh $$26 = dfh.a.o();

         for (ja $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ja, dsh> $$28 : $$6.entrySet()) {
            ja $$29 = $$28.getKey();
            dsh $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dsh $$32 = $$12[$$14++];
            ja $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dfh.bz);
         }

         return true;
      }
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dsh $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class drx extends dhe {
   public static final MapCodec<drx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, drx::new)
   );
   public static final dsv c = dsu.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final ewm h = dfb.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final ewm i = dfb.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ewm j = dfb.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final ewm k = dfb.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final ewm l = dfb.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final ewm m = dfb.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<drx> a() {
      return b;
   }

   public drx(boolean $$0, dsd.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, je.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$0.c(c)) {
         switch ((je)$$0.c(a)) {
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
         return ewj.b();
      }
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, btr $$3, cur $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dse a(cyc $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dca $$0, iz $$1, dse $$2) {
      je $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dsb($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         iz $$5 = $$1.a($$3, 2);
         dse $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dfd.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dsa $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((arf)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dcq $$0, iz $$1, je $$2) {
      for (je $$3 : je.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, je.a)) {
         return true;
      } else {
         iz $$4 = $$1.c();

         for (je $$5 : je.values()) {
            if ($$5 != je.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dse $$0, dca $$1, iz $$2, int $$3, int $$4) {
      je $$5 = $$0.c(a);
      dse $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awa.tX, awb.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dwx.a, $$2, dwx.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dpj $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dsa) {
            ((dsa)$$8).k();
         }

         dse $$9 = dfd.bQ.o().a(drw.b, $$5).a(drw.c, this.n ? dtg.b : dtg.a);
         $$1.a($$2, $$9, 20);
         $$1.a(drw.a($$2, $$9, this.o().a(a, je.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            iz $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dse $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dfd.bQ) && $$1.c_($$10) instanceof dsa $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eoc.a && !$$11.a(dfd.by) && !$$11.a(dfd.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awa.tW, awb.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dwx.e, $$2, dwx.a.a($$9));
      }

      return true;
   }

   public static boolean a(dse $$0, dca $$1, iz $$2, je $$3, boolean $$4, je $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dfd.co) || $$0.a(dfd.pk) || $$0.a(dfd.pl) || $$0.a(dfd.to)) {
         return false;
      } else if ($$3 == je.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == je.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dfd.by) && !$$0.a(dfd.br)) {
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

   private boolean a(dca $$0, iz $$1, je $$2, boolean $$3) {
      iz $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dfd.bz)) {
         $$0.a($$4, dfd.a.o(), 20);
      }

      dsb $$5 = new dsb($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<iz, dse> $$6 = Maps.newHashMap();
         List<iz> $$7 = $$5.c();
         List<dse> $$8 = Lists.newArrayList();

         for (iz $$9 : $$7) {
            dse $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<iz> $$11 = $$5.d();
         dse[] $$12 = new dse[$$7.size() + $$11.size()];
         je $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            iz $$16 = $$11.get($$15);
            dse $$17 = $$0.a_($$16);
            dpj $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dfd.a.o(), 18);
            $$0.a(dwx.f, $$16, dwx.a.a($$17));
            if (!$$17.a(awp.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            iz $$20 = $$7.get($$19);
            dse $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dse $$22 = dfd.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(drw.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dtg $$23 = this.n ? dtg.b : dtg.a;
            dse $$24 = dfd.bz.o().a(dry.a, $$2).a(dry.c, $$23);
            dse $$25 = dfd.bQ.o().a(drw.b, $$2).a(drw.c, this.n ? dtg.b : dtg.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(drw.a($$4, $$25, $$24, $$2, true, true));
         }

         dse $$26 = dfd.a.o();

         for (iz $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<iz, dse> $$28 : $$6.entrySet()) {
            iz $$29 = $$28.getKey();
            dse $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dse $$32 = $$12[$$14++];
            iz $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dfd.bz);
         }

         return true;
      }
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dse $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}

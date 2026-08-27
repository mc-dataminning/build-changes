import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dmu extends dcf {
   public static final MapCodec<dmu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dmu::new)
   );
   public static final dns c = dnr.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final eqm h = dac.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eqm i = dac.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqm j = dac.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eqm k = dac.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eqm l = dac.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eqm m = dac.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dmu> a() {
      return b;
   }

   public dmu(boolean $$0, dna.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ih.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
         return eqj.b();
      }
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dmy($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ib $$5 = $$1.a($$3, 2);
         dnb $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dae.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dmx $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.X() == $$9.l() || ((apf)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cxr $$0, ib $$1, ih $$2) {
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
   protected boolean a(dnb $$0, cxb $$1, ib $$2, int $$3, int $$4) {
      ih $$5 = $$0.c(a);
      dnb $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aty.tB, atz.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(drp.a, $$2, drp.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dki $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dmx) {
            ((dmx)$$8).k();
         }

         dnb $$9 = dae.bQ.o().a(dmt.b, $$5).a(dmt.c, this.n ? dod.b : dod.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dmt.a($$2, $$9, this.o().a(a, ih.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ib $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dnb $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dae.bQ) && $$1.c_($$10) instanceof dmx $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eiu.a && !$$11.a(dae.by) && !$$11.a(dae.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aty.tA, atz.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(drp.e, $$2, drp.a.a($$9));
      }

      return true;
   }

   public static boolean a(dnb $$0, cxb $$1, ib $$2, ih $$3, boolean $$4, ih $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.ak() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dae.co) || $$0.a(dae.pk) || $$0.a(dae.pl) || $$0.a(dae.to)) {
         return false;
      } else if ($$3 == ih.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ih.b && $$2.v() == $$1.ak() - 1) {
         return false;
      } else {
         if (!$$0.a(dae.by) && !$$0.a(dae.br)) {
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

   private boolean a(cxb $$0, ib $$1, ih $$2, boolean $$3) {
      ib $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dae.bz)) {
         $$0.a($$4, dae.a.o(), 20);
      }

      dmy $$5 = new dmy($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ib, dnb> $$6 = Maps.newHashMap();
         List<ib> $$7 = $$5.c();
         List<dnb> $$8 = Lists.newArrayList();

         for (ib $$9 : $$7) {
            dnb $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ib> $$11 = $$5.d();
         dnb[] $$12 = new dnb[$$7.size() + $$11.size()];
         ih $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ib $$16 = $$11.get($$15);
            dnb $$17 = $$0.a_($$16);
            dki $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dae.a.o(), 18);
            $$0.a(drp.f, $$16, drp.a.a($$17));
            if (!$$17.a(aun.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ib $$20 = $$7.get($$19);
            dnb $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dnb $$22 = dae.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dmt.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dod $$23 = this.n ? dod.b : dod.a;
            dnb $$24 = dae.bz.o().a(dmv.a, $$2).a(dmv.c, $$23);
            dnb $$25 = dae.bQ.o().a(dmt.b, $$2).a(dmt.c, this.n ? dod.b : dod.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dmt.a($$4, $$25, $$24, $$2, true, true));
         }

         dnb $$26 = dae.a.o();

         for (ib $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ib, dnb> $$28 : $$6.entrySet()) {
            ib $$29 = $$28.getKey();
            dnb $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dnb $$32 = $$12[$$14++];
            ib $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dae.bz);
         }

         return true;
      }
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dnb $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dms extends dcd {
   public static final MapCodec<dms> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dms::new)
   );
   public static final dnq c = dnp.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final eqk h = daa.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eqk i = daa.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eqk j = daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eqk k = daa.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eqk l = daa.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eqk m = daa.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dms> a() {
      return b;
   }

   public dms(boolean $$0, dmy.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ih.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
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
         return eqh.b();
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bpo $$3, cqk $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3, ib $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dmz a(css $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cwz $$0, ib $$1, dmz $$2) {
      ih $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dmw($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ib $$5 = $$1.a($$3, 2);
         dmz $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dac.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dmv $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.X() == $$9.l() || ((apf)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cxp $$0, ib $$1, ih $$2) {
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
   protected boolean a(dmz $$0, cwz $$1, ib $$2, int $$3, int $$4) {
      ih $$5 = $$0.c(a);
      dmz $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aty.tw, atz.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(drn.a, $$2, drn.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dkg $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dmv) {
            ((dmv)$$8).k();
         }

         dmz $$9 = dac.bQ.o().a(dmr.b, $$5).a(dmr.c, this.n ? dob.b : dob.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dmr.a($$2, $$9, this.o().a(a, ih.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ib $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dmz $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dac.bQ) && $$1.c_($$10) instanceof dmv $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != eis.a && !$$11.a(dac.by) && !$$11.a(dac.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aty.tv, atz.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(drn.e, $$2, drn.a.a($$9));
      }

      return true;
   }

   public static boolean a(dmz $$0, cwz $$1, ib $$2, ih $$3, boolean $$4, ih $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.ak() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dac.co) || $$0.a(dac.pk) || $$0.a(dac.pl) || $$0.a(dac.to)) {
         return false;
      } else if ($$3 == ih.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ih.b && $$2.v() == $$1.ak() - 1) {
         return false;
      } else {
         if (!$$0.a(dac.by) && !$$0.a(dac.br)) {
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

   private boolean a(cwz $$0, ib $$1, ih $$2, boolean $$3) {
      ib $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dac.bz)) {
         $$0.a($$4, dac.a.o(), 20);
      }

      dmw $$5 = new dmw($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ib, dmz> $$6 = Maps.newHashMap();
         List<ib> $$7 = $$5.c();
         List<dmz> $$8 = Lists.newArrayList();

         for (ib $$9 : $$7) {
            dmz $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ib> $$11 = $$5.d();
         dmz[] $$12 = new dmz[$$7.size() + $$11.size()];
         ih $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ib $$16 = $$11.get($$15);
            dmz $$17 = $$0.a_($$16);
            dkg $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dac.a.o(), 18);
            $$0.a(drn.f, $$16, drn.a.a($$17));
            if (!$$17.a(aun.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ib $$20 = $$7.get($$19);
            dmz $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dmz $$22 = dac.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dmr.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dob $$23 = this.n ? dob.b : dob.a;
            dmz $$24 = dac.bz.o().a(dmt.a, $$2).a(dmt.c, $$23);
            dmz $$25 = dac.bQ.o().a(dmr.b, $$2).a(dmr.c, this.n ? dob.b : dob.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dmr.a($$4, $$25, $$24, $$2, true, true));
         }

         dmz $$26 = dac.a.o();

         for (ib $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ib, dmz> $$28 : $$6.entrySet()) {
            ib $$29 = $$28.getKey();
            dmz $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dmz $$32 = $$12[$$14++];
            ib $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dac.bz);
         }

         return true;
      }
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dmz $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}

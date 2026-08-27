import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dlc extends dav {
   public static final MapCodec<dlc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dlc::new)
   );
   public static final dma c = dlz.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final eos h = cys.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eos i = cys.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eos j = cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eos k = cys.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eos l = cys.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eos m = cys.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dlc> a() {
      return b;
   }

   public dlc(boolean $$0, dli.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ie.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      if ($$0.c(c)) {
         switch ((ie)$$0.c(a)) {
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
         return eop.b();
      }
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, boi $$3, cpd $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3, hz $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cvr $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dlg($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         hz $$5 = $$1.a($$3, 2);
         dlj $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cyu.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dlf $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.X() == $$9.m() || ((aow)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(cwh $$0, hz $$1, ie $$2) {
      for (ie $$3 : ie.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ie.a)) {
         return true;
      } else {
         hz $$4 = $$1.c();

         for (ie $$5 : ie.values()) {
            if ($$5 != ie.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dlj $$0, cvr $$1, hz $$2, int $$3, int $$4) {
      ie $$5 = $$0.c(a);
      dlj $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, atl.tt, atm.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dpw.a, $$2, dpw.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dix $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dlf) {
            ((dlf)$$8).l();
         }

         dlj $$9 = cyu.bQ.o().a(dlb.b, $$5).a(dlb.c, this.n ? dml.b : dml.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dlb.a($$2, $$9, this.o().a(a, ie.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            hz $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dlj $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cyu.bQ) && $$1.c_($$10) instanceof dlf $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.l();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != ehb.a && !$$11.a(cyu.by) && !$$11.a(cyu.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, atl.ts, atm.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dpw.e, $$2, dpw.a.a($$9));
      }

      return true;
   }

   public static boolean a(dlj $$0, cvr $$1, hz $$2, ie $$3, boolean $$4, ie $$5) {
      if ($$2.v() < $$1.J_() || $$2.v() > $$1.ak() - 1 || !$$1.D_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cyu.co) || $$0.a(cyu.pk) || $$0.a(cyu.pl) || $$0.a(cyu.to)) {
         return false;
      } else if ($$3 == ie.a && $$2.v() == $$1.J_()) {
         return false;
      } else if ($$3 == ie.b && $$2.v() == $$1.ak() - 1) {
         return false;
      } else {
         if (!$$0.a(cyu.by) && !$$0.a(cyu.br)) {
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

   private boolean a(cvr $$0, hz $$1, ie $$2, boolean $$3) {
      hz $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cyu.bz)) {
         $$0.a($$4, cyu.a.o(), 20);
      }

      dlg $$5 = new dlg($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<hz, dlj> $$6 = Maps.newHashMap();
         List<hz> $$7 = $$5.c();
         List<dlj> $$8 = Lists.newArrayList();

         for (hz $$9 : $$7) {
            dlj $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<hz> $$11 = $$5.d();
         dlj[] $$12 = new dlj[$$7.size() + $$11.size()];
         ie $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            hz $$16 = $$11.get($$15);
            dlj $$17 = $$0.a_($$16);
            dix $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cyu.a.o(), 18);
            $$0.a(dpw.f, $$16, dpw.a.a($$17));
            if (!$$17.a(aua.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            hz $$20 = $$7.get($$19);
            dlj $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dlj $$22 = cyu.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dlb.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dml $$23 = this.n ? dml.b : dml.a;
            dlj $$24 = cyu.bz.o().a(dld.a, $$2).a(dld.c, $$23);
            dlj $$25 = cyu.bQ.o().a(dlb.b, $$2).a(dlb.c, this.n ? dml.b : dml.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dlb.a($$4, $$25, $$24, $$2, true, true));
         }

         dlj $$26 = cyu.a.o();

         for (hz $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<hz, dlj> $$28 : $$6.entrySet()) {
            hz $$29 = $$28.getKey();
            dlj $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dlj $$32 = $$12[$$14++];
            hz $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cyu.bz);
         }

         return true;
      }
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dlj $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}

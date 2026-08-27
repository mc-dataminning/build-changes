import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dfu extends cwb {
   public static final MapCodec<dfu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dfu::new)
   );
   public static final dgs c = dgr.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final eiy h = cua.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final eiy i = cua.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eiy j = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final eiy k = cua.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final eiy l = cua.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final eiy m = cua.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dfu> a() {
      return b;
   }

   public dfu(boolean $$0, dga.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, hx.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$0.c(c)) {
         switch ((hx)$$0.c(a)) {
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
         return eiv.b();
      }
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dgb a(cmr $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(cqz $$0, ht $$1, dgb $$2) {
      hx $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dfy($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ht $$5 = $$1.a($$3, 2);
         dgb $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(cuc.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dfx $$9 && $$9.c() && ($$9.a(0.0F) < 0.5F || $$0.V() == $$9.v() || ((alq)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(crp $$0, ht $$1, hx $$2) {
      for (hx $$3 : hx.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, hx.a)) {
         return true;
      } else {
         ht $$4 = $$1.c();

         for (hx $$5 : hx.values()) {
            if ($$5 != hx.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, int $$3, int $$4) {
      hx $$5 = $$0.c(a);
      dgb $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, aqd.sq, aqe.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dkl.a, $$2, dkl.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         ddx $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dfx) {
            ((dfx)$$8).j();
         }

         dgb $$9 = cuc.bQ.o().a(dft.b, $$5).a(dft.c, this.n ? dhd.b : dhd.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dft.a($$2, $$9, this.o().a(a, hx.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ht $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dgb $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(cuc.bQ) && $$1.c_($$10) instanceof dfx $$14 && $$14.d() == $$5 && $$14.c()) {
               $$14.j();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != ebj.a && !$$11.a(cuc.by) && !$$11.a(cuc.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, aqd.sp, aqe.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dkl.e, $$2, dkl.a.a($$9));
      }

      return true;
   }

   public static boolean a(dgb $$0, cqz $$1, ht $$2, hx $$3, boolean $$4, hx $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.aj() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(cuc.co) || $$0.a(cuc.pk) || $$0.a(cuc.pl) || $$0.a(cuc.sn)) {
         return false;
      } else if ($$3 == hx.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == hx.b && $$2.v() == $$1.aj() - 1) {
         return false;
      } else {
         if (!$$0.a(cuc.by) && !$$0.a(cuc.br)) {
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

   private boolean a(cqz $$0, ht $$1, hx $$2, boolean $$3) {
      ht $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(cuc.bz)) {
         $$0.a($$4, cuc.a.o(), 20);
      }

      dfy $$5 = new dfy($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ht, dgb> $$6 = Maps.newHashMap();
         List<ht> $$7 = $$5.c();
         List<dgb> $$8 = Lists.newArrayList();

         for (ht $$9 : $$7) {
            dgb $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ht> $$11 = $$5.d();
         dgb[] $$12 = new dgb[$$7.size() + $$11.size()];
         hx $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ht $$16 = $$11.get($$15);
            dgb $$17 = $$0.a_($$16);
            ddx $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, cuc.a.o(), 18);
            $$0.a(dkl.f, $$16, dkl.a.a($$17));
            if (!$$17.a(aqs.aJ)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ht $$20 = $$7.get($$19);
            dgb $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dgb $$22 = cuc.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dft.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dhd $$23 = this.n ? dhd.b : dhd.a;
            dgb $$24 = cuc.bz.o().a(dfv.a, $$2).a(dfv.c, $$23);
            dgb $$25 = cuc.bQ.o().a(dft.b, $$2).a(dft.c, this.n ? dhd.b : dhd.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dft.a($$4, $$25, $$24, $$2, true, true));
         }

         dgb $$26 = cuc.a.o();

         for (ht $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ht, dgb> $$28 : $$6.entrySet()) {
            ht $$29 = $$28.getKey();
            dgb $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dgb $$32 = $$12[$$14++];
            ht $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, cuc.bz);
         }

         return true;
      }
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(a, c);
   }

   @Override
   public boolean g_(dgb $$0) {
      return $$0.c(c);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}

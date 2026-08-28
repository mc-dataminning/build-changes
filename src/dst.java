import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class dst extends dhz {
   public static final MapCodec<dst> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), u()).apply($$0, dst::new)
   );
   public static final dtr c = dtq.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final exp h = dfw.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final exp i = dfw.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final exp j = dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final exp k = dfw.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final exp l = dfw.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final exp m = dfw.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dst> a() {
      return b;
   }

   public dst(boolean $$0, dsz.d $$1) {
      super($$1);
      this.k(this.E.b().a(a, ji.c).a(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      if ($$0.c(c)) {
         switch ((ji)$$0.c(a)) {
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
         return exm.b();
      }
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, btl $$3, cuo $$4) {
      if (!$$0.B) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      if (!$$1.B) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.B && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dta a(cyb $$0) {
      return this.o().a(a, $$0.d().g()).a(c, Boolean.valueOf(false));
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      ji $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dsx($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jd $$5 = $$1.a($$3, 2);
         dta $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dfy.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dsw $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.Z() == $$9.l() || ((aqt)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(ddk $$0, jd $$1, ji $$2) {
      for (ji $$3 : ji.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ji.a)) {
         return true;
      } else {
         jd $$4 = $$1.c();

         for (ji $$5 : ji.values()) {
            if ($$5 != ji.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dta $$0, dcu $$1, jd $$2, int $$3, int $$4) {
      ji $$5 = $$0.c(a);
      dta $$6 = $$0.a(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, avo.ua, avp.e, 0.5F, $$1.z.i() * 0.25F + 0.6F);
         $$1.a(dxw.a, $$2, dxw.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dqf $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dsw) {
            ((dsw)$$8).k();
         }

         dta $$9 = dfy.bQ.o().a(dss.b, $$5).a(dss.c, this.n ? duc.b : duc.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dss.a($$2, $$9, this.o().a(a, ji.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jd $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dta $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dfy.bQ) && $$1.c_($$10) instanceof dsw $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.i() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.o() != epd.a && !$$11.a(dfy.by) && !$$11.a(dfy.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, avo.tZ, avp.e, 0.5F, $$1.z.i() * 0.15F + 0.6F);
         $$1.a(dxw.e, $$2, dxw.a.a($$9));
      }

      return true;
   }

   public static boolean a(dta $$0, dcu $$1, jd $$2, ji $$3, boolean $$4, ji $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.am() - 1 || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.i()) {
         return true;
      } else if ($$0.a(dfy.co) || $$0.a(dfy.pk) || $$0.a(dfy.pl) || $$0.a(dfy.to)) {
         return false;
      } else if ($$3 == ji.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == ji.b && $$2.v() == $$1.am() - 1) {
         return false;
      } else {
         if (!$$0.a(dfy.by) && !$$0.a(dfy.br)) {
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

   private boolean a(dcu $$0, jd $$1, ji $$2, boolean $$3) {
      jd $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dfy.bz)) {
         $$0.a($$4, dfy.a.o(), 20);
      }

      dsx $$5 = new dsx($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jd, dta> $$6 = Maps.newHashMap();
         List<jd> $$7 = $$5.c();
         List<dta> $$8 = Lists.newArrayList();

         for (jd $$9 : $$7) {
            dta $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jd> $$11 = $$5.d();
         dta[] $$12 = new dta[$$7.size() + $$11.size()];
         ji $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jd $$16 = $$11.get($$15);
            dta $$17 = $$0.a_($$16);
            dqf $$18 = $$17.t() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dfy.a.o(), 18);
            $$0.a(dxw.f, $$16, dxw.a.a($$17));
            if (!$$17.a(awd.aK)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jd $$20 = $$7.get($$19);
            dta $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dta $$22 = dfy.bQ.o().a(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dss.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            duc $$23 = this.n ? duc.b : duc.a;
            dta $$24 = dfy.bz.o().a(dsu.a, $$2).a(dsu.c, $$23);
            dta $$25 = dfy.bQ.o().a(dss.b, $$2).a(dss.c, this.n ? duc.b : duc.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dss.a($$4, $$25, $$24, $$2, true, true));
         }

         dta $$26 = dfy.a.o();

         for (jd $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jd, dta> $$28 : $$6.entrySet()) {
            jd $$29 = $$28.getKey();
            dta $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         $$14 = 0;

         for (int $$31 = $$11.size() - 1; $$31 >= 0; $$31--) {
            dta $$32 = $$12[$$14++];
            jd $$33 = $$11.get($$31);
            $$32.b($$0, $$33, 2);
            $$0.a($$33, $$32.b());
         }

         for (int $$34 = $$7.size() - 1; $$34 >= 0; $$34--) {
            $$0.a($$7.get($$34), $$12[$$14++].b());
         }

         if ($$3) {
            $$0.a($$4, dfy.bz);
         }

         return true;
      }
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean f_(dta $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}

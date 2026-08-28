import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dwr extends dlr {
   public static final MapCodec<dwr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dwr::new)
   );
   public static final dxp c = dxo.k;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final fbv h = djn.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final fbv i = djn.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fbv j = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final fbv k = djn.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final fbv l = djn.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final fbv m = djn.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dwr> a() {
      return b;
   }

   public dwr(boolean $$0, dwx.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jn.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      if ($$0.c(c)) {
         switch ((jn)$$0.c(a)) {
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
         return fbs.b();
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bvi $$3, cwq $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dgj $$0, ji $$1, dwy $$2) {
      jn $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dwv($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         ji $$5 = $$1.a($$3, 2);
         dwy $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(djp.bX) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dwu $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.ad() == $$9.t() || ((ard)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dhb $$0, ji $$1, jn $$2) {
      for (jn $$3 : jn.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jn.a)) {
         return true;
      } else {
         ji $$4 = $$1.d();

         for (jn $$5 : jn.values()) {
            if ($$5 != jn.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dwy $$0, dgj $$1, ji $$2, int $$3, int $$4) {
      jn $$5 = $$0.c(a);
      dwy $$6 = $$0.b(c, Boolean.valueOf(true));
      if (!$$1.C) {
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
         $$1.a(null, $$2, awa.uA, awb.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(ebu.a, $$2, ebu.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dua $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dwu) {
            ((dwu)$$8).k();
         }

         dwy $$9 = djp.bX.m().b(dwq.b, $$5).b(dwq.c, this.n ? dxz.b : dxz.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dwq.a($$2, $$9, this.m().b(a, jn.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            ji $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dwy $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(djp.bX) && $$1.c_($$10) instanceof dwu $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != etf.a && !$$11.a(djp.bF) && !$$11.a(djp.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awa.uz, awb.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(ebu.e, $$2, ebu.a.a($$9));
      }

      return true;
   }

   public static boolean a(dwy $$0, dgj $$1, ji $$2, jn $$3, boolean $$4, jn $$5) {
      if ($$2.v() < $$1.L_() || $$2.v() > $$1.an() || !$$1.F_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(djp.cv) || $$0.a(djp.pM) || $$0.a(djp.pN) || $$0.a(djp.tQ)) {
         return false;
      } else if ($$3 == jn.a && $$2.v() == $$1.L_()) {
         return false;
      } else if ($$3 == jn.b && $$2.v() == $$1.an()) {
         return false;
      } else {
         if (!$$0.a(djp.bF) && !$$0.a(djp.by)) {
            if ($$0.e($$1, $$2) == -1.0F) {
               return false;
            }

            switch ($$0.r()) {
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

         return !$$0.x();
      }
   }

   private boolean a(dgj $$0, ji $$1, jn $$2, boolean $$3) {
      ji $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(djp.bG)) {
         $$0.a($$4, djp.a.m(), 20);
      }

      dwv $$5 = new dwv($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<ji, dwy> $$6 = Maps.newHashMap();
         List<ji> $$7 = $$5.c();
         List<dwy> $$8 = Lists.newArrayList();

         for (ji $$9 : $$7) {
            dwy $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<ji> $$11 = $$5.d();
         dwy[] $$12 = new dwy[$$7.size() + $$11.size()];
         jn $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            ji $$16 = $$11.get($$15);
            dwy $$17 = $$0.a_($$16);
            dua $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, djp.a.m(), 18);
            $$0.a(ebu.f, $$16, ebu.a.a($$17));
            if (!$$17.a(awp.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            ji $$20 = $$7.get($$19);
            dwy $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dwy $$22 = djp.bX.m().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dwq.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dxz $$23 = this.n ? dxz.b : dxz.a;
            dwy $$24 = djp.bG.m().b(dws.a, $$2).b(dws.c, $$23);
            dwy $$25 = djp.bX.m().b(dwq.b, $$2).b(dwq.c, this.n ? dxz.b : dxz.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dwq.a($$4, $$25, $$24, $$2, true, true));
         }

         dwy $$26 = djp.a.m();

         for (ji $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<ji, dwy> $$28 : $$6.entrySet()) {
            ji $$29 = $$28.getKey();
            dwy $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         eui $$31 = eue.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dwy $$33 = $$12[$$14++];
            ji $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, djp.bG, $$31);
         }

         return true;
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dwy $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}

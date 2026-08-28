import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dyf extends dmy {
   public static final MapCodec<dyf> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.i), t()).apply($$0, dyf::new)
   );
   public static final dzd c = dzc.j;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final int g = 4;
   private static final Map<jo, fdo> h = fdl.d(dku.c(16.0, 4.0, 16.0));
   private final boolean i;

   @Override
   public MapCodec<dyf> a() {
      return b;
   }

   public dyf(boolean $$0, dyl.d $$1) {
      super($$1);
      this.l(this.B.b().b(a, jo.c).b(c, Boolean.valueOf(false)));
      this.i = $$0;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(c) ? h.get($$0.c(a)) : fdl.b();
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bwr $$3, cxy $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dym a(dbn $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dhp $$0, jj $$1, dym $$2) {
      jo $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dyj($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jj $$5 = $$1.a($$3, 2);
         dym $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dkw.bX) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dyi $$9 && $$9.a() && ($$9.a(0.0F) < 0.5F || $$0.ae() == $$9.t() || ((arn)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dih $$0, jj $$1, jo $$2) {
      for (jo $$3 : jo.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jo.a)) {
         return true;
      } else {
         jj $$4 = $$1.d();

         for (jo $$5 : jo.values()) {
            if ($$5 != jo.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dym $$0, dhp $$1, jj $$2, int $$3, int $$4) {
      jo $$5 = $$0.c(a);
      dym $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awk.uK, awl.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(edm.a, $$2, edm.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dvl $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dyi) {
            ((dyi)$$8).k();
         }

         dym $$9 = dkw.bX.m().b(dye.b, $$5).b(dye.c, this.i ? dzo.b : dzo.a);
         $$1.a($$2, $$9, 276);
         $$1.a(dye.a($$2, $$9, this.m().b(a, jo.a($$4 & 7)), $$5, false, true));
         $$1.a($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.i) {
            jj $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dym $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dkw.bX) && $$1.c_($$10) instanceof dyi $$14 && $$14.c() == $$5 && $$14.a()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != euy.a && !$$11.a(dkw.bF) && !$$11.a(dkw.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awk.uJ, awl.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(edm.e, $$2, edm.a.a($$9));
      }

      return true;
   }

   public static boolean a(dym $$0, dhp $$1, jj $$2, jo $$3, boolean $$4, jo $$5) {
      if ($$2.v() < $$1.G_() || $$2.v() > $$1.ao() || !$$1.A_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dkw.cv) || $$0.a(dkw.pO) || $$0.a(dkw.pP) || $$0.a(dkw.tU)) {
         return false;
      } else if ($$3 == jo.a && $$2.v() == $$1.G_()) {
         return false;
      } else if ($$3 == jo.b && $$2.v() == $$1.ao()) {
         return false;
      } else {
         if (!$$0.a(dkw.bF) && !$$0.a(dkw.by)) {
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

   private boolean a(dhp $$0, jj $$1, jo $$2, boolean $$3) {
      jj $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dkw.bG)) {
         $$0.a($$4, dkw.a.m(), 276);
      }

      dyj $$5 = new dyj($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jj, dym> $$6 = Maps.newHashMap();
         List<jj> $$7 = $$5.c();
         List<dym> $$8 = Lists.newArrayList();

         for (jj $$9 : $$7) {
            dym $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jj> $$11 = $$5.d();
         dym[] $$12 = new dym[$$7.size() + $$11.size()];
         jo $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jj $$16 = $$11.get($$15);
            dym $$17 = $$0.a_($$16);
            dvl $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dkw.a.m(), 18);
            $$0.a(edm.f, $$16, edm.a.a($$17));
            if (!$$17.a(awz.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jj $$20 = $$7.get($$19);
            dym $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dym $$22 = dkw.bX.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.a(dye.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dzo $$23 = this.i ? dzo.b : dzo.a;
            dym $$24 = dkw.bG.m().b(dyg.a, $$2).b(dyg.c, $$23);
            dym $$25 = dkw.bX.m().b(dye.b, $$2).b(dye.c, this.i ? dzo.b : dzo.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 324);
            $$0.a(dye.a($$4, $$25, $$24, $$2, true, true));
         }

         dym $$26 = dkw.a.m();

         for (jj $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jj, dym> $$28 : $$6.entrySet()) {
            jj $$29 = $$28.getKey();
            dym $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         ewb $$31 = evx.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dym $$33 = $$12[$$14++];
            jj $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dkw.bG, $$31);
         }

         return true;
      }
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dym $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}

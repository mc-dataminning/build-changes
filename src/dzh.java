import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dzh extends dny {
   public static final MapCodec<dzh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.i), t()).apply($$0, dzh::new)
   );
   public static final eaf c = eae.j;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final int g = 4;
   private static final Map<ja, feq> h = fen.d(dlu.c(16.0, 4.0, 16.0));
   private final boolean i;

   @Override
   public MapCodec<dzh> a() {
      return b;
   }

   public dzh(boolean $$0, dzn.d $$1) {
      super($$1);
      this.l(this.B.b().b(a, ja.c).b(c, Boolean.valueOf(false)));
      this.i = $$0;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(c) ? h.get($$0.c(a)) : fen.b();
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwz $$3, cys $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dzo a(dcl $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dip $$0, iu $$1, dzo $$2) {
      ja $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dzl($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         iu $$5 = $$1.a($$3, 2);
         dzo $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dlw.bX) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dzk $$9 && $$9.a() && ($$9.a(0.0F) < 0.5F || $$0.ae() == $$9.t() || ((aro)$$0).d())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(djh $$0, iu $$1, ja $$2) {
      for (ja $$3 : ja.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, ja.a)) {
         return true;
      } else {
         iu $$4 = $$1.d();

         for (ja $$5 : ja.values()) {
            if ($$5 != ja.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dzo $$0, dip $$1, iu $$2, int $$3, int $$4) {
      ja $$5 = $$0.c(a);
      dzo $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awl.uK, awm.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(eeo.a, $$2, eeo.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dwn $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dzk) {
            ((dzk)$$8).k();
         }

         dzo $$9 = dlw.bX.m().b(dzg.b, $$5).b(dzg.c, this.i ? eaq.b : eaq.a);
         $$1.a($$2, $$9, 276);
         $$1.a(dzg.a($$2, $$9, this.m().b(a, ja.a($$4 & 7)), $$5, false, true));
         $$1.a($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.i) {
            iu $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dzo $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dlw.bX) && $$1.c_($$10) instanceof dzk $$14 && $$14.c() == $$5 && $$14.a()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != ewa.a && !$$11.a(dlw.bF) && !$$11.a(dlw.by)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awl.uJ, awm.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(eeo.e, $$2, eeo.a.a($$9));
      }

      return true;
   }

   public static boolean a(dzo $$0, dip $$1, iu $$2, ja $$3, boolean $$4, ja $$5) {
      if ($$2.v() < $$1.G_() || $$2.v() > $$1.ao() || !$$1.A_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dlw.cv) || $$0.a(dlw.pO) || $$0.a(dlw.pP) || $$0.a(dlw.tU)) {
         return false;
      } else if ($$3 == ja.a && $$2.v() == $$1.G_()) {
         return false;
      } else if ($$3 == ja.b && $$2.v() == $$1.ao()) {
         return false;
      } else {
         if (!$$0.a(dlw.bF) && !$$0.a(dlw.by)) {
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

   private boolean a(dip $$0, iu $$1, ja $$2, boolean $$3) {
      iu $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dlw.bG)) {
         $$0.a($$4, dlw.a.m(), 276);
      }

      dzl $$5 = new dzl($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<iu, dzo> $$6 = Maps.newHashMap();
         List<iu> $$7 = $$5.c();
         List<dzo> $$8 = Lists.newArrayList();

         for (iu $$9 : $$7) {
            dzo $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<iu> $$11 = $$5.d();
         dzo[] $$12 = new dzo[$$7.size() + $$11.size()];
         ja $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            iu $$16 = $$11.get($$15);
            dzo $$17 = $$0.a_($$16);
            dwn $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dlw.a.m(), 18);
            $$0.a(eeo.f, $$16, eeo.a.a($$17));
            if (!$$17.a(axa.aN)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            iu $$20 = $$7.get($$19);
            dzo $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dzo $$22 = dlw.bX.m().b(a, $$2);
            $$0.a($$20, $$22, 324);
            $$0.a(dzg.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            eaq $$23 = this.i ? eaq.b : eaq.a;
            dzo $$24 = dlw.bG.m().b(dzi.a, $$2).b(dzi.c, $$23);
            dzo $$25 = dlw.bX.m().b(dzg.b, $$2).b(dzg.c, this.i ? eaq.b : eaq.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 324);
            $$0.a(dzg.a($$4, $$25, $$24, $$2, true, true));
         }

         dzo $$26 = dlw.a.m();

         for (iu $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<iu, dzo> $$28 : $$6.entrySet()) {
            iu $$29 = $$28.getKey();
            dzo $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         exd $$31 = ewz.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dzo $$33 = $$12[$$14++];
            iu $$34 = $$11.get($$32);
            if ($$0 instanceof aro $$35) {
               $$33.a($$35, $$34, false);
            }

            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$36 = $$7.size() - 1; $$36 >= 0; $$36--) {
            $$0.a($$7.get($$36), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dlw.bG, $$31);
         }

         return true;
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dzo $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}

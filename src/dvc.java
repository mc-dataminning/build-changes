import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class dvc extends dkh {
   public static final MapCodec<dvc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.fieldOf("sticky").forGetter($$0x -> $$0x.n), t()).apply($$0, dvc::new)
   );
   public static final dwa c = dvz.g;
   public static final int d = 0;
   public static final int e = 1;
   public static final int f = 2;
   public static final float g = 4.0F;
   protected static final fah h = die.a(0.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   protected static final fah i = die.a(4.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final fah j = die.a(0.0, 0.0, 0.0, 16.0, 16.0, 12.0);
   protected static final fah k = die.a(0.0, 0.0, 4.0, 16.0, 16.0, 16.0);
   protected static final fah l = die.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   protected static final fah m = die.a(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
   private final boolean n;

   @Override
   public MapCodec<dvc> a() {
      return b;
   }

   public dvc(boolean $$0, dvi.d $$1) {
      super($$1);
      this.l(this.F.b().b(a, jm.c).b(c, Boolean.valueOf(false)));
      this.n = $$0;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$0.c(c)) {
         switch ((jm)$$0.c(a)) {
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
         return fae.b();
      }
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bva $$3, cwb $$4) {
      if (!$$0.C) {
         this.a($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (!$$1.C && $$1.c_($$2) == null) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public dvj a(czs $$0) {
      return this.m().b(a, $$0.d().g()).b(c, Boolean.valueOf(false));
   }

   private void a(dfb $$0, jh $$1, dvj $$2) {
      jm $$3 = $$2.c(a);
      boolean $$4 = this.a($$0, $$1, $$3);
      if ($$4 && !$$2.c(c)) {
         if (new dvg($$0, $$1, $$3, true).a()) {
            $$0.a($$1, this, 0, $$3.d());
         }
      } else if (!$$4 && $$2.c(c)) {
         jh $$5 = $$1.a($$3, 2);
         dvj $$6 = $$0.a_($$5);
         int $$7 = 1;
         if ($$6.a(dig.bQ) && $$6.c(a) == $$3 && $$0.c_($$5) instanceof dvf $$9 && $$9.b() && ($$9.a(0.0F) < 0.5F || $$0.aa() == $$9.u() || ((arn)$$0).c())) {
            $$7 = 2;
         }

         $$0.a($$1, this, $$7, $$3.d());
      }
   }

   private boolean a(dfs $$0, jh $$1, jm $$2) {
      for (jm $$3 : jm.values()) {
         if ($$3 != $$2 && $$0.b($$1.a($$3), $$3)) {
            return true;
         }
      }

      if ($$0.b($$1, jm.a)) {
         return true;
      } else {
         jh $$4 = $$1.d();

         for (jm $$5 : jm.values()) {
            if ($$5 != jm.a && $$0.b($$4.a($$5), $$5)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a(dvj $$0, dfb $$1, jh $$2, int $$3, int $$4) {
      jm $$5 = $$0.c(a);
      dvj $$6 = $$0.b(c, Boolean.valueOf(true));
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
         $$1.a(null, $$2, awl.tZ, awm.e, 0.5F, $$1.A.i() * 0.25F + 0.6F);
         $$1.a(eag.a, $$2, eag.a.a($$6));
      } else if ($$3 == 1 || $$3 == 2) {
         dsm $$8 = $$1.c_($$2.a($$5));
         if ($$8 instanceof dvf) {
            ((dvf)$$8).k();
         }

         dvj $$9 = dig.bQ.m().b(dvb.b, $$5).b(dvb.c, this.n ? dwl.b : dwl.a);
         $$1.a($$2, $$9, 20);
         $$1.a(dvb.a($$2, $$9, this.m().b(a, jm.a($$4 & 7)), $$5, false, true));
         $$1.b($$2, $$9.b());
         $$9.a($$1, $$2, 2);
         if (this.n) {
            jh $$10 = $$2.b($$5.j() * 2, $$5.k() * 2, $$5.l() * 2);
            dvj $$11 = $$1.a_($$10);
            boolean $$12 = false;
            if ($$11.a(dig.bQ) && $$1.c_($$10) instanceof dvf $$14 && $$14.c() == $$5 && $$14.b()) {
               $$14.k();
               $$12 = true;
            }

            if (!$$12) {
               if ($$3 != 1 || $$11.l() || !a($$11, $$1, $$10, $$5.g(), false, $$5) || $$11.r() != erp.a && !$$11.a(dig.by) && !$$11.a(dig.br)) {
                  $$1.a($$2.a($$5), false);
               } else {
                  this.a($$1, $$2, $$5, false);
               }
            }
         } else {
            $$1.a($$2.a($$5), false);
         }

         $$1.a(null, $$2, awl.tY, awm.e, 0.5F, $$1.A.i() * 0.15F + 0.6F);
         $$1.a(eag.e, $$2, eag.a.a($$9));
      }

      return true;
   }

   public static boolean a(dvj $$0, dfb $$1, jh $$2, jm $$3, boolean $$4, jm $$5) {
      if ($$2.v() < $$1.I_() || $$2.v() > $$1.al() || !$$1.C_().a($$2)) {
         return false;
      } else if ($$0.l()) {
         return true;
      } else if ($$0.a(dig.co) || $$0.a(dig.pk) || $$0.a(dig.pl) || $$0.a(dig.to)) {
         return false;
      } else if ($$3 == jm.a && $$2.v() == $$1.I_()) {
         return false;
      } else if ($$3 == jm.b && $$2.v() == $$1.al()) {
         return false;
      } else {
         if (!$$0.a(dig.by) && !$$0.a(dig.br)) {
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

   private boolean a(dfb $$0, jh $$1, jm $$2, boolean $$3) {
      jh $$4 = $$1.a($$2);
      if (!$$3 && $$0.a_($$4).a(dig.bz)) {
         $$0.a($$4, dig.a.m(), 20);
      }

      dvg $$5 = new dvg($$0, $$1, $$2, $$3);
      if (!$$5.a()) {
         return false;
      } else {
         Map<jh, dvj> $$6 = Maps.newHashMap();
         List<jh> $$7 = $$5.c();
         List<dvj> $$8 = Lists.newArrayList();

         for (jh $$9 : $$7) {
            dvj $$10 = $$0.a_($$9);
            $$8.add($$10);
            $$6.put($$9, $$10);
         }

         List<jh> $$11 = $$5.d();
         dvj[] $$12 = new dvj[$$7.size() + $$11.size()];
         jm $$13 = $$3 ? $$2 : $$2.g();
         int $$14 = 0;

         for (int $$15 = $$11.size() - 1; $$15 >= 0; $$15--) {
            jh $$16 = $$11.get($$15);
            dvj $$17 = $$0.a_($$16);
            dsm $$18 = $$17.x() ? $$0.c_($$16) : null;
            a($$17, $$0, $$16, $$18);
            $$0.a($$16, dig.a.m(), 18);
            $$0.a(eag.f, $$16, eag.a.a($$17));
            if (!$$17.a(axa.aL)) {
               $$0.a($$16, $$17);
            }

            $$12[$$14++] = $$17;
         }

         for (int $$19 = $$7.size() - 1; $$19 >= 0; $$19--) {
            jh $$20 = $$7.get($$19);
            dvj $$21 = $$0.a_($$20);
            $$20 = $$20.a($$13);
            $$6.remove($$20);
            dvj $$22 = dig.bQ.m().b(a, $$2);
            $$0.a($$20, $$22, 68);
            $$0.a(dvb.a($$20, $$22, $$8.get($$19), $$2, $$3, false));
            $$12[$$14++] = $$21;
         }

         if ($$3) {
            dwl $$23 = this.n ? dwl.b : dwl.a;
            dvj $$24 = dig.bz.m().b(dvd.a, $$2).b(dvd.c, $$23);
            dvj $$25 = dig.bQ.m().b(dvb.b, $$2).b(dvb.c, this.n ? dwl.b : dwl.a);
            $$6.remove($$4);
            $$0.a($$4, $$25, 68);
            $$0.a(dvb.a($$4, $$25, $$24, $$2, true, true));
         }

         dvj $$26 = dig.a.m();

         for (jh $$27 : $$6.keySet()) {
            $$0.a($$27, $$26, 82);
         }

         for (Entry<jh, dvj> $$28 : $$6.entrySet()) {
            jh $$29 = $$28.getKey();
            dvj $$30 = $$28.getValue();
            $$30.b($$0, $$29, 2);
            $$26.a($$0, $$29, 2);
            $$26.b($$0, $$29, 2);
         }

         ess $$31 = eso.a($$0, $$5.b(), null);
         $$14 = 0;

         for (int $$32 = $$11.size() - 1; $$32 >= 0; $$32--) {
            dvj $$33 = $$12[$$14++];
            jh $$34 = $$11.get($$32);
            $$33.b($$0, $$34, 2);
            $$0.a($$34, $$33.b(), $$31);
         }

         for (int $$35 = $$7.size() - 1; $$35 >= 0; $$35--) {
            $$0.a($$7.get($$35), $$12[$$14++].b(), $$31);
         }

         if ($$3) {
            $$0.a($$4, dig.bz, $$31);
         }

         return true;
      }
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected boolean g_(dvj $$0) {
      return $$0.c(c);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}

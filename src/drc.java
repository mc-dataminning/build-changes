import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class drc extends die implements dpf {
   public static final MapCodec<drc> a = b(drc::new);
   public static final dwa b = dvz.J;
   public static final dwh<dwv> c = dvz.W;
   public static final dwh<dwv> d = dvz.X;
   public static final dwh<dwv> e = dvz.Y;
   public static final dwh<dwv> f = dvz.Z;
   public static final dwa g = dvz.C;
   private final Map<dvj, fah> h;
   private final Map<dvj, fah> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fah G = die.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fah H = die.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fah I = die.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fah J = die.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fah K = die.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   public drc(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dwv.a).b(c, dwv.a).b(e, dwv.a).b(f, dwv.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fah a(fah $$0, dwv $$1, fah $$2, fah $$3) {
      if ($$1 == dwv.c) {
         return fae.a($$0, $$3);
      } else {
         return $$1 == dwv.b ? fae.a($$0, $$2) : $$0;
      }
   }

   private Map<dvj, fah> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fah $$10 = die.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fah $$11 = die.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fah $$12 = die.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fah $$13 = die.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fah $$14 = die.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fah $$15 = die.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fah $$16 = die.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fah $$17 = die.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fah $$18 = die.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dvj, fah> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dwv $$21 : c.a()) {
            for (dwv $$22 : d.a()) {
               for (dwv $$23 : f.a()) {
                  for (dwv $$24 : e.a()) {
                     fah $$25 = fae.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fae.a($$25, $$10);
                     }

                     dvj $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
                     $$19.put($$26.b(g, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.b(g, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   private boolean a(dvj $$0, boolean $$1, jm $$2) {
      die $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dlc && dlc.a($$0, $$2);
      return $$0.a(axa.M) || !k($$0) && $$1 || $$3 instanceof dme || $$4;
   }

   @Override
   public dvj a(czs $$0) {
      dfe $$1 = $$0.q();
      jh $$2 = $$0.a();
      erk $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dvj $$9 = $$1.a_($$4);
      dvj $$10 = $$1.a_($$5);
      dvj $$11 = $$1.a_($$6);
      dvj $$12 = $$1.a_($$7);
      dvj $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dvj $$18 = this.m().b(g, Boolean.valueOf($$3.a() == erl.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      if ($$1 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jm.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dvj $$0, dwm<dwv> $$1) {
      return $$0.c($$1) != dwv.a;
   }

   private static boolean a(fah $$0, fah $$1) {
      return !fae.c($$1, $$0, ezr.e);
   }

   private dvj a(dfe $$0, dvj $$1, jh $$2, dvj $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dvj a(dfe $$0, jh $$1, dvj $$2, jh $$3, dvj $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dvj $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dvj a(dfe $$0, dvj $$1, jh $$2, dvj $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fah $$8 = $$3.g($$0, $$2).a(jm.a);
      dvj $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dvj $$0, dvj $$1, fah $$2) {
      boolean $$3 = $$1.b() instanceof drc && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dwv $$4 = $$0.c(d);
         dwv $$5 = $$0.c(e);
         dwv $$6 = $$0.c(c);
         dwv $$7 = $$0.c(f);
         boolean $$8 = $$5 == dwv.a;
         boolean $$9 = $$7 == dwv.a;
         boolean $$10 = $$6 == dwv.a;
         boolean $$11 = $$4 == dwv.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dwv.c && $$5 == dwv.c || $$6 == dwv.c && $$7 == dwv.c;
            return $$13 ? false : $$1.a(axa.aP) || a($$2, G);
         }
      }
   }

   private dvj a(dvj $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fah $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dwv a(boolean $$0, fah $$1, fah $$2) {
      if ($$0) {
         return a($$1, $$2) ? dwv.c : dwv.b;
      } else {
         return dwv.a;
      }
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(g) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvj $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      switch ($$1) {
         case c:
            return $$0.b(d, $$0.c(e)).b(c, $$0.c(f)).b(e, $$0.c(d)).b(f, $$0.c(c));
         case d:
            return $$0.b(d, $$0.c(c)).b(c, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(d));
         case b:
            return $$0.b(d, $$0.c(f)).b(c, $$0.c(d)).b(e, $$0.c(c)).b(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      switch ($$1) {
         case b:
            return $$0.b(d, $$0.c(e)).b(e, $$0.c(d));
         case c:
            return $$0.b(c, $$0.c(f)).b(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}

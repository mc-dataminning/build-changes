import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dqw extends dhy implements doz {
   public static final MapCodec<dqw> a = b(dqw::new);
   public static final dvu b = dvt.J;
   public static final dwb<dwp> c = dvt.W;
   public static final dwb<dwp> d = dvt.X;
   public static final dwb<dwp> e = dvt.Y;
   public static final dwb<dwp> f = dvt.Z;
   public static final dvu g = dvt.C;
   private final Map<dvd, fab> h;
   private final Map<dvd, fab> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fab G = dhy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fab H = dhy.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fab I = dhy.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fab J = dhy.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fab K = dhy.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   public dqw(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dwp.a).b(c, dwp.a).b(e, dwp.a).b(f, dwp.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fab a(fab $$0, dwp $$1, fab $$2, fab $$3) {
      if ($$1 == dwp.c) {
         return ezy.a($$0, $$3);
      } else {
         return $$1 == dwp.b ? ezy.a($$0, $$2) : $$0;
      }
   }

   private Map<dvd, fab> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fab $$10 = dhy.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fab $$11 = dhy.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fab $$12 = dhy.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fab $$13 = dhy.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fab $$14 = dhy.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fab $$15 = dhy.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fab $$16 = dhy.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fab $$17 = dhy.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fab $$18 = dhy.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dvd, fab> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dwp $$21 : c.a()) {
            for (dwp $$22 : d.a()) {
               for (dwp $$23 : f.a()) {
                  for (dwp $$24 : e.a()) {
                     fab $$25 = ezy.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ezy.a($$25, $$10);
                     }

                     dvd $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   private boolean a(dvd $$0, boolean $$1, jl $$2) {
      dhy $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dkw && dkw.a($$0, $$2);
      return $$0.a(awz.M) || !k($$0) && $$1 || $$3 instanceof dly || $$4;
   }

   @Override
   public dvd a(czm $$0) {
      dey $$1 = $$0.q();
      jg $$2 = $$0.a();
      ere $$3 = $$0.q().b_($$0.a());
      jg $$4 = $$2.f();
      jg $$5 = $$2.i();
      jg $$6 = $$2.g();
      jg $$7 = $$2.h();
      jg $$8 = $$2.d();
      dvd $$9 = $$1.a_($$4);
      dvd $$10 = $$1.a_($$5);
      dvd $$11 = $$1.a_($$6);
      dvd $$12 = $$1.a_($$7);
      dvd $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jl.d), jl.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jl.e), jl.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jl.c), jl.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jl.f), jl.f);
      dvd $$18 = this.m().b(g, Boolean.valueOf($$3.a() == erf.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      if ($$1 == jl.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jl.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dvd $$0, dwg<dwp> $$1) {
      return $$0.c($$1) != dwp.a;
   }

   private static boolean a(fab $$0, fab $$1) {
      return !ezy.c($$1, $$0, ezl.e);
   }

   private dvd a(dey $$0, dvd $$1, jg $$2, dvd $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dvd a(dey $$0, jg $$1, dvd $$2, jg $$3, dvd $$4, jl $$5) {
      jl $$6 = $$5.g();
      boolean $$7 = $$5 == jl.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jl.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jl.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jl.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jg $$11 = $$1.d();
      dvd $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dvd a(dey $$0, dvd $$1, jg $$2, dvd $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fab $$8 = $$3.g($$0, $$2).a(jl.a);
      dvd $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dvd $$0, dvd $$1, fab $$2) {
      boolean $$3 = $$1.b() instanceof dqw && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dwp $$4 = $$0.c(d);
         dwp $$5 = $$0.c(e);
         dwp $$6 = $$0.c(c);
         dwp $$7 = $$0.c(f);
         boolean $$8 = $$5 == dwp.a;
         boolean $$9 = $$7 == dwp.a;
         boolean $$10 = $$6 == dwp.a;
         boolean $$11 = $$4 == dwp.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dwp.c && $$5 == dwp.c || $$6 == dwp.c && $$7 == dwp.c;
            return $$13 ? false : $$1.a(awz.aP) || a($$2, G);
         }
      }
   }

   private dvd a(dvd $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fab $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dwp a(boolean $$0, fab $$1, fab $$2) {
      if ($$0) {
         return a($$1, $$2) ? dwp.c : dwp.b;
      } else {
         return dwp.a;
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(g) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvd $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
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
   protected dvd a(dvd $$0, dmu $$1) {
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

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dql extends dhm implements doo {
   public static final MapCodec<dql> a = b(dql::new);
   public static final dvj b = dvi.J;
   public static final dvq<dwe> c = dvi.W;
   public static final dvq<dwe> d = dvi.X;
   public static final dvq<dwe> e = dvi.Y;
   public static final dvq<dwe> f = dvi.Z;
   public static final dvj g = dvi.C;
   private final Map<dus, ezq> h;
   private final Map<dus, ezq> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ezq G = dhm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ezq H = dhm.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ezq I = dhm.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ezq J = dhm.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ezq K = dhm.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dql> a() {
      return a;
   }

   public dql(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dwe.a).b(c, dwe.a).b(e, dwe.a).b(f, dwe.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ezq a(ezq $$0, dwe $$1, ezq $$2, ezq $$3) {
      if ($$1 == dwe.c) {
         return ezn.a($$0, $$3);
      } else {
         return $$1 == dwe.b ? ezn.a($$0, $$2) : $$0;
      }
   }

   private Map<dus, ezq> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ezq $$10 = dhm.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ezq $$11 = dhm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ezq $$12 = dhm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ezq $$13 = dhm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ezq $$14 = dhm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ezq $$15 = dhm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ezq $$16 = dhm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ezq $$17 = dhm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ezq $$18 = dhm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dus, ezq> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dwe $$21 : c.a()) {
            for (dwe $$22 : d.a()) {
               for (dwe $$23 : f.a()) {
                  for (dwe $$24 : e.a()) {
                     ezq $$25 = ezn.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ezn.a($$25, $$10);
                     }

                     dus $$26 = this.n().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   private boolean a(dus $$0, boolean $$1, jk $$2) {
      dhm $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dkl && dkl.a($$0, $$2);
      return $$0.a(awv.M) || !k($$0) && $$1 || $$3 instanceof dln || $$4;
   }

   @Override
   public dus a(czn $$0) {
      dem $$1 = $$0.q();
      jf $$2 = $$0.a();
      eqt $$3 = $$0.q().b_($$0.a());
      jf $$4 = $$2.f();
      jf $$5 = $$2.i();
      jf $$6 = $$2.g();
      jf $$7 = $$2.h();
      jf $$8 = $$2.d();
      dus $$9 = $$1.a_($$4);
      dus $$10 = $$1.a_($$5);
      dus $$11 = $$1.a_($$6);
      dus $$12 = $$1.a_($$7);
      dus $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jk.d), jk.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jk.e), jk.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jk.c), jk.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jk.f), jk.f);
      dus $$18 = this.n().b(g, Boolean.valueOf($$3.a() == equ.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, equ.c, equ.c.a($$3));
      }

      if ($$1 == jk.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jk.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dus $$0, dvv<dwe> $$1) {
      return $$0.c($$1) != dwe.a;
   }

   private static boolean a(ezq $$0, ezq $$1) {
      return !ezn.c($$1, $$0, eza.e);
   }

   private dus a(dem $$0, dus $$1, jf $$2, dus $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dus a(dem $$0, jf $$1, dus $$2, jf $$3, dus $$4, jk $$5) {
      jk $$6 = $$5.g();
      boolean $$7 = $$5 == jk.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jk.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jk.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jk.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jf $$11 = $$1.d();
      dus $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dus a(dem $$0, dus $$1, jf $$2, dus $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ezq $$8 = $$3.g($$0, $$2).a(jk.a);
      dus $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dus $$0, dus $$1, ezq $$2) {
      boolean $$3 = $$1.b() instanceof dql && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dwe $$4 = $$0.c(d);
         dwe $$5 = $$0.c(e);
         dwe $$6 = $$0.c(c);
         dwe $$7 = $$0.c(f);
         boolean $$8 = $$5 == dwe.a;
         boolean $$9 = $$7 == dwe.a;
         boolean $$10 = $$6 == dwe.a;
         boolean $$11 = $$4 == dwe.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dwe.c && $$5 == dwe.c || $$6 == dwe.c && $$7 == dwe.c;
            return $$13 ? false : $$1.a(awv.aP) || a($$2, G);
         }
      }
   }

   private dus a(dus $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ezq $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dwe a(boolean $$0, ezq $$1, ezq $$2) {
      if ($$0) {
         return a($$1, $$2) ? dwe.c : dwe.b;
      } else {
         return dwe.a;
      }
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(g) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dus $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
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
   protected dus a(dus $$0, dmj $$1) {
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

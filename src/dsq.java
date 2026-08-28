import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsq extends djn implements dqt {
   public static final MapCodec<dsq> a = b(dsq::new);
   public static final dxp b = dxo.M;
   public static final dxv<dyj> c = dxo.Z;
   public static final dxv<dyj> d = dxo.aa;
   public static final dxv<dyj> e = dxo.ab;
   public static final dxv<dyj> f = dxo.ac;
   public static final dxp g = dxo.J;
   private final Map<dwy, fbv> h;
   private final Map<dwy, fbv> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fbv G = djn.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbv H = djn.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fbv I = djn.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fbv J = djn.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbv K = djn.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   public dsq(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dyj.a).b(c, dyj.a).b(e, dyj.a).b(f, dyj.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fbv a(fbv $$0, dyj $$1, fbv $$2, fbv $$3) {
      if ($$1 == dyj.c) {
         return fbs.a($$0, $$3);
      } else {
         return $$1 == dyj.b ? fbs.a($$0, $$2) : $$0;
      }
   }

   private Map<dwy, fbv> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fbv $$10 = djn.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fbv $$11 = djn.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fbv $$12 = djn.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fbv $$13 = djn.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fbv $$14 = djn.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fbv $$15 = djn.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fbv $$16 = djn.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fbv $$17 = djn.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fbv $$18 = djn.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dwy, fbv> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dyj $$21 : c.a()) {
            for (dyj $$22 : d.a()) {
               for (dyj $$23 : f.a()) {
                  for (dyj $$24 : e.a()) {
                     fbv $$25 = fbs.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fbs.a($$25, $$10);
                     }

                     dwy $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   private boolean a(dwy $$0, boolean $$1, jn $$2) {
      djn $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dmn && dmn.a($$0, $$2);
      return $$0.a(awp.N) || !k($$0) && $$1 || $$3 instanceof dnq || $$4;
   }

   @Override
   public dwy a(dah $$0) {
      dgm $$1 = $$0.q();
      ji $$2 = $$0.a();
      eta $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      ji $$8 = $$2.d();
      dwy $$9 = $$1.a_($$4);
      dwy $$10 = $$1.a_($$5);
      dwy $$11 = $$1.a_($$6);
      dwy $$12 = $$1.a_($$7);
      dwy $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jn.d), jn.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jn.e), jn.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jn.c), jn.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jn.f), jn.f);
      dwy $$18 = this.m().b(g, Boolean.valueOf($$3.a() == etb.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jn.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dwy $$0, dya<dyj> $$1) {
      return $$0.c($$1) != dyj.a;
   }

   private static boolean a(fbv $$0, fbv $$1) {
      return !fbs.c($$1, $$0, fbf.e);
   }

   private dwy a(dgm $$0, dwy $$1, ji $$2, dwy $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dwy a(dgm $$0, ji $$1, dwy $$2, ji $$3, dwy $$4, jn $$5) {
      jn $$6 = $$5.g();
      boolean $$7 = $$5 == jn.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jn.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jn.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jn.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      ji $$11 = $$1.d();
      dwy $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dwy a(dgm $$0, dwy $$1, ji $$2, dwy $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fbv $$8 = $$3.g($$0, $$2).a(jn.a);
      dwy $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dwy $$0, dwy $$1, fbv $$2) {
      boolean $$3 = $$1.b() instanceof dsq && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dyj $$4 = $$0.c(d);
         dyj $$5 = $$0.c(e);
         dyj $$6 = $$0.c(c);
         dyj $$7 = $$0.c(f);
         boolean $$8 = $$5 == dyj.a;
         boolean $$9 = $$7 == dyj.a;
         boolean $$10 = $$6 == dyj.a;
         boolean $$11 = $$4 == dyj.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dyj.c && $$5 == dyj.c || $$6 == dyj.c && $$7 == dyj.c;
            return $$13 ? false : $$1.a(awp.aR) || a($$2, G);
         }
      }
   }

   private dwy a(dwy $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fbv $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dyj a(boolean $$0, fbv $$1, fbv $$2) {
      if ($$0) {
         return a($$1, $$2) ? dyj.c : dyj.b;
      } else {
         return dyj.a;
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(g) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dwy $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
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
   protected dwy a(dwy $$0, dom $$1) {
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

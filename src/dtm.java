import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dtm extends dkl implements drp {
   public static final MapCodec<dtm> a = b(dtm::new);
   public static final dyl b = dyk.K;
   public static final dyr<dzf> c = dyk.X;
   public static final dyr<dzf> d = dyk.Y;
   public static final dyr<dzf> e = dyk.Z;
   public static final dyr<dzf> f = dyk.aa;
   public static final dyl g = dyk.D;
   private final Map<dxu, fcr> h;
   private final Map<dxu, fcr> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fcr G = dkl.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcr H = dkl.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fcr I = dkl.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fcr J = dkl.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcr K = dkl.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dtm> a() {
      return a;
   }

   public dtm(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dzf.a).b(c, dzf.a).b(e, dzf.a).b(f, dzf.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fcr a(fcr $$0, dzf $$1, fcr $$2, fcr $$3) {
      if ($$1 == dzf.c) {
         return fco.a($$0, $$3);
      } else {
         return $$1 == dzf.b ? fco.a($$0, $$2) : $$0;
      }
   }

   private Map<dxu, fcr> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fcr $$10 = dkl.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fcr $$11 = dkl.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fcr $$12 = dkl.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fcr $$13 = dkl.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fcr $$14 = dkl.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fcr $$15 = dkl.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fcr $$16 = dkl.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fcr $$17 = dkl.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fcr $$18 = dkl.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dxu, fcr> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dzf $$21 : c.a()) {
            for (dzf $$22 : d.a()) {
               for (dzf $$23 : f.a()) {
                  for (dzf $$24 : e.a()) {
                     fcr $$25 = fco.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fco.a($$25, $$10);
                     }

                     dxu $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   private boolean a(dxu $$0, boolean $$1, jm $$2) {
      dkl $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dnl && dnl.a($$0, $$2);
      return $$0.a(axu.N) || !k($$0) && $$1 || $$3 instanceof doo || $$4;
   }

   @Override
   public dxu a(dbf $$0) {
      dhk $$1 = $$0.q();
      jh $$2 = $$0.a();
      etw $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dxu $$9 = $$1.a_($$4);
      dxu $$10 = $$1.a_($$5);
      dxu $$11 = $$1.a_($$6);
      dxu $$12 = $$1.a_($$7);
      dxu $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dxu $$18 = this.m().b(g, Boolean.valueOf($$3.a() == etx.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jm.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dxu $$0, dyw<dzf> $$1) {
      return $$0.c($$1) != dzf.a;
   }

   private static boolean a(fcr $$0, fcr $$1) {
      return !fco.c($$1, $$0, fcb.e);
   }

   private dxu a(dhk $$0, dxu $$1, jh $$2, dxu $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dxu a(dhk $$0, jh $$1, dxu $$2, jh $$3, dxu $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dxu $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dxu a(dhk $$0, dxu $$1, jh $$2, dxu $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fcr $$8 = $$3.g($$0, $$2).a(jm.a);
      dxu $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dxu $$0, dxu $$1, fcr $$2) {
      boolean $$3 = $$1.b() instanceof dtm && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dzf $$4 = $$0.c(d);
         dzf $$5 = $$0.c(e);
         dzf $$6 = $$0.c(c);
         dzf $$7 = $$0.c(f);
         boolean $$8 = $$5 == dzf.a;
         boolean $$9 = $$7 == dzf.a;
         boolean $$10 = $$6 == dzf.a;
         boolean $$11 = $$4 == dzf.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dzf.c && $$5 == dzf.c || $$6 == dzf.c && $$7 == dzf.c;
            return $$13 ? false : $$1.a(axu.aR) || a($$2, G);
         }
      }
   }

   private dxu a(dxu $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fcr $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dzf a(boolean $$0, fcr $$1, fcr $$2) {
      if ($$0) {
         return a($$1, $$2) ? dzf.c : dzf.b;
      } else {
         return dzf.a;
      }
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(g) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxu $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
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
   protected dxu a(dxu $$0, dpk $$1) {
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

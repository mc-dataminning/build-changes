import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dro extends diq implements dpr {
   public static final MapCodec<dro> a = b(dro::new);
   public static final dwm b = dwl.J;
   public static final dws<dxg> c = dwl.W;
   public static final dws<dxg> d = dwl.X;
   public static final dws<dxg> e = dwl.Y;
   public static final dws<dxg> f = dwl.Z;
   public static final dwm g = dwl.C;
   private final Map<dvv, fas> h;
   private final Map<dvv, fas> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fas G = diq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fas H = diq.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fas I = diq.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fas J = diq.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fas K = diq.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dxg.a).b(c, dxg.a).b(e, dxg.a).b(f, dxg.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fas a(fas $$0, dxg $$1, fas $$2, fas $$3) {
      if ($$1 == dxg.c) {
         return fap.a($$0, $$3);
      } else {
         return $$1 == dxg.b ? fap.a($$0, $$2) : $$0;
      }
   }

   private Map<dvv, fas> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fas $$10 = diq.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fas $$11 = diq.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fas $$12 = diq.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fas $$13 = diq.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fas $$14 = diq.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fas $$15 = diq.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fas $$16 = diq.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fas $$17 = diq.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fas $$18 = diq.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dvv, fas> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dxg $$21 : c.a()) {
            for (dxg $$22 : d.a()) {
               for (dxg $$23 : f.a()) {
                  for (dxg $$24 : e.a()) {
                     fas $$25 = fap.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fap.a($$25, $$10);
                     }

                     dvv $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   private boolean a(dvv $$0, boolean $$1, jm $$2) {
      diq $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dlo && dlo.a($$0, $$2);
      return $$0.a(axc.M) || !k($$0) && $$1 || $$3 instanceof dmq || $$4;
   }

   @Override
   public dvv a(dad $$0) {
      dfp $$1 = $$0.q();
      jh $$2 = $$0.a();
      erv $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dvv $$9 = $$1.a_($$4);
      dvv $$10 = $$1.a_($$5);
      dvv $$11 = $$1.a_($$6);
      dvv $$12 = $$1.a_($$7);
      dvv $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dvv $$18 = this.m().b(g, Boolean.valueOf($$3.a() == erw.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jm.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dvv $$0, dwx<dxg> $$1) {
      return $$0.c($$1) != dxg.a;
   }

   private static boolean a(fas $$0, fas $$1) {
      return !fap.c($$1, $$0, fac.e);
   }

   private dvv a(dfp $$0, dvv $$1, jh $$2, dvv $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dvv a(dfp $$0, jh $$1, dvv $$2, jh $$3, dvv $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dvv $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dvv a(dfp $$0, dvv $$1, jh $$2, dvv $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fas $$8 = $$3.g($$0, $$2).a(jm.a);
      dvv $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dvv $$0, dvv $$1, fas $$2) {
      boolean $$3 = $$1.b() instanceof dro && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dxg $$4 = $$0.c(d);
         dxg $$5 = $$0.c(e);
         dxg $$6 = $$0.c(c);
         dxg $$7 = $$0.c(f);
         boolean $$8 = $$5 == dxg.a;
         boolean $$9 = $$7 == dxg.a;
         boolean $$10 = $$6 == dxg.a;
         boolean $$11 = $$4 == dxg.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dxg.c && $$5 == dxg.c || $$6 == dxg.c && $$7 == dxg.c;
            return $$13 ? false : $$1.a(axc.aQ) || a($$2, G);
         }
      }
   }

   private dvv a(dvv $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fas $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dxg a(boolean $$0, fas $$1, fas $$2) {
      if ($$0) {
         return a($$1, $$2) ? dxg.c : dxg.b;
      } else {
         return dxg.a;
      }
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(g) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvv $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
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
   protected dvv a(dvv $$0, dnm $$1) {
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

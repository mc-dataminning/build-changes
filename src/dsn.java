import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsn extends djk implements dqq {
   public static final MapCodec<dsn> a = b(dsn::new);
   public static final dxm b = dxl.M;
   public static final dxs<dyg> c = dxl.Z;
   public static final dxs<dyg> d = dxl.aa;
   public static final dxs<dyg> e = dxl.ab;
   public static final dxs<dyg> f = dxl.ac;
   public static final dxm g = dxl.J;
   private final Map<dwv, fbs> h;
   private final Map<dwv, fbs> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fbs G = djk.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbs H = djk.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fbs I = djk.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fbs J = djk.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbs K = djk.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dyg.a).b(c, dyg.a).b(e, dyg.a).b(f, dyg.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fbs a(fbs $$0, dyg $$1, fbs $$2, fbs $$3) {
      if ($$1 == dyg.c) {
         return fbp.a($$0, $$3);
      } else {
         return $$1 == dyg.b ? fbp.a($$0, $$2) : $$0;
      }
   }

   private Map<dwv, fbs> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fbs $$10 = djk.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fbs $$11 = djk.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fbs $$12 = djk.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fbs $$13 = djk.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fbs $$14 = djk.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fbs $$15 = djk.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fbs $$16 = djk.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fbs $$17 = djk.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fbs $$18 = djk.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dwv, fbs> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dyg $$21 : c.a()) {
            for (dyg $$22 : d.a()) {
               for (dyg $$23 : f.a()) {
                  for (dyg $$24 : e.a()) {
                     fbs $$25 = fbp.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fbp.a($$25, $$10);
                     }

                     dwv $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   private boolean a(dwv $$0, boolean $$1, jn $$2) {
      djk $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dmk && dmk.a($$0, $$2);
      return $$0.a(awo.N) || !k($$0) && $$1 || $$3 instanceof dnn || $$4;
   }

   @Override
   public dwv a(dae $$0) {
      dgj $$1 = $$0.q();
      ji $$2 = $$0.a();
      esx $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      ji $$8 = $$2.d();
      dwv $$9 = $$1.a_($$4);
      dwv $$10 = $$1.a_($$5);
      dwv $$11 = $$1.a_($$6);
      dwv $$12 = $$1.a_($$7);
      dwv $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jn.d), jn.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jn.e), jn.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jn.c), jn.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jn.f), jn.f);
      dwv $$18 = this.m().b(g, Boolean.valueOf($$3.a() == esy.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, esy.c, esy.c.a($$1));
      }

      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jn.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dwv $$0, dxx<dyg> $$1) {
      return $$0.c($$1) != dyg.a;
   }

   private static boolean a(fbs $$0, fbs $$1) {
      return !fbp.c($$1, $$0, fbc.e);
   }

   private dwv a(dgj $$0, dwv $$1, ji $$2, dwv $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dwv a(dgj $$0, ji $$1, dwv $$2, ji $$3, dwv $$4, jn $$5) {
      jn $$6 = $$5.g();
      boolean $$7 = $$5 == jn.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jn.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jn.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jn.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      ji $$11 = $$1.d();
      dwv $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dwv a(dgj $$0, dwv $$1, ji $$2, dwv $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fbs $$8 = $$3.g($$0, $$2).a(jn.a);
      dwv $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dwv $$0, dwv $$1, fbs $$2) {
      boolean $$3 = $$1.b() instanceof dsn && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dyg $$4 = $$0.c(d);
         dyg $$5 = $$0.c(e);
         dyg $$6 = $$0.c(c);
         dyg $$7 = $$0.c(f);
         boolean $$8 = $$5 == dyg.a;
         boolean $$9 = $$7 == dyg.a;
         boolean $$10 = $$6 == dyg.a;
         boolean $$11 = $$4 == dyg.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dyg.c && $$5 == dyg.c || $$6 == dyg.c && $$7 == dyg.c;
            return $$13 ? false : $$1.a(awo.aR) || a($$2, G);
         }
      }
   }

   private dwv a(dwv $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fbs $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dyg a(boolean $$0, fbs $$1, fbs $$2) {
      if ($$0) {
         return a($$1, $$2) ? dyg.c : dyg.b;
      } else {
         return dyg.a;
      }
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(g) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dwv $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
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
   protected dwv a(dwv $$0, doj $$1) {
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

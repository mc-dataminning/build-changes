import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dtf extends dke implements dri {
   public static final MapCodec<dtf> a = b(dtf::new);
   public static final dye b = dyd.K;
   public static final dyk<dyy> c = dyd.X;
   public static final dyk<dyy> d = dyd.Y;
   public static final dyk<dyy> e = dyd.Z;
   public static final dyk<dyy> f = dyd.aa;
   public static final dye g = dyd.D;
   private final Map<dxn, fcm> h;
   private final Map<dxn, fcm> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fcm G = dke.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcm H = dke.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fcm I = dke.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fcm J = dke.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcm K = dke.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dtf> a() {
      return a;
   }

   public dtf(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dyy.a).b(c, dyy.a).b(e, dyy.a).b(f, dyy.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fcm a(fcm $$0, dyy $$1, fcm $$2, fcm $$3) {
      if ($$1 == dyy.c) {
         return fcj.a($$0, $$3);
      } else {
         return $$1 == dyy.b ? fcj.a($$0, $$2) : $$0;
      }
   }

   private Map<dxn, fcm> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fcm $$10 = dke.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fcm $$11 = dke.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fcm $$12 = dke.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fcm $$13 = dke.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fcm $$14 = dke.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fcm $$15 = dke.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fcm $$16 = dke.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fcm $$17 = dke.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fcm $$18 = dke.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dxn, fcm> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dyy $$21 : c.a()) {
            for (dyy $$22 : d.a()) {
               for (dyy $$23 : f.a()) {
                  for (dyy $$24 : e.a()) {
                     fcm $$25 = fcj.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fcj.a($$25, $$10);
                     }

                     dxn $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   private boolean a(dxn $$0, boolean $$1, jm $$2) {
      dke $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dne && dne.a($$0, $$2);
      return $$0.a(axu.N) || !k($$0) && $$1 || $$3 instanceof doh || $$4;
   }

   @Override
   public dxn a(dbb $$0) {
      dhd $$1 = $$0.q();
      jh $$2 = $$0.a();
      etp $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dxn $$9 = $$1.a_($$4);
      dxn $$10 = $$1.a_($$5);
      dxn $$11 = $$1.a_($$6);
      dxn $$12 = $$1.a_($$7);
      dxn $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dxn $$18 = this.m().b(g, Boolean.valueOf($$3.a() == etq.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jm.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dxn $$0, dyp<dyy> $$1) {
      return $$0.c($$1) != dyy.a;
   }

   private static boolean a(fcm $$0, fcm $$1) {
      return !fcj.c($$1, $$0, fbw.e);
   }

   private dxn a(dhd $$0, dxn $$1, jh $$2, dxn $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dxn a(dhd $$0, jh $$1, dxn $$2, jh $$3, dxn $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dxn $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dxn a(dhd $$0, dxn $$1, jh $$2, dxn $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fcm $$8 = $$3.g($$0, $$2).a(jm.a);
      dxn $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dxn $$0, dxn $$1, fcm $$2) {
      boolean $$3 = $$1.b() instanceof dtf && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dyy $$4 = $$0.c(d);
         dyy $$5 = $$0.c(e);
         dyy $$6 = $$0.c(c);
         dyy $$7 = $$0.c(f);
         boolean $$8 = $$5 == dyy.a;
         boolean $$9 = $$7 == dyy.a;
         boolean $$10 = $$6 == dyy.a;
         boolean $$11 = $$4 == dyy.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dyy.c && $$5 == dyy.c || $$6 == dyy.c && $$7 == dyy.c;
            return $$13 ? false : $$1.a(axu.aR) || a($$2, G);
         }
      }
   }

   private dxn a(dxn $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fcm $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dyy a(boolean $$0, fcm $$1, fcm $$2) {
      if ($$0) {
         return a($$1, $$2) ? dyy.c : dyy.b;
      } else {
         return dyy.a;
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(g) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxn $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
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
   protected dxn a(dxn $$0, dpd $$1) {
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

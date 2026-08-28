import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dtn extends dkm implements drq {
   public static final MapCodec<dtn> a = b(dtn::new);
   public static final dym b = dyl.K;
   public static final dys<dzg> c = dyl.X;
   public static final dys<dzg> d = dyl.Y;
   public static final dys<dzg> e = dyl.Z;
   public static final dys<dzg> f = dyl.aa;
   public static final dym g = dyl.D;
   private final Map<dxv, fcs> h;
   private final Map<dxv, fcs> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fcs G = dkm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcs H = dkm.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fcs I = dkm.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fcs J = dkm.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fcs K = dkm.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dtn> a() {
      return a;
   }

   public dtn(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dzg.a).b(c, dzg.a).b(e, dzg.a).b(f, dzg.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fcs a(fcs $$0, dzg $$1, fcs $$2, fcs $$3) {
      if ($$1 == dzg.c) {
         return fcp.a($$0, $$3);
      } else {
         return $$1 == dzg.b ? fcp.a($$0, $$2) : $$0;
      }
   }

   private Map<dxv, fcs> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fcs $$10 = dkm.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fcs $$11 = dkm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fcs $$12 = dkm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fcs $$13 = dkm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fcs $$14 = dkm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fcs $$15 = dkm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fcs $$16 = dkm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fcs $$17 = dkm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fcs $$18 = dkm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dxv, fcs> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dzg $$21 : c.a()) {
            for (dzg $$22 : d.a()) {
               for (dzg $$23 : f.a()) {
                  for (dzg $$24 : e.a()) {
                     fcs $$25 = fcp.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fcp.a($$25, $$10);
                     }

                     dxv $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   private boolean a(dxv $$0, boolean $$1, jm $$2) {
      dkm $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dnm && dnm.a($$0, $$2);
      return $$0.a(axu.N) || !k($$0) && $$1 || $$3 instanceof dop || $$4;
   }

   @Override
   public dxv a(dbg $$0) {
      dhl $$1 = $$0.q();
      jh $$2 = $$0.a();
      etx $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dxv $$9 = $$1.a_($$4);
      dxv $$10 = $$1.a_($$5);
      dxv $$11 = $$1.a_($$6);
      dxv $$12 = $$1.a_($$7);
      dxv $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dxv $$18 = this.m().b(g, Boolean.valueOf($$3.a() == ety.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jm.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dxv $$0, dyx<dzg> $$1) {
      return $$0.c($$1) != dzg.a;
   }

   private static boolean a(fcs $$0, fcs $$1) {
      return !fcp.c($$1, $$0, fcc.e);
   }

   private dxv a(dhl $$0, dxv $$1, jh $$2, dxv $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dxv a(dhl $$0, jh $$1, dxv $$2, jh $$3, dxv $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dxv $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dxv a(dhl $$0, dxv $$1, jh $$2, dxv $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fcs $$8 = $$3.g($$0, $$2).a(jm.a);
      dxv $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dxv $$0, dxv $$1, fcs $$2) {
      boolean $$3 = $$1.b() instanceof dtn && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dzg $$4 = $$0.c(d);
         dzg $$5 = $$0.c(e);
         dzg $$6 = $$0.c(c);
         dzg $$7 = $$0.c(f);
         boolean $$8 = $$5 == dzg.a;
         boolean $$9 = $$7 == dzg.a;
         boolean $$10 = $$6 == dzg.a;
         boolean $$11 = $$4 == dzg.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dzg.c && $$5 == dzg.c || $$6 == dzg.c && $$7 == dzg.c;
            return $$13 ? false : $$1.a(axu.aR) || a($$2, G);
         }
      }
   }

   private dxv a(dxv $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fcs $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dzg a(boolean $$0, fcs $$1, fcs $$2) {
      if ($$0) {
         return a($$1, $$2) ? dzg.c : dzg.b;
      } else {
         return dzg.a;
      }
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(g) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dxv $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
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
   protected dxv a(dxv $$0, dpl $$1) {
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

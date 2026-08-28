import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dsp extends djm implements dqs {
   public static final MapCodec<dsp> a = b(dsp::new);
   public static final dxo b = dxn.M;
   public static final dxu<dyi> c = dxn.Z;
   public static final dxu<dyi> d = dxn.aa;
   public static final dxu<dyi> e = dxn.ab;
   public static final dxu<dyi> f = dxn.ac;
   public static final dxo g = dxn.J;
   private final Map<dwx, fbu> h;
   private final Map<dwx, fbu> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fbu G = djm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbu H = djm.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fbu I = djm.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fbu J = djm.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbu K = djm.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   public dsp(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dyi.a).b(c, dyi.a).b(e, dyi.a).b(f, dyi.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fbu a(fbu $$0, dyi $$1, fbu $$2, fbu $$3) {
      if ($$1 == dyi.c) {
         return fbr.a($$0, $$3);
      } else {
         return $$1 == dyi.b ? fbr.a($$0, $$2) : $$0;
      }
   }

   private Map<dwx, fbu> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fbu $$10 = djm.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fbu $$11 = djm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fbu $$12 = djm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fbu $$13 = djm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fbu $$14 = djm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fbu $$15 = djm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fbu $$16 = djm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fbu $$17 = djm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fbu $$18 = djm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dwx, fbu> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dyi $$21 : c.a()) {
            for (dyi $$22 : d.a()) {
               for (dyi $$23 : f.a()) {
                  for (dyi $$24 : e.a()) {
                     fbu $$25 = fbr.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fbr.a($$25, $$10);
                     }

                     dwx $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   private boolean a(dwx $$0, boolean $$1, jn $$2) {
      djm $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dmm && dmm.a($$0, $$2);
      return $$0.a(awp.N) || !k($$0) && $$1 || $$3 instanceof dnp || $$4;
   }

   @Override
   public dwx a(dag $$0) {
      dgl $$1 = $$0.q();
      ji $$2 = $$0.a();
      esz $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      ji $$8 = $$2.d();
      dwx $$9 = $$1.a_($$4);
      dwx $$10 = $$1.a_($$5);
      dwx $$11 = $$1.a_($$6);
      dwx $$12 = $$1.a_($$7);
      dwx $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jn.d), jn.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jn.e), jn.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jn.c), jn.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jn.f), jn.f);
      dwx $$18 = this.m().b(g, Boolean.valueOf($$3.a() == eta.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jn.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dwx $$0, dxz<dyi> $$1) {
      return $$0.c($$1) != dyi.a;
   }

   private static boolean a(fbu $$0, fbu $$1) {
      return !fbr.c($$1, $$0, fbe.e);
   }

   private dwx a(dgl $$0, dwx $$1, ji $$2, dwx $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dwx a(dgl $$0, ji $$1, dwx $$2, ji $$3, dwx $$4, jn $$5) {
      jn $$6 = $$5.g();
      boolean $$7 = $$5 == jn.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jn.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jn.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jn.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      ji $$11 = $$1.d();
      dwx $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dwx a(dgl $$0, dwx $$1, ji $$2, dwx $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fbu $$8 = $$3.g($$0, $$2).a(jn.a);
      dwx $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dwx $$0, dwx $$1, fbu $$2) {
      boolean $$3 = $$1.b() instanceof dsp && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dyi $$4 = $$0.c(d);
         dyi $$5 = $$0.c(e);
         dyi $$6 = $$0.c(c);
         dyi $$7 = $$0.c(f);
         boolean $$8 = $$5 == dyi.a;
         boolean $$9 = $$7 == dyi.a;
         boolean $$10 = $$6 == dyi.a;
         boolean $$11 = $$4 == dyi.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dyi.c && $$5 == dyi.c || $$6 == dyi.c && $$7 == dyi.c;
            return $$13 ? false : $$1.a(awp.aR) || a($$2, G);
         }
      }
   }

   private dwx a(dwx $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fbu $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dyi a(boolean $$0, fbu $$1, fbu $$2) {
      if ($$0) {
         return a($$1, $$2) ? dyi.c : dyi.b;
      } else {
         return dyi.a;
      }
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(g) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dwx $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
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
   protected dwx a(dwx $$0, dol $$1) {
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

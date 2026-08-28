import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dso extends djl implements dqr {
   public static final MapCodec<dso> a = b(dso::new);
   public static final dxn b = dxm.M;
   public static final dxt<dyh> c = dxm.Z;
   public static final dxt<dyh> d = dxm.aa;
   public static final dxt<dyh> e = dxm.ab;
   public static final dxt<dyh> f = dxm.ac;
   public static final dxn g = dxm.J;
   private final Map<dww, fbt> h;
   private final Map<dww, fbt> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fbt G = djl.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbt H = djl.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fbt I = djl.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fbt J = djl.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fbt K = djl.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dyh.a).b(c, dyh.a).b(e, dyh.a).b(f, dyh.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fbt a(fbt $$0, dyh $$1, fbt $$2, fbt $$3) {
      if ($$1 == dyh.c) {
         return fbq.a($$0, $$3);
      } else {
         return $$1 == dyh.b ? fbq.a($$0, $$2) : $$0;
      }
   }

   private Map<dww, fbt> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fbt $$10 = djl.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fbt $$11 = djl.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fbt $$12 = djl.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fbt $$13 = djl.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fbt $$14 = djl.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fbt $$15 = djl.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fbt $$16 = djl.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fbt $$17 = djl.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fbt $$18 = djl.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dww, fbt> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dyh $$21 : c.a()) {
            for (dyh $$22 : d.a()) {
               for (dyh $$23 : f.a()) {
                  for (dyh $$24 : e.a()) {
                     fbt $$25 = fbq.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fbq.a($$25, $$10);
                     }

                     dww $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   private boolean a(dww $$0, boolean $$1, jn $$2) {
      djl $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dml && dml.a($$0, $$2);
      return $$0.a(awp.N) || !k($$0) && $$1 || $$3 instanceof dno || $$4;
   }

   @Override
   public dww a(daf $$0) {
      dgk $$1 = $$0.q();
      ji $$2 = $$0.a();
      esy $$3 = $$0.q().b_($$0.a());
      ji $$4 = $$2.f();
      ji $$5 = $$2.i();
      ji $$6 = $$2.g();
      ji $$7 = $$2.h();
      ji $$8 = $$2.d();
      dww $$9 = $$1.a_($$4);
      dww $$10 = $$1.a_($$5);
      dww $$11 = $$1.a_($$6);
      dww $$12 = $$1.a_($$7);
      dww $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jn.d), jn.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jn.e), jn.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jn.c), jn.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jn.f), jn.f);
      dww $$18 = this.m().b(g, Boolean.valueOf($$3.a() == esz.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      if ($$4 == jn.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jn.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dww $$0, dxy<dyh> $$1) {
      return $$0.c($$1) != dyh.a;
   }

   private static boolean a(fbt $$0, fbt $$1) {
      return !fbq.c($$1, $$0, fbd.e);
   }

   private dww a(dgk $$0, dww $$1, ji $$2, dww $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dww a(dgk $$0, ji $$1, dww $$2, ji $$3, dww $$4, jn $$5) {
      jn $$6 = $$5.g();
      boolean $$7 = $$5 == jn.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jn.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jn.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jn.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      ji $$11 = $$1.d();
      dww $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dww a(dgk $$0, dww $$1, ji $$2, dww $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fbt $$8 = $$3.g($$0, $$2).a(jn.a);
      dww $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dww $$0, dww $$1, fbt $$2) {
      boolean $$3 = $$1.b() instanceof dso && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dyh $$4 = $$0.c(d);
         dyh $$5 = $$0.c(e);
         dyh $$6 = $$0.c(c);
         dyh $$7 = $$0.c(f);
         boolean $$8 = $$5 == dyh.a;
         boolean $$9 = $$7 == dyh.a;
         boolean $$10 = $$6 == dyh.a;
         boolean $$11 = $$4 == dyh.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dyh.c && $$5 == dyh.c || $$6 == dyh.c && $$7 == dyh.c;
            return $$13 ? false : $$1.a(awp.aR) || a($$2, G);
         }
      }
   }

   private dww a(dww $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fbt $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dyh a(boolean $$0, fbt $$1, fbt $$2) {
      if ($$0) {
         return a($$1, $$2) ? dyh.c : dyh.b;
      } else {
         return dyh.a;
      }
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(g) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dww $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
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
   protected dww a(dww $$0, dok $$1) {
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

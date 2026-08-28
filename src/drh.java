import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class drh extends dij implements dpk {
   public static final MapCodec<drh> a = b(drh::new);
   public static final dwf b = dwe.J;
   public static final dwl<dwz> c = dwe.W;
   public static final dwl<dwz> d = dwe.X;
   public static final dwl<dwz> e = dwe.Y;
   public static final dwl<dwz> f = dwe.Z;
   public static final dwf g = dwe.C;
   private final Map<dvo, fal> h;
   private final Map<dvo, fal> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final fal G = dij.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fal H = dij.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final fal I = dij.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final fal J = dij.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final fal K = dij.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<drh> a() {
      return a;
   }

   public drh(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(d, dwz.a).b(c, dwz.a).b(e, dwz.a).b(f, dwz.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static fal a(fal $$0, dwz $$1, fal $$2, fal $$3) {
      if ($$1 == dwz.c) {
         return fai.a($$0, $$3);
      } else {
         return $$1 == dwz.b ? fai.a($$0, $$2) : $$0;
      }
   }

   private Map<dvo, fal> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      fal $$10 = dij.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      fal $$11 = dij.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      fal $$12 = dij.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      fal $$13 = dij.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      fal $$14 = dij.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      fal $$15 = dij.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      fal $$16 = dij.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      fal $$17 = dij.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      fal $$18 = dij.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dvo, fal> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dwz $$21 : c.a()) {
            for (dwz $$22 : d.a()) {
               for (dwz $$23 : f.a()) {
                  for (dwz $$24 : e.a()) {
                     fal $$25 = fai.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = fai.a($$25, $$10);
                     }

                     dvo $$26 = this.m().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.h.get($$0);
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   private boolean a(dvo $$0, boolean $$1, jm $$2) {
      dij $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dlh && dlh.a($$0, $$2);
      return $$0.a(axd.M) || !k($$0) && $$1 || $$3 instanceof dmj || $$4;
   }

   @Override
   public dvo a(czw $$0) {
      dfi $$1 = $$0.q();
      jh $$2 = $$0.a();
      ero $$3 = $$0.q().b_($$0.a());
      jh $$4 = $$2.f();
      jh $$5 = $$2.i();
      jh $$6 = $$2.g();
      jh $$7 = $$2.h();
      jh $$8 = $$2.d();
      dvo $$9 = $$1.a_($$4);
      dvo $$10 = $$1.a_($$5);
      dvo $$11 = $$1.a_($$6);
      dvo $$12 = $$1.a_($$7);
      dvo $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jm.d), jm.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jm.e), jm.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jm.c), jm.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jm.f), jm.f);
      dvo $$18 = this.m().b(g, Boolean.valueOf($$3.a() == erp.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(g)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      if ($$4 == jm.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$4 == jm.b ? this.a($$1, $$0, $$5, $$6) : this.a($$1, $$3, $$0, $$5, $$6, $$4);
      }
   }

   private static boolean a(dvo $$0, dwq<dwz> $$1) {
      return $$0.c($$1) != dwz.a;
   }

   private static boolean a(fal $$0, fal $$1) {
      return !fai.c($$1, $$0, ezv.e);
   }

   private dvo a(dfi $$0, dvo $$1, jh $$2, dvo $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dvo a(dfi $$0, jh $$1, dvo $$2, jh $$3, dvo $$4, jm $$5) {
      jm $$6 = $$5.g();
      boolean $$7 = $$5 == jm.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jm.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jm.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jm.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      jh $$11 = $$1.d();
      dvo $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dvo a(dfi $$0, dvo $$1, jh $$2, dvo $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      fal $$8 = $$3.g($$0, $$2).a(jm.a);
      dvo $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dvo $$0, dvo $$1, fal $$2) {
      boolean $$3 = $$1.b() instanceof drh && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dwz $$4 = $$0.c(d);
         dwz $$5 = $$0.c(e);
         dwz $$6 = $$0.c(c);
         dwz $$7 = $$0.c(f);
         boolean $$8 = $$5 == dwz.a;
         boolean $$9 = $$7 == dwz.a;
         boolean $$10 = $$6 == dwz.a;
         boolean $$11 = $$4 == dwz.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dwz.c && $$5 == dwz.c || $$6 == dwz.c && $$7 == dwz.c;
            return $$13 ? false : $$1.a(axd.aQ) || a($$2, G);
         }
      }
   }

   private dvo a(dvo $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, fal $$5) {
      return $$0.b(d, this.a($$1, $$5, H)).b(c, this.a($$2, $$5, K)).b(e, this.a($$3, $$5, I)).b(f, this.a($$4, $$5, J));
   }

   private dwz a(boolean $$0, fal $$1, fal $$2) {
      if ($$0) {
         return a($$1, $$2) ? dwz.c : dwz.b;
      } else {
         return dwz.a;
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(g) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dvo $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
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
   protected dvo a(dvo $$0, dnf $$1) {
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

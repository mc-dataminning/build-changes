import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dkv extends dby implements diy {
   public static final MapCodec<dkv> a = b(dkv::new);
   public static final dpq b = dpp.J;
   public static final dpx<dql> c = dpp.W;
   public static final dpx<dql> d = dpp.X;
   public static final dpx<dql> e = dpp.Y;
   public static final dpx<dql> f = dpp.Z;
   public static final dpq g = dpp.C;
   private final Map<doz, est> h;
   private final Map<doz, est> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final est F = dby.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final est G = dby.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final est H = dby.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final est I = dby.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final est J = dby.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dkv> a() {
      return a;
   }

   public dkv(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dql.a).a(c, dql.a).a(e, dql.a).a(f, dql.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static est a(est $$0, dql $$1, est $$2, est $$3) {
      if ($$1 == dql.c) {
         return esq.a($$0, $$3);
      } else {
         return $$1 == dql.b ? esq.a($$0, $$2) : $$0;
      }
   }

   private Map<doz, est> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      est $$10 = dby.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      est $$11 = dby.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      est $$12 = dby.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      est $$13 = dby.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      est $$14 = dby.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      est $$15 = dby.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      est $$16 = dby.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      est $$17 = dby.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      est $$18 = dby.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<doz, est> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dql $$21 : c.a()) {
            for (dql $$22 : d.a()) {
               for (dql $$23 : f.a()) {
                  for (dql $$24 : e.a()) {
                     est $$25 = esq.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = esq.a($$25, $$10);
                     }

                     doz $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
                     $$19.put($$26.a(g, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.a(g, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.h.get($$0);
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   private boolean a(doz $$0, boolean $$1, ih $$2) {
      dby $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dex && dex.a($$0, $$2);
      return $$0.a(avc.L) || !j($$0) && $$1 || $$3 instanceof dfy || $$4;
   }

   @Override
   public doz a(cuo $$0) {
      cza $$1 = $$0.q();
      ib $$2 = $$0.a();
      eks $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      ib $$8 = $$2.c();
      doz $$9 = $$1.a_($$4);
      doz $$10 = $$1.a_($$5);
      doz $$11 = $$1.a_($$6);
      doz $$12 = $$1.a_($$7);
      doz $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ih.d), ih.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ih.e), ih.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ih.c), ih.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ih.f), ih.f);
      doz $$18 = this.n().a(g, Boolean.valueOf($$3.a() == ekt.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      if ($$1 == ih.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ih.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(doz $$0, dqc<dql> $$1) {
      return $$0.c($$1) != dql.a;
   }

   private static boolean a(est $$0, est $$1) {
      return !esq.c($$1, $$0, ese.e);
   }

   private doz a(cza $$0, doz $$1, ib $$2, doz $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private doz a(cza $$0, ib $$1, doz $$2, ib $$3, doz $$4, ih $$5) {
      ih $$6 = $$5.g();
      boolean $$7 = $$5 == ih.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ih.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ih.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ih.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ib $$11 = $$1.c();
      doz $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private doz a(cza $$0, doz $$1, ib $$2, doz $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      est $$8 = $$3.k($$0, $$2).a(ih.a);
      doz $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(doz $$0, doz $$1, est $$2) {
      boolean $$3 = $$1.b() instanceof dkv && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dql $$4 = $$0.c(d);
         dql $$5 = $$0.c(e);
         dql $$6 = $$0.c(c);
         dql $$7 = $$0.c(f);
         boolean $$8 = $$5 == dql.a;
         boolean $$9 = $$7 == dql.a;
         boolean $$10 = $$6 == dql.a;
         boolean $$11 = $$4 == dql.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dql.c && $$5 == dql.c || $$6 == dql.c && $$7 == dql.c;
            return $$13 ? false : $$1.a(avc.aO) || a($$2, F);
         }
      }
   }

   private doz a(doz $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, est $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dql a(boolean $$0, est $$1, est $$2) {
      if ($$0) {
         return a($$1, $$2) ? dql.c : dql.b;
      } else {
         return dql.a;
      }
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(g) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      switch ($$1) {
         case c:
            return $$0.a(d, $$0.c(e)).a(c, $$0.c(f)).a(e, $$0.c(d)).a(f, $$0.c(c));
         case d:
            return $$0.a(d, $$0.c(c)).a(c, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(d));
         case b:
            return $$0.a(d, $$0.c(f)).a(c, $$0.c(d)).a(e, $$0.c(c)).a(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      switch ($$1) {
         case b:
            return $$0.a(d, $$0.c(e)).a(e, $$0.c(d));
         case c:
            return $$0.a(c, $$0.c(f)).a(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}

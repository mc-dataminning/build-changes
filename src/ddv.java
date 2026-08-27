import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ddv extends cva implements dca {
   public static final MapCodec<ddv> a = b(ddv::new);
   public static final dhz b = dhy.J;
   public static final dig<diu> c = dhy.W;
   public static final dig<diu> d = dhy.X;
   public static final dig<diu> e = dhy.Y;
   public static final dig<diu> f = dhy.Z;
   public static final dhz g = dhy.C;
   private final Map<dhi, ekn> h;
   private final Map<dhi, ekn> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ekn F = cva.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ekn G = cva.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ekn H = cva.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ekn I = cva.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ekn J = cva.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, diu.a).a(c, diu.a).a(e, diu.a).a(f, diu.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ekn a(ekn $$0, diu $$1, ekn $$2, ekn $$3) {
      if ($$1 == diu.c) {
         return ekk.a($$0, $$3);
      } else {
         return $$1 == diu.b ? ekk.a($$0, $$2) : $$0;
      }
   }

   private Map<dhi, ekn> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ekn $$10 = cva.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ekn $$11 = cva.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ekn $$12 = cva.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ekn $$13 = cva.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ekn $$14 = cva.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ekn $$15 = cva.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ekn $$16 = cva.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ekn $$17 = cva.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ekn $$18 = cva.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dhi, ekn> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (diu $$21 : c.a()) {
            for (diu $$22 : d.a()) {
               for (diu $$23 : f.a()) {
                  for (diu $$24 : e.a()) {
                     ekn $$25 = ekk.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ekk.a($$25, $$10);
                     }

                     dhi $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.h.get($$0);
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   private boolean a(dhi $$0, boolean $$1, hx $$2) {
      cva $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cxz && cxz.a($$0, $$2);
      return $$0.a(arg.L) || !j($$0) && $$1 || $$3 instanceof cza || $$4;
   }

   @Override
   public dhi a(cnr $$0) {
      csd $$1 = $$0.q();
      ht $$2 = $$0.a();
      ecs $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.h();
      ht $$6 = $$2.f();
      ht $$7 = $$2.g();
      ht $$8 = $$2.c();
      dhi $$9 = $$1.a_($$4);
      dhi $$10 = $$1.a_($$5);
      dhi $$11 = $$1.a_($$6);
      dhi $$12 = $$1.a_($$7);
      dhi $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, hx.d), hx.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, hx.e), hx.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, hx.c), hx.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, hx.f), hx.f);
      dhi $$18 = this.o().a(g, Boolean.valueOf($$3.a() == ect.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      if ($$1 == hx.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == hx.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dhi $$0, dil<diu> $$1) {
      return $$0.c($$1) != diu.a;
   }

   private static boolean a(ekn $$0, ekn $$1) {
      return !ekk.c($$1, $$0, ejy.e);
   }

   private dhi a(csd $$0, dhi $$1, ht $$2, dhi $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dhi a(csd $$0, ht $$1, dhi $$2, ht $$3, dhi $$4, hx $$5) {
      hx $$6 = $$5.g();
      boolean $$7 = $$5 == hx.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == hx.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == hx.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == hx.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ht $$11 = $$1.c();
      dhi $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dhi a(csd $$0, dhi $$1, ht $$2, dhi $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ekn $$8 = $$3.k($$0, $$2).a(hx.a);
      dhi $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dhi $$0, dhi $$1, ekn $$2) {
      boolean $$3 = $$1.b() instanceof ddv && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         diu $$4 = $$0.c(d);
         diu $$5 = $$0.c(e);
         diu $$6 = $$0.c(c);
         diu $$7 = $$0.c(f);
         boolean $$8 = $$5 == diu.a;
         boolean $$9 = $$7 == diu.a;
         boolean $$10 = $$6 == diu.a;
         boolean $$11 = $$4 == diu.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == diu.c && $$5 == diu.c || $$6 == diu.c && $$7 == diu.c;
            return $$13 ? false : $$1.a(arg.aN) || a($$2, F);
         }
      }
   }

   private dhi a(dhi $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ekn $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private diu a(boolean $$0, ekn $$1, ekn $$2) {
      if ($$0) {
         return a($$1, $$2) ? diu.c : diu.b;
      } else {
         return diu.a;
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(g) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
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
   public dhi a(dhi $$0, czw $$1) {
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

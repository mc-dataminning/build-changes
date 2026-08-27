import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class ddn extends cut implements dbt {
   public static final MapCodec<ddn> a = b(ddn::new);
   public static final dhn b = dhm.J;
   public static final dhu<dii> c = dhm.W;
   public static final dhu<dii> d = dhm.X;
   public static final dhu<dii> e = dhm.Y;
   public static final dhu<dii> f = dhm.Z;
   public static final dhn g = dhm.C;
   private final Map<dgw, ekb> h;
   private final Map<dgw, ekb> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ekb F = cut.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ekb G = cut.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ekb H = cut.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ekb I = cut.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ekb J = cut.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<ddn> a() {
      return a;
   }

   public ddn(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dii.a).a(c, dii.a).a(e, dii.a).a(f, dii.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ekb a(ekb $$0, dii $$1, ekb $$2, ekb $$3) {
      if ($$1 == dii.c) {
         return ejy.a($$0, $$3);
      } else {
         return $$1 == dii.b ? ejy.a($$0, $$2) : $$0;
      }
   }

   private Map<dgw, ekb> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ekb $$10 = cut.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ekb $$11 = cut.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ekb $$12 = cut.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ekb $$13 = cut.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ekb $$14 = cut.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ekb $$15 = cut.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ekb $$16 = cut.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ekb $$17 = cut.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ekb $$18 = cut.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dgw, ekb> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dii $$21 : c.a()) {
            for (dii $$22 : d.a()) {
               for (dii $$23 : f.a()) {
                  for (dii $$24 : e.a()) {
                     ekb $$25 = ejy.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ejy.a($$25, $$10);
                     }

                     dgw $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.h.get($$0);
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   private boolean a(dgw $$0, boolean $$1, hx $$2) {
      cut $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cxr && cxr.a($$0, $$2);
      return $$0.a(arc.L) || !j($$0) && $$1 || $$3 instanceof cyt || $$4;
   }

   @Override
   public dgw a(cnj $$0) {
      crv $$1 = $$0.q();
      ht $$2 = $$0.a();
      ecg $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.h();
      ht $$6 = $$2.f();
      ht $$7 = $$2.g();
      ht $$8 = $$2.c();
      dgw $$9 = $$1.a_($$4);
      dgw $$10 = $$1.a_($$5);
      dgw $$11 = $$1.a_($$6);
      dgw $$12 = $$1.a_($$7);
      dgw $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, hx.d), hx.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, hx.e), hx.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, hx.c), hx.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, hx.f), hx.f);
      dgw $$18 = this.o().a(g, Boolean.valueOf($$3.a() == ech.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      if ($$1 == hx.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == hx.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dgw $$0, dhz<dii> $$1) {
      return $$0.c($$1) != dii.a;
   }

   private static boolean a(ekb $$0, ekb $$1) {
      return !ejy.c($$1, $$0, ejm.e);
   }

   private dgw a(crv $$0, dgw $$1, ht $$2, dgw $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dgw a(crv $$0, ht $$1, dgw $$2, ht $$3, dgw $$4, hx $$5) {
      hx $$6 = $$5.g();
      boolean $$7 = $$5 == hx.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == hx.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == hx.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == hx.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ht $$11 = $$1.c();
      dgw $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dgw a(crv $$0, dgw $$1, ht $$2, dgw $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ekb $$8 = $$3.k($$0, $$2).a(hx.a);
      dgw $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dgw $$0, dgw $$1, ekb $$2) {
      boolean $$3 = $$1.b() instanceof ddn && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dii $$4 = $$0.c(d);
         dii $$5 = $$0.c(e);
         dii $$6 = $$0.c(c);
         dii $$7 = $$0.c(f);
         boolean $$8 = $$5 == dii.a;
         boolean $$9 = $$7 == dii.a;
         boolean $$10 = $$6 == dii.a;
         boolean $$11 = $$4 == dii.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dii.c && $$5 == dii.c || $$6 == dii.c && $$7 == dii.c;
            return $$13 ? false : $$1.a(arc.aN) || a($$2, F);
         }
      }
   }

   private dgw a(dgw $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ekb $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dii a(boolean $$0, ekb $$1, ekb $$2) {
      if ($$0) {
         return a($$1, $$2) ? dii.c : dii.b;
      } else {
         return dii.a;
      }
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(g) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
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
   public dgw a(dgw $$0, czp $$1) {
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

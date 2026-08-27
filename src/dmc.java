import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmc extends dde implements dkf {
   public static final MapCodec<dmc> a = b(dmc::new);
   public static final dqy b = dqx.J;
   public static final drf<drt> c = dqx.W;
   public static final drf<drt> d = dqx.X;
   public static final drf<drt> e = dqx.Y;
   public static final drf<drt> f = dqx.Z;
   public static final dqy g = dqx.C;
   private final Map<dqh, eui> h;
   private final Map<dqh, eui> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eui F = dde.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eui G = dde.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eui H = dde.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eui I = dde.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eui J = dde.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   public dmc(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, drt.a).a(c, drt.a).a(e, drt.a).a(f, drt.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eui a(eui $$0, drt $$1, eui $$2, eui $$3) {
      if ($$1 == drt.c) {
         return euf.a($$0, $$3);
      } else {
         return $$1 == drt.b ? euf.a($$0, $$2) : $$0;
      }
   }

   private Map<dqh, eui> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eui $$10 = dde.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eui $$11 = dde.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eui $$12 = dde.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eui $$13 = dde.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eui $$14 = dde.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eui $$15 = dde.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eui $$16 = dde.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eui $$17 = dde.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eui $$18 = dde.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dqh, eui> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (drt $$21 : c.a()) {
            for (drt $$22 : d.a()) {
               for (drt $$23 : f.a()) {
                  for (drt $$24 : e.a()) {
                     eui $$25 = euf.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = euf.a($$25, $$10);
                     }

                     dqh $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.h.get($$0);
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   private boolean a(dqh $$0, boolean $$1, is $$2) {
      dde $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dgd && dgd.a($$0, $$2);
      return $$0.a(avr.L) || !j($$0) && $$1 || $$3 instanceof dhf || $$4;
   }

   @Override
   public dqh a(cwi $$0) {
      dag $$1 = $$0.q();
      in $$2 = $$0.a();
      ema $$3 = $$0.q().b_($$0.a());
      in $$4 = $$2.e();
      in $$5 = $$2.h();
      in $$6 = $$2.f();
      in $$7 = $$2.g();
      in $$8 = $$2.c();
      dqh $$9 = $$1.a_($$4);
      dqh $$10 = $$1.a_($$5);
      dqh $$11 = $$1.a_($$6);
      dqh $$12 = $$1.a_($$7);
      dqh $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, is.d), is.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, is.e), is.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, is.c), is.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, is.f), is.f);
      dqh $$18 = this.n().a(g, Boolean.valueOf($$3.a() == emb.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      if ($$1 == is.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == is.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dqh $$0, drk<drt> $$1) {
      return $$0.c($$1) != drt.a;
   }

   private static boolean a(eui $$0, eui $$1) {
      return !euf.c($$1, $$0, ett.e);
   }

   private dqh a(dag $$0, dqh $$1, in $$2, dqh $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dqh a(dag $$0, in $$1, dqh $$2, in $$3, dqh $$4, is $$5) {
      is $$6 = $$5.g();
      boolean $$7 = $$5 == is.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == is.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == is.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == is.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      in $$11 = $$1.c();
      dqh $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dqh a(dag $$0, dqh $$1, in $$2, dqh $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eui $$8 = $$3.k($$0, $$2).a(is.a);
      dqh $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dqh $$0, dqh $$1, eui $$2) {
      boolean $$3 = $$1.b() instanceof dmc && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         drt $$4 = $$0.c(d);
         drt $$5 = $$0.c(e);
         drt $$6 = $$0.c(c);
         drt $$7 = $$0.c(f);
         boolean $$8 = $$5 == drt.a;
         boolean $$9 = $$7 == drt.a;
         boolean $$10 = $$6 == drt.a;
         boolean $$11 = $$4 == drt.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == drt.c && $$5 == drt.c || $$6 == drt.c && $$7 == drt.c;
            return $$13 ? false : $$1.a(avr.aO) || a($$2, F);
         }
      }
   }

   private dqh a(dqh $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eui $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private drt a(boolean $$0, eui $$1, eui $$2) {
      if ($$0) {
         return a($$1, $$2) ? drt.c : drt.b;
      } else {
         return drt.a;
      }
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(g) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
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
   protected dqh a(dqh $$0, dib $$1) {
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

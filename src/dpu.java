import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dpu extends dgv implements dnx {
   public static final MapCodec<dpu> a = b(dpu::new);
   public static final dur b = duq.J;
   public static final duy<dvm> c = duq.W;
   public static final duy<dvm> d = duq.X;
   public static final duy<dvm> e = duq.Y;
   public static final duy<dvm> f = duq.Z;
   public static final dur g = duq.C;
   private final Map<dua, eyx> h;
   private final Map<dua, eyx> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eyx F = dgv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eyx G = dgv.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eyx H = dgv.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eyx I = dgv.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eyx J = dgv.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(true)).b(d, dvm.a).b(c, dvm.a).b(e, dvm.a).b(f, dvm.a).b(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eyx a(eyx $$0, dvm $$1, eyx $$2, eyx $$3) {
      if ($$1 == dvm.c) {
         return eyu.a($$0, $$3);
      } else {
         return $$1 == dvm.b ? eyu.a($$0, $$2) : $$0;
      }
   }

   private Map<dua, eyx> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eyx $$10 = dgv.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eyx $$11 = dgv.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eyx $$12 = dgv.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eyx $$13 = dgv.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eyx $$14 = dgv.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eyx $$15 = dgv.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eyx $$16 = dgv.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eyx $$17 = dgv.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eyx $$18 = dgv.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dua, eyx> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dvm $$21 : c.a()) {
            for (dvm $$22 : d.a()) {
               for (dvm $$23 : f.a()) {
                  for (dvm $$24 : e.a()) {
                     eyx $$25 = eyu.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eyu.a($$25, $$10);
                     }

                     dua $$26 = this.o().b(b, $$20).b(c, $$21).b(f, $$23).b(d, $$22).b(e, $$24);
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
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.h.get($$0);
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   private boolean a(dua $$0, boolean $$1, jj $$2) {
      dgv $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dju && dju.a($$0, $$2);
      return $$0.a(aws.M) || !k($$0) && $$1 || $$3 instanceof dkw || $$4;
   }

   @Override
   public dua a(cyw $$0) {
      ddv $$1 = $$0.q();
      je $$2 = $$0.a();
      eqb $$3 = $$0.q().b_($$0.a());
      je $$4 = $$2.f();
      je $$5 = $$2.i();
      je $$6 = $$2.g();
      je $$7 = $$2.h();
      je $$8 = $$2.d();
      dua $$9 = $$1.a_($$4);
      dua $$10 = $$1.a_($$5);
      dua $$11 = $$1.a_($$6);
      dua $$12 = $$1.a_($$7);
      dua $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.c($$1, $$4, jj.d), jj.d);
      boolean $$15 = this.a($$10, $$10.c($$1, $$5, jj.e), jj.e);
      boolean $$16 = this.a($$11, $$11.c($$1, $$6, jj.c), jj.c);
      boolean $$17 = this.a($$12, $$12.c($$1, $$7, jj.f), jj.f);
      dua $$18 = this.o().b(g, Boolean.valueOf($$3.a() == eqc.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      if ($$1 == jj.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jj.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dua $$0, dvd<dvm> $$1) {
      return $$0.c($$1) != dvm.a;
   }

   private static boolean a(eyx $$0, eyx $$1) {
      return !eyu.c($$1, $$0, eyi.e);
   }

   private dua a(ddv $$0, dua $$1, je $$2, dua $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dua a(ddv $$0, je $$1, dua $$2, je $$3, dua $$4, jj $$5) {
      jj $$6 = $$5.g();
      boolean $$7 = $$5 == jj.c ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jj.f ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jj.d ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jj.e ? this.a($$4, $$4.c($$0, $$3, $$6), $$6) : a($$2, f);
      je $$11 = $$1.d();
      dua $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dua a(ddv $$0, dua $$1, je $$2, dua $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eyx $$8 = $$3.g($$0, $$2).a(jj.a);
      dua $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.b(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dua $$0, dua $$1, eyx $$2) {
      boolean $$3 = $$1.b() instanceof dpu && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dvm $$4 = $$0.c(d);
         dvm $$5 = $$0.c(e);
         dvm $$6 = $$0.c(c);
         dvm $$7 = $$0.c(f);
         boolean $$8 = $$5 == dvm.a;
         boolean $$9 = $$7 == dvm.a;
         boolean $$10 = $$6 == dvm.a;
         boolean $$11 = $$4 == dvm.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dvm.c && $$5 == dvm.c || $$6 == dvm.c && $$7 == dvm.c;
            return $$13 ? false : $$1.a(aws.aP) || a($$2, F);
         }
      }
   }

   private dua a(dua $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eyx $$5) {
      return $$0.b(d, this.a($$1, $$5, G)).b(c, this.a($$2, $$5, J)).b(e, this.a($$3, $$5, H)).b(f, this.a($$4, $$5, I));
   }

   private dvm a(boolean $$0, eyx $$1, eyx $$2) {
      if ($$0) {
         return a($$1, $$2) ? dvm.c : dvm.b;
      } else {
         return dvm.a;
      }
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(g) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean e_(dua $$0) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
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
   protected dua a(dua $$0, dls $$1) {
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

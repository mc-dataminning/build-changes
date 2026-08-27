import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dhk extends cyo implements dfo {
   public static final MapCodec<dhk> a = b(dhk::new);
   public static final dlw b = dlv.J;
   public static final dmd<dmr> c = dlv.W;
   public static final dmd<dmr> d = dlv.X;
   public static final dmd<dmr> e = dlv.Y;
   public static final dmd<dmr> f = dlv.Z;
   public static final dlw g = dlv.C;
   private final Map<dlf, eol> h;
   private final Map<dlf, eol> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eol F = cyo.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eol G = cyo.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eol H = cyo.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eol I = cyo.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eol J = cyo.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public dhk(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dmr.a).a(c, dmr.a).a(e, dmr.a).a(f, dmr.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eol a(eol $$0, dmr $$1, eol $$2, eol $$3) {
      if ($$1 == dmr.c) {
         return eoi.a($$0, $$3);
      } else {
         return $$1 == dmr.b ? eoi.a($$0, $$2) : $$0;
      }
   }

   private Map<dlf, eol> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eol $$10 = cyo.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eol $$11 = cyo.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eol $$12 = cyo.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eol $$13 = cyo.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eol $$14 = cyo.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eol $$15 = cyo.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eol $$16 = cyo.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eol $$17 = cyo.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eol $$18 = cyo.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dlf, eol> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dmr $$21 : c.a()) {
            for (dmr $$22 : d.a()) {
               for (dmr $$23 : f.a()) {
                  for (dmr $$24 : e.a()) {
                     eol $$25 = eoi.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eoi.a($$25, $$10);
                     }

                     dlf $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.h.get($$0);
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   private boolean a(dlf $$0, boolean $$1, ie $$2) {
      cyo $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dbn && dbn.a($$0, $$2);
      return $$0.a(atz.L) || !j($$0) && $$1 || $$3 instanceof dco || $$4;
   }

   @Override
   public dlf a(crg $$0) {
      cvq $$1 = $$0.q();
      hz $$2 = $$0.a();
      egp $$3 = $$0.q().b_($$0.a());
      hz $$4 = $$2.e();
      hz $$5 = $$2.h();
      hz $$6 = $$2.f();
      hz $$7 = $$2.g();
      hz $$8 = $$2.c();
      dlf $$9 = $$1.a_($$4);
      dlf $$10 = $$1.a_($$5);
      dlf $$11 = $$1.a_($$6);
      dlf $$12 = $$1.a_($$7);
      dlf $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ie.d), ie.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ie.e), ie.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ie.c), ie.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ie.f), ie.f);
      dlf $$18 = this.o().a(g, Boolean.valueOf($$3.a() == egq.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      if ($$1 == ie.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ie.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dlf $$0, dmi<dmr> $$1) {
      return $$0.c($$1) != dmr.a;
   }

   private static boolean a(eol $$0, eol $$1) {
      return !eoi.c($$1, $$0, enw.e);
   }

   private dlf a(cvq $$0, dlf $$1, hz $$2, dlf $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dlf a(cvq $$0, hz $$1, dlf $$2, hz $$3, dlf $$4, ie $$5) {
      ie $$6 = $$5.g();
      boolean $$7 = $$5 == ie.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ie.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ie.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ie.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hz $$11 = $$1.c();
      dlf $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dlf a(cvq $$0, dlf $$1, hz $$2, dlf $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eol $$8 = $$3.k($$0, $$2).a(ie.a);
      dlf $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dlf $$0, dlf $$1, eol $$2) {
      boolean $$3 = $$1.b() instanceof dhk && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dmr $$4 = $$0.c(d);
         dmr $$5 = $$0.c(e);
         dmr $$6 = $$0.c(c);
         dmr $$7 = $$0.c(f);
         boolean $$8 = $$5 == dmr.a;
         boolean $$9 = $$7 == dmr.a;
         boolean $$10 = $$6 == dmr.a;
         boolean $$11 = $$4 == dmr.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dmr.c && $$5 == dmr.c || $$6 == dmr.c && $$7 == dmr.c;
            return $$13 ? false : $$1.a(atz.aN) || a($$2, F);
         }
      }
   }

   private dlf a(dlf $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eol $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dmr a(boolean $$0, eol $$1, eol $$2) {
      if ($$0) {
         return a($$1, $$2) ? dmr.c : dmr.b;
      } else {
         return dmr.a;
      }
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(g) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
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
   protected dlf a(dlf $$0, ddk $$1) {
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

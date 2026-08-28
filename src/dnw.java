import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnw extends dey implements dlz {
   public static final MapCodec<dnw> a = b(dnw::new);
   public static final dss b = dsr.J;
   public static final dsz<dtn> c = dsr.W;
   public static final dsz<dtn> d = dsr.X;
   public static final dsz<dtn> e = dsr.Y;
   public static final dsz<dtn> f = dsr.Z;
   public static final dss g = dsr.C;
   private final Map<dsb, ewj> h;
   private final Map<dsb, ewj> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewj F = dey.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewj G = dey.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewj H = dey.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewj I = dey.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewj J = dey.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   public dnw(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtn.a).a(c, dtn.a).a(e, dtn.a).a(f, dtn.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewj a(ewj $$0, dtn $$1, ewj $$2, ewj $$3) {
      if ($$1 == dtn.c) {
         return ewg.a($$0, $$3);
      } else {
         return $$1 == dtn.b ? ewg.a($$0, $$2) : $$0;
      }
   }

   private Map<dsb, ewj> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewj $$10 = dey.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewj $$11 = dey.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewj $$12 = dey.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewj $$13 = dey.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewj $$14 = dey.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewj $$15 = dey.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewj $$16 = dey.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewj $$17 = dey.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewj $$18 = dey.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsb, ewj> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtn $$21 : c.a()) {
            for (dtn $$22 : d.a()) {
               for (dtn $$23 : f.a()) {
                  for (dtn $$24 : e.a()) {
                     ewj $$25 = ewg.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewg.a($$25, $$10);
                     }

                     dsb $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   private boolean a(dsb $$0, boolean $$1, je $$2) {
      dey $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dhx && dhx.a($$0, $$2);
      return $$0.a(awo.L) || !j($$0) && $$1 || $$3 instanceof diz || $$4;
   }

   @Override
   public dsb a(cxz $$0) {
      dca $$1 = $$0.q();
      iz $$2 = $$0.a();
      enu $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      iz $$8 = $$2.c();
      dsb $$9 = $$1.a_($$4);
      dsb $$10 = $$1.a_($$5);
      dsb $$11 = $$1.a_($$6);
      dsb $$12 = $$1.a_($$7);
      dsb $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, je.d), je.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, je.e), je.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, je.c), je.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, je.f), je.f);
      dsb $$18 = this.o().a(g, Boolean.valueOf($$3.a() == env.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == je.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsb $$0, dte<dtn> $$1) {
      return $$0.c($$1) != dtn.a;
   }

   private static boolean a(ewj $$0, ewj $$1) {
      return !ewg.c($$1, $$0, evu.e);
   }

   private dsb a(dca $$0, dsb $$1, iz $$2, dsb $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsb a(dca $$0, iz $$1, dsb $$2, iz $$3, dsb $$4, je $$5) {
      je $$6 = $$5.g();
      boolean $$7 = $$5 == je.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == je.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == je.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == je.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      iz $$11 = $$1.c();
      dsb $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsb a(dca $$0, dsb $$1, iz $$2, dsb $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewj $$8 = $$3.k($$0, $$2).a(je.a);
      dsb $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsb $$0, dsb $$1, ewj $$2) {
      boolean $$3 = $$1.b() instanceof dnw && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtn $$4 = $$0.c(d);
         dtn $$5 = $$0.c(e);
         dtn $$6 = $$0.c(c);
         dtn $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtn.a;
         boolean $$9 = $$7 == dtn.a;
         boolean $$10 = $$6 == dtn.a;
         boolean $$11 = $$4 == dtn.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtn.c && $$5 == dtn.c || $$6 == dtn.c && $$7 == dtn.c;
            return $$13 ? false : $$1.a(awo.aO) || a($$2, F);
         }
      }
   }

   private dsb a(dsb $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewj $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtn a(boolean $$0, ewj $$1, ewj $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtn.c : dtn.b;
      } else {
         return dtn.a;
      }
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(g) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
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
   protected dsb a(dsb $$0, djv $$1) {
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

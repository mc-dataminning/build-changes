import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnz extends dfb implements dmc {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final dsv b = dsu.J;
   public static final dtc<dtq> c = dsu.W;
   public static final dtc<dtq> d = dsu.X;
   public static final dtc<dtq> e = dsu.Y;
   public static final dtc<dtq> f = dsu.Z;
   public static final dsv g = dsu.C;
   private final Map<dse, ewm> h;
   private final Map<dse, ewm> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewm F = dfb.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewm G = dfb.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewm H = dfb.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewm I = dfb.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewm J = dfb.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtq.a).a(c, dtq.a).a(e, dtq.a).a(f, dtq.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewm a(ewm $$0, dtq $$1, ewm $$2, ewm $$3) {
      if ($$1 == dtq.c) {
         return ewj.a($$0, $$3);
      } else {
         return $$1 == dtq.b ? ewj.a($$0, $$2) : $$0;
      }
   }

   private Map<dse, ewm> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewm $$10 = dfb.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewm $$11 = dfb.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewm $$12 = dfb.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewm $$13 = dfb.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewm $$14 = dfb.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewm $$15 = dfb.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewm $$16 = dfb.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewm $$17 = dfb.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewm $$18 = dfb.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dse, ewm> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtq $$21 : c.a()) {
            for (dtq $$22 : d.a()) {
               for (dtq $$23 : f.a()) {
                  for (dtq $$24 : e.a()) {
                     ewm $$25 = ewj.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewj.a($$25, $$10);
                     }

                     dse $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   private boolean a(dse $$0, boolean $$1, je $$2) {
      dfb $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dia && dia.a($$0, $$2);
      return $$0.a(awp.L) || !j($$0) && $$1 || $$3 instanceof djc || $$4;
   }

   @Override
   public dse a(cyc $$0) {
      dcd $$1 = $$0.q();
      iz $$2 = $$0.a();
      enx $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      iz $$8 = $$2.c();
      dse $$9 = $$1.a_($$4);
      dse $$10 = $$1.a_($$5);
      dse $$11 = $$1.a_($$6);
      dse $$12 = $$1.a_($$7);
      dse $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, je.d), je.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, je.e), je.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, je.c), je.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, je.f), je.f);
      dse $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eny.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == je.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dse $$0, dth<dtq> $$1) {
      return $$0.c($$1) != dtq.a;
   }

   private static boolean a(ewm $$0, ewm $$1) {
      return !ewj.c($$1, $$0, evx.e);
   }

   private dse a(dcd $$0, dse $$1, iz $$2, dse $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dse a(dcd $$0, iz $$1, dse $$2, iz $$3, dse $$4, je $$5) {
      je $$6 = $$5.g();
      boolean $$7 = $$5 == je.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == je.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == je.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == je.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      iz $$11 = $$1.c();
      dse $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dse a(dcd $$0, dse $$1, iz $$2, dse $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewm $$8 = $$3.k($$0, $$2).a(je.a);
      dse $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dse $$0, dse $$1, ewm $$2) {
      boolean $$3 = $$1.b() instanceof dnz && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtq $$4 = $$0.c(d);
         dtq $$5 = $$0.c(e);
         dtq $$6 = $$0.c(c);
         dtq $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtq.a;
         boolean $$9 = $$7 == dtq.a;
         boolean $$10 = $$6 == dtq.a;
         boolean $$11 = $$4 == dtq.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtq.c && $$5 == dtq.c || $$6 == dtq.c && $$7 == dtq.c;
            return $$13 ? false : $$1.a(awp.aO) || a($$2, F);
         }
      }
   }

   private dse a(dse $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewm $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtq a(boolean $$0, ewm $$1, ewm $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtq.c : dtq.b;
      } else {
         return dtq.a;
      }
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(g) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
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
   protected dse a(dse $$0, djy $$1) {
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

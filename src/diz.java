import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class diz extends dac implements dhc {
   public static final MapCodec<diz> a = b(diz::new);
   public static final dns b = dnr.J;
   public static final dnz<don> c = dnr.W;
   public static final dnz<don> d = dnr.X;
   public static final dnz<don> e = dnr.Y;
   public static final dnz<don> f = dnr.Z;
   public static final dns g = dnr.C;
   private final Map<dnb, eqm> h;
   private final Map<dnb, eqm> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eqm F = dac.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eqm G = dac.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eqm H = dac.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eqm I = dac.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eqm J = dac.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   public diz(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, don.a).a(c, don.a).a(e, don.a).a(f, don.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eqm a(eqm $$0, don $$1, eqm $$2, eqm $$3) {
      if ($$1 == don.c) {
         return eqj.a($$0, $$3);
      } else {
         return $$1 == don.b ? eqj.a($$0, $$2) : $$0;
      }
   }

   private Map<dnb, eqm> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eqm $$10 = dac.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eqm $$11 = dac.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eqm $$12 = dac.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eqm $$13 = dac.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eqm $$14 = dac.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eqm $$15 = dac.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eqm $$16 = dac.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eqm $$17 = dac.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eqm $$18 = dac.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dnb, eqm> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (don $$21 : c.a()) {
            for (don $$22 : d.a()) {
               for (don $$23 : f.a()) {
                  for (don $$24 : e.a()) {
                     eqm $$25 = eqj.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eqj.a($$25, $$10);
                     }

                     dnb $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.h.get($$0);
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   private boolean a(dnb $$0, boolean $$1, ih $$2) {
      dac $$3 = $$0.b();
      boolean $$4 = $$3 instanceof ddb && ddb.a($$0, $$2);
      return $$0.a(aun.L) || !j($$0) && $$1 || $$3 instanceof dec || $$4;
   }

   @Override
   public dnb a(csu $$0) {
      cxe $$1 = $$0.q();
      ib $$2 = $$0.a();
      eip $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      ib $$8 = $$2.c();
      dnb $$9 = $$1.a_($$4);
      dnb $$10 = $$1.a_($$5);
      dnb $$11 = $$1.a_($$6);
      dnb $$12 = $$1.a_($$7);
      dnb $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ih.d), ih.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ih.e), ih.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ih.c), ih.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ih.f), ih.f);
      dnb $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eiq.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      if ($$1 == ih.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ih.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dnb $$0, doe<don> $$1) {
      return $$0.c($$1) != don.a;
   }

   private static boolean a(eqm $$0, eqm $$1) {
      return !eqj.c($$1, $$0, epx.e);
   }

   private dnb a(cxe $$0, dnb $$1, ib $$2, dnb $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dnb a(cxe $$0, ib $$1, dnb $$2, ib $$3, dnb $$4, ih $$5) {
      ih $$6 = $$5.g();
      boolean $$7 = $$5 == ih.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ih.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ih.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ih.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ib $$11 = $$1.c();
      dnb $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dnb a(cxe $$0, dnb $$1, ib $$2, dnb $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eqm $$8 = $$3.k($$0, $$2).a(ih.a);
      dnb $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dnb $$0, dnb $$1, eqm $$2) {
      boolean $$3 = $$1.b() instanceof diz && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         don $$4 = $$0.c(d);
         don $$5 = $$0.c(e);
         don $$6 = $$0.c(c);
         don $$7 = $$0.c(f);
         boolean $$8 = $$5 == don.a;
         boolean $$9 = $$7 == don.a;
         boolean $$10 = $$6 == don.a;
         boolean $$11 = $$4 == don.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == don.c && $$5 == don.c || $$6 == don.c && $$7 == don.c;
            return $$13 ? false : $$1.a(aun.aO) || a($$2, F);
         }
      }
   }

   private dnb a(dnb $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eqm $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private don a(boolean $$0, eqm $$1, eqm $$2) {
      if ($$0) {
         return a($$1, $$2) ? don.c : don.b;
      } else {
         return don.a;
      }
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(g) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
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
   protected dnb a(dnb $$0, dey $$1) {
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

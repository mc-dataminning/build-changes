import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dog extends dfi implements dmj {
   public static final MapCodec<dog> a = b(dog::new);
   public static final dtc b = dtb.J;
   public static final dtj<dtx> c = dtb.W;
   public static final dtj<dtx> d = dtb.X;
   public static final dtj<dtx> e = dtb.Y;
   public static final dtj<dtx> f = dtb.Z;
   public static final dtc g = dtb.C;
   private final Map<dsl, exa> h;
   private final Map<dsl, exa> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final exa F = dfi.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final exa G = dfi.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final exa H = dfi.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final exa I = dfi.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final exa J = dfi.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtx.a).a(c, dtx.a).a(e, dtx.a).a(f, dtx.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static exa a(exa $$0, dtx $$1, exa $$2, exa $$3) {
      if ($$1 == dtx.c) {
         return ewx.a($$0, $$3);
      } else {
         return $$1 == dtx.b ? ewx.a($$0, $$2) : $$0;
      }
   }

   private Map<dsl, exa> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      exa $$10 = dfi.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      exa $$11 = dfi.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      exa $$12 = dfi.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      exa $$13 = dfi.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      exa $$14 = dfi.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      exa $$15 = dfi.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      exa $$16 = dfi.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      exa $$17 = dfi.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      exa $$18 = dfi.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsl, exa> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtx $$21 : c.a()) {
            for (dtx $$22 : d.a()) {
               for (dtx $$23 : f.a()) {
                  for (dtx $$24 : e.a()) {
                     exa $$25 = ewx.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewx.a($$25, $$10);
                     }

                     dsl $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.h.get($$0);
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   private boolean a(dsl $$0, boolean $$1, jf $$2) {
      dfi $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dih && dih.a($$0, $$2);
      return $$0.a(avw.L) || !j($$0) && $$1 || $$3 instanceof djj || $$4;
   }

   @Override
   public dsl a(cxn $$0) {
      dcj $$1 = $$0.q();
      ja $$2 = $$0.a();
      eoj $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.h();
      ja $$6 = $$2.f();
      ja $$7 = $$2.g();
      ja $$8 = $$2.c();
      dsl $$9 = $$1.a_($$4);
      dsl $$10 = $$1.a_($$5);
      dsl $$11 = $$1.a_($$6);
      dsl $$12 = $$1.a_($$7);
      dsl $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, jf.d), jf.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, jf.e), jf.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, jf.c), jf.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, jf.f), jf.f);
      dsl $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eok.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      if ($$1 == jf.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jf.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsl $$0, dto<dtx> $$1) {
      return $$0.c($$1) != dtx.a;
   }

   private static boolean a(exa $$0, exa $$1) {
      return !ewx.c($$1, $$0, ewl.e);
   }

   private dsl a(dcj $$0, dsl $$1, ja $$2, dsl $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsl a(dcj $$0, ja $$1, dsl $$2, ja $$3, dsl $$4, jf $$5) {
      jf $$6 = $$5.g();
      boolean $$7 = $$5 == jf.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jf.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jf.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jf.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ja $$11 = $$1.c();
      dsl $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsl a(dcj $$0, dsl $$1, ja $$2, dsl $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      exa $$8 = $$3.k($$0, $$2).a(jf.a);
      dsl $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsl $$0, dsl $$1, exa $$2) {
      boolean $$3 = $$1.b() instanceof dog && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtx $$4 = $$0.c(d);
         dtx $$5 = $$0.c(e);
         dtx $$6 = $$0.c(c);
         dtx $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtx.a;
         boolean $$9 = $$7 == dtx.a;
         boolean $$10 = $$6 == dtx.a;
         boolean $$11 = $$4 == dtx.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtx.c && $$5 == dtx.c || $$6 == dtx.c && $$7 == dtx.c;
            return $$13 ? false : $$1.a(avw.aO) || a($$2, F);
         }
      }
   }

   private dsl a(dsl $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, exa $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtx a(boolean $$0, exa $$1, exa $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtx.c : dtx.b;
      } else {
         return dtx.a;
      }
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(g) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsl $$0, dbm $$1, ja $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
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
   protected dsl a(dsl $$0, dkf $$1) {
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

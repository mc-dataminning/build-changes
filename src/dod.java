import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dod extends dff implements dmg {
   public static final MapCodec<dod> a = b(dod::new);
   public static final dsy b = dsx.J;
   public static final dtf<dtt> c = dsx.W;
   public static final dtf<dtt> d = dsx.X;
   public static final dtf<dtt> e = dsx.Y;
   public static final dtf<dtt> f = dsx.Z;
   public static final dsy g = dsx.C;
   private final Map<dsh, ews> h;
   private final Map<dsh, ews> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ews F = dff.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ews G = dff.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ews H = dff.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ews I = dff.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ews J = dff.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   public dod(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtt.a).a(c, dtt.a).a(e, dtt.a).a(f, dtt.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ews a(ews $$0, dtt $$1, ews $$2, ews $$3) {
      if ($$1 == dtt.c) {
         return ewp.a($$0, $$3);
      } else {
         return $$1 == dtt.b ? ewp.a($$0, $$2) : $$0;
      }
   }

   private Map<dsh, ews> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ews $$10 = dff.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ews $$11 = dff.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ews $$12 = dff.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ews $$13 = dff.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ews $$14 = dff.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ews $$15 = dff.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ews $$16 = dff.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ews $$17 = dff.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ews $$18 = dff.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsh, ews> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtt $$21 : c.a()) {
            for (dtt $$22 : d.a()) {
               for (dtt $$23 : f.a()) {
                  for (dtt $$24 : e.a()) {
                     ews $$25 = ewp.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewp.a($$25, $$10);
                     }

                     dsh $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   private boolean a(dsh $$0, boolean $$1, jf $$2) {
      dff $$3 = $$0.b();
      boolean $$4 = $$3 instanceof die && die.a($$0, $$2);
      return $$0.a(avu.L) || !j($$0) && $$1 || $$3 instanceof djg || $$4;
   }

   @Override
   public dsh a(cxk $$0) {
      dcg $$1 = $$0.q();
      ja $$2 = $$0.a();
      eob $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.h();
      ja $$6 = $$2.f();
      ja $$7 = $$2.g();
      ja $$8 = $$2.c();
      dsh $$9 = $$1.a_($$4);
      dsh $$10 = $$1.a_($$5);
      dsh $$11 = $$1.a_($$6);
      dsh $$12 = $$1.a_($$7);
      dsh $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, jf.d), jf.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, jf.e), jf.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, jf.c), jf.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, jf.f), jf.f);
      dsh $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eoc.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      if ($$1 == jf.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jf.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsh $$0, dtk<dtt> $$1) {
      return $$0.c($$1) != dtt.a;
   }

   private static boolean a(ews $$0, ews $$1) {
      return !ewp.c($$1, $$0, ewd.e);
   }

   private dsh a(dcg $$0, dsh $$1, ja $$2, dsh $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsh a(dcg $$0, ja $$1, dsh $$2, ja $$3, dsh $$4, jf $$5) {
      jf $$6 = $$5.g();
      boolean $$7 = $$5 == jf.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jf.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jf.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jf.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ja $$11 = $$1.c();
      dsh $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsh a(dcg $$0, dsh $$1, ja $$2, dsh $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ews $$8 = $$3.k($$0, $$2).a(jf.a);
      dsh $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsh $$0, dsh $$1, ews $$2) {
      boolean $$3 = $$1.b() instanceof dod && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtt $$4 = $$0.c(d);
         dtt $$5 = $$0.c(e);
         dtt $$6 = $$0.c(c);
         dtt $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtt.a;
         boolean $$9 = $$7 == dtt.a;
         boolean $$10 = $$6 == dtt.a;
         boolean $$11 = $$4 == dtt.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtt.c && $$5 == dtt.c || $$6 == dtt.c && $$7 == dtt.c;
            return $$13 ? false : $$1.a(avu.aO) || a($$2, F);
         }
      }
   }

   private dsh a(dsh $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ews $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtt a(boolean $$0, ews $$1, ews $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtt.c : dtt.b;
      } else {
         return dtt.a;
      }
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(g) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
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
   protected dsh a(dsh $$0, dkc $$1) {
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

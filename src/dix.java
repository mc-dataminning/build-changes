import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dix extends daa implements dha {
   public static final MapCodec<dix> a = b(dix::new);
   public static final dnq b = dnp.J;
   public static final dnx<dol> c = dnp.W;
   public static final dnx<dol> d = dnp.X;
   public static final dnx<dol> e = dnp.Y;
   public static final dnx<dol> f = dnp.Z;
   public static final dnq g = dnp.C;
   private final Map<dmz, eqk> h;
   private final Map<dmz, eqk> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eqk F = daa.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eqk G = daa.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eqk H = daa.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eqk I = daa.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eqk J = daa.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dix> a() {
      return a;
   }

   public dix(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dol.a).a(c, dol.a).a(e, dol.a).a(f, dol.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eqk a(eqk $$0, dol $$1, eqk $$2, eqk $$3) {
      if ($$1 == dol.c) {
         return eqh.a($$0, $$3);
      } else {
         return $$1 == dol.b ? eqh.a($$0, $$2) : $$0;
      }
   }

   private Map<dmz, eqk> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eqk $$10 = daa.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eqk $$11 = daa.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eqk $$12 = daa.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eqk $$13 = daa.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eqk $$14 = daa.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eqk $$15 = daa.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eqk $$16 = daa.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eqk $$17 = daa.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eqk $$18 = daa.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dmz, eqk> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dol $$21 : c.a()) {
            for (dol $$22 : d.a()) {
               for (dol $$23 : f.a()) {
                  for (dol $$24 : e.a()) {
                     eqk $$25 = eqh.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eqh.a($$25, $$10);
                     }

                     dmz $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.h.get($$0);
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   private boolean a(dmz $$0, boolean $$1, ih $$2) {
      daa $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dcz && dcz.a($$0, $$2);
      return $$0.a(aun.L) || !j($$0) && $$1 || $$3 instanceof dea || $$4;
   }

   @Override
   public dmz a(css $$0) {
      cxc $$1 = $$0.q();
      ib $$2 = $$0.a();
      ein $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      ib $$8 = $$2.c();
      dmz $$9 = $$1.a_($$4);
      dmz $$10 = $$1.a_($$5);
      dmz $$11 = $$1.a_($$6);
      dmz $$12 = $$1.a_($$7);
      dmz $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ih.d), ih.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ih.e), ih.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ih.c), ih.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ih.f), ih.f);
      dmz $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eio.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      if ($$1 == ih.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ih.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dmz $$0, doc<dol> $$1) {
      return $$0.c($$1) != dol.a;
   }

   private static boolean a(eqk $$0, eqk $$1) {
      return !eqh.c($$1, $$0, epv.e);
   }

   private dmz a(cxc $$0, dmz $$1, ib $$2, dmz $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dmz a(cxc $$0, ib $$1, dmz $$2, ib $$3, dmz $$4, ih $$5) {
      ih $$6 = $$5.g();
      boolean $$7 = $$5 == ih.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ih.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ih.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ih.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ib $$11 = $$1.c();
      dmz $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dmz a(cxc $$0, dmz $$1, ib $$2, dmz $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eqk $$8 = $$3.k($$0, $$2).a(ih.a);
      dmz $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dmz $$0, dmz $$1, eqk $$2) {
      boolean $$3 = $$1.b() instanceof dix && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dol $$4 = $$0.c(d);
         dol $$5 = $$0.c(e);
         dol $$6 = $$0.c(c);
         dol $$7 = $$0.c(f);
         boolean $$8 = $$5 == dol.a;
         boolean $$9 = $$7 == dol.a;
         boolean $$10 = $$6 == dol.a;
         boolean $$11 = $$4 == dol.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dol.c && $$5 == dol.c || $$6 == dol.c && $$7 == dol.c;
            return $$13 ? false : $$1.a(aun.aO) || a($$2, F);
         }
      }
   }

   private dmz a(dmz $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eqk $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dol a(boolean $$0, eqk $$1, eqk $$2) {
      if ($$0) {
         return a($$1, $$2) ? dol.c : dol.b;
      } else {
         return dol.a;
      }
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(g) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
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
   protected dmz a(dmz $$0, dew $$1) {
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

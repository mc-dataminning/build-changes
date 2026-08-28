import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dov extends dfw implements dmy {
   public static final MapCodec<dov> a = b(dov::new);
   public static final dtr b = dtq.J;
   public static final dty<dum> c = dtq.W;
   public static final dty<dum> d = dtq.X;
   public static final dty<dum> e = dtq.Y;
   public static final dty<dum> f = dtq.Z;
   public static final dtr g = dtq.C;
   private final Map<dta, exp> h;
   private final Map<dta, exp> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final exp F = dfw.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final exp G = dfw.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final exp H = dfw.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final exp I = dfw.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final exp J = dfw.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   public dov(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dum.a).a(c, dum.a).a(e, dum.a).a(f, dum.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static exp a(exp $$0, dum $$1, exp $$2, exp $$3) {
      if ($$1 == dum.c) {
         return exm.a($$0, $$3);
      } else {
         return $$1 == dum.b ? exm.a($$0, $$2) : $$0;
      }
   }

   private Map<dta, exp> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      exp $$10 = dfw.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      exp $$11 = dfw.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      exp $$12 = dfw.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      exp $$13 = dfw.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      exp $$14 = dfw.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      exp $$15 = dfw.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      exp $$16 = dfw.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      exp $$17 = dfw.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      exp $$18 = dfw.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dta, exp> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dum $$21 : c.a()) {
            for (dum $$22 : d.a()) {
               for (dum $$23 : f.a()) {
                  for (dum $$24 : e.a()) {
                     exp $$25 = exm.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = exm.a($$25, $$10);
                     }

                     dta $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.h.get($$0);
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   private boolean a(dta $$0, boolean $$1, ji $$2) {
      dfw $$3 = $$0.b();
      boolean $$4 = $$3 instanceof div && div.a($$0, $$2);
      return $$0.a(awd.L) || !j($$0) && $$1 || $$3 instanceof djx || $$4;
   }

   @Override
   public dta a(cyb $$0) {
      dcx $$1 = $$0.q();
      jd $$2 = $$0.a();
      eoy $$3 = $$0.q().b_($$0.a());
      jd $$4 = $$2.e();
      jd $$5 = $$2.h();
      jd $$6 = $$2.f();
      jd $$7 = $$2.g();
      jd $$8 = $$2.c();
      dta $$9 = $$1.a_($$4);
      dta $$10 = $$1.a_($$5);
      dta $$11 = $$1.a_($$6);
      dta $$12 = $$1.a_($$7);
      dta $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ji.d), ji.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ji.e), ji.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ji.c), ji.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ji.f), ji.f);
      dta $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eoz.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      if ($$1 == ji.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ji.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dta $$0, dud<dum> $$1) {
      return $$0.c($$1) != dum.a;
   }

   private static boolean a(exp $$0, exp $$1) {
      return !exm.c($$1, $$0, exa.e);
   }

   private dta a(dcx $$0, dta $$1, jd $$2, dta $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dta a(dcx $$0, jd $$1, dta $$2, jd $$3, dta $$4, ji $$5) {
      ji $$6 = $$5.g();
      boolean $$7 = $$5 == ji.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ji.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ji.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ji.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      jd $$11 = $$1.c();
      dta $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dta a(dcx $$0, dta $$1, jd $$2, dta $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      exp $$8 = $$3.k($$0, $$2).a(ji.a);
      dta $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dta $$0, dta $$1, exp $$2) {
      boolean $$3 = $$1.b() instanceof dov && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dum $$4 = $$0.c(d);
         dum $$5 = $$0.c(e);
         dum $$6 = $$0.c(c);
         dum $$7 = $$0.c(f);
         boolean $$8 = $$5 == dum.a;
         boolean $$9 = $$7 == dum.a;
         boolean $$10 = $$6 == dum.a;
         boolean $$11 = $$4 == dum.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dum.c && $$5 == dum.c || $$6 == dum.c && $$7 == dum.c;
            return $$13 ? false : $$1.a(awd.aO) || a($$2, F);
         }
      }
   }

   private dta a(dta $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, exp $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dum a(boolean $$0, exp $$1, exp $$2) {
      if ($$0) {
         return a($$1, $$2) ? dum.c : dum.b;
      } else {
         return dum.a;
      }
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(g) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
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
   protected dta a(dta $$0, dkt $$1) {
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

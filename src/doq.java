import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class doq extends dfc implements dmr {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dtt b = dts.J;
   public static final dua<duo> c = dts.W;
   public static final dua<duo> d = dts.X;
   public static final dua<duo> e = dts.Y;
   public static final dua<duo> f = dts.Z;
   public static final dtt g = dts.C;
   private final Map<dtc, exn> h;
   private final Map<dtc, exn> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final exn F = dfc.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final exn G = dfc.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final exn H = dfc.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final exn I = dfc.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final exn J = dfc.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   public doq(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, duo.a).a(c, duo.a).a(e, duo.a).a(f, duo.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static exn a(exn $$0, duo $$1, exn $$2, exn $$3) {
      if ($$1 == duo.c) {
         return exk.a($$0, $$3);
      } else {
         return $$1 == duo.b ? exk.a($$0, $$2) : $$0;
      }
   }

   private Map<dtc, exn> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      exn $$10 = dfc.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      exn $$11 = dfc.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      exn $$12 = dfc.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      exn $$13 = dfc.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      exn $$14 = dfc.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      exn $$15 = dfc.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      exn $$16 = dfc.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      exn $$17 = dfc.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      exn $$18 = dfc.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dtc, exn> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (duo $$21 : c.a()) {
            for (duo $$22 : d.a()) {
               for (duo $$23 : f.a()) {
                  for (duo $$24 : e.a()) {
                     exn $$25 = exk.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = exk.a($$25, $$10);
                     }

                     dtc $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.h.get($$0);
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   private boolean a(dtc $$0, boolean $$1, iw $$2) {
      dfc $$3 = $$0.b();
      boolean $$4 = $$3 instanceof die && die.a($$0, $$2);
      return $$0.a(awe.L) || !j($$0) && $$1 || $$3 instanceof djh || $$4;
   }

   @Override
   public dtc a(cyd $$0) {
      dcd $$1 = $$0.q();
      ir $$2 = $$0.a();
      epe $$3 = $$0.q().b_($$0.a());
      ir $$4 = $$2.e();
      ir $$5 = $$2.h();
      ir $$6 = $$2.f();
      ir $$7 = $$2.g();
      ir $$8 = $$2.c();
      dtc $$9 = $$1.a_($$4);
      dtc $$10 = $$1.a_($$5);
      dtc $$11 = $$1.a_($$6);
      dtc $$12 = $$1.a_($$7);
      dtc $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, iw.d), iw.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, iw.e), iw.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, iw.c), iw.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, iw.f), iw.f);
      dtc $$18 = this.n().a(g, Boolean.valueOf($$3.a() == epf.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      if ($$1 == iw.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == iw.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dtc $$0, duf<duo> $$1) {
      return $$0.c($$1) != duo.a;
   }

   private static boolean a(exn $$0, exn $$1) {
      return !exk.c($$1, $$0, ewy.e);
   }

   private dtc a(dcd $$0, dtc $$1, ir $$2, dtc $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dtc a(dcd $$0, ir $$1, dtc $$2, ir $$3, dtc $$4, iw $$5) {
      iw $$6 = $$5.g();
      boolean $$7 = $$5 == iw.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == iw.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == iw.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == iw.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ir $$11 = $$1.c();
      dtc $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dtc a(dcd $$0, dtc $$1, ir $$2, dtc $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      exn $$8 = $$3.k($$0, $$2).a(iw.a);
      dtc $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dtc $$0, dtc $$1, exn $$2) {
      boolean $$3 = $$1.b() instanceof doq && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         duo $$4 = $$0.c(d);
         duo $$5 = $$0.c(e);
         duo $$6 = $$0.c(c);
         duo $$7 = $$0.c(f);
         boolean $$8 = $$5 == duo.a;
         boolean $$9 = $$7 == duo.a;
         boolean $$10 = $$6 == duo.a;
         boolean $$11 = $$4 == duo.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == duo.c && $$5 == duo.c || $$6 == duo.c && $$7 == duo.c;
            return $$13 ? false : $$1.a(awe.aQ) || a($$2, F);
         }
      }
   }

   private dtc a(dtc $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, exn $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private duo a(boolean $$0, exn $$1, exn $$2) {
      if ($$0) {
         return a($$1, $$2) ? duo.c : duo.b;
      } else {
         return duo.a;
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(g) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
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
   protected dtc a(dtc $$0, dke $$1) {
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

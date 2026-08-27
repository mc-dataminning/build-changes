import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dlt extends dcv implements djw {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final dqp b = dqo.J;
   public static final dqw<drk> c = dqo.W;
   public static final dqw<drk> d = dqo.X;
   public static final dqw<drk> e = dqo.Y;
   public static final dqw<drk> f = dqo.Z;
   public static final dqp g = dqo.C;
   private final Map<dpy, ety> h;
   private final Map<dpy, ety> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ety F = dcv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ety G = dcv.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ety H = dcv.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ety I = dcv.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ety J = dcv.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, drk.a).a(c, drk.a).a(e, drk.a).a(f, drk.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ety a(ety $$0, drk $$1, ety $$2, ety $$3) {
      if ($$1 == drk.c) {
         return etv.a($$0, $$3);
      } else {
         return $$1 == drk.b ? etv.a($$0, $$2) : $$0;
      }
   }

   private Map<dpy, ety> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ety $$10 = dcv.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ety $$11 = dcv.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ety $$12 = dcv.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ety $$13 = dcv.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ety $$14 = dcv.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ety $$15 = dcv.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ety $$16 = dcv.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ety $$17 = dcv.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ety $$18 = dcv.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dpy, ety> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (drk $$21 : c.a()) {
            for (drk $$22 : d.a()) {
               for (drk $$23 : f.a()) {
                  for (drk $$24 : e.a()) {
                     ety $$25 = etv.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = etv.a($$25, $$10);
                     }

                     dpy $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   private boolean a(dpy $$0, boolean $$1, ir $$2) {
      dcv $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dfu && dfu.a($$0, $$2);
      return $$0.a(avo.L) || !j($$0) && $$1 || $$3 instanceof dgw || $$4;
   }

   @Override
   public dpy a(cvl $$0) {
      czx $$1 = $$0.q();
      im $$2 = $$0.a();
      elr $$3 = $$0.q().b_($$0.a());
      im $$4 = $$2.e();
      im $$5 = $$2.h();
      im $$6 = $$2.f();
      im $$7 = $$2.g();
      im $$8 = $$2.c();
      dpy $$9 = $$1.a_($$4);
      dpy $$10 = $$1.a_($$5);
      dpy $$11 = $$1.a_($$6);
      dpy $$12 = $$1.a_($$7);
      dpy $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ir.d), ir.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ir.e), ir.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ir.c), ir.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ir.f), ir.f);
      dpy $$18 = this.n().a(g, Boolean.valueOf($$3.a() == els.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      if ($$1 == ir.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ir.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dpy $$0, drb<drk> $$1) {
      return $$0.c($$1) != drk.a;
   }

   private static boolean a(ety $$0, ety $$1) {
      return !etv.c($$1, $$0, etj.e);
   }

   private dpy a(czx $$0, dpy $$1, im $$2, dpy $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dpy a(czx $$0, im $$1, dpy $$2, im $$3, dpy $$4, ir $$5) {
      ir $$6 = $$5.g();
      boolean $$7 = $$5 == ir.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ir.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ir.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ir.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      im $$11 = $$1.c();
      dpy $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dpy a(czx $$0, dpy $$1, im $$2, dpy $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ety $$8 = $$3.k($$0, $$2).a(ir.a);
      dpy $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dpy $$0, dpy $$1, ety $$2) {
      boolean $$3 = $$1.b() instanceof dlt && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         drk $$4 = $$0.c(d);
         drk $$5 = $$0.c(e);
         drk $$6 = $$0.c(c);
         drk $$7 = $$0.c(f);
         boolean $$8 = $$5 == drk.a;
         boolean $$9 = $$7 == drk.a;
         boolean $$10 = $$6 == drk.a;
         boolean $$11 = $$4 == drk.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == drk.c && $$5 == drk.c || $$6 == drk.c && $$7 == drk.c;
            return $$13 ? false : $$1.a(avo.aO) || a($$2, F);
         }
      }
   }

   private dpy a(dpy $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ety $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private drk a(boolean $$0, ety $$1, ety $$2) {
      if ($$0) {
         return a($$1, $$2) ? drk.c : drk.b;
      } else {
         return drk.a;
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(g) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
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
   protected dpy a(dpy $$0, dhs $$1) {
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

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dle extends dch implements djh {
   public static final MapCodec<dle> a = b(dle::new);
   public static final dpz b = dpy.J;
   public static final dqg<dqu> c = dpy.W;
   public static final dqg<dqu> d = dpy.X;
   public static final dqg<dqu> e = dpy.Y;
   public static final dqg<dqu> f = dpy.Z;
   public static final dpz g = dpy.C;
   private final Map<dpi, etc> h;
   private final Map<dpi, etc> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final etc F = dch.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final etc G = dch.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final etc H = dch.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final etc I = dch.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final etc J = dch.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dqu.a).a(c, dqu.a).a(e, dqu.a).a(f, dqu.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static etc a(etc $$0, dqu $$1, etc $$2, etc $$3) {
      if ($$1 == dqu.c) {
         return esz.a($$0, $$3);
      } else {
         return $$1 == dqu.b ? esz.a($$0, $$2) : $$0;
      }
   }

   private Map<dpi, etc> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      etc $$10 = dch.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      etc $$11 = dch.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      etc $$12 = dch.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      etc $$13 = dch.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      etc $$14 = dch.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      etc $$15 = dch.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      etc $$16 = dch.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      etc $$17 = dch.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      etc $$18 = dch.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dpi, etc> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dqu $$21 : c.a()) {
            for (dqu $$22 : d.a()) {
               for (dqu $$23 : f.a()) {
                  for (dqu $$24 : e.a()) {
                     etc $$25 = esz.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = esz.a($$25, $$10);
                     }

                     dpi $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.h.get($$0);
   }

   @Override
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   private boolean a(dpi $$0, boolean $$1, ij $$2) {
      dch $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dfg && dfg.a($$0, $$2);
      return $$0.a(ave.L) || !j($$0) && $$1 || $$3 instanceof dgh || $$4;
   }

   @Override
   public dpi a(cux $$0) {
      czj $$1 = $$0.q();
      id $$2 = $$0.a();
      elb $$3 = $$0.q().b_($$0.a());
      id $$4 = $$2.e();
      id $$5 = $$2.h();
      id $$6 = $$2.f();
      id $$7 = $$2.g();
      id $$8 = $$2.c();
      dpi $$9 = $$1.a_($$4);
      dpi $$10 = $$1.a_($$5);
      dpi $$11 = $$1.a_($$6);
      dpi $$12 = $$1.a_($$7);
      dpi $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ij.d), ij.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ij.e), ij.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ij.c), ij.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ij.f), ij.f);
      dpi $$18 = this.n().a(g, Boolean.valueOf($$3.a() == elc.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      if ($$1 == ij.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ij.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dpi $$0, dql<dqu> $$1) {
      return $$0.c($$1) != dqu.a;
   }

   private static boolean a(etc $$0, etc $$1) {
      return !esz.c($$1, $$0, esn.e);
   }

   private dpi a(czj $$0, dpi $$1, id $$2, dpi $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dpi a(czj $$0, id $$1, dpi $$2, id $$3, dpi $$4, ij $$5) {
      ij $$6 = $$5.g();
      boolean $$7 = $$5 == ij.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ij.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ij.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ij.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      id $$11 = $$1.c();
      dpi $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dpi a(czj $$0, dpi $$1, id $$2, dpi $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      etc $$8 = $$3.k($$0, $$2).a(ij.a);
      dpi $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dpi $$0, dpi $$1, etc $$2) {
      boolean $$3 = $$1.b() instanceof dle && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dqu $$4 = $$0.c(d);
         dqu $$5 = $$0.c(e);
         dqu $$6 = $$0.c(c);
         dqu $$7 = $$0.c(f);
         boolean $$8 = $$5 == dqu.a;
         boolean $$9 = $$7 == dqu.a;
         boolean $$10 = $$6 == dqu.a;
         boolean $$11 = $$4 == dqu.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dqu.c && $$5 == dqu.c || $$6 == dqu.c && $$7 == dqu.c;
            return $$13 ? false : $$1.a(ave.aO) || a($$2, F);
         }
      }
   }

   private dpi a(dpi $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, etc $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dqu a(boolean $$0, etc $$1, etc $$2) {
      if ($$0) {
         return a($$1, $$2) ? dqu.c : dqu.b;
      } else {
         return dqu.a;
      }
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(g) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
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
   protected dpi a(dpi $$0, dhd $$1) {
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

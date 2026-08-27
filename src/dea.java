import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dea extends cvf implements dcf {
   public static final MapCodec<dea> a = b(dea::new);
   public static final die b = did.J;
   public static final dil<diz> c = did.W;
   public static final dil<diz> d = did.X;
   public static final dil<diz> e = did.Y;
   public static final dil<diz> f = did.Z;
   public static final die g = did.C;
   private final Map<dhn, eks> h;
   private final Map<dhn, eks> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eks F = cvf.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eks G = cvf.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eks H = cvf.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eks I = cvf.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eks J = cvf.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public dea(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, diz.a).a(c, diz.a).a(e, diz.a).a(f, diz.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eks a(eks $$0, diz $$1, eks $$2, eks $$3) {
      if ($$1 == diz.c) {
         return ekp.a($$0, $$3);
      } else {
         return $$1 == diz.b ? ekp.a($$0, $$2) : $$0;
      }
   }

   private Map<dhn, eks> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eks $$10 = cvf.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eks $$11 = cvf.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eks $$12 = cvf.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eks $$13 = cvf.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eks $$14 = cvf.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eks $$15 = cvf.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eks $$16 = cvf.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eks $$17 = cvf.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eks $$18 = cvf.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dhn, eks> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (diz $$21 : c.a()) {
            for (diz $$22 : d.a()) {
               for (diz $$23 : f.a()) {
                  for (diz $$24 : e.a()) {
                     eks $$25 = ekp.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ekp.a($$25, $$10);
                     }

                     dhn $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.h.get($$0);
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   private boolean a(dhn $$0, boolean $$1, ib $$2) {
      cvf $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cye && cye.a($$0, $$2);
      return $$0.a(ark.L) || !j($$0) && $$1 || $$3 instanceof czf || $$4;
   }

   @Override
   public dhn a(cnw $$0) {
      csi $$1 = $$0.q();
      hx $$2 = $$0.a();
      ecx $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      hx $$8 = $$2.c();
      dhn $$9 = $$1.a_($$4);
      dhn $$10 = $$1.a_($$5);
      dhn $$11 = $$1.a_($$6);
      dhn $$12 = $$1.a_($$7);
      dhn $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ib.d), ib.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ib.e), ib.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ib.c), ib.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ib.f), ib.f);
      dhn $$18 = this.o().a(g, Boolean.valueOf($$3.a() == ecy.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      if ($$1 == ib.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ib.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dhn $$0, diq<diz> $$1) {
      return $$0.c($$1) != diz.a;
   }

   private static boolean a(eks $$0, eks $$1) {
      return !ekp.c($$1, $$0, ekd.e);
   }

   private dhn a(csi $$0, dhn $$1, hx $$2, dhn $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dhn a(csi $$0, hx $$1, dhn $$2, hx $$3, dhn $$4, ib $$5) {
      ib $$6 = $$5.g();
      boolean $$7 = $$5 == ib.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ib.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ib.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ib.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hx $$11 = $$1.c();
      dhn $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dhn a(csi $$0, dhn $$1, hx $$2, dhn $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eks $$8 = $$3.k($$0, $$2).a(ib.a);
      dhn $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dhn $$0, dhn $$1, eks $$2) {
      boolean $$3 = $$1.b() instanceof dea && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         diz $$4 = $$0.c(d);
         diz $$5 = $$0.c(e);
         diz $$6 = $$0.c(c);
         diz $$7 = $$0.c(f);
         boolean $$8 = $$5 == diz.a;
         boolean $$9 = $$7 == diz.a;
         boolean $$10 = $$6 == diz.a;
         boolean $$11 = $$4 == diz.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == diz.c && $$5 == diz.c || $$6 == diz.c && $$7 == diz.c;
            return $$13 ? false : $$1.a(ark.aN) || a($$2, F);
         }
      }
   }

   private dhn a(dhn $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eks $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private diz a(boolean $$0, eks $$1, eks $$2) {
      if ($$0) {
         return a($$1, $$2) ? diz.c : diz.b;
      } else {
         return diz.a;
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(g) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
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
   public dhn a(dhn $$0, dab $$1) {
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

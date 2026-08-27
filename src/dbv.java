import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dbv extends ctc implements dab {
   public static final MapCodec<dbv> a = b(dbv::new);
   public static final dfu b = dft.J;
   public static final dgb<dgp> c = dft.W;
   public static final dgb<dgp> d = dft.X;
   public static final dgb<dgp> e = dft.Y;
   public static final dgb<dgp> f = dft.Z;
   public static final dfu g = dft.C;
   private final Map<dfd, eia> h;
   private final Map<dfd, eia> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eia F = ctc.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eia G = ctc.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eia H = ctc.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eia I = ctc.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eia J = ctc.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   public dbv(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dgp.a).a(c, dgp.a).a(e, dgp.a).a(f, dgp.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eia a(eia $$0, dgp $$1, eia $$2, eia $$3) {
      if ($$1 == dgp.c) {
         return ehx.a($$0, $$3);
      } else {
         return $$1 == dgp.b ? ehx.a($$0, $$2) : $$0;
      }
   }

   private Map<dfd, eia> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eia $$10 = ctc.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eia $$11 = ctc.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eia $$12 = ctc.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eia $$13 = ctc.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eia $$14 = ctc.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eia $$15 = ctc.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eia $$16 = ctc.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eia $$17 = ctc.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eia $$18 = ctc.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dfd, eia> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dgp $$21 : c.a()) {
            for (dgp $$22 : d.a()) {
               for (dgp $$23 : f.a()) {
                  for (dgp $$24 : e.a()) {
                     eia $$25 = ehx.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ehx.a($$25, $$10);
                     }

                     dfd $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.h.get($$0);
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   private boolean a(dfd $$0, boolean $$1, ha $$2) {
      ctc $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvz && cvz.a($$0, $$2);
      return $$0.a(apv.L) || !j($$0) && $$1 || $$3 instanceof cxb || $$4;
   }

   @Override
   public dfd a(clt $$0) {
      cqe $$1 = $$0.q();
      gw $$2 = $$0.a();
      eag $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      gw $$8 = $$2.c();
      dfd $$9 = $$1.a_($$4);
      dfd $$10 = $$1.a_($$5);
      dfd $$11 = $$1.a_($$6);
      dfd $$12 = $$1.a_($$7);
      dfd $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ha.d), ha.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ha.e), ha.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ha.c), ha.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ha.f), ha.f);
      dfd $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eah.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      if ($$1 == ha.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ha.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dfd $$0, dgg<dgp> $$1) {
      return $$0.c($$1) != dgp.a;
   }

   private static boolean a(eia $$0, eia $$1) {
      return !ehx.c($$1, $$0, ehl.e);
   }

   private dfd a(cqe $$0, dfd $$1, gw $$2, dfd $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dfd a(cqe $$0, gw $$1, dfd $$2, gw $$3, dfd $$4, ha $$5) {
      ha $$6 = $$5.g();
      boolean $$7 = $$5 == ha.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ha.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ha.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ha.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      gw $$11 = $$1.c();
      dfd $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dfd a(cqe $$0, dfd $$1, gw $$2, dfd $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eia $$8 = $$3.k($$0, $$2).a(ha.a);
      dfd $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dfd $$0, dfd $$1, eia $$2) {
      boolean $$3 = $$1.b() instanceof dbv && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dgp $$4 = $$0.c(d);
         dgp $$5 = $$0.c(e);
         dgp $$6 = $$0.c(c);
         dgp $$7 = $$0.c(f);
         boolean $$8 = $$5 == dgp.a;
         boolean $$9 = $$7 == dgp.a;
         boolean $$10 = $$6 == dgp.a;
         boolean $$11 = $$4 == dgp.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgp.c && $$5 == dgp.c || $$6 == dgp.c && $$7 == dgp.c;
            return $$13 ? false : $$1.a(apv.aN) || a($$2, F);
         }
      }
   }

   private dfd a(dfd $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eia $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dgp a(boolean $$0, eia $$1, eia $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgp.c : dgp.b;
      } else {
         return dgp.a;
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(g) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
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
   public dfd a(dfd $$0, cxx $$1) {
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

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dmy extends dea implements dlb {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final dru b = drt.J;
   public static final dsb<dsp> c = drt.W;
   public static final dsb<dsp> d = drt.X;
   public static final dsb<dsp> e = drt.Y;
   public static final dsb<dsp> f = drt.Z;
   public static final dru g = drt.C;
   private final Map<drd, evf> h;
   private final Map<drd, evf> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final evf F = dea.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final evf G = dea.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final evf H = dea.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final evf I = dea.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final evf J = dea.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dsp.a).a(c, dsp.a).a(e, dsp.a).a(f, dsp.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static evf a(evf $$0, dsp $$1, evf $$2, evf $$3) {
      if ($$1 == dsp.c) {
         return evc.a($$0, $$3);
      } else {
         return $$1 == dsp.b ? evc.a($$0, $$2) : $$0;
      }
   }

   private Map<drd, evf> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      evf $$10 = dea.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      evf $$11 = dea.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      evf $$12 = dea.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      evf $$13 = dea.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      evf $$14 = dea.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      evf $$15 = dea.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      evf $$16 = dea.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      evf $$17 = dea.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      evf $$18 = dea.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<drd, evf> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dsp $$21 : c.a()) {
            for (dsp $$22 : d.a()) {
               for (dsp $$23 : f.a()) {
                  for (dsp $$24 : e.a()) {
                     evf $$25 = evc.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = evc.a($$25, $$10);
                     }

                     drd $$26 = this.n().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.h.get($$0);
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   private boolean a(drd $$0, boolean $$1, it $$2) {
      dea $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dgz && dgz.a($$0, $$2);
      return $$0.a(avx.L) || !j($$0) && $$1 || $$3 instanceof dib || $$4;
   }

   @Override
   public drd a(cxb $$0) {
      dbc $$1 = $$0.q();
      io $$2 = $$0.a();
      emw $$3 = $$0.q().b_($$0.a());
      io $$4 = $$2.e();
      io $$5 = $$2.h();
      io $$6 = $$2.f();
      io $$7 = $$2.g();
      io $$8 = $$2.c();
      drd $$9 = $$1.a_($$4);
      drd $$10 = $$1.a_($$5);
      drd $$11 = $$1.a_($$6);
      drd $$12 = $$1.a_($$7);
      drd $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, it.d), it.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, it.e), it.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, it.c), it.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, it.f), it.f);
      drd $$18 = this.n().a(g, Boolean.valueOf($$3.a() == emx.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      if ($$1 == it.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == it.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(drd $$0, dsg<dsp> $$1) {
      return $$0.c($$1) != dsp.a;
   }

   private static boolean a(evf $$0, evf $$1) {
      return !evc.c($$1, $$0, euq.e);
   }

   private drd a(dbc $$0, drd $$1, io $$2, drd $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private drd a(dbc $$0, io $$1, drd $$2, io $$3, drd $$4, it $$5) {
      it $$6 = $$5.g();
      boolean $$7 = $$5 == it.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == it.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == it.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == it.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      io $$11 = $$1.c();
      drd $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private drd a(dbc $$0, drd $$1, io $$2, drd $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      evf $$8 = $$3.k($$0, $$2).a(it.a);
      drd $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(drd $$0, drd $$1, evf $$2) {
      boolean $$3 = $$1.b() instanceof dmy && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dsp $$4 = $$0.c(d);
         dsp $$5 = $$0.c(e);
         dsp $$6 = $$0.c(c);
         dsp $$7 = $$0.c(f);
         boolean $$8 = $$5 == dsp.a;
         boolean $$9 = $$7 == dsp.a;
         boolean $$10 = $$6 == dsp.a;
         boolean $$11 = $$4 == dsp.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dsp.c && $$5 == dsp.c || $$6 == dsp.c && $$7 == dsp.c;
            return $$13 ? false : $$1.a(avx.aO) || a($$2, F);
         }
      }
   }

   private drd a(drd $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, evf $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dsp a(boolean $$0, evf $$1, evf $$2) {
      if ($$0) {
         return a($$1, $$2) ? dsp.c : dsp.b;
      } else {
         return dsp.a;
      }
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(g) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
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
   protected drd a(drd $$0, dix $$1) {
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

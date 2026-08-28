import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dnx extends dez implements dma {
   public static final MapCodec<dnx> a = b(dnx::new);
   public static final dst b = dss.J;
   public static final dta<dto> c = dss.W;
   public static final dta<dto> d = dss.X;
   public static final dta<dto> e = dss.Y;
   public static final dta<dto> f = dss.Z;
   public static final dst g = dss.C;
   private final Map<dsc, ewk> h;
   private final Map<dsc, ewk> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewk F = dez.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewk G = dez.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewk H = dez.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewk I = dez.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewk J = dez.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   public dnx(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dto.a).a(c, dto.a).a(e, dto.a).a(f, dto.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewk a(ewk $$0, dto $$1, ewk $$2, ewk $$3) {
      if ($$1 == dto.c) {
         return ewh.a($$0, $$3);
      } else {
         return $$1 == dto.b ? ewh.a($$0, $$2) : $$0;
      }
   }

   private Map<dsc, ewk> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewk $$10 = dez.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewk $$11 = dez.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewk $$12 = dez.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewk $$13 = dez.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewk $$14 = dez.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewk $$15 = dez.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewk $$16 = dez.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewk $$17 = dez.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewk $$18 = dez.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsc, ewk> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dto $$21 : c.a()) {
            for (dto $$22 : d.a()) {
               for (dto $$23 : f.a()) {
                  for (dto $$24 : e.a()) {
                     ewk $$25 = ewh.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewh.a($$25, $$10);
                     }

                     dsc $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }

   private boolean a(dsc $$0, boolean $$1, je $$2) {
      dez $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dhy && dhy.a($$0, $$2);
      return $$0.a(awp.L) || !j($$0) && $$1 || $$3 instanceof dja || $$4;
   }

   @Override
   public dsc a(cya $$0) {
      dcb $$1 = $$0.q();
      iz $$2 = $$0.a();
      env $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.h();
      iz $$6 = $$2.f();
      iz $$7 = $$2.g();
      iz $$8 = $$2.c();
      dsc $$9 = $$1.a_($$4);
      dsc $$10 = $$1.a_($$5);
      dsc $$11 = $$1.a_($$6);
      dsc $$12 = $$1.a_($$7);
      dsc $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, je.d), je.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, je.e), je.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, je.c), je.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, je.f), je.f);
      dsc $$18 = this.o().a(g, Boolean.valueOf($$3.a() == enw.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      if ($$1 == je.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == je.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsc $$0, dtf<dto> $$1) {
      return $$0.c($$1) != dto.a;
   }

   private static boolean a(ewk $$0, ewk $$1) {
      return !ewh.c($$1, $$0, evv.e);
   }

   private dsc a(dcb $$0, dsc $$1, iz $$2, dsc $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsc a(dcb $$0, iz $$1, dsc $$2, iz $$3, dsc $$4, je $$5) {
      je $$6 = $$5.g();
      boolean $$7 = $$5 == je.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == je.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == je.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == je.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      iz $$11 = $$1.c();
      dsc $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsc a(dcb $$0, dsc $$1, iz $$2, dsc $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewk $$8 = $$3.k($$0, $$2).a(je.a);
      dsc $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsc $$0, dsc $$1, ewk $$2) {
      boolean $$3 = $$1.b() instanceof dnx && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dto $$4 = $$0.c(d);
         dto $$5 = $$0.c(e);
         dto $$6 = $$0.c(c);
         dto $$7 = $$0.c(f);
         boolean $$8 = $$5 == dto.a;
         boolean $$9 = $$7 == dto.a;
         boolean $$10 = $$6 == dto.a;
         boolean $$11 = $$4 == dto.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dto.c && $$5 == dto.c || $$6 == dto.c && $$7 == dto.c;
            return $$13 ? false : $$1.a(awp.aO) || a($$2, F);
         }
      }
   }

   private dsc a(dsc $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewk $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dto a(boolean $$0, ewk $$1, ewk $$2) {
      if ($$0) {
         return a($$1, $$2) ? dto.c : dto.b;
      } else {
         return dto.a;
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return $$0.c(g) ? enw.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
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
   protected dsc a(dsc $$0, djw $$1) {
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

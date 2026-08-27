import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dfu extends cwy implements ddy {
   public static final MapCodec<dfu> a = b(dfu::new);
   public static final dkg b = dkf.J;
   public static final dkn<dlb> c = dkf.W;
   public static final dkn<dlb> d = dkf.X;
   public static final dkn<dlb> e = dkf.Y;
   public static final dkn<dlb> f = dkf.Z;
   public static final dkg g = dkf.C;
   private final Map<djp, emv> h;
   private final Map<djp, emv> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final emv F = cwy.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final emv G = cwy.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final emv H = cwy.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final emv I = cwy.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final emv J = cwy.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dlb.a).a(c, dlb.a).a(e, dlb.a).a(f, dlb.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static emv a(emv $$0, dlb $$1, emv $$2, emv $$3) {
      if ($$1 == dlb.c) {
         return ems.a($$0, $$3);
      } else {
         return $$1 == dlb.b ? ems.a($$0, $$2) : $$0;
      }
   }

   private Map<djp, emv> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      emv $$10 = cwy.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      emv $$11 = cwy.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      emv $$12 = cwy.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      emv $$13 = cwy.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      emv $$14 = cwy.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      emv $$15 = cwy.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      emv $$16 = cwy.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      emv $$17 = cwy.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      emv $$18 = cwy.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<djp, emv> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dlb $$21 : c.a()) {
            for (dlb $$22 : d.a()) {
               for (dlb $$23 : f.a()) {
                  for (dlb $$24 : e.a()) {
                     emv $$25 = ems.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ems.a($$25, $$10);
                     }

                     djp $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.h.get($$0);
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   private boolean a(djp $$0, boolean $$1, ic $$2) {
      cwy $$3 = $$0.b();
      boolean $$4 = $$3 instanceof czx && czx.a($$0, $$2);
      return $$0.a(asi.L) || !j($$0) && $$1 || $$3 instanceof day || $$4;
   }

   @Override
   public djp a(cpp $$0) {
      cua $$1 = $$0.q();
      hx $$2 = $$0.a();
      eez $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      hx $$8 = $$2.c();
      djp $$9 = $$1.a_($$4);
      djp $$10 = $$1.a_($$5);
      djp $$11 = $$1.a_($$6);
      djp $$12 = $$1.a_($$7);
      djp $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ic.d), ic.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ic.e), ic.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ic.c), ic.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ic.f), ic.f);
      djp $$18 = this.o().a(g, Boolean.valueOf($$3.a() == efa.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      if ($$1 == ic.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ic.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(djp $$0, dks<dlb> $$1) {
      return $$0.c($$1) != dlb.a;
   }

   private static boolean a(emv $$0, emv $$1) {
      return !ems.c($$1, $$0, emg.e);
   }

   private djp a(cua $$0, djp $$1, hx $$2, djp $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private djp a(cua $$0, hx $$1, djp $$2, hx $$3, djp $$4, ic $$5) {
      ic $$6 = $$5.g();
      boolean $$7 = $$5 == ic.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ic.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ic.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ic.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hx $$11 = $$1.c();
      djp $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private djp a(cua $$0, djp $$1, hx $$2, djp $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      emv $$8 = $$3.k($$0, $$2).a(ic.a);
      djp $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(djp $$0, djp $$1, emv $$2) {
      boolean $$3 = $$1.b() instanceof dfu && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dlb $$4 = $$0.c(d);
         dlb $$5 = $$0.c(e);
         dlb $$6 = $$0.c(c);
         dlb $$7 = $$0.c(f);
         boolean $$8 = $$5 == dlb.a;
         boolean $$9 = $$7 == dlb.a;
         boolean $$10 = $$6 == dlb.a;
         boolean $$11 = $$4 == dlb.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dlb.c && $$5 == dlb.c || $$6 == dlb.c && $$7 == dlb.c;
            return $$13 ? false : $$1.a(asi.aN) || a($$2, F);
         }
      }
   }

   private djp a(djp $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, emv $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dlb a(boolean $$0, emv $$1, emv $$2) {
      if ($$0) {
         return a($$1, $$2) ? dlb.c : dlb.b;
      } else {
         return dlb.a;
      }
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(g) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
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
   public djp a(djp $$0, dbu $$1) {
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

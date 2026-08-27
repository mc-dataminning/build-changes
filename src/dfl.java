import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dfl extends cwp implements ddp {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final djx b = djw.J;
   public static final dke<dks> c = djw.W;
   public static final dke<dks> d = djw.X;
   public static final dke<dks> e = djw.Y;
   public static final dke<dks> f = djw.Z;
   public static final djx g = djw.C;
   private final Map<djg, eml> h;
   private final Map<djg, eml> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eml F = cwp.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eml G = cwp.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eml H = cwp.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eml I = cwp.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eml J = cwp.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dks.a).a(c, dks.a).a(e, dks.a).a(f, dks.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eml a(eml $$0, dks $$1, eml $$2, eml $$3) {
      if ($$1 == dks.c) {
         return emi.a($$0, $$3);
      } else {
         return $$1 == dks.b ? emi.a($$0, $$2) : $$0;
      }
   }

   private Map<djg, eml> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eml $$10 = cwp.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eml $$11 = cwp.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eml $$12 = cwp.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eml $$13 = cwp.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eml $$14 = cwp.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eml $$15 = cwp.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eml $$16 = cwp.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eml $$17 = cwp.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eml $$18 = cwp.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<djg, eml> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dks $$21 : c.a()) {
            for (dks $$22 : d.a()) {
               for (dks $$23 : f.a()) {
                  for (dks $$24 : e.a()) {
                     eml $$25 = emi.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = emi.a($$25, $$10);
                     }

                     djg $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.h.get($$0);
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   private boolean a(djg $$0, boolean $$1, ic $$2) {
      cwp $$3 = $$0.b();
      boolean $$4 = $$3 instanceof czo && czo.a($$0, $$2);
      return $$0.a(asg.L) || !j($$0) && $$1 || $$3 instanceof dap || $$4;
   }

   @Override
   public djg a(cpg $$0) {
      ctr $$1 = $$0.q();
      hx $$2 = $$0.a();
      eeq $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      hx $$8 = $$2.c();
      djg $$9 = $$1.a_($$4);
      djg $$10 = $$1.a_($$5);
      djg $$11 = $$1.a_($$6);
      djg $$12 = $$1.a_($$7);
      djg $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ic.d), ic.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ic.e), ic.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ic.c), ic.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ic.f), ic.f);
      djg $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eer.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      if ($$1 == ic.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ic.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(djg $$0, dkj<dks> $$1) {
      return $$0.c($$1) != dks.a;
   }

   private static boolean a(eml $$0, eml $$1) {
      return !emi.c($$1, $$0, elw.e);
   }

   private djg a(ctr $$0, djg $$1, hx $$2, djg $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private djg a(ctr $$0, hx $$1, djg $$2, hx $$3, djg $$4, ic $$5) {
      ic $$6 = $$5.g();
      boolean $$7 = $$5 == ic.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ic.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ic.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ic.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hx $$11 = $$1.c();
      djg $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private djg a(ctr $$0, djg $$1, hx $$2, djg $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eml $$8 = $$3.k($$0, $$2).a(ic.a);
      djg $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(djg $$0, djg $$1, eml $$2) {
      boolean $$3 = $$1.b() instanceof dfl && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dks $$4 = $$0.c(d);
         dks $$5 = $$0.c(e);
         dks $$6 = $$0.c(c);
         dks $$7 = $$0.c(f);
         boolean $$8 = $$5 == dks.a;
         boolean $$9 = $$7 == dks.a;
         boolean $$10 = $$6 == dks.a;
         boolean $$11 = $$4 == dks.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dks.c && $$5 == dks.c || $$6 == dks.c && $$7 == dks.c;
            return $$13 ? false : $$1.a(asg.aN) || a($$2, F);
         }
      }
   }

   private djg a(djg $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eml $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dks a(boolean $$0, eml $$1, eml $$2) {
      if ($$0) {
         return a($$1, $$2) ? dks.c : dks.b;
      } else {
         return dks.a;
      }
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(g) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
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
   public djg a(djg $$0, dbl $$1) {
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

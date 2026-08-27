import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dfm extends cwq implements ddq {
   public static final MapCodec<dfm> a = b(dfm::new);
   public static final djy b = djx.J;
   public static final dkf<dkt> c = djx.W;
   public static final dkf<dkt> d = djx.X;
   public static final dkf<dkt> e = djx.Y;
   public static final dkf<dkt> f = djx.Z;
   public static final djy g = djx.C;
   private final Map<djh, emm> h;
   private final Map<djh, emm> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final emm F = cwq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final emm G = cwq.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final emm H = cwq.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final emm I = cwq.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final emm J = cwq.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dfm> a() {
      return a;
   }

   public dfm(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dkt.a).a(c, dkt.a).a(e, dkt.a).a(f, dkt.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static emm a(emm $$0, dkt $$1, emm $$2, emm $$3) {
      if ($$1 == dkt.c) {
         return emj.a($$0, $$3);
      } else {
         return $$1 == dkt.b ? emj.a($$0, $$2) : $$0;
      }
   }

   private Map<djh, emm> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      emm $$10 = cwq.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      emm $$11 = cwq.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      emm $$12 = cwq.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      emm $$13 = cwq.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      emm $$14 = cwq.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      emm $$15 = cwq.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      emm $$16 = cwq.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      emm $$17 = cwq.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      emm $$18 = cwq.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<djh, emm> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dkt $$21 : c.a()) {
            for (dkt $$22 : d.a()) {
               for (dkt $$23 : f.a()) {
                  for (dkt $$24 : e.a()) {
                     emm $$25 = emj.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = emj.a($$25, $$10);
                     }

                     djh $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.h.get($$0);
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   private boolean a(djh $$0, boolean $$1, ic $$2) {
      cwq $$3 = $$0.b();
      boolean $$4 = $$3 instanceof czp && czp.a($$0, $$2);
      return $$0.a(ash.L) || !j($$0) && $$1 || $$3 instanceof daq || $$4;
   }

   @Override
   public djh a(cph $$0) {
      cts $$1 = $$0.q();
      hx $$2 = $$0.a();
      eer $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      hx $$8 = $$2.c();
      djh $$9 = $$1.a_($$4);
      djh $$10 = $$1.a_($$5);
      djh $$11 = $$1.a_($$6);
      djh $$12 = $$1.a_($$7);
      djh $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ic.d), ic.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ic.e), ic.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ic.c), ic.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ic.f), ic.f);
      djh $$18 = this.o().a(g, Boolean.valueOf($$3.a() == ees.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      if ($$1 == ic.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ic.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(djh $$0, dkk<dkt> $$1) {
      return $$0.c($$1) != dkt.a;
   }

   private static boolean a(emm $$0, emm $$1) {
      return !emj.c($$1, $$0, elx.e);
   }

   private djh a(cts $$0, djh $$1, hx $$2, djh $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private djh a(cts $$0, hx $$1, djh $$2, hx $$3, djh $$4, ic $$5) {
      ic $$6 = $$5.g();
      boolean $$7 = $$5 == ic.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ic.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ic.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ic.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hx $$11 = $$1.c();
      djh $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private djh a(cts $$0, djh $$1, hx $$2, djh $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      emm $$8 = $$3.k($$0, $$2).a(ic.a);
      djh $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(djh $$0, djh $$1, emm $$2) {
      boolean $$3 = $$1.b() instanceof dfm && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dkt $$4 = $$0.c(d);
         dkt $$5 = $$0.c(e);
         dkt $$6 = $$0.c(c);
         dkt $$7 = $$0.c(f);
         boolean $$8 = $$5 == dkt.a;
         boolean $$9 = $$7 == dkt.a;
         boolean $$10 = $$6 == dkt.a;
         boolean $$11 = $$4 == dkt.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dkt.c && $$5 == dkt.c || $$6 == dkt.c && $$7 == dkt.c;
            return $$13 ? false : $$1.a(ash.aN) || a($$2, F);
         }
      }
   }

   private djh a(djh $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, emm $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dkt a(boolean $$0, emm $$1, emm $$2) {
      if ($$0) {
         return a($$1, $$2) ? dkt.c : dkt.b;
      } else {
         return dkt.a;
      }
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(g) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
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
   public djh a(djh $$0, dbm $$1) {
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

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dff extends cwj implements ddj {
   public static final MapCodec<dff> a = b(dff::new);
   public static final djr b = djq.J;
   public static final djy<dkm> c = djq.W;
   public static final djy<dkm> d = djq.X;
   public static final djy<dkm> e = djq.Y;
   public static final djy<dkm> f = djq.Z;
   public static final djr g = djq.C;
   private final Map<dja, emf> h;
   private final Map<dja, emf> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final emf F = cwj.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final emf G = cwj.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final emf H = cwj.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final emf I = cwj.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final emf J = cwj.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dff> a() {
      return a;
   }

   public dff(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dkm.a).a(c, dkm.a).a(e, dkm.a).a(f, dkm.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static emf a(emf $$0, dkm $$1, emf $$2, emf $$3) {
      if ($$1 == dkm.c) {
         return emc.a($$0, $$3);
      } else {
         return $$1 == dkm.b ? emc.a($$0, $$2) : $$0;
      }
   }

   private Map<dja, emf> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      emf $$10 = cwj.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      emf $$11 = cwj.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      emf $$12 = cwj.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      emf $$13 = cwj.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      emf $$14 = cwj.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      emf $$15 = cwj.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      emf $$16 = cwj.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      emf $$17 = cwj.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      emf $$18 = cwj.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dja, emf> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dkm $$21 : c.a()) {
            for (dkm $$22 : d.a()) {
               for (dkm $$23 : f.a()) {
                  for (dkm $$24 : e.a()) {
                     emf $$25 = emc.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = emc.a($$25, $$10);
                     }

                     dja $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.h.get($$0);
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   private boolean a(dja $$0, boolean $$1, ic $$2) {
      cwj $$3 = $$0.b();
      boolean $$4 = $$3 instanceof czi && czi.a($$0, $$2);
      return $$0.a(asb.L) || !j($$0) && $$1 || $$3 instanceof daj || $$4;
   }

   @Override
   public dja a(cpa $$0) {
      ctl $$1 = $$0.q();
      hx $$2 = $$0.a();
      eek $$3 = $$0.q().b_($$0.a());
      hx $$4 = $$2.e();
      hx $$5 = $$2.h();
      hx $$6 = $$2.f();
      hx $$7 = $$2.g();
      hx $$8 = $$2.c();
      dja $$9 = $$1.a_($$4);
      dja $$10 = $$1.a_($$5);
      dja $$11 = $$1.a_($$6);
      dja $$12 = $$1.a_($$7);
      dja $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ic.d), ic.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ic.e), ic.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ic.c), ic.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ic.f), ic.f);
      dja $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eel.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      if ($$1 == ic.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ic.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dja $$0, dkd<dkm> $$1) {
      return $$0.c($$1) != dkm.a;
   }

   private static boolean a(emf $$0, emf $$1) {
      return !emc.c($$1, $$0, elq.e);
   }

   private dja a(ctl $$0, dja $$1, hx $$2, dja $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dja a(ctl $$0, hx $$1, dja $$2, hx $$3, dja $$4, ic $$5) {
      ic $$6 = $$5.g();
      boolean $$7 = $$5 == ic.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ic.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ic.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ic.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hx $$11 = $$1.c();
      dja $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dja a(ctl $$0, dja $$1, hx $$2, dja $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      emf $$8 = $$3.k($$0, $$2).a(ic.a);
      dja $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dja $$0, dja $$1, emf $$2) {
      boolean $$3 = $$1.b() instanceof dff && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dkm $$4 = $$0.c(d);
         dkm $$5 = $$0.c(e);
         dkm $$6 = $$0.c(c);
         dkm $$7 = $$0.c(f);
         boolean $$8 = $$5 == dkm.a;
         boolean $$9 = $$7 == dkm.a;
         boolean $$10 = $$6 == dkm.a;
         boolean $$11 = $$4 == dkm.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dkm.c && $$5 == dkm.c || $$6 == dkm.c && $$7 == dkm.c;
            return $$13 ? false : $$1.a(asb.aN) || a($$2, F);
         }
      }
   }

   private dja a(dja $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, emf $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dkm a(boolean $$0, emf $$1, emf $$2) {
      if ($$0) {
         return a($$1, $$2) ? dkm.c : dkm.b;
      } else {
         return dkm.a;
      }
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(g) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
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
   public dja a(dja $$0, dbf $$1) {
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

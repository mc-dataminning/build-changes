import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dev extends cvz implements dcz {
   public static final MapCodec<dev> a = b(dev::new);
   public static final djg b = djf.J;
   public static final djn<dkb> c = djf.W;
   public static final djn<dkb> d = djf.X;
   public static final djn<dkb> e = djf.Y;
   public static final djn<dkb> f = djf.Z;
   public static final djg g = djf.C;
   private final Map<dip, elu> h;
   private final Map<dip, elu> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final elu F = cvz.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final elu G = cvz.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final elu H = cvz.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final elu I = cvz.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final elu J = cvz.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dkb.a).a(c, dkb.a).a(e, dkb.a).a(f, dkb.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static elu a(elu $$0, dkb $$1, elu $$2, elu $$3) {
      if ($$1 == dkb.c) {
         return elr.a($$0, $$3);
      } else {
         return $$1 == dkb.b ? elr.a($$0, $$2) : $$0;
      }
   }

   private Map<dip, elu> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      elu $$10 = cvz.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      elu $$11 = cvz.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      elu $$12 = cvz.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      elu $$13 = cvz.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      elu $$14 = cvz.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      elu $$15 = cvz.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      elu $$16 = cvz.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      elu $$17 = cvz.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      elu $$18 = cvz.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dip, elu> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dkb $$21 : c.a()) {
            for (dkb $$22 : d.a()) {
               for (dkb $$23 : f.a()) {
                  for (dkb $$24 : e.a()) {
                     elu $$25 = elr.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = elr.a($$25, $$10);
                     }

                     dip $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.h.get($$0);
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   private boolean a(dip $$0, boolean $$1, ia $$2) {
      cvz $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cyy && cyy.a($$0, $$2);
      return $$0.a(arr.L) || !j($$0) && $$1 || $$3 instanceof czz || $$4;
   }

   @Override
   public dip a(coq $$0) {
      ctb $$1 = $$0.q();
      hv $$2 = $$0.a();
      edz $$3 = $$0.q().b_($$0.a());
      hv $$4 = $$2.e();
      hv $$5 = $$2.h();
      hv $$6 = $$2.f();
      hv $$7 = $$2.g();
      hv $$8 = $$2.c();
      dip $$9 = $$1.a_($$4);
      dip $$10 = $$1.a_($$5);
      dip $$11 = $$1.a_($$6);
      dip $$12 = $$1.a_($$7);
      dip $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ia.d), ia.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ia.e), ia.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ia.c), ia.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ia.f), ia.f);
      dip $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eea.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eea.c, eea.c.a($$3));
      }

      if ($$1 == ia.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ia.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dip $$0, djs<dkb> $$1) {
      return $$0.c($$1) != dkb.a;
   }

   private static boolean a(elu $$0, elu $$1) {
      return !elr.c($$1, $$0, elf.e);
   }

   private dip a(ctb $$0, dip $$1, hv $$2, dip $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dip a(ctb $$0, hv $$1, dip $$2, hv $$3, dip $$4, ia $$5) {
      ia $$6 = $$5.g();
      boolean $$7 = $$5 == ia.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ia.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ia.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ia.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      hv $$11 = $$1.c();
      dip $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dip a(ctb $$0, dip $$1, hv $$2, dip $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      elu $$8 = $$3.k($$0, $$2).a(ia.a);
      dip $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dip $$0, dip $$1, elu $$2) {
      boolean $$3 = $$1.b() instanceof dev && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dkb $$4 = $$0.c(d);
         dkb $$5 = $$0.c(e);
         dkb $$6 = $$0.c(c);
         dkb $$7 = $$0.c(f);
         boolean $$8 = $$5 == dkb.a;
         boolean $$9 = $$7 == dkb.a;
         boolean $$10 = $$6 == dkb.a;
         boolean $$11 = $$4 == dkb.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dkb.c && $$5 == dkb.c || $$6 == dkb.c && $$7 == dkb.c;
            return $$13 ? false : $$1.a(arr.aN) || a($$2, F);
         }
      }
   }

   private dip a(dip $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, elu $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dkb a(boolean $$0, elu $$1, elu $$2) {
      if ($$0) {
         return a($$1, $$2) ? dkb.c : dkb.b;
      } else {
         return dkb.a;
      }
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(g) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
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
   public dip a(dip $$0, dav $$1) {
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

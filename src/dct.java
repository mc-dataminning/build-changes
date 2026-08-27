import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dct extends cua implements daz {
   public static final MapCodec<dct> a = b(dct::new);
   public static final dgs b = dgr.J;
   public static final dgz<dhn> c = dgr.W;
   public static final dgz<dhn> d = dgr.X;
   public static final dgz<dhn> e = dgr.Y;
   public static final dgz<dhn> f = dgr.Z;
   public static final dgs g = dgr.C;
   private final Map<dgb, eiy> h;
   private final Map<dgb, eiy> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final eiy F = cua.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eiy G = cua.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eiy H = cua.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eiy I = cua.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eiy J = cua.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   public dct(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dhn.a).a(c, dhn.a).a(e, dhn.a).a(f, dhn.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eiy a(eiy $$0, dhn $$1, eiy $$2, eiy $$3) {
      if ($$1 == dhn.c) {
         return eiv.a($$0, $$3);
      } else {
         return $$1 == dhn.b ? eiv.a($$0, $$2) : $$0;
      }
   }

   private Map<dgb, eiy> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eiy $$10 = cua.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eiy $$11 = cua.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eiy $$12 = cua.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eiy $$13 = cua.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eiy $$14 = cua.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eiy $$15 = cua.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eiy $$16 = cua.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eiy $$17 = cua.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eiy $$18 = cua.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dgb, eiy> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dhn $$21 : c.a()) {
            for (dhn $$22 : d.a()) {
               for (dhn $$23 : f.a()) {
                  for (dhn $$24 : e.a()) {
                     eiy $$25 = eiv.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eiv.a($$25, $$10);
                     }

                     dgb $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.h.get($$0);
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.i.get($$0);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   private boolean a(dgb $$0, boolean $$1, hx $$2) {
      cua $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cwx && cwx.a($$0, $$2);
      return $$0.a(aqs.L) || !j($$0) && $$1 || $$3 instanceof cxz || $$4;
   }

   @Override
   public dgb a(cmr $$0) {
      crc $$1 = $$0.q();
      ht $$2 = $$0.a();
      ebe $$3 = $$0.q().b_($$0.a());
      ht $$4 = $$2.e();
      ht $$5 = $$2.h();
      ht $$6 = $$2.f();
      ht $$7 = $$2.g();
      ht $$8 = $$2.c();
      dgb $$9 = $$1.a_($$4);
      dgb $$10 = $$1.a_($$5);
      dgb $$11 = $$1.a_($$6);
      dgb $$12 = $$1.a_($$7);
      dgb $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, hx.d), hx.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, hx.e), hx.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, hx.c), hx.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, hx.f), hx.f);
      dgb $$18 = this.o().a(g, Boolean.valueOf($$3.a() == ebf.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      if ($$1 == hx.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == hx.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dgb $$0, dhe<dhn> $$1) {
      return $$0.c($$1) != dhn.a;
   }

   private static boolean a(eiy $$0, eiy $$1) {
      return !eiv.c($$1, $$0, eij.e);
   }

   private dgb a(crc $$0, dgb $$1, ht $$2, dgb $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dgb a(crc $$0, ht $$1, dgb $$2, ht $$3, dgb $$4, hx $$5) {
      hx $$6 = $$5.g();
      boolean $$7 = $$5 == hx.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == hx.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == hx.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == hx.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ht $$11 = $$1.c();
      dgb $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dgb a(crc $$0, dgb $$1, ht $$2, dgb $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eiy $$8 = $$3.k($$0, $$2).a(hx.a);
      dgb $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dgb $$0, dgb $$1, eiy $$2) {
      boolean $$3 = $$1.b() instanceof dct && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dhn $$4 = $$0.c(d);
         dhn $$5 = $$0.c(e);
         dhn $$6 = $$0.c(c);
         dhn $$7 = $$0.c(f);
         boolean $$8 = $$5 == dhn.a;
         boolean $$9 = $$7 == dhn.a;
         boolean $$10 = $$6 == dhn.a;
         boolean $$11 = $$4 == dhn.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dhn.c && $$5 == dhn.c || $$6 == dhn.c && $$7 == dhn.c;
            return $$13 ? false : $$1.a(aqs.aN) || a($$2, F);
         }
      }
   }

   private dgb a(dgb $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eiy $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dhn a(boolean $$0, eiy $$1, eiy $$2) {
      if ($$0) {
         return a($$1, $$2) ? dhn.c : dhn.b;
      } else {
         return dhn.a;
      }
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(g) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
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
   public dgb a(dgb $$0, cyv $$1) {
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

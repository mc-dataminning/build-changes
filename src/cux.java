import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cux extends cyv implements cvd, dca {
   public static final MapCodec<cux> a = b(cux::new);
   private static final dhz b = dhy.C;
   private static final dig<dit> c = dhy.bl;
   private static final int d = -1;
   private static final Object2IntMap<dit> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dit.b, 10);
      $$0.put(dit.c, 10);
      $$0.put(dit.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dit, ekn> j = ImmutableMap.of(
      dit.a,
      cva.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dit.b,
      cva.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dit.c,
      cva.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dit.d,
      ekk.a()
   );
   private static final ekn k = cva.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hx, ekn> l = ImmutableMap.of(
      hx.c, ekk.b(cuy.b, k, ejy.e), hx.d, ekk.b(cuy.c, k, ejy.e), hx.f, ekk.b(cuy.d, k, ejy.e), hx.e, ekk.b(cuy.e, k, ejy.e)
   );
   private final Map<dhi, ekn> m;

   @Override
   public MapCodec<cux> a() {
      return a;
   }

   protected cux(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, hx.c).a(c, dit.a));
      this.m = this.a(cux::h);
   }

   private static ekn h(dhi $$0) {
      return ekk.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(csb $$0, ats $$1, ht $$2, hx $$3) {
      int $$4 = atm.a($$1, 2, 5);
      ht.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hx.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cuy.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hx.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dhi $$0) {
      return $$0.i() || $$0.a(cvc.G) || $$0.a(cvc.sF);
   }

   protected static boolean a(csc $$0, ht $$1, dhi $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(csb $$0, ht $$1, ecs $$2, hx $$3) {
      dhi $$4 = cvc.sD.o().a(b, Boolean.valueOf($$2.a(ect.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(csa $$0, dhi $$1, ejq $$2, cem $$3) {
      this.a($$1, $$0, $$2.a(), dit.d, aqr.gO);
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(b) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      ht $$3 = $$2.d();
      dhi $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cvc.sE) || $$4.a(arg.bx);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !$$0.a($$3, $$4)) {
         return cvc.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ect.c, ect.c.a($$3));
         }

         return $$1 == hx.b && $$2.a(this) ? cvc.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(csd $$0, ht $$1, dhi $$2) {
      dhi $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(csa $$0, ats $$1, ht $$2, dhi $$3) {
      return true;
   }

   @Override
   public void a(ame $$0, ats $$1, ht $$2, dhi $$3) {
      ht $$4 = $$2.c();
      dhi $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         hx $$6 = $$3.c(aE);
         cuy.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, bkq $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dit.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dit.b, null);
         }
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dit $$4 = $$0.c(c);
         if ($$4 == dit.b) {
            this.a($$0, $$1, $$2, dit.c, aqr.gO);
         } else if ($$4 == dit.c) {
            this.a($$0, $$1, $$2, dit.d, aqr.gO);
         } else if ($$4 == dit.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(csa $$0, ht $$1, aqq $$2) {
      float $$3 = atm.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aqs.e, 1.0F, $$3);
   }

   private static boolean a(ht $$0, bkq $$1) {
      return $$1.aC() && $$1.dl().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dhi $$0, csa $$1, ht $$2, dit $$3, @Nullable aqq $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dhi $$0, csa $$1, ht $$2) {
      a($$0, $$1, $$2, dit.a);
      if ($$0.c(c) != dit.a) {
         a($$1, $$2, aqr.gP);
      }
   }

   private static void a(dhi $$0, csa $$1, ht $$2, dit $$3) {
      dit $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dls.c, $$2);
      }
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.m.get($$0);
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = $$0.q().a_($$0.a().d());
      ecs $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cvc.sD) || $$1.a(cvc.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(ect.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, aE, c);
   }
}

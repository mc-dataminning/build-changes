import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class czo extends csi implements czw {
   public static final int b = 30;
   public static final int c = 10;
   public static final dgh<dgq> d = dfz.bo;
   public static final dgj e = dfz.aT;
   public static final dga f = dfz.C;
   protected static final eig g = csv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cyc.b($$1[$$2]);
      }
   });

   public czo(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, dgq.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      gw $$1 = $$0.a();
      eam $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == ean.c));
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(f) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (h($$0) != dgq.b) {
         if (h($$0) == dgq.c) {
            $$1.a($$2, $$0.a(d, dgq.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, apd.uu, ape.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, biq $$3) {
      if (!$$0.w_() && n($$2) && $$3.ag() != biu.bi && $$0.c_($$1) instanceof dea $$5 && $$0 instanceof akq $$6 && $$5.gg().a($$6, $$1, djt.P, djt.a.a($$2))) {
         $$5.g().b($$6, djt.P, djt.a.a($$3), $$3.dj());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgq.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cpv $$0, gw $$1, dfj $$2) {
      csv $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dea($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return !$$0.B ? a($$2, dcx.I, ($$0x, $$1x, $$2x, $$3) -> dkc.c.a($$0x, $$3.gf(), $$3.gg())) : null;
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.c;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return g;
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$3 == ha.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgq h(dfj $$0) {
      return $$0.c(d);
   }

   public static boolean n(dfj $$0) {
      return h($$0) == dgq.a;
   }

   public static void a(cpv $$0, gw $$1, dfj $$2) {
      $$0.a($$1, $$2.a(d, dgq.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable biq $$0, cpv $$1, gw $$2, dfj $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, dgq.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, djt.L, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apd.ut, ape.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable biq $$0, cpv $$1, gw $$2, int $$3) {
      for (ha $$4 : ha.values()) {
         gw $$5 = $$2.a($$4);
         dfj $$6 = $$1.a_($$5);
         if ($$6.a(aps.bO)) {
            $$1.a(dkc.b($$3), $$5, djt.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, apd.I, ape.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if (h($$0) == dgq.b) {
         ha $$4 = ha.b($$3);
         if ($$4 != ha.b && $$4 != ha.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(io.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      if ($$1.c_($$2) instanceof dea $$4) {
         return h($$0) == dgq.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public boolean g_(dfj $$0) {
      return true;
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, cjf $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bga.a(5));
      }
   }
}

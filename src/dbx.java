import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbx extends cur implements dcf {
   public static final MapCodec<dbx> c = b(dbx::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dil<diu> f = did.bo;
   public static final din g = did.aT;
   public static final die h = did.C;
   protected static final eks i = cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dan.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dbx> a() {
      return c;
   }

   public dbx(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, diu.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      hx $$1 = $$0.a();
      ecx $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == ecy.c));
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(h) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (h($$0) != diu.b) {
         if (h($$0) == diu.c) {
            $$1.a($$2, $$0.a(f, diu.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aqv.uP, aqw.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
      if (!$$0.y_() && n($$2) && $$3.ai() != bkz.bi && $$0.c_($$1) instanceof dgo $$5 && $$0 instanceof ami $$6 && $$5.gi().a($$6, $$1, dlx.P, dlx.a.a($$2))) {
         $$5.g().b($$6, dlx.P, dlx.a.a($$3), $$3.dl());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == diu.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(csf $$0, hx $$1, dhn $$2) {
      cvf $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return !$$0.B ? a($$2, dfk.I, ($$0x, $$1x, $$2x, $$3) -> dmg.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return i;
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$3 == ib.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static diu h(dhn $$0) {
      return $$0.c(f);
   }

   public static boolean n(dhn $$0) {
      return h($$0) == diu.a;
   }

   public static void a(csf $$0, hx $$1, dhn $$2) {
      $$0.a($$1, $$2.a(f, diu.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bkv $$0, csf $$1, hx $$2, dhn $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, diu.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dlx.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqv.uO, aqw.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bkv $$0, csf $$1, hx $$2, int $$3) {
      for (ib $$4 : ib.values()) {
         hx $$5 = $$2.a($$4);
         dhn $$6 = $$1.a_($$5);
         if ($$6.a(ark.bO)) {
            $$1.a(dmg.b($$3), $$5, dlx.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aqv.I, aqw.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if (h($$0) == diu.b) {
         ib $$4 = ib.b($$3);
         if ($$4 != ib.b && $$4 != ib.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jp.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      if ($$1.c_($$2) instanceof dgo $$4) {
         return h($$0) == diu.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public boolean g_(dhn $$0) {
      return true;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, clo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bid.a(5));
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbl extends cuf implements dbt {
   public static final MapCodec<dbl> c = b(dbl::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dhu<did> f = dhm.bo;
   public static final dhw g = dhm.aT;
   public static final dhn h = dhm.C;
   protected static final ekb i = cut.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dab.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dbl> a() {
      return c;
   }

   public dbl(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, did.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      ht $$1 = $$0.a();
      ecg $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == ech.c));
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(h) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (h($$0) != did.b) {
         if (h($$0) == did.c) {
            $$1.a($$2, $$0.a(f, did.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aqn.uy, aqo.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bki $$3) {
      if (!$$0.x_() && n($$2) && $$3.ag() != bkm.bi && $$0.c_($$1) instanceof dfx $$5 && $$0 instanceof ama $$6 && $$5.gh().a($$6, $$1, dlg.P, dlg.a.a($$2))) {
         $$5.g().b($$6, dlg.P, dlg.a.a($$3), $$3.dj());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == did.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(crs $$0, ht $$1, dgw $$2) {
      cut $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return !$$0.B ? a($$2, det.I, ($$0x, $$1x, $$2x, $$3) -> dlp.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return i;
   }

   @Override
   public boolean f_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dgw $$0, cqy $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static did h(dgw $$0) {
      return $$0.c(f);
   }

   public static boolean n(dgw $$0) {
      return h($$0) == did.a;
   }

   public static void a(crs $$0, ht $$1, dgw $$2) {
      $$0.a($$1, $$2.a(f, did.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bki $$0, crs $$1, ht $$2, dgw $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, did.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dlg.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqn.ux, aqo.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bki $$0, crs $$1, ht $$2, int $$3) {
      for (hx $$4 : hx.values()) {
         ht $$5 = $$2.a($$4);
         dgw $$6 = $$1.a_($$5);
         if ($$6.a(arc.bO)) {
            $$1.a(dlp.b($$3), $$5, dlg.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aqn.I, aqo.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      if (h($$0) == did.b) {
         hx $$4 = hx.b($$3);
         if ($$4 != hx.b && $$4 != hx.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(jl.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dgw $$0) {
      return true;
   }

   @Override
   public int a(dgw $$0, crs $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dfx $$4) {
         return h($$0) == did.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public boolean g_(dgw $$0) {
      return true;
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, clb $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bhs.a(5));
      }
   }
}

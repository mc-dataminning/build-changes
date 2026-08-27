import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbs extends cum implements dca {
   public static final MapCodec<dbs> c = b(dbs::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dig<dip> f = dhy.bo;
   public static final dii g = dhy.aT;
   public static final dhz h = dhy.C;
   protected static final ekn i = cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dai.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dbs> a() {
      return c;
   }

   public dbs(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dip.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      ht $$1 = $$0.a();
      ecs $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == ect.c));
   }

   @Override
   public ecs c_(dhi $$0) {
      return $$0.c(h) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (h($$0) != dip.b) {
         if (h($$0) == dip.c) {
            $$1.a($$2, $$0.a(f, dip.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, aqr.uP, aqs.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, bkq $$3) {
      if (!$$0.x_() && n($$2) && $$3.ai() != bku.bi && $$0.c_($$1) instanceof dgj $$5 && $$0 instanceof ame $$6 && $$5.gi().a($$6, $$1, dls.P, dls.a.a($$2))) {
         $$5.g().b($$6, dls.P, dls.a.a($$3), $$3.dl());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dip.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ect.c, ect.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(csa $$0, ht $$1, dhi $$2) {
      cva $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dgj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return !$$0.B ? a($$2, dff.I, ($$0x, $$1x, $$2x, $$3) -> dmb.c.a($$0x, $$3.gh(), $$3.gi())) : null;
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.c;
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return i;
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$3 == hx.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dip h(dhi $$0) {
      return $$0.c(f);
   }

   public static boolean n(dhi $$0) {
      return h($$0) == dip.a;
   }

   public static void a(csa $$0, ht $$1, dhi $$2) {
      $$0.a($$1, $$2.a(f, dip.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bkq $$0, csa $$1, ht $$2, dhi $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dip.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dls.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aqr.uO, aqs.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bkq $$0, csa $$1, ht $$2, int $$3) {
      for (hx $$4 : hx.values()) {
         ht $$5 = $$2.a($$4);
         dhi $$6 = $$1.a_($$5);
         if ($$6.a(arg.bO)) {
            $$1.a(dmb.b($$3), $$5, dls.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aqr.I, aqs.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if (h($$0) == dip.b) {
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
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dhi $$0) {
      return true;
   }

   @Override
   public int a(dhi $$0, csa $$1, ht $$2) {
      if ($$1.c_($$2) instanceof dgj $$4) {
         return h($$0) == dip.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public boolean g_(dhi $$0) {
      return true;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, clj $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bhz.a(5));
      }
   }
}

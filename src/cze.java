import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class cze extends cry implements czm {
   public static final int b = 30;
   public static final int c = 10;
   public static final dfx<dgg> d = dfp.bo;
   public static final dfz e = dfp.aT;
   public static final dfq f = dfp.C;
   protected static final ehw g = csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cxs.b($$1[$$2]);
      }
   });

   public cze(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(d, dgg.a).a(e, Integer.valueOf(0)).a(f, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      gu $$1 = $$0.a();
      eac $$2 = $$0.q().b_($$1);
      return this.n().a(f, Boolean.valueOf($$2.a() == ead.c));
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(f) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (h($$0) != dgg.b) {
         if (h($$0) == dgg.c) {
            $$1.a($$2, $$0.a(d, dgg.a), 3);
            if (!$$0.c(f)) {
               $$1.a(null, $$2, aow.uu, aox.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, bii $$3) {
      if (!$$0.r_() && n($$2) && $$3.ag() != bim.bi && $$0.c_($$1) instanceof ddq $$5 && $$0 instanceof akk $$6 && $$5.gd().a($$6, $$1, djj.P, djj.a.a($$2))) {
         $$5.g().b($$6, djj.P, djj.a.a($$3), $$3.di());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$1.r_() && !$$0.a($$3.b())) {
         if ($$0.c(e) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(e, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgg.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cpl $$0, gu $$1, dez $$2) {
      csl $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return !$$0.B ? a($$2, dcn.I, ($$0x, $$1x, $$2x, $$3) -> djs.c.a($$0x, $$3.gc(), $$3.gd())) : null;
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return g;
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(e);
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$3 == ha.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgg h(dez $$0) {
      return $$0.c(d);
   }

   public static boolean n(dez $$0) {
      return h($$0) == dgg.a;
   }

   public static void a(cpl $$0, gu $$1, dez $$2) {
      $$0.a($$1, $$2.a(d, dgg.c).a(e, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int b() {
      return 30;
   }

   public void a(@Nullable bii $$0, cpl $$1, gu $$2, dez $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(d, dgg.b).a(e, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.b());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, djj.L, $$2);
      if (!$$3.c(f)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.ut, aox.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bii $$0, cpl $$1, gu $$2, int $$3) {
      for (ha $$4 : ha.values()) {
         gu $$5 = $$2.a($$4);
         dez $$6 = $$1.a_($$5);
         if ($$6.a(apl.bO)) {
            $$1.a(djs.b($$3), $$5, djj.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, aow.I, aox.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if (h($$0) == dgg.b) {
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
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d, e, f);
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddq $$4) {
         return h($$0) == dgg.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, cix $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfs.a(5));
      }
   }
}

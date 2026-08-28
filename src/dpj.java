import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpj extends dic implements dpr {
   public static final MapCodec<dpj> c = b(dpj::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dws<dxb> f = dwl.bo;
   public static final dwu g = dwl.aT;
   public static final dwm h = dwl.C;
   protected static final fas i = diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ae.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dny.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dpj> a() {
      return c;
   }

   public dpj(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, dxb.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      jh $$1 = $$0.a();
      erv $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == erw.c));
   }

   @Override
   protected erv b_(dvv $$0) {
      return $$0.c(h) ? erw.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (o($$0) != dxb.b) {
         if (o($$0) == dxb.c) {
            $$1.a($$2, $$0.b(f, dxb.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awn.wg, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bul $$3) {
      if (!$$0.A_() && q($$2) && $$3.aq() != bus.bC && $$0.c_($$1) instanceof duh $$5 && $$0 instanceof arp $$6 && $$5.gp().a($$6, $$1, ear.P, ear.a.a($$2))) {
         $$5.f().b($$6, ear.P, ear.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.S().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if (o($$0) == dxb.b) {
            b($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, erw.c, erw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dfm $$0, jh $$1, dvv $$2) {
      diq $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new duh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return !$$0.C ? a($$2, dta.I, ($$0x, $$1x, $$2x, $$3) -> eba.c.a($$0x, $$3.go(), $$3.gp())) : null;
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return i;
   }

   @Override
   protected boolean f_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dvv $$0, der $$1, jh $$2, jm $$3) {
      return $$3 == jm.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dxb o(dvv $$0) {
      return $$0.c(f);
   }

   public static boolean q(dvv $$0) {
      return o($$0) == dxb.a;
   }

   public static void a(dfm $$0, jh $$1, dvv $$2) {
      $$0.a($$1, $$2.b(f, dxb.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bul $$0, dfm $$1, jh $$2, dvv $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dxb.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, ear.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wf, awo.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bul $$0, dfm $$1, jh $$2, int $$3) {
      for (jm $$4 : jm.values()) {
         jh $$5 = $$2.a($$4);
         dvv $$6 = $$1.a_($$5);
         if ($$6.a(axc.bW)) {
            $$1.a(eba.b($$3), $$5, ear.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awn.I, awo.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if (o($$0) == dxb.b) {
         jm $$4 = jm.b($$3);
         if ($$4 != jm.b && $$4 != jm.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lm.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      if ($$1.c_($$2) instanceof duh $$4) {
         return o($$0) == dxb.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }

   @Override
   protected boolean g_(dvv $$0) {
      return true;
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brm.a(5));
      }
   }
}

import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czt extends cso implements dab {
   public static final MapCodec<czt> c = b(czt::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dgb<dgk> f = dft.bo;
   public static final dgd g = dft.aT;
   public static final dfu h = dft.C;
   protected static final eia i = ctc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = cyj.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends czt> a() {
      return c;
   }

   public czt(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dgk.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      gw $$1 = $$0.a();
      eag $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eah.c));
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(h) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (h($$0) != dgk.b) {
         if (h($$0) == dgk.c) {
            $$1.a($$2, $$0.a(f, dgk.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, apg.uu, aph.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
      if (!$$0.w_() && n($$2) && $$3.ag() != bja.bi && $$0.c_($$1) instanceof dee $$5 && $$0 instanceof akt $$6 && $$5.gh().a($$6, $$1, djn.P, djn.a.a($$2))) {
         $$5.g().b($$6, djn.P, djn.a.a($$3), $$3.dj());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (h($$0) == dgk.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(cqb $$0, gw $$1, dfd $$2) {
      ctc $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dee($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return !$$0.B ? a($$2, ddb.I, ($$0x, $$1x, $$2x, $$3) -> djw.c.a($$0x, $$3.gg(), $$3.gh())) : null;
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.c;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return i;
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$3 == ha.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dgk h(dfd $$0) {
      return $$0.c(f);
   }

   public static boolean n(dfd $$0) {
      return h($$0) == dgk.a;
   }

   public static void a(cqb $$0, gw $$1, dfd $$2) {
      $$0.a($$1, $$2.a(f, dgk.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable biw $$0, cqb $$1, gw $$2, dfd $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dgk.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, djn.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apg.ut, aph.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable biw $$0, cqb $$1, gw $$2, int $$3) {
      for (ha $$4 : ha.values()) {
         gw $$5 = $$2.a($$4);
         dfd $$6 = $$1.a_($$5);
         if ($$6.a(apv.bO)) {
            $$1.a(djw.b($$3), $$5, djn.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, apg.I, aph.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if (h($$0) == dgk.b) {
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
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      if ($$1.c_($$2) instanceof dee $$4) {
         return h($$0) == dgk.b ? $$4.f() : 0;
      } else {
         return 0;
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public boolean g_(dfd $$0) {
      return true;
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, cjl $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bgg.a(5));
      }
   }
}

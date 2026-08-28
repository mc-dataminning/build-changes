import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlr extends dek implements dlz {
   public static final MapCodec<dlr> c = b(dlr::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dsz<dti> f = dsr.bo;
   public static final dtb g = dsr.aT;
   public static final dss h = dsr.C;
   protected static final ewj i = dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkh.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dlr> a() {
      return c;
   }

   public dlr(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dti.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      iz $$1 = $$0.a();
      enu $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == env.c));
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(h) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (m($$0) != dti.b) {
         if (m($$0) == dti.c) {
            $$1.a($$2, $$0.a(f, dti.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avz.we, awa.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, bst $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsz.bm && $$0.c_($$1) instanceof dqn $$5 && $$0 instanceof are $$6 && $$5.gt().a($$6, $$1, dwu.P, dwu.a.a($$2))) {
         $$5.f().b($$6, dwu.P, dwu.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dti.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dbx $$0, iz $$1, dsb $$2) {
      dey $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return !$$0.B ? a($$2, dpi.I, ($$0x, $$1x, $$2x, $$3) -> dxd.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.c;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dti m(dsb $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsb $$0) {
      return m($$0) == dti.a;
   }

   public static void a(dbx $$0, iz $$1, dsb $$2) {
      $$0.a($$1, $$2.a(f, dti.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bst $$0, dbx $$1, iz $$2, dsb $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dti.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dwu.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.wd, awa.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bst $$0, dbx $$1, iz $$2, int $$3) {
      for (je $$4 : je.values()) {
         iz $$5 = $$2.a($$4);
         dsb $$6 = $$1.a_($$5);
         if ($$6.a(awo.bV)) {
            $$1.a(dxd.b($$3), $$5, dwu.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avz.I, awa.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if (m($$0) == dti.b) {
         je $$4 = je.b($$3);
         if ($$4 != je.b && $$4 != je.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lc.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsb $$0) {
      return true;
   }

   @Override
   protected int a(dsb $$0, dbx $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqn $$4) {
         return m($$0) == dti.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsb $$0) {
      return true;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, cuo $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpv.a(5));
      }
   }
}

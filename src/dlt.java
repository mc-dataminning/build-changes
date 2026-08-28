import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlt extends dem implements dmb {
   public static final MapCodec<dlt> c = b(dlt::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dtb<dtk> f = dst.bo;
   public static final dtd g = dst.aT;
   public static final dsu h = dst.C;
   protected static final ewl i = dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkj.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dlt> a() {
      return c;
   }

   public dlt(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dtk.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      iz $$1 = $$0.a();
      enw $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == enx.c));
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(h) ? enx.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (m($$0) != dtk.b) {
         if (m($$0) == dtk.c) {
            $$1.a($$2, $$0.a(f, dtk.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awa.we, awb.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != btb.bm && $$0.c_($$1) instanceof dqp $$5 && $$0 instanceof arf $$6 && $$5.gt().a($$6, $$1, dww.P, dww.a.a($$2))) {
         $$5.f().b($$6, dww.P, dww.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dtk.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dbz $$0, iz $$1, dsd $$2) {
      dfa $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dqp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpi> dpj<T> a(dbz $$0, dsd $$1, dpk<T> $$2) {
      return !$$0.B ? a($$2, dpk.I, ($$0x, $$1x, $$2x, $$3) -> dxf.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.c;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dtk m(dsd $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsd $$0) {
      return m($$0) == dtk.a;
   }

   public static void a(dbz $$0, iz $$1, dsd $$2) {
      $$0.a($$1, $$2.a(f, dtk.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsv $$0, dbz $$1, iz $$2, dsd $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dtk.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dww.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.wd, awb.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsv $$0, dbz $$1, iz $$2, int $$3) {
      for (je $$4 : je.values()) {
         iz $$5 = $$2.a($$4);
         dsd $$6 = $$1.a_($$5);
         if ($$6.a(awp.bV)) {
            $$1.a(dxf.b($$3), $$5, dww.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, awa.I, awb.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if (m($$0) == dtk.b) {
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
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsd $$0) {
      return true;
   }

   @Override
   protected int a(dsd $$0, dbz $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqp $$4) {
         return m($$0) == dtk.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsd $$0) {
      return true;
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, cuq $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpx.a(5));
      }
   }
}

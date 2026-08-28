import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlq extends dej implements dly {
   public static final MapCodec<dlq> c = b(dlq::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dsy<dth> f = dsq.bo;
   public static final dta g = dsq.aT;
   public static final dsr h = dsq.C;
   protected static final ewi i = dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dkg.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dlq> a() {
      return c;
   }

   public dlq(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dth.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      iz $$1 = $$0.a();
      ent $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == enu.c));
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(h) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (m($$0) != dth.b) {
         if (m($$0) == dth.c) {
            $$1.a($$2, $$0.a(f, dth.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avz.we, awa.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, bss $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsy.bm && $$0.c_($$1) instanceof dqm $$5 && $$0 instanceof are $$6 && $$5.gt().a($$6, $$1, dwt.P, dwt.a.a($$2))) {
         $$5.f().b($$6, dwt.P, dwt.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dth.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, enu.c, enu.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dbw $$0, iz $$1, dsa $$2) {
      dex $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpf a(iz $$0, dsa $$1) {
      return new dqm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpf> dpg<T> a(dbw $$0, dsa $$1, dph<T> $$2) {
      return !$$0.B ? a($$2, dph.I, ($$0x, $$1x, $$2x, $$3) -> dxc.c.a($$0x, $$3.gs(), $$3.gt())) : null;
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.c;
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsa $$0, dbc $$1, iz $$2, je $$3) {
      return $$3 == je.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dth m(dsa $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsa $$0) {
      return m($$0) == dth.a;
   }

   public static void a(dbw $$0, iz $$1, dsa $$2) {
      $$0.a($$1, $$2.a(f, dth.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bss $$0, dbw $$1, iz $$2, dsa $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dth.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dwt.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.wd, awa.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bss $$0, dbw $$1, iz $$2, int $$3) {
      for (je $$4 : je.values()) {
         iz $$5 = $$2.a($$4);
         dsa $$6 = $$1.a_($$5);
         if ($$6.a(awo.bV)) {
            $$1.a(dxc.b($$3), $$5, dwt.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avz.I, awa.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsa $$0, dbw $$1, iz $$2, azf $$3) {
      if (m($$0) == dth.b) {
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
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqm $$4) {
         return m($$0) == dth.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsa $$0) {
      return true;
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, cun $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpu.a(5));
      }
   }
}

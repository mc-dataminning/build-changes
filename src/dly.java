import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dly extends der implements dmg {
   public static final MapCodec<dly> c = b(dly::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dtf<dto> f = dsx.bo;
   public static final dth g = dsx.aT;
   public static final dsy h = dsx.C;
   protected static final ews i = dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private static final float[] a = ac.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dko.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends dly> a() {
      return c;
   }

   public dly(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, dto.a).a(g, Integer.valueOf(0)).a(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      ja $$1 = $$0.a();
      eob $$2 = $$0.q().b_($$1);
      return this.o().a(h, Boolean.valueOf($$2.a() == eoc.c));
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(h) ? eoc.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (m($$0) != dto.b) {
         if (m($$0) == dto.c) {
            $$1.a($$2, $$0.a(f, dto.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, avf.wh, avg.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dcd $$0, ja $$1, dsh $$2, bsd $$3) {
      if (!$$0.x_() && n($$2) && $$3.ak() != bsj.bm && $$0.c_($$1) instanceof dqu $$5 && $$0 instanceof aqk $$6 && $$5.gq().a($$6, $$1, dxa.P, dxa.a.a($$2))) {
         $$5.f().b($$6, dxa.P, dxa.a.a($$3), $$3.dn());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.P().a($$2, this)) {
            $$1.a($$2, $$0.a(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (m($$0) == dto.b) {
            b($$1, $$2, $$0);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private static void b(dcd $$0, ja $$1, dsh $$2) {
      dff $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.d(), $$3);
   }

   @Nullable
   @Override
   public dpn a(ja $$0, dsh $$1) {
      return new dqu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpn> dpo<T> a(dcd $$0, dsh $$1, dpp<T> $$2) {
      return !$$0.B ? a($$2, dpp.I, ($$0x, $$1x, $$2x, $$3) -> dxj.c.a($$0x, $$3.gp(), $$3.gq())) : null;
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.c;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return i;
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$3 == jf.b ? $$0.b($$1, $$2, $$3) : 0;
   }

   public static dto m(dsh $$0) {
      return $$0.c(f);
   }

   public static boolean n(dsh $$0) {
      return m($$0) == dto.a;
   }

   public static void a(dcd $$0, ja $$1, dsh $$2) {
      $$0.a($$1, $$2.a(f, dto.c).a(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bsd $$0, dcd $$1, ja $$2, dsh $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.a(f, dto.b).a(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, dxa.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avf.wg, avg.e, 1.0F, $$1.z.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bsd $$0, dcd $$1, ja $$2, int $$3) {
      for (jf $$4 : jf.values()) {
         ja $$5 = $$2.a($$4);
         dsh $$6 = $$1.a_($$5);
         if ($$6.a(avu.bV)) {
            $$1.a(dxj.b($$3), $$5, dxa.a.a($$0, $$6));
            float $$7 = a[$$3];
            $$1.a(null, $$5, avf.I, avg.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if (m($$0) == dto.b) {
         jf $$4 = jf.b($$3);
         if ($$4 != jf.b && $$4 != jf.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(ld.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dsh $$0) {
      return true;
   }

   @Override
   protected int a(dsh $$0, dcd $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqu $$4) {
         return m($$0) == dto.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected boolean f_(dsh $$0) {
      return true;
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, cua $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bpf.a(5));
      }
   }
}

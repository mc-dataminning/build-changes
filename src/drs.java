import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drs extends dkg implements dsb {
   public static final MapCodec<drs> c = b(drs::new);
   public static final int d = 30;
   public static final int e = 10;
   public static final dzk<dzt> f = dzc.br;
   public static final dzm g = dzc.aW;
   public static final dzd h = dzc.I;
   private static final fdo a = dku.b(16.0, 0.0, 8.0);
   private static final float[] b = af.a(new float[16], $$0 -> {
      int[] $$1 = new int[]{0, 0, 2, 4, 6, 7, 9, 10, 12, 14, 15, 18, 19, 21, 22, 24};

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$0[$$2] = dqi.b($$1[$$2]);
      }
   });

   @Override
   public MapCodec<? extends drs> a() {
      return c;
   }

   public drs(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(f, dzt.a).b(g, Integer.valueOf(0)).b(h, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      jj $$1 = $$0.a();
      eut $$2 = $$0.q().b_($$1);
      return this.m().b(h, Boolean.valueOf($$2.a() == euu.c));
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(h) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (o($$0) != dzt.b) {
         if (o($$0) == dzt.c) {
            $$1.a($$2, $$0.b(f, dzt.a), 3);
            if (!$$0.c(h)) {
               $$1.a(null, $$2, awk.wR, awl.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
            }
         }
      } else {
         a($$1, $$2, $$0);
      }
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bvs $$3) {
      if (!$$0.w_() && q($$2) && $$3.aq() != bwb.bF && $$0.c_($$1) instanceof dww $$5 && $$0 instanceof arn $$6 && $$5.gq().a($$6, $$1, edm.P, edm.a.a($$2))) {
         $$5.f().b($$6, edm.P, edm.a.a($$3), $$3.dt());
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(g) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(g, Integer.valueOf(0)), 18);
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (o($$0) == dzt.b) {
         b($$1, $$2, $$0);
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(h)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private static void b(dhp $$0, jj $$1, dym $$2) {
      dku $$3 = $$2.b();
      $$0.a($$1, $$3);
      $$0.a($$1.e(), $$3);
   }

   @Nullable
   @Override
   public dvl a(jj $$0, dym $$1) {
      return new dww($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dvl> dvm<T> a(dhp $$0, dym $$1, dvn<T> $$2) {
      return !$$0.C ? a($$2, dvn.J, ($$0x, $$1x, $$2x, $$3) -> edv.c.a($$0x, $$3.x(), $$3.gq())) : null;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a;
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(g);
   }

   @Override
   public int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$3 == jo.b ? $$0.a($$1, $$2, $$3) : 0;
   }

   public static dzt o(dym $$0) {
      return $$0.c(f);
   }

   public static boolean q(dym $$0) {
      return o($$0) == dzt.a;
   }

   public static void a(dhp $$0, jj $$1, dym $$2) {
      $$0.a($$1, $$2.b(f, dzt.c).b(g, Integer.valueOf(0)), 3);
      $$0.a($$1, $$2.b(), 10);
      b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public int c() {
      return 30;
   }

   public void a(@Nullable bvs $$0, dhp $$1, jj $$2, dym $$3, int $$4, int $$5) {
      $$1.a($$2, $$3.b(f, dzt.b).b(g, Integer.valueOf($$4)), 3);
      $$1.a($$2, $$3.b(), this.c());
      b($$1, $$2, $$3);
      a($$0, $$1, $$2, $$5);
      $$1.a($$0, edm.L, $$2);
      if (!$$3.c(h)) {
         $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.wQ, awl.e, 1.0F, $$1.A.i() * 0.2F + 0.8F);
      }
   }

   public static void a(@Nullable bvs $$0, dhp $$1, jj $$2, int $$3) {
      for (jo $$4 : jo.values()) {
         jj $$5 = $$2.a($$4);
         dym $$6 = $$1.a_($$5);
         if ($$6.a(awz.bY)) {
            $$1.a(edv.b($$3), $$5, edm.a.a($$0, $$6));
            float $$7 = b[$$3];
            $$1.a(null, $$5, awk.I, awl.e, 1.0F, $$7);
         }
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if (o($$0) == dzt.b) {
         jo $$4 = jo.b($$3);
         if ($$4 != jo.b && $$4 != jo.a) {
            double $$5 = (double)$$2.u() + 0.5 + ($$4.j() == 0 ? 0.5 - $$3.j() : (double)$$4.j() * 0.6);
            double $$6 = (double)$$2.v() + 0.25;
            double $$7 = (double)$$2.w() + 0.5 + ($$4.l() == 0 ? 0.5 - $$3.j() : (double)$$4.l() * 0.6);
            double $$8 = (double)$$3.i() * 0.04;
            $$1.a(lp.b, $$5, $$6, $$7, 0.0, $$8, 0.0);
         }
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f, g, h);
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      if ($$1.c_($$2) instanceof dww $$4) {
         return o($$0) == dzt.b ? $$4.d() : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }

   @Override
   protected boolean g_(dym $$0) {
      return true;
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, cxy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bss.a(5));
      }
   }
}

import com.mojang.serialization.MapCodec;

public class dsi extends dku {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final int b = 2;
   public static final dzm c = dzc.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fdo g = dku.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   public dsi(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   public fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return g;
   }

   public int o(dym $$0) {
      return $$0.c(c);
   }

   private boolean q(dym $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awk.zw, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awk.zx, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cla $$4 = bwb.bi.a($$1, bwa.e);
         if ($$4 != null) {
            fcu $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azk.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(edm.i, $$2, edm.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dym $$0, evi $$1) {
      return false;
   }

   public static boolean a(dgv $$0, jj $$1) {
      return $$0.a_($$1.e()).a(awz.cx);
   }
}

import com.mojang.serialization.MapCodec;

public class dqx extends djk {
   public static final MapCodec<dqx> a = b(dqx::new);
   public static final int b = 2;
   public static final dxu c = dxl.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fbs g = djk.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dqx> a() {
      return a;
   }

   public dqx(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   public fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return g;
   }

   public int o(dwv $$0) {
      return $$0.c(c);
   }

   private boolean q(dwv $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, avz.zm, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avz.zn, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cjn $$4 = buq.bi.a($$1, bup.e);
         if ($$4 != null) {
            fay $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayy.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.B_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(ebr.i, $$2, ebr.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dwv $$0, etm $$1) {
      return false;
   }

   public static boolean a(dfl $$0, ji $$1) {
      return $$0.a_($$1.e()).a(awo.cv);
   }
}

import com.mojang.serialization.MapCodec;

public class dpg extends dhy {
   public static final MapCodec<dpg> a = b(dpg::new);
   public static final int b = 2;
   public static final dwd c = dvt.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final fab g = dhy.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }

   @Override
   public fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return g;
   }

   public int o(dvd $$0) {
      return $$0.c(c);
   }

   private boolean q(dvd $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awk.yC, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awk.yD, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cjd $$4 = bug.aR.a($$1, buf.e);
         if ($$4 != null) {
            ezh $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azj.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eaa.i, $$2, eaa.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(dvd $$0, ert $$1) {
      return false;
   }

   public static boolean a(dea $$0, jg $$1) {
      return $$0.a_($$1.e()).a(awz.cu);
   }
}

import com.mojang.serialization.MapCodec;

public class duj extends dmr {
   public static final MapCodec<duj> a = b(duj::new);
   public static final int b = 2;
   public static final ebt c = ebj.aH;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ffw g = dmr.a(14.0, 12.0, 0.0, 16.0);

   @Override
   public MapCodec<duj> a() {
      return a;
   }

   public duj(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c);
   }

   @Override
   public ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return g;
   }

   public int o(eat $$0) {
      return $$0.c(c);
   }

   private boolean q(eat $$0) {
      return this.o($$0) == 2;
   }

   @Override
   public void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!this.q($$0)) {
         $$1.a(null, $$2, awn.zC, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.b(c, Integer.valueOf(this.o($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, awn.zD, awo.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cly $$4 = bwr.bj.a($$1, bwq.e);
         if ($$4 != null) {
            ffc $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), azm.h($$1.A.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.w_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(eft.i, $$2, eft.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.A.a(300));
   }

   @Override
   public boolean a(eat $$0, exp $$1) {
      return false;
   }

   public static boolean a(diq $$0, iv $$1) {
      return $$0.a_($$1.e()).a(axc.cz);
   }
}

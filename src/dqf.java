import com.mojang.serialization.MapCodec;

public class dqf extends dhy {
   public static final MapCodec<dqf> a = b(dqf::new);
   private static final dwd b = dvt.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dqf> a() {
      return a;
   }

   public dqf(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dev $$0, dvd $$1, ezd $$2, cpb $$3) {
      int $$4 = a((dew)$$0, $$1, $$2, (btz)$$3);
      if ($$3.s() instanceof arn $$6) {
         $$6.a(awu.aE);
         an.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dew $$0, dvd $$1, ezd $$2, btz $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cop ? 20 : 8;
      if (!$$0.R().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(ezd $$0, ezh $$1) {
      jl $$2 = $$0.c();
      double $$3 = Math.abs(azj.e($$1.d) - 0.5);
      double $$4 = Math.abs(azj.e($$1.e) - 0.5);
      double $$5 = Math.abs(azj.e($$1.f) - 0.5);
      jl.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jl.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jl.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azj.c(15.0 * azj.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dew $$0, dvd $$1, int $$2, jg $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

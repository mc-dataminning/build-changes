import com.mojang.serialization.MapCodec;

public class dpu extends dhm {
   public static final MapCodec<dpu> a = b(dpu::new);
   private static final dvs b = dvi.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dpu> a() {
      return a;
   }

   public dpu(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      int $$4 = a((dek)$$0, $$1, $$2, (btr)$$3);
      if ($$3.s() instanceof ark $$6) {
         $$6.a(awq.aE);
         an.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dek $$0, dus $$1, eys $$2, btr $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof coe ? 20 : 8;
      if (!$$0.R().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(eys $$0, eyw $$1) {
      jk $$2 = $$0.c();
      double $$3 = Math.abs(azf.e($$1.d) - 0.5);
      double $$4 = Math.abs(azf.e($$1.e) - 0.5);
      double $$5 = Math.abs(azf.e($$1.f) - 0.5);
      jk.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jk.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jk.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azf.c(15.0 * azf.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dek $$0, dus $$1, int $$2, jf $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.R().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

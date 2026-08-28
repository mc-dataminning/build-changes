import com.mojang.serialization.MapCodec;

public class dup extends dma {
   public static final MapCodec<dup> a = b(dup::new);
   private static final eaz b = eap.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dup> a() {
      return a;
   }

   public dup(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      int $$4 = a((diw)$$0, $$1, $$2, (bwd)$$3);
      if ($$3.q() instanceof arr $$6) {
         $$6.a(awx.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(diw $$0, dzz $$1, fee $$2, bwd $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof crf ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fee $$0, fei $$1) {
      ja $$2 = $$0.c();
      double $$3 = Math.abs(azm.e($$1.d) - 0.5);
      double $$4 = Math.abs(azm.e($$1.e) - 0.5);
      double $$5 = Math.abs(azm.e($$1.f) - 0.5);
      ja.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ja.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ja.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azm.c(15.0 * azm.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(diw $$0, dzz $$1, int $$2, iu $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

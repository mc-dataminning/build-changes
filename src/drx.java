import com.mojang.serialization.MapCodec;

public class drx extends djl {
   public static final MapCodec<drx> a = b(drx::new);
   private static final dxv b = dxm.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   public drx(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      int $$4 = a((dgi)$$0, $$1, $$2, (buk)$$3);
      if ($$3.p() instanceof are $$6) {
         $$6.a(awk.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dgi $$0, dww $$1, fav $$2, buk $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cpd ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fav $$0, faz $$1) {
      jn $$2 = $$0.c();
      double $$3 = Math.abs(ayz.e($$1.d) - 0.5);
      double $$4 = Math.abs(ayz.e($$1.e) - 0.5);
      double $$5 = Math.abs(ayz.e($$1.f) - 0.5);
      jn.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jn.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jn.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayz.c(15.0 * ayz.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dgi $$0, dww $$1, int $$2, ji $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dww $$0, dfm $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dww $$0) {
      return true;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

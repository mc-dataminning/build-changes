import com.mojang.serialization.MapCodec;

public class drw extends djk {
   public static final MapCodec<drw> a = b(drw::new);
   private static final dxu b = dxl.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<drw> a() {
      return a;
   }

   public drw(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      int $$4 = a((dgh)$$0, $$1, $$2, (buj)$$3);
      if ($$3.p() instanceof ard $$6) {
         $$6.a(awj.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dgh $$0, dwv $$1, fau $$2, buj $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cpc ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fau $$0, fay $$1) {
      jn $$2 = $$0.c();
      double $$3 = Math.abs(ayy.e($$1.d) - 0.5);
      double $$4 = Math.abs(ayy.e($$1.e) - 0.5);
      double $$5 = Math.abs(ayy.e($$1.f) - 0.5);
      jn.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jn.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jn.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, ayy.c(15.0 * ayy.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dgh $$0, dwv $$1, int $$2, ji $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dwv $$0, dfl $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dwv $$0) {
      return true;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

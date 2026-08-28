import com.mojang.serialization.MapCodec;

public class drz extends djn {
   public static final MapCodec<drz> a = b(drz::new);
   private static final dxx b = dxo.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<drz> a() {
      return a;
   }

   public drz(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgj $$0, dwy $$1, fax $$2, cpr $$3) {
      int $$4 = a((dgk)$$0, $$1, $$2, (bum)$$3);
      if ($$3.p() instanceof are $$6) {
         $$6.a(awk.aE);
         ap.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dgk $$0, dwy $$1, fax $$2, bum $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cpf ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fax $$0, fbb $$1) {
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

   private static void a(dgk $$0, dwy $$1, int $$2, ji $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dwy $$0, dfo $$1, ji $$2, jn $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dwy $$0) {
      return true;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

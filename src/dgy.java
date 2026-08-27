import com.mojang.serialization.MapCodec;

public class dgy extends cys {
   public static final MapCodec<dgy> a = b(dgy::new);
   private static final dmj b = dlz.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dgy> a() {
      return a;
   }

   public dgy(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(cvr $$0, dlj $$1, env $$2, cid $$3) {
      int $$4 = a((cvs)$$0, $$1, $$2, (bnq)$$3);
      if ($$3.w() instanceof aox $$6) {
         $$6.a(atv.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cvs $$0, dlj $$1, env $$2, bnq $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof chr ? 20 : 8;
      if (!$$0.N().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(env $$0, enz $$1) {
      ie $$2 = $$0.b();
      double $$3 = Math.abs(awi.e($$1.c) - 0.5);
      double $$4 = Math.abs(awi.e($$1.d) - 0.5);
      double $$5 = Math.abs(awi.e($$1.e) - 0.5);
      ie.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ie.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ie.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, awi.c(15.0 * awi.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cvs $$0, dlj $$1, int $$2, hz $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

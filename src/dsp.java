import com.mojang.serialization.MapCodec;

public class dsp extends dkd {
   public static final MapCodec<dsp> a = b(dsp::new);
   private static final dyn b = dye.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dsp> a() {
      return a;
   }

   public dsp(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dgz $$0, dxo $$1, fbn $$2, cqh $$3) {
      int $$4 = a((dha)$$0, $$1, $$2, (bvb)$$3);
      if ($$3.p() instanceof ary $$6) {
         $$6.a(axf.aE);
         ao.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dha $$0, dxo $$1, fbn $$2, bvb $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof cpv ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(fbn $$0, fbr $$1) {
      jm $$2 = $$0.c();
      double $$3 = Math.abs(azu.e($$1.d) - 0.5);
      double $$4 = Math.abs(azu.e($$1.e) - 0.5);
      double $$5 = Math.abs(azu.e($$1.f) - 0.5);
      jm.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jm.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jm.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azu.c(15.0 * azu.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dha $$0, dxo $$1, int $$2, jh $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dxo $$0, dge $$1, jh $$2, jm $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dxo $$0) {
      return true;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$1.B_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

import com.mojang.serialization.MapCodec;

public class dvw extends dne {
   public static final MapCodec<dvw> a = b(dvw::new);
   private static final ecg b = ebw.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dvw> a() {
      return a;
   }

   public dvw(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      int $$4 = a((dka)$$0, $$1, $$2, (bwv)$$3);
      if ($$3.q() instanceof arv $$6) {
         $$6.a(axb.aE);
         aq.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dka $$0, ebg $$1, ffo $$2, bwv $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof csh ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(ffo $$0, ffs $$1) {
      jc $$2 = $$0.c();
      double $$3 = Math.abs(azq.e($$1.d) - 0.5);
      double $$4 = Math.abs(azq.e($$1.e) - 0.5);
      double $$5 = Math.abs(azq.e($$1.f) - 0.5);
      jc.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jc.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jc.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azq.c(15.0 * azq.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dka $$0, ebg $$1, int $$2, iw $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

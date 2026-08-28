import com.mojang.serialization.MapCodec;

public class dwg extends dno {
   public static final MapCodec<dwg> a = b(dwg::new);
   private static final ecq b = ecg.aW;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dwg> a() {
      return a;
   }

   public dwg(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      int $$4 = a((dkk)$$0, $$1, $$2, (bxe)$$3);
      if ($$3.p() instanceof asc $$6) {
         $$6.a(axi.aE);
         aq.M.a($$6, $$3, $$2.g(), $$4);
      }
   }

   private static int a(dkk $$0, ebq $$1, ffy $$2, bxe $$3) {
      int $$4 = a($$2, $$2.g());
      int $$5 = $$3 instanceof csq ? 20 : 8;
      if (!$$0.U().a($$2.b(), $$1.b())) {
         a($$0, $$1, $$4, $$2.b(), $$5);
      }

      return $$4;
   }

   private static int a(ffy $$0, fgc $$1) {
      jc $$2 = $$0.c();
      double $$3 = Math.abs(azz.e($$1.d) - 0.5);
      double $$4 = Math.abs(azz.e($$1.e) - 0.5);
      double $$5 = Math.abs(azz.e($$1.f) - 0.5);
      jc.a $$6 = $$2.o();
      double $$7;
      if ($$6 == jc.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == jc.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, azz.c(15.0 * azz.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(dkk $$0, ebq $$1, int $$2, iw $$3, int $$4) {
      $$0.a($$3, $$1.b(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(ebq $$0, djn $$1, iw $$2, jc $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(ebq $$0) {
      return true;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$1.A_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.U().a($$2, this)) {
            $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

import com.mojang.serialization.MapCodec;

public class dii extends dac {
   public static final MapCodec<dii> a = b(dii::new);
   private static final dob b = dnr.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dii> a() {
      return a;
   }

   public dii(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(cxb $$0, dnb $$1, epp $$2, cjm $$3) {
      int $$4 = a((cxc)$$0, $$1, $$2, (box)$$3);
      if ($$3.af_() instanceof apg $$6) {
         $$6.a(aui.aE);
         am.M.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cxc $$0, dnb $$1, epp $$2, box $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cja ? 20 : 8;
      if (!$$0.N().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(epp $$0, ept $$1) {
      ih $$2 = $$0.b();
      double $$3 = Math.abs(aww.e($$1.c) - 0.5);
      double $$4 = Math.abs(aww.e($$1.d) - 0.5);
      double $$5 = Math.abs(aww.e($$1.e) - 0.5);
      ih.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ih.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ih.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, aww.c(15.0 * aww.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cxc $$0, dnb $$1, int $$2, ib $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(b);
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$1.x_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.N().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

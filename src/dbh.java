import com.mojang.serialization.MapCodec;

public class dbh extends ctc {
   public static final MapCodec<dbh> a = b(dbh::new);
   private static final dgd b = dft.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      int $$4 = a((cqc)$$0, $$1, $$2, (biw)$$3);
      if ($$3.v() instanceof aku $$6) {
         $$6.a(apq.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(cqc $$0, dfd $$1, ehd $$2, biw $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof ccg ? 20 : 8;
      if (!$$0.L().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ehd $$0, ehh $$1) {
      ha $$2 = $$0.b();
      double $$3 = Math.abs(asb.e($$1.c) - 0.5);
      double $$4 = Math.abs(asb.e($$1.d) - 0.5);
      double $$5 = Math.abs(asb.e($$1.e) - 0.5);
      ha.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ha.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ha.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, asb.c(15.0 * asb.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(cqc $$0, dfd $$1, int $$2, gw $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dfd $$0, cph $$1, gw $$2, ha $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dfd $$0) {
      return true;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$1.w_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}

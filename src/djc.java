import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class djc extends dfy {
   public static final MapCodec<djc> a = b(djc::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ext b = dfy.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   public djc(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ayw $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return !this.a($$0, $$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dcw)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3.am().equals(bsx.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dcc $$0, jd $$1) {
      epc $$2 = $$0.b_($$1);
      epc $$3 = $$0.b_($$1.d());
      return $$2.a() == epd.c && $$3.a() == epd.a;
   }

   private void a(aqu $$0, jd $$1, ayw $$2) {
      this.a((dcw)$$0, $$1);
      $$0.a(null, $$1, avp.jI, avq.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dcw $$0, jd $$1) {
      $$0.b($$1, false);
   }

   private void b(aqu $$0, jd $$1, ayw $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         chb $$5 = bsx.ba.a((dcw)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fS();
            $$0.b($$5);
         }
      }
   }

   private double b(ayw $$0) {
      double $$1 = 0.2F;
      return ayo.a($$0.j(), 0.2F, 0.7999999970197678);
   }

   @VisibleForTesting
   public static void a(int $$0, int $$1) {
      g = $$0;
      h = $$1;
   }

   @VisibleForTesting
   public static void b() {
      g = 3600;
      h = 12000;
   }
}

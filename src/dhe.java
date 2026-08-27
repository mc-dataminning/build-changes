import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dhe extends dea {
   public static final MapCodec<dhe> a = b(dhe::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   public dhe(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(aym $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return !this.a($$0, $$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((daz)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if ($$3.ak().equals(bsc.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(daf $$0, io $$1) {
      emw $$2 = $$0.b_($$1);
      emw $$3 = $$0.b_($$1.c());
      return $$2.a() == emx.c && $$3.a() == emx.a;
   }

   private void a(aqn $$0, io $$1, aym $$2) {
      this.a((daz)$$0, $$1);
      $$0.a(null, $$1, avi.jI, avj.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(daz $$0, io $$1) {
      $$0.b($$1, false);
   }

   private void b(aqn $$0, io $$1, aym $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgd $$5 = bsc.ba.a((daz)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fT();
            $$0.b($$5);
         }
      }
   }

   private double b(aym $$0) {
      double $$1 = (double)(cgd.c / 2.0F);
      return ayf.a($$0.j(), $$1, 1.0 - $$1);
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

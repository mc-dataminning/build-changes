import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dlt extends diq {
   public static final MapCodec<dlt> a = b(dlt::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final fas b = diq.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return a($$1, $$2.e());
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.G_()));
   }

   private static int a(azu $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return !this.a($$0, $$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dfm)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$3.aq().equals(bus.W)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(der $$0, jh $$1) {
      erv $$2 = $$0.b_($$1);
      erv $$3 = $$0.b_($$1.d());
      return $$2.a() == erw.c && $$3.a() == erw.a;
   }

   private void a(arp $$0, jh $$1, azu $$2) {
      this.a((dfm)$$0, $$1);
      $$0.a(null, $$1, awn.jJ, awo.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dfm $$0, jh $$1) {
      $$0.b($$1, false);
   }

   private void b(arp $$0, jh $$1, azu $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         civ $$5 = bus.bq.a($$0, bur.e);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.ai();
            $$0.b($$5);
         }
      }
   }

   private double b(azu $$0) {
      double $$1 = 0.2F;
      return azm.a($$0.j(), 0.2F, 0.7999999970197678);
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

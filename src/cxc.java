import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class cxc extends cua {
   public static final MapCodec<cxc> a = b(cxc::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final eiy b = cua.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   public cxc(dga.d $$0) {
      super($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return a($$1, $$2.d());
   }

   @Override
   public void b(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(ate $$0) {
      return $$0.b(g, h);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return !this.a($$0, $$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((cqz)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$3.ag().equals(bjx.L)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(cqf $$0, ht $$1) {
      ebe $$2 = $$0.b_($$1);
      ebe $$3 = $$0.b_($$1.c());
      return $$2.a() == ebf.c && $$3.a() == ebf.a;
   }

   private void a(alq $$0, ht $$1, ate $$2) {
      this.a((cqz)$$0, $$1);
      $$0.a(null, $$1, aqd.iD, aqe.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(cqz $$0, ht $$1) {
      $$0.b($$1, false);
   }

   private void b(alq $$0, ht $$1, ate $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         bxm $$5 = bjx.aW.a((cqz)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fJ();
            $$0.b($$5);
         }
      }
   }

   private double b(ate $$0) {
      double $$1 = (double)(bxm.c / 2.0F);
      return asy.a($$0.j(), $$1, 1.0 - $$1);
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

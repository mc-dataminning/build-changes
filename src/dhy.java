import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dhy extends deu {
   public static final MapCodec<dhy> a = b(dhy::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ewf b = deu.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   public dhy(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(azc $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return !this.a($$0, $$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dbt)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if ($$3.ak().equals(bsv.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(daz $$0, iz $$1) {
      enq $$2 = $$0.b_($$1);
      enq $$3 = $$0.b_($$1.c());
      return $$2.a() == enr.c && $$3.a() == enr.a;
   }

   private void a(arb $$0, iz $$1, azc $$2) {
      this.a((dbt)$$0, $$1);
      $$0.a(null, $$1, avw.jI, avx.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dbt $$0, iz $$1) {
      $$0.b($$1, false);
   }

   private void b(arb $$0, iz $$1, azc $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cgx $$5 = bsv.ba.a((dbt)$$0);
         if ($$5 != null) {
            double $$6 = (double)$$1.u() + this.b($$2);
            double $$7 = (double)$$1.w() + this.b($$2);
            int $$8 = $$2.b(1, 361);
            $$5.b($$6, (double)$$1.v() - 0.5, $$7, (float)$$8, 0.0F);
            $$5.fU();
            $$0.b($$5);
         }
      }
   }

   private double b(azc $$0) {
      double $$1 = (double)(cgx.c / 2.0F);
      return ayu.a($$0.j(), $$1, 1.0 - $$1);
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

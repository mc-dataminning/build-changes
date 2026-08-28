import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;

public class dib extends dex {
   public static final MapCodec<dib> a = b(dib::new);
   private static final int c = 2;
   private static final int d = 5;
   private static final int e = 3600;
   private static final int f = 12000;
   protected static final ewi b = dex.a(0.0, 0.0, 0.0, 16.0, 1.5, 16.0);
   private static int g = 3600;
   private static int h = 12000;

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   public dib(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return a($$1, $$2.d());
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      $$1.a($$2, this, a($$1.E_()));
   }

   private static int a(azf $$0) {
      return $$0.b(g, h);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return !this.a($$0, $$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!this.a($$0, $$1, $$2)) {
         this.a((dbw)$$1, $$2);
      } else {
         this.a($$1, $$2, $$3);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if ($$3.ak().equals(bsy.O)) {
         this.a($$1, $$2);
      }
   }

   private static boolean a(dbc $$0, iz $$1) {
      ent $$2 = $$0.b_($$1);
      ent $$3 = $$0.b_($$1.c());
      return $$2.a() == enu.c && $$3.a() == enu.a;
   }

   private void a(are $$0, iz $$1, azf $$2) {
      this.a((dbw)$$0, $$1);
      $$0.a(null, $$1, avz.jI, awa.e, 1.0F, 1.0F);
      this.b($$0, $$1, $$2);
   }

   private void a(dbw $$0, iz $$1) {
      $$0.b($$1, false);
   }

   private void b(are $$0, iz $$1, azf $$2) {
      int $$3 = $$2.b(2, 6);

      for (int $$4 = 1; $$4 <= $$3; $$4++) {
         cha $$5 = bsy.ba.a((dbw)$$0);
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

   private double b(azf $$0) {
      double $$1 = (double)(cha.c / 2.0F);
      return ayx.a($$0.j(), $$1, 1.0 - $$1);
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

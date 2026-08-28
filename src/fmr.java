import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class fmr extends fnd {
   private static final long a = 2000L;
   private final aqx b;
   private long c = -1L;
   private boolean q;
   private static final Object2IntMap<dvc> r = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dvc.c, 5526612);
      $$0.put(dvc.d, 10066329);
      $$0.put(dvc.e, 6250897);
      $$0.put(dvc.f, 8434258);
      $$0.put(dvc.g, 13750737);
      $$0.put(dvc.h, 7497737);
      $$0.put(dvc.i, 3159410);
      $$0.put(dvc.j, 2213376);
      $$0.put(dvc.k, 13421772);
      $$0.put(dvc.l, 16769184);
      $$0.put(dvc.m, 15884384);
      $$0.put(dvc.n, 16777215);
   });

   public fmr(aqx $$0) {
      super(fff.a);
      this.b = $$0;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected boolean aN_() {
      return false;
   }

   @Override
   public void j() {
      this.q = true;
      this.d(true);
   }

   @Override
   protected void b(fli $$0) {
      if (this.q) {
         $$0.a(flh.a, wu.c("narrator.loading.done"));
      } else {
         $$0.a(flh.a, this.m());
      }
   }

   private wu m() {
      return wu.a("loading.progress", aye.a(this.b.f(), 0, 100));
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.c > 2000L) {
         this.c = $$4;
         this.d(true);
      }

      int $$5 = this.m / 2;
      int $$6 = this.n / 2;
      a($$0, this.b, $$5, $$6, 2, 0);
      int $$7 = this.b.e() + 9 + 2;
      $$0.a(this.o, this.m(), $$5, $$6 - $$7, 16777215);
   }

   public static void a(fgz $$0, aqx $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$4 + $$5;
      int $$7 = $$1.d();
      int $$8 = $$7 * $$6 - $$5;
      int $$9 = $$1.e();
      int $$10 = $$9 * $$6 - $$5;
      int $$11 = $$2 - $$10 / 2;
      int $$12 = $$3 - $$10 / 2;
      int $$13 = $$8 / 2 + 1;
      int $$14 = -16772609;
      $$0.a(() -> {
         if ($$5 != 0) {
            $$0.a($$2 - $$13, $$3 - $$13, $$2 - $$13 + 1, $$3 + $$13, -16772609);
            $$0.a($$2 + $$13 - 1, $$3 - $$13, $$2 + $$13, $$3 + $$13, -16772609);
            $$0.a($$2 - $$13, $$3 - $$13, $$2 + $$13, $$3 - $$13 + 1, -16772609);
            $$0.a($$2 - $$13, $$3 + $$13 - 1, $$2 + $$13, $$3 + $$13, -16772609);
         }

         for (int $$11x = 0; $$11x < $$9; $$11x++) {
            for (int $$12x = 0; $$12x < $$9; $$12x++) {
               dvc $$13x = $$1.a($$11x, $$12x);
               int $$14x = $$11 + $$11x * $$6;
               int $$15 = $$12 + $$12x * $$6;
               $$0.a($$14x, $$15, $$14x + $$4, $$15 + $$4, r.getInt($$13x) | 0xFF000000);
            }
         }
      });
   }
}

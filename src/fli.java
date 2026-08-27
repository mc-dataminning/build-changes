import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class fli extends fly {
   private static final long a = 2000L;
   private final aqz b;
   private long c = -1L;
   private boolean d;
   private static final Object2IntMap<dtw> r = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dtw.c, 5526612);
      $$0.put(dtw.d, 10066329);
      $$0.put(dtw.e, 6250897);
      $$0.put(dtw.f, 8434258);
      $$0.put(dtw.g, 13750737);
      $$0.put(dtw.h, 7497737);
      $$0.put(dtw.i, 3159410);
      $$0.put(dtw.j, 2213376);
      $$0.put(dtw.k, 13421772);
      $$0.put(dtw.l, 16769184);
      $$0.put(dtw.m, 15884384);
      $$0.put(dtw.n, 16777215);
   });

   public fli(aqz $$0) {
      super(fdr.a);
      this.b = $$0;
   }

   @Override
   public boolean aD_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void j() {
      this.d = true;
      this.d(true);
   }

   @Override
   protected void b(fjv $$0) {
      if (this.d) {
         $$0.a(fju.a, wx.c("narrator.loading.done"));
      } else {
         $$0.a(fju.a, this.m());
      }
   }

   private wx m() {
      return wx.a("loading.progress", ayd.a(this.b.f(), 0, 100));
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.c();
      if ($$4 - this.c > 2000L) {
         this.c = $$4;
         this.d(true);
      }

      int $$5 = this.n / 2;
      int $$6 = this.o / 2;
      a($$0, this.b, $$5, $$6, 2, 0);
      int $$7 = this.b.e() + 9 + 2;
      $$0.a(this.p, this.m(), $$5, $$6 - $$7, 16777215);
   }

   public static void a(ffm $$0, aqz $$1, int $$2, int $$3, int $$4, int $$5) {
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
               dtw $$13x = $$1.a($$11x, $$12x);
               int $$14x = $$11 + $$11x * $$6;
               int $$15 = $$12 + $$12x * $$6;
               $$0.a($$14x, $$15, $$14x + $$4, $$15 + $$4, r.getInt($$13x) | 0xFF000000);
            }
         }
      });
   }
}

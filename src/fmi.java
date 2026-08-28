import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class fmi extends fmy {
   private static final long a = 2000L;
   private final aro b;
   private long c = -1L;
   private boolean d;
   private static final Object2IntMap<dus> r = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dus.c, 5526612);
      $$0.put(dus.d, 10066329);
      $$0.put(dus.e, 6250897);
      $$0.put(dus.f, 8434258);
      $$0.put(dus.g, 13750737);
      $$0.put(dus.h, 7497737);
      $$0.put(dus.i, 3159410);
      $$0.put(dus.j, 2213376);
      $$0.put(dus.k, 13421772);
      $$0.put(dus.l, 16769184);
      $$0.put(dus.m, 15884384);
      $$0.put(dus.n, 16777215);
   });

   public fmi(aro $$0) {
      super(fes.a);
      this.b = $$0;
   }

   @Override
   public boolean aE_() {
      return false;
   }

   @Override
   protected boolean aM_() {
      return false;
   }

   @Override
   public void j() {
      this.d = true;
      this.d(true);
   }

   @Override
   protected void b(fkv $$0) {
      if (this.d) {
         $$0.a(fku.a, xl.c("narrator.loading.done"));
      } else {
         $$0.a(fku.a, this.m());
      }
   }

   private xl m() {
      return xl.a("loading.progress", ayu.a(this.b.f(), 0, 100));
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
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

   public static void a(fgm $$0, aro $$1, int $$2, int $$3, int $$4, int $$5) {
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
               dus $$13x = $$1.a($$11x, $$12x);
               int $$14x = $$11 + $$11x * $$6;
               int $$15 = $$12 + $$12x * $$6;
               $$0.a($$14x, $$15, $$14x + $$4, $$15 + $$4, r.getInt($$13x) | 0xFF000000);
            }
         }
      });
   }
}

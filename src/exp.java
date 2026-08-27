import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class exp extends eye {
   private static final long a = 2000L;
   private final alg b;
   private long c = -1L;
   private boolean k;
   private static final Object2IntMap<dhe> l = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dhe.c, 5526612);
      $$0.put(dhe.d, 10066329);
      $$0.put(dhe.e, 6250897);
      $$0.put(dhe.f, 8434258);
      $$0.put(dhe.g, 13750737);
      $$0.put(dhe.h, 7497737);
      $$0.put(dhe.i, 3159410);
      $$0.put(dhe.j, 2213376);
      $$0.put(dhe.k, 13421772);
      $$0.put(dhe.l, 16769184);
      $$0.put(dhe.m, 15884384);
      $$0.put(dhe.n, 16777215);
   });

   public exp(alg $$0) {
      super(eqh.a);
      this.b = $$0;
   }

   @Override
   public boolean ay_() {
      return false;
   }

   @Override
   protected boolean aG_() {
      return false;
   }

   @Override
   public void h() {
      this.k = true;
      this.d(true);
   }

   @Override
   protected void b(ewd $$0) {
      if (this.k) {
         $$0.a(ewc.a, tl.c("narrator.loading.done"));
      } else {
         $$0.a(ewc.a, this.l());
      }
   }

   private tl l() {
      return tl.a("loading.progress", asb.a(this.b.e(), 0, 100));
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ac.b();
      if ($$4 - this.c > 2000L) {
         this.c = $$4;
         this.d(true);
      }

      int $$5 = this.g / 2;
      int $$6 = this.h / 2;
      int $$7 = 30;
      a($$0, this.b, $$5, $$6 + 30, 2, 0);
      $$0.a(this.i, this.l(), $$5, $$6 - 9 / 2 - 30, 16777215);
   }

   public static void a(erz $$0, alg $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$4 + $$5;
      int $$7 = $$1.c();
      int $$8 = $$7 * $$6 - $$5;
      int $$9 = $$1.d();
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
               dhe $$13x = $$1.a($$11x, $$12x);
               int $$14x = $$11 + $$11x * $$6;
               int $$15 = $$12 + $$12x * $$6;
               $$0.a($$14x, $$15, $$14x + $$4, $$15 + $$4, l.getInt($$13x) | 0xFF000000);
            }
         }
      });
   }
}

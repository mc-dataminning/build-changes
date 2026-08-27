import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class eyo extends ezd {
   private static final long a = 2000L;
   private final amd b;
   private long c = -1L;
   private boolean k;
   private static final Object2IntMap<dic> l = ac.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(dic.c, 5526612);
      $$0.put(dic.d, 10066329);
      $$0.put(dic.e, 6250897);
      $$0.put(dic.f, 8434258);
      $$0.put(dic.g, 13750737);
      $$0.put(dic.h, 7497737);
      $$0.put(dic.i, 3159410);
      $$0.put(dic.j, 2213376);
      $$0.put(dic.k, 13421772);
      $$0.put(dic.l, 16769184);
      $$0.put(dic.m, 15884384);
      $$0.put(dic.n, 16777215);
   });

   public eyo(amd $$0) {
      super(erg.a);
      this.b = $$0;
   }

   @Override
   public boolean aB_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void aD_() {
      this.k = true;
      this.d(true);
   }

   @Override
   protected void b(exc $$0) {
      if (this.k) {
         $$0.a(exb.a, ui.c("narrator.loading.done"));
      } else {
         $$0.a(exb.a, this.l());
      }
   }

   private ui l() {
      return ui.a("loading.progress", asy.a(this.b.e(), 0, 100));
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
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

   public static void a(esy $$0, amd $$1, int $$2, int $$3, int $$4, int $$5) {
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
               dic $$13x = $$1.a($$11x, $$12x);
               int $$14x = $$11 + $$11x * $$6;
               int $$15 = $$12 + $$12x * $$6;
               $$0.a($$14x, $$15, $$14x + $$4, $$15 + $$4, l.getInt($$13x) | 0xFF000000);
            }
         }
      });
   }
}

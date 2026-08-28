import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class ftf extends ftr {
   private static final long a = 2000L;
   private final asl b;
   private long c = -1L;
   private boolean d;
   private static final Object2IntMap<eak> s = ae.a(new Object2IntOpenHashMap(), $$0 -> {
      $$0.defaultReturnValue(0);
      $$0.put(eak.c, 5526612);
      $$0.put(eak.d, 10066329);
      $$0.put(eak.e, 6250897);
      $$0.put(eak.f, 8434258);
      $$0.put(eak.g, 13750737);
      $$0.put(eak.h, 7497737);
      $$0.put(eak.i, 3159410);
      $$0.put(eak.j, 2213376);
      $$0.put(eak.k, 13421772);
      $$0.put(eak.l, 16769184);
      $$0.put(eak.m, 15884384);
      $$0.put(eak.n, 16777215);
   });

   public ftf(asl $$0) {
      super(flq.a);
      this.b = $$0;
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void aJ_() {
      this.d = true;
      this.d(true);
   }

   @Override
   protected void b(frw $$0) {
      if (this.d) {
         $$0.a(frv.a, xk.c("narrator.loading.done"));
      } else {
         $$0.a(frv.a, this.l());
      }
   }

   private xk l() {
      return xk.a("loading.progress", azu.a(this.b.f(), 0, 100));
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      long $$4 = ae.c();
      if ($$4 - this.c > 2000L) {
         this.c = $$4;
         this.d(true);
      }

      int $$5 = this.n / 2;
      int $$6 = this.o / 2;
      a($$0, this.b, $$5, $$6, 2, 0);
      int $$7 = this.b.e() + 9 + 2;
      $$0.a(this.p, this.l(), $$5, $$6 - $$7, 16777215);
   }

   public static void a(fnl $$0, asl $$1, int $$2, int $$3, int $$4, int $$5) {
      int $$6 = $$4 + $$5;
      int $$7 = $$1.d();
      int $$8 = $$7 * $$6 - $$5;
      int $$9 = $$1.e();
      int $$10 = $$9 * $$6 - $$5;
      int $$11 = $$2 - $$10 / 2;
      int $$12 = $$3 - $$10 / 2;
      int $$13 = $$8 / 2 + 1;
      int $$14 = -16772609;
      if ($$5 != 0) {
         $$0.a($$2 - $$13, $$3 - $$13, $$2 - $$13 + 1, $$3 + $$13, -16772609);
         $$0.a($$2 + $$13 - 1, $$3 - $$13, $$2 + $$13, $$3 + $$13, -16772609);
         $$0.a($$2 - $$13, $$3 - $$13, $$2 + $$13, $$3 - $$13 + 1, -16772609);
         $$0.a($$2 - $$13, $$3 + $$13 - 1, $$2 + $$13, $$3 + $$13, -16772609);
      }

      for (int $$15 = 0; $$15 < $$9; $$15++) {
         for (int $$16 = 0; $$16 < $$9; $$16++) {
            eak $$17 = $$1.a($$15, $$16);
            int $$18 = $$11 + $$15 * $$6;
            int $$19 = $$12 + $$16 * $$6;
            $$0.a($$18, $$19, $$18 + $$4, $$19 + $$4, ayf.f(s.getInt($$17)));
         }
      }
   }
}

import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dir extends dgv implements dnx {
   public static final dur a = dmj.b;
   public static final dur b = dmj.c;
   public static final dur c = dmj.d;
   public static final dur d = dmj.e;
   public static final dur e = duq.C;
   protected static final Map<jj, dur> f = dmj.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ad.a());
   protected final eyx[] g;
   protected final eyx[] h;
   private final Object2IntMap<dua> i = new Object2IntOpenHashMap();

   protected dir(float $$0, float $$1, float $$2, float $$3, float $$4, dtz.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dua $$6 = (dua)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dir> a();

   protected eyx[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eyx $$9 = dgv.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eyx $$10 = dgv.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eyx $$11 = dgv.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eyx $$12 = dgv.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eyx $$13 = dgv.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eyx $$14 = eyu.a($$10, $$13);
      eyx $$15 = eyu.a($$11, $$12);
      eyx[] $$16 = new eyx[]{
         eyu.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eyu.a($$11, $$10),
         eyu.a($$12, $$10),
         eyu.a($$15, $$10),
         $$13,
         eyu.a($$11, $$13),
         eyu.a($$12, $$13),
         eyu.a($$15, $$13),
         $$14,
         eyu.a($$11, $$14),
         eyu.a($$12, $$14),
         eyu.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eyu.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dua $$0) {
      return !$$0.c(e);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jj $$0) {
      return 1 << $$0.e();
   }

   protected int h(dua $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jj.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jj.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jj.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jj.e);
         }

         return $$1;
      });
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(e) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class cun extends csv implements czw {
   public static final dga a = cyh.a;
   public static final dga b = cyh.b;
   public static final dga c = cyh.c;
   public static final dga d = cyh.d;
   public static final dga e = dfz.C;
   protected static final Map<ha, dga> f = cyh.g.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eig[] g;
   protected final eig[] h;
   private final Object2IntMap<dfj> i = new Object2IntOpenHashMap();

   protected cun(float $$0, float $$1, float $$2, float $$3, float $$4, dfi.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.C.a().iterator();

      while (var7.hasNext()) {
         dfj $$6 = (dfj)var7.next();
         this.g($$6);
      }
   }

   protected eig[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eig $$9 = csv.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eig $$10 = csv.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eig $$11 = csv.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eig $$12 = csv.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eig $$13 = csv.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eig $$14 = eid.a($$10, $$13);
      eig $$15 = eid.a($$11, $$12);
      eig[] $$16 = new eig[]{
         eid.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eid.a($$11, $$10),
         eid.a($$12, $$10),
         eid.a($$15, $$10),
         $$13,
         eid.a($$11, $$13),
         eid.a($$12, $$13),
         eid.a($$15, $$13),
         $$14,
         eid.a($$11, $$14),
         eid.a($$12, $$14),
         eid.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eid.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return !$$0.c(e);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ha $$0) {
      return 1 << $$0.e();
   }

   protected int g(dfj $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ha.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ha.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ha.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ha.e);
         }

         return $$1;
      });
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(e) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      switch ($$1) {
         case c:
            return $$0.a(a, $$0.c(c)).a(b, $$0.c(d)).a(c, $$0.c(a)).a(d, $$0.c(b));
         case d:
            return $$0.a(a, $$0.c(b)).a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(a));
         case b:
            return $$0.a(a, $$0.c(d)).a(b, $$0.c(a)).a(c, $$0.c(b)).a(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      switch ($$1) {
         case b:
            return $$0.a(a, $$0.c(c)).a(c, $$0.c(a));
         case c:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}

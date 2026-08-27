import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class cui extends csq implements czr {
   public static final dfv a = cyc.a;
   public static final dfv b = cyc.b;
   public static final dfv c = cyc.c;
   public static final dfv d = cyc.d;
   public static final dfv e = dfu.C;
   protected static final Map<hc, dfv> f = cyc.g.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eib[] g;
   protected final eib[] h;
   private final Object2IntMap<dfe> i = new Object2IntOpenHashMap();

   protected cui(float $$0, float $$1, float $$2, float $$3, float $$4, dfd.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.C.a().iterator();

      while (var7.hasNext()) {
         dfe $$6 = (dfe)var7.next();
         this.g($$6);
      }
   }

   protected eib[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eib $$9 = csq.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eib $$10 = csq.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eib $$11 = csq.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eib $$12 = csq.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eib $$13 = csq.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eib $$14 = ehy.a($$10, $$13);
      eib $$15 = ehy.a($$11, $$12);
      eib[] $$16 = new eib[]{
         ehy.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ehy.a($$11, $$10),
         ehy.a($$12, $$10),
         ehy.a($$15, $$10),
         $$13,
         ehy.a($$11, $$13),
         ehy.a($$12, $$13),
         ehy.a($$15, $$13),
         $$14,
         ehy.a($$11, $$14),
         ehy.a($$12, $$14),
         ehy.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ehy.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return !$$0.c(e);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(hc $$0) {
      return 1 << $$0.e();
   }

   protected int g(dfe $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(hc.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(hc.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(hc.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(hc.e);
         }

         return $$1;
      });
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(e) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
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
   public dfe a(dfe $$0, cxl $$1) {
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

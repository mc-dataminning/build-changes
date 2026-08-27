import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dao extends cys implements dfs {
   public static final dma a = def.b;
   public static final dma b = def.c;
   public static final dma c = def.d;
   public static final dma d = def.e;
   public static final dma e = dlz.C;
   protected static final Map<ie, dma> f = def.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eos[] g;
   protected final eos[] h;
   private final Object2IntMap<dlj> i = new Object2IntOpenHashMap();

   protected dao(float $$0, float $$1, float $$2, float $$3, float $$4, dli.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dlj $$6 = (dlj)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dao> a();

   protected eos[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eos $$9 = cys.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eos $$10 = cys.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eos $$11 = cys.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eos $$12 = cys.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eos $$13 = cys.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eos $$14 = eop.a($$10, $$13);
      eos $$15 = eop.a($$11, $$12);
      eos[] $$16 = new eos[]{
         eop.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eop.a($$11, $$10),
         eop.a($$12, $$10),
         eop.a($$15, $$10),
         $$13,
         eop.a($$11, $$13),
         eop.a($$12, $$13),
         eop.a($$15, $$13),
         $$14,
         eop.a($$11, $$14),
         eop.a($$12, $$14),
         eop.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eop.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return !$$0.c(e);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected eos b(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ie $$0) {
      return 1 << $$0.e();
   }

   protected int g(dlj $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ie.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ie.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ie.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ie.e);
         }

         return $$1;
      });
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(e) ? egx.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
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
   protected dlj a(dlj $$0, ddo $$1) {
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

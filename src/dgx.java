import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dgx extends dfb implements dmc {
   public static final dsv a = dkp.b;
   public static final dsv b = dkp.c;
   public static final dsv c = dkp.d;
   public static final dsv d = dkp.e;
   public static final dsv e = dsu.C;
   protected static final Map<je, dsv> f = dkp.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ewm[] g;
   protected final ewm[] h;
   private final Object2IntMap<dse> i = new Object2IntOpenHashMap();

   protected dgx(float $$0, float $$1, float $$2, float $$3, float $$4, dsd.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dse $$6 = (dse)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dgx> a();

   protected ewm[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ewm $$9 = dfb.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ewm $$10 = dfb.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ewm $$11 = dfb.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ewm $$12 = dfb.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ewm $$13 = dfb.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ewm $$14 = ewj.a($$10, $$13);
      ewm $$15 = ewj.a($$11, $$12);
      ewm[] $$16 = new ewm[]{
         ewj.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ewj.a($$11, $$10),
         ewj.a($$12, $$10),
         ewj.a($$15, $$10),
         $$13,
         ewj.a($$11, $$13),
         ewj.a($$12, $$13),
         ewj.a($$15, $$13),
         $$14,
         ewj.a($$11, $$14),
         ewj.a($$12, $$14),
         ewj.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ewj.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dse $$0, dbg $$1, iz $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ewm b(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(je $$0) {
      return 1 << $$0.e();
   }

   protected int g(dse $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(je.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(je.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(je.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(je.e);
         }

         return $$1;
      });
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(e) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
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
   protected dse a(dse $$0, djy $$1) {
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

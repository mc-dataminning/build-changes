import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dgt extends dex implements dly {
   public static final dsr a = dkl.b;
   public static final dsr b = dkl.c;
   public static final dsr c = dkl.d;
   public static final dsr d = dkl.e;
   public static final dsr e = dsq.C;
   protected static final Map<je, dsr> f = dkl.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ewi[] g;
   protected final ewi[] h;
   private final Object2IntMap<dsa> i = new Object2IntOpenHashMap();

   protected dgt(float $$0, float $$1, float $$2, float $$3, float $$4, drz.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dsa $$6 = (dsa)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dgt> a();

   protected ewi[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ewi $$9 = dex.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ewi $$10 = dex.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ewi $$11 = dex.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ewi $$12 = dex.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ewi $$13 = dex.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ewi $$14 = ewf.a($$10, $$13);
      ewi $$15 = ewf.a($$11, $$12);
      ewi[] $$16 = new ewi[]{
         ewf.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ewf.a($$11, $$10),
         ewf.a($$12, $$10),
         ewf.a($$15, $$10),
         $$13,
         ewf.a($$11, $$13),
         ewf.a($$12, $$13),
         ewf.a($$15, $$13),
         $$14,
         ewf.a($$11, $$14),
         ewf.a($$12, $$14),
         ewf.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ewf.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(je $$0) {
      return 1 << $$0.e();
   }

   protected int g(dsa $$0) {
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
   protected ent b_(dsa $$0) {
      return $$0.c(e) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
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
   protected dsa a(dsa $$0, dju $$1) {
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

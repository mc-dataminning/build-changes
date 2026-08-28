import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dgu extends dey implements dlz {
   public static final dss a = dkm.b;
   public static final dss b = dkm.c;
   public static final dss c = dkm.d;
   public static final dss d = dkm.e;
   public static final dss e = dsr.C;
   protected static final Map<je, dss> f = dkm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ewj[] g;
   protected final ewj[] h;
   private final Object2IntMap<dsb> i = new Object2IntOpenHashMap();

   protected dgu(float $$0, float $$1, float $$2, float $$3, float $$4, dsa.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dsb $$6 = (dsb)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dgu> a();

   protected ewj[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ewj $$9 = dey.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ewj $$10 = dey.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ewj $$11 = dey.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ewj $$12 = dey.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ewj $$13 = dey.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ewj $$14 = ewg.a($$10, $$13);
      ewj $$15 = ewg.a($$11, $$12);
      ewj[] $$16 = new ewj[]{
         ewg.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ewg.a($$11, $$10),
         ewg.a($$12, $$10),
         ewg.a($$15, $$10),
         $$13,
         ewg.a($$11, $$13),
         ewg.a($$12, $$13),
         ewg.a($$15, $$13),
         $$14,
         ewg.a($$11, $$14),
         ewg.a($$12, $$14),
         ewg.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ewg.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(je $$0) {
      return 1 << $$0.e();
   }

   protected int g(dsb $$0) {
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
   protected enu b_(dsb $$0) {
      return $$0.c(e) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
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
   protected dsb a(dsb $$0, djv $$1) {
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

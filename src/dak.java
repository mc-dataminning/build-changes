import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dak extends cyo implements dfo {
   public static final dlw a = deb.b;
   public static final dlw b = deb.c;
   public static final dlw c = deb.d;
   public static final dlw d = deb.e;
   public static final dlw e = dlv.C;
   protected static final Map<ie, dlw> f = deb.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eol[] g;
   protected final eol[] h;
   private final Object2IntMap<dlf> i = new Object2IntOpenHashMap();

   protected dak(float $$0, float $$1, float $$2, float $$3, float $$4, dle.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dlf $$6 = (dlf)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dak> a();

   protected eol[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eol $$9 = cyo.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eol $$10 = cyo.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eol $$11 = cyo.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eol $$12 = cyo.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eol $$13 = cyo.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eol $$14 = eoi.a($$10, $$13);
      eol $$15 = eoi.a($$11, $$12);
      eol[] $$16 = new eol[]{
         eoi.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eoi.a($$11, $$10),
         eoi.a($$12, $$10),
         eoi.a($$15, $$10),
         $$13,
         eoi.a($$11, $$13),
         eoi.a($$12, $$13),
         eoi.a($$15, $$13),
         $$14,
         eoi.a($$11, $$14),
         eoi.a($$12, $$14),
         eoi.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eoi.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dlf $$0, cut $$1, hz $$2) {
      return !$$0.c(e);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ie $$0) {
      return 1 << $$0.e();
   }

   protected int g(dlf $$0) {
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
   protected egp c_(dlf $$0) {
      return $$0.c(e) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
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
   protected dlf a(dlf $$0, ddk $$1) {
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

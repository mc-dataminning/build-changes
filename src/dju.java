import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dju extends dhy implements doz {
   public static final dvu a = dnl.b;
   public static final dvu b = dnl.c;
   public static final dvu c = dnl.d;
   public static final dvu d = dnl.e;
   public static final dvu e = dvt.C;
   protected static final Map<jl, dvu> f = dnl.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ad.a());
   protected final fab[] g;
   protected final fab[] h;
   private final Object2IntMap<dvd> i = new Object2IntOpenHashMap();

   protected dju(float $$0, float $$1, float $$2, float $$3, float $$4, dvc.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dvd $$6 = (dvd)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dju> a();

   protected fab[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fab $$9 = dhy.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fab $$10 = dhy.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fab $$11 = dhy.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fab $$12 = dhy.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fab $$13 = dhy.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fab $$14 = ezy.a($$10, $$13);
      fab $$15 = ezy.a($$11, $$12);
      fab[] $$16 = new fab[]{
         ezy.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ezy.a($$11, $$10),
         ezy.a($$12, $$10),
         ezy.a($$15, $$10),
         $$13,
         ezy.a($$11, $$13),
         ezy.a($$12, $$13),
         ezy.a($$15, $$13),
         $$14,
         ezy.a($$11, $$14),
         ezy.a($$12, $$14),
         ezy.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ezy.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dvd $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jl $$0) {
      return 1 << $$0.e();
   }

   protected int h(dvd $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jl.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jl.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jl.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jl.e);
         }

         return $$1;
      });
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(e) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
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
   protected dvd a(dvd $$0, dmu $$1) {
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

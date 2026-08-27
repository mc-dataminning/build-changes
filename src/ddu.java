import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class ddu extends dby implements diy {
   public static final dpq a = dhl.b;
   public static final dpq b = dhl.c;
   public static final dpq c = dhl.d;
   public static final dpq d = dhl.e;
   public static final dpq e = dpp.C;
   protected static final Map<ih, dpq> f = dhl.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final est[] g;
   protected final est[] h;
   private final Object2IntMap<doz> i = new Object2IntOpenHashMap();

   protected ddu(float $$0, float $$1, float $$2, float $$3, float $$4, doy.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         doz $$6 = (doz)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends ddu> a();

   protected est[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      est $$9 = dby.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      est $$10 = dby.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      est $$11 = dby.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      est $$12 = dby.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      est $$13 = dby.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      est $$14 = esq.a($$10, $$13);
      est $$15 = esq.a($$11, $$12);
      est[] $$16 = new est[]{
         esq.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         esq.a($$11, $$10),
         esq.a($$12, $$10),
         esq.a($$15, $$10),
         $$13,
         esq.a($$11, $$13),
         esq.a($$12, $$13),
         esq.a($$15, $$13),
         $$14,
         esq.a($$11, $$14),
         esq.a($$12, $$14),
         esq.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = esq.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(doz $$0, cyd $$1, ib $$2) {
      return !$$0.c(e);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ih $$0) {
      return 1 << $$0.e();
   }

   protected int g(doz $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ih.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ih.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ih.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ih.e);
         }

         return $$1;
      });
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(e) ? ekt.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
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
   protected doz a(doz $$0, dgu $$1) {
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

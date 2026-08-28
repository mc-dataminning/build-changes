import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dhs extends dfw implements dmy {
   public static final dtr a = dlk.b;
   public static final dtr b = dlk.c;
   public static final dtr c = dlk.d;
   public static final dtr d = dlk.e;
   public static final dtr e = dtq.C;
   protected static final Map<ji, dtr> f = dlk.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ad.a());
   protected final exp[] g;
   protected final exp[] h;
   private final Object2IntMap<dta> i = new Object2IntOpenHashMap();

   protected dhs(float $$0, float $$1, float $$2, float $$3, float $$4, dsz.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dta $$6 = (dta)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dhs> a();

   protected exp[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      exp $$9 = dfw.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      exp $$10 = dfw.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      exp $$11 = dfw.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      exp $$12 = dfw.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      exp $$13 = dfw.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      exp $$14 = exm.a($$10, $$13);
      exp $$15 = exm.a($$11, $$12);
      exp[] $$16 = new exp[]{
         exm.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         exm.a($$11, $$10),
         exm.a($$12, $$10),
         exm.a($$15, $$10),
         $$13,
         exm.a($$11, $$13),
         exm.a($$12, $$13),
         exm.a($$15, $$13),
         $$14,
         exm.a($$11, $$14),
         exm.a($$12, $$14),
         exm.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = exm.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dta $$0, dca $$1, jd $$2) {
      return !$$0.c(e);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ji $$0) {
      return 1 << $$0.e();
   }

   protected int g(dta $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ji.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ji.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ji.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ji.e);
         }

         return $$1;
      });
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(e) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
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
   protected dta a(dta $$0, dkt $$1) {
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

import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cxb extends cvf implements dcf {
   public static final die a = das.b;
   public static final die b = das.c;
   public static final die c = das.d;
   public static final die d = das.e;
   public static final die e = did.C;
   protected static final Map<ib, die> f = das.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eks[] g;
   protected final eks[] h;
   private final Object2IntMap<dhn> i = new Object2IntOpenHashMap();

   protected cxb(float $$0, float $$1, float $$2, float $$3, float $$4, dhm.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dhn $$6 = (dhn)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cxb> a();

   protected eks[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eks $$9 = cvf.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eks $$10 = cvf.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eks $$11 = cvf.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eks $$12 = cvf.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eks $$13 = cvf.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eks $$14 = ekp.a($$10, $$13);
      eks $$15 = ekp.a($$11, $$12);
      eks[] $$16 = new eks[]{
         ekp.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ekp.a($$11, $$10),
         ekp.a($$12, $$10),
         ekp.a($$15, $$10),
         $$13,
         ekp.a($$11, $$13),
         ekp.a($$12, $$13),
         ekp.a($$15, $$13),
         $$14,
         ekp.a($$11, $$14),
         ekp.a($$12, $$14),
         ekp.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ekp.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return !$$0.c(e);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ib $$0) {
      return 1 << $$0.e();
   }

   protected int g(dhn $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ib.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ib.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ib.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ib.e);
         }

         return $$1;
      });
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(e) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
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
   public dhn a(dhn $$0, dab $$1) {
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

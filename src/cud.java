import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class cud extends csl implements czm {
   public static final dfq a = cxx.a;
   public static final dfq b = cxx.b;
   public static final dfq c = cxx.c;
   public static final dfq d = cxx.d;
   public static final dfq e = dfp.C;
   protected static final Map<ha, dfq> f = cxx.g.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ehw[] g;
   protected final ehw[] h;
   private final Object2IntMap<dez> i = new Object2IntOpenHashMap();

   protected cud(float $$0, float $$1, float $$2, float $$3, float $$4, dey.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.C.a().iterator();

      while (var7.hasNext()) {
         dez $$6 = (dez)var7.next();
         this.g($$6);
      }
   }

   protected ehw[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ehw $$9 = csl.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ehw $$10 = csl.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ehw $$11 = csl.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ehw $$12 = csl.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ehw $$13 = csl.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ehw $$14 = eht.a($$10, $$13);
      ehw $$15 = eht.a($$11, $$12);
      ehw[] $$16 = new ehw[]{
         eht.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eht.a($$11, $$10),
         eht.a($$12, $$10),
         eht.a($$15, $$10),
         $$13,
         eht.a($$11, $$13),
         eht.a($$12, $$13),
         eht.a($$15, $$13),
         $$14,
         eht.a($$11, $$14),
         eht.a($$12, $$14),
         eht.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eht.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dez $$0, cor $$1, gu $$2) {
      return !$$0.c(e);
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ha $$0) {
      return 1 << $$0.e();
   }

   protected int g(dez $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ha.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ha.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ha.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ha.e);
         }

         return $$1;
      });
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(e) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
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
   public dez a(dez $$0, cxg $$1) {
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

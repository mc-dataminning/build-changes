import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dkf extends dij implements dpk {
   public static final dwf a = dnw.b;
   public static final dwf b = dnw.c;
   public static final dwf c = dnw.d;
   public static final dwf d = dnw.e;
   public static final dwf e = dwe.C;
   protected static final Map<jm, dwf> f = dnw.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ae.a());
   protected final fal[] g;
   protected final fal[] h;
   private final Object2IntMap<dvo> i = new Object2IntOpenHashMap();

   protected dkf(float $$0, float $$1, float $$2, float $$3, float $$4, dvn.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dvo $$6 = (dvo)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dkf> a();

   protected fal[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fal $$9 = dij.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fal $$10 = dij.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fal $$11 = dij.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fal $$12 = dij.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fal $$13 = dij.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fal $$14 = fai.a($$10, $$13);
      fal $$15 = fai.a($$11, $$12);
      fal[] $$16 = new fal[]{
         fai.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fai.a($$11, $$10),
         fai.a($$12, $$10),
         fai.a($$15, $$10),
         $$13,
         fai.a($$11, $$13),
         fai.a($$12, $$13),
         fai.a($$15, $$13),
         $$14,
         fai.a($$11, $$14),
         fai.a($$12, $$14),
         fai.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fai.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dvo $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jm $$0) {
      return 1 << $$0.e();
   }

   protected int h(dvo $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jm.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jm.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jm.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jm.e);
         }

         return $$1;
      });
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(e) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
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
   protected dvo a(dvo $$0, dnf $$1) {
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

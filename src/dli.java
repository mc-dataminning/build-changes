import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dli extends djl implements dqr {
   public static final dxn a = dpd.b;
   public static final dxn b = dpd.c;
   public static final dxn c = dpd.d;
   public static final dxn d = dpd.e;
   public static final dxn e = dxm.J;
   protected static final Map<jn, dxn> f = dpd.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   protected final fbt[] g;
   protected final fbt[] h;
   private final Object2IntMap<dww> i = new Object2IntOpenHashMap();

   protected dli(float $$0, float $$1, float $$2, float $$3, float $$4, dwv.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dww $$6 = (dww)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dli> a();

   protected fbt[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fbt $$9 = djl.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fbt $$10 = djl.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fbt $$11 = djl.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fbt $$12 = djl.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fbt $$13 = djl.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fbt $$14 = fbq.a($$10, $$13);
      fbt $$15 = fbq.a($$11, $$12);
      fbt[] $$16 = new fbt[]{
         fbq.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fbq.a($$11, $$10),
         fbq.a($$12, $$10),
         fbq.a($$15, $$10),
         $$13,
         fbq.a($$11, $$13),
         fbq.a($$12, $$13),
         fbq.a($$15, $$13),
         $$14,
         fbq.a($$11, $$14),
         fbq.a($$12, $$14),
         fbq.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fbq.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dww $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jn $$0) {
      return 1 << $$0.e();
   }

   protected int h(dww $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jn.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jn.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jn.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jn.e);
         }

         return $$1;
      });
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(e) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
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
   protected dww a(dww $$0, dok $$1) {
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

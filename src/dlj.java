import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dlj extends djm implements dqs {
   public static final dxo a = dpe.b;
   public static final dxo b = dpe.c;
   public static final dxo c = dpe.d;
   public static final dxo d = dpe.e;
   public static final dxo e = dxn.J;
   protected static final Map<jn, dxo> f = dpe.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   protected final fbu[] g;
   protected final fbu[] h;
   private final Object2IntMap<dwx> i = new Object2IntOpenHashMap();

   protected dlj(float $$0, float $$1, float $$2, float $$3, float $$4, dww.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dwx $$6 = (dwx)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dlj> a();

   protected fbu[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fbu $$9 = djm.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fbu $$10 = djm.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fbu $$11 = djm.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fbu $$12 = djm.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fbu $$13 = djm.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fbu $$14 = fbr.a($$10, $$13);
      fbu $$15 = fbr.a($$11, $$12);
      fbu[] $$16 = new fbu[]{
         fbr.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fbr.a($$11, $$10),
         fbr.a($$12, $$10),
         fbr.a($$15, $$10),
         $$13,
         fbr.a($$11, $$13),
         fbr.a($$12, $$13),
         fbr.a($$15, $$13),
         $$14,
         fbr.a($$11, $$14),
         fbr.a($$12, $$14),
         fbr.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fbr.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dwx $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jn $$0) {
      return 1 << $$0.e();
   }

   protected int h(dwx $$0) {
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
   protected esz b_(dwx $$0) {
      return $$0.c(e) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
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
   protected dwx a(dwx $$0, dol $$1) {
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

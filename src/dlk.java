import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dlk extends djn implements dqt {
   public static final dxp a = dpf.b;
   public static final dxp b = dpf.c;
   public static final dxp c = dpf.d;
   public static final dxp d = dpf.e;
   public static final dxp e = dxo.J;
   protected static final Map<jn, dxp> f = dpf.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   protected final fbv[] g;
   protected final fbv[] h;
   private final Object2IntMap<dwy> i = new Object2IntOpenHashMap();

   protected dlk(float $$0, float $$1, float $$2, float $$3, float $$4, dwx.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dwy $$6 = (dwy)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dlk> a();

   protected fbv[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fbv $$9 = djn.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fbv $$10 = djn.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fbv $$11 = djn.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fbv $$12 = djn.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fbv $$13 = djn.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fbv $$14 = fbs.a($$10, $$13);
      fbv $$15 = fbs.a($$11, $$12);
      fbv[] $$16 = new fbv[]{
         fbs.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fbs.a($$11, $$10),
         fbs.a($$12, $$10),
         fbs.a($$15, $$10),
         $$13,
         fbs.a($$11, $$13),
         fbs.a($$12, $$13),
         fbs.a($$15, $$13),
         $$14,
         fbs.a($$11, $$14),
         fbs.a($$12, $$14),
         fbs.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fbs.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dwy $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jn $$0) {
      return 1 << $$0.e();
   }

   protected int h(dwy $$0) {
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
   protected eta b_(dwy $$0) {
      return $$0.c(e) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
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
   protected dwy a(dwy $$0, dom $$1) {
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

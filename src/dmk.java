import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dmk extends dkm implements drq {
   public static final dym a = dqc.b;
   public static final dym b = dqc.c;
   public static final dym c = dqc.d;
   public static final dym d = dqc.e;
   public static final dym e = dyl.D;
   protected static final Map<jm, dym> f = dqc.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ae.a());
   protected final fcs[] g;
   protected final fcs[] h;
   private final Object2IntMap<dxv> i = new Object2IntOpenHashMap();

   protected dmk(float $$0, float $$1, float $$2, float $$3, float $$4, dxu.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dxv $$6 = (dxv)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dmk> a();

   protected fcs[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fcs $$9 = dkm.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fcs $$10 = dkm.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fcs $$11 = dkm.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fcs $$12 = dkm.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fcs $$13 = dkm.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fcs $$14 = fcp.a($$10, $$13);
      fcs $$15 = fcp.a($$11, $$12);
      fcs[] $$16 = new fcs[]{
         fcp.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fcp.a($$11, $$10),
         fcp.a($$12, $$10),
         fcp.a($$15, $$10),
         $$13,
         fcp.a($$11, $$13),
         fcp.a($$12, $$13),
         fcp.a($$15, $$13),
         $$14,
         fcp.a($$11, $$14),
         fcp.a($$12, $$14),
         fcp.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fcp.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dxv $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jm $$0) {
      return 1 << $$0.e();
   }

   protected int h(dxv $$0) {
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
   protected etx b_(dxv $$0) {
      return $$0.c(e) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
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
   protected dxv a(dxv $$0, dpl $$1) {
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

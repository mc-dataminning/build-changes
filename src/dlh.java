import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dlh extends djk implements dqq {
   public static final dxm a = dpc.b;
   public static final dxm b = dpc.c;
   public static final dxm c = dpc.d;
   public static final dxm d = dpc.e;
   public static final dxm e = dxl.J;
   protected static final Map<jn, dxm> f = dpc.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(af.a());
   protected final fbs[] g;
   protected final fbs[] h;
   private final Object2IntMap<dwv> i = new Object2IntOpenHashMap();

   protected dlh(float $$0, float $$1, float $$2, float $$3, float $$4, dwu.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dwv $$6 = (dwv)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dlh> a();

   protected fbs[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fbs $$9 = djk.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fbs $$10 = djk.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fbs $$11 = djk.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fbs $$12 = djk.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fbs $$13 = djk.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fbs $$14 = fbp.a($$10, $$13);
      fbs $$15 = fbp.a($$11, $$12);
      fbs[] $$16 = new fbs[]{
         fbp.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fbp.a($$11, $$10),
         fbp.a($$12, $$10),
         fbp.a($$15, $$10),
         $$13,
         fbp.a($$11, $$13),
         fbp.a($$12, $$13),
         fbp.a($$15, $$13),
         $$14,
         fbp.a($$11, $$14),
         fbp.a($$12, $$14),
         fbp.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fbp.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dwv $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jn $$0) {
      return 1 << $$0.e();
   }

   protected int h(dwv $$0) {
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
   protected esx b_(dwv $$0) {
      return $$0.c(e) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
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
   protected dwv a(dwv $$0, doj $$1) {
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

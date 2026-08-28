import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dmj extends dkl implements drp {
   public static final dyl a = dqb.b;
   public static final dyl b = dqb.c;
   public static final dyl c = dqb.d;
   public static final dyl d = dqb.e;
   public static final dyl e = dyk.D;
   protected static final Map<jm, dyl> f = dqb.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ae.a());
   protected final fcr[] g;
   protected final fcr[] h;
   private final Object2IntMap<dxu> i = new Object2IntOpenHashMap();

   protected dmj(float $$0, float $$1, float $$2, float $$3, float $$4, dxt.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dxu $$6 = (dxu)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dmj> a();

   protected fcr[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fcr $$9 = dkl.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fcr $$10 = dkl.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fcr $$11 = dkl.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fcr $$12 = dkl.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fcr $$13 = dkl.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fcr $$14 = fco.a($$10, $$13);
      fcr $$15 = fco.a($$11, $$12);
      fcr[] $$16 = new fcr[]{
         fco.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fco.a($$11, $$10),
         fco.a($$12, $$10),
         fco.a($$15, $$10),
         $$13,
         fco.a($$11, $$13),
         fco.a($$12, $$13),
         fco.a($$15, $$13),
         $$14,
         fco.a($$11, $$14),
         fco.a($$12, $$14),
         fco.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fco.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dxu $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fcr b(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jm $$0) {
      return 1 << $$0.e();
   }

   protected int h(dxu $$0) {
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
   protected etw b_(dxu $$0) {
      return $$0.c(e) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
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
   protected dxu a(dxu $$0, dpk $$1) {
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

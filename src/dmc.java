import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dmc extends dke implements dri {
   public static final dye a = dpu.b;
   public static final dye b = dpu.c;
   public static final dye c = dpu.d;
   public static final dye d = dpu.e;
   public static final dye e = dyd.D;
   protected static final Map<jm, dye> f = dpu.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ae.a());
   protected final fcm[] g;
   protected final fcm[] h;
   private final Object2IntMap<dxn> i = new Object2IntOpenHashMap();

   protected dmc(float $$0, float $$1, float $$2, float $$3, float $$4, dxm.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dxn $$6 = (dxn)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dmc> a();

   protected fcm[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      fcm $$9 = dke.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      fcm $$10 = dke.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      fcm $$11 = dke.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      fcm $$12 = dke.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      fcm $$13 = dke.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      fcm $$14 = fcj.a($$10, $$13);
      fcm $$15 = fcj.a($$11, $$12);
      fcm[] $$16 = new fcm[]{
         fcj.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         fcj.a($$11, $$10),
         fcj.a($$12, $$10),
         fcj.a($$15, $$10),
         $$13,
         fcj.a($$11, $$13),
         fcj.a($$12, $$13),
         fcj.a($$15, $$13),
         $$14,
         fcj.a($$11, $$14),
         fcj.a($$12, $$14),
         fcj.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = fcj.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dxn $$0) {
      return !$$0.c(e);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected fcm b(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jm $$0) {
      return 1 << $$0.e();
   }

   protected int h(dxn $$0) {
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
   protected etp b_(dxn $$0) {
      return $$0.c(e) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
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
   protected dxn a(dxn $$0, dpd $$1) {
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

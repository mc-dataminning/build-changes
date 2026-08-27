import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cwo extends cut implements dbt {
   public static final dhn a = dag.b;
   public static final dhn b = dag.c;
   public static final dhn c = dag.d;
   public static final dhn d = dag.e;
   public static final dhn e = dhm.C;
   protected static final Map<hx, dhn> f = dag.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ekb[] g;
   protected final ekb[] h;
   private final Object2IntMap<dgw> i = new Object2IntOpenHashMap();

   protected cwo(float $$0, float $$1, float $$2, float $$3, float $$4, dgv.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dgw $$6 = (dgw)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cwo> a();

   protected ekb[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ekb $$9 = cut.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ekb $$10 = cut.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ekb $$11 = cut.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ekb $$12 = cut.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ekb $$13 = cut.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ekb $$14 = ejy.a($$10, $$13);
      ekb $$15 = ejy.a($$11, $$12);
      ekb[] $$16 = new ekb[]{
         ejy.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ejy.a($$11, $$10),
         ejy.a($$12, $$10),
         ejy.a($$15, $$10),
         $$13,
         ejy.a($$11, $$13),
         ejy.a($$12, $$13),
         ejy.a($$15, $$13),
         $$14,
         ejy.a($$11, $$14),
         ejy.a($$12, $$14),
         ejy.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ejy.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dgw $$0, cqy $$1, ht $$2) {
      return !$$0.c(e);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(hx $$0) {
      return 1 << $$0.e();
   }

   protected int g(dgw $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(hx.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(hx.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(hx.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(hx.e);
         }

         return $$1;
      });
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(e) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
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
   public dgw a(dgw $$0, czp $$1) {
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

import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dbw extends daa implements dha {
   public static final dnq a = dfn.b;
   public static final dnq b = dfn.c;
   public static final dnq c = dfn.d;
   public static final dnq d = dfn.e;
   public static final dnq e = dnp.C;
   protected static final Map<ih, dnq> f = dfn.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eqk[] g;
   protected final eqk[] h;
   private final Object2IntMap<dmz> i = new Object2IntOpenHashMap();

   protected dbw(float $$0, float $$1, float $$2, float $$3, float $$4, dmy.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dmz $$6 = (dmz)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dbw> a();

   protected eqk[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eqk $$9 = daa.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eqk $$10 = daa.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eqk $$11 = daa.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eqk $$12 = daa.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eqk $$13 = daa.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eqk $$14 = eqh.a($$10, $$13);
      eqk $$15 = eqh.a($$11, $$12);
      eqk[] $$16 = new eqk[]{
         eqh.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eqh.a($$11, $$10),
         eqh.a($$12, $$10),
         eqh.a($$15, $$10),
         $$13,
         eqh.a($$11, $$13),
         eqh.a($$12, $$13),
         eqh.a($$15, $$13),
         $$14,
         eqh.a($$11, $$14),
         eqh.a($$12, $$14),
         eqh.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eqh.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dmz $$0, cwf $$1, ib $$2) {
      return !$$0.c(e);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ih $$0) {
      return 1 << $$0.e();
   }

   protected int g(dmz $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ih.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ih.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ih.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ih.e);
         }

         return $$1;
      });
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(e) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
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
   protected dmz a(dmz $$0, dew $$1) {
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

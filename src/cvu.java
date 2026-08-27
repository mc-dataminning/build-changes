import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cvu extends cua implements daz {
   public static final dgs a = czm.b;
   public static final dgs b = czm.c;
   public static final dgs c = czm.d;
   public static final dgs d = czm.e;
   public static final dgs e = dgr.C;
   protected static final Map<hx, dgs> f = czm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eiy[] g;
   protected final eiy[] h;
   private final Object2IntMap<dgb> i = new Object2IntOpenHashMap();

   protected cvu(float $$0, float $$1, float $$2, float $$3, float $$4, dga.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dgb $$6 = (dgb)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cvu> a();

   protected eiy[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eiy $$9 = cua.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eiy $$10 = cua.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eiy $$11 = cua.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eiy $$12 = cua.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eiy $$13 = cua.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eiy $$14 = eiv.a($$10, $$13);
      eiy $$15 = eiv.a($$11, $$12);
      eiy[] $$16 = new eiy[]{
         eiv.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eiv.a($$11, $$10),
         eiv.a($$12, $$10),
         eiv.a($$15, $$10),
         $$13,
         eiv.a($$11, $$13),
         eiv.a($$12, $$13),
         eiv.a($$15, $$13),
         $$14,
         eiv.a($$11, $$14),
         eiv.a($$12, $$14),
         eiv.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eiv.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dgb $$0, cqf $$1, ht $$2) {
      return !$$0.c(e);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(hx $$0) {
      return 1 << $$0.e();
   }

   protected int g(dgb $$0) {
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
   public ebe c_(dgb $$0) {
      return $$0.c(e) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
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
   public dgb a(dgb $$0, cyv $$1) {
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

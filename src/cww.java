import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cww extends cva implements dca {
   public static final dhz a = dan.b;
   public static final dhz b = dan.c;
   public static final dhz c = dan.d;
   public static final dhz d = dan.e;
   public static final dhz e = dhy.C;
   protected static final Map<hx, dhz> f = dan.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ekn[] g;
   protected final ekn[] h;
   private final Object2IntMap<dhi> i = new Object2IntOpenHashMap();

   protected cww(float $$0, float $$1, float $$2, float $$3, float $$4, dhh.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dhi $$6 = (dhi)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cww> a();

   protected ekn[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ekn $$9 = cva.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ekn $$10 = cva.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ekn $$11 = cva.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ekn $$12 = cva.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ekn $$13 = cva.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ekn $$14 = ekk.a($$10, $$13);
      ekn $$15 = ekk.a($$11, $$12);
      ekn[] $$16 = new ekn[]{
         ekk.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ekk.a($$11, $$10),
         ekk.a($$12, $$10),
         ekk.a($$15, $$10),
         $$13,
         ekk.a($$11, $$13),
         ekk.a($$12, $$13),
         ekk.a($$15, $$13),
         $$14,
         ekk.a($$11, $$14),
         ekk.a($$12, $$14),
         ekk.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ekk.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return !$$0.c(e);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(hx $$0) {
      return 1 << $$0.e();
   }

   protected int g(dhi $$0) {
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
   public ecs c_(dhi $$0) {
      return $$0.c(e) ? ect.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
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
   public dhi a(dhi $$0, czw $$1) {
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

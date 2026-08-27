import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cyf extends cwj implements ddj {
   public static final djr a = dbw.b;
   public static final djr b = dbw.c;
   public static final djr c = dbw.d;
   public static final djr d = dbw.e;
   public static final djr e = djq.C;
   protected static final Map<ic, djr> f = dbw.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final emf[] g;
   protected final emf[] h;
   private final Object2IntMap<dja> i = new Object2IntOpenHashMap();

   protected cyf(float $$0, float $$1, float $$2, float $$3, float $$4, diz.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dja $$6 = (dja)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cyf> a();

   protected emf[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      emf $$9 = cwj.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      emf $$10 = cwj.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      emf $$11 = cwj.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      emf $$12 = cwj.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      emf $$13 = cwj.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      emf $$14 = emc.a($$10, $$13);
      emf $$15 = emc.a($$11, $$12);
      emf[] $$16 = new emf[]{
         emc.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         emc.a($$11, $$10),
         emc.a($$12, $$10),
         emc.a($$15, $$10),
         $$13,
         emc.a($$11, $$13),
         emc.a($$12, $$13),
         emc.a($$15, $$13),
         $$14,
         emc.a($$11, $$14),
         emc.a($$12, $$14),
         emc.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = emc.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(dja $$0, cso $$1, hx $$2) {
      return !$$0.c(e);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ic $$0) {
      return 1 << $$0.e();
   }

   protected int g(dja $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ic.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ic.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ic.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ic.e);
         }

         return $$1;
      });
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(e) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
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
   public dja a(dja $$0, dbf $$1) {
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

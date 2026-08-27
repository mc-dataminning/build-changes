import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cxv extends cvz implements dcz {
   public static final djg a = dbm.b;
   public static final djg b = dbm.c;
   public static final djg c = dbm.d;
   public static final djg d = dbm.e;
   public static final djg e = djf.C;
   protected static final Map<ia, djg> f = dbm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final elu[] g;
   protected final elu[] h;
   private final Object2IntMap<dip> i = new Object2IntOpenHashMap();

   protected cxv(float $$0, float $$1, float $$2, float $$3, float $$4, dio.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dip $$6 = (dip)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cxv> a();

   protected elu[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      elu $$9 = cvz.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      elu $$10 = cvz.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      elu $$11 = cvz.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      elu $$12 = cvz.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      elu $$13 = cvz.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      elu $$14 = elr.a($$10, $$13);
      elu $$15 = elr.a($$11, $$12);
      elu[] $$16 = new elu[]{
         elr.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         elr.a($$11, $$10),
         elr.a($$12, $$10),
         elr.a($$15, $$10),
         $$13,
         elr.a($$11, $$13),
         elr.a($$12, $$13),
         elr.a($$15, $$13),
         $$14,
         elr.a($$11, $$14),
         elr.a($$12, $$14),
         elr.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = elr.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean a_(dip $$0, cse $$1, hv $$2) {
      return !$$0.c(e);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ia $$0) {
      return 1 << $$0.e();
   }

   protected int g(dip $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ia.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ia.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ia.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ia.e);
         }

         return $$1;
      });
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(e) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
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
   public dip a(dip $$0, dav $$1) {
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

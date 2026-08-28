import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dhu extends dfy implements dna {
   public static final dtt a = dlm.b;
   public static final dtt b = dlm.c;
   public static final dtt c = dlm.d;
   public static final dtt d = dlm.e;
   public static final dtt e = dts.C;
   protected static final Map<ji, dtt> f = dlm.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ad.a());
   protected final ext[] g;
   protected final ext[] h;
   private final Object2IntMap<dtc> i = new Object2IntOpenHashMap();

   protected dhu(float $$0, float $$1, float $$2, float $$3, float $$4, dtb.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dtc $$6 = (dtc)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dhu> a();

   protected ext[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ext $$9 = dfy.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ext $$10 = dfy.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ext $$11 = dfy.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ext $$12 = dfy.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ext $$13 = dfy.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ext $$14 = exq.a($$10, $$13);
      ext $$15 = exq.a($$11, $$12);
      ext[] $$16 = new ext[]{
         exq.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         exq.a($$11, $$10),
         exq.a($$12, $$10),
         exq.a($$15, $$10),
         $$13,
         exq.a($$11, $$13),
         exq.a($$12, $$13),
         exq.a($$15, $$13),
         $$14,
         exq.a($$11, $$14),
         exq.a($$12, $$14),
         exq.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = exq.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dtc $$0, dcc $$1, jd $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ext b(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ji $$0) {
      return 1 << $$0.e();
   }

   protected int g(dtc $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ji.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ji.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ji.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ji.e);
         }

         return $$1;
      });
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(e) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
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
   protected dtc a(dtc $$0, dkv $$1) {
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

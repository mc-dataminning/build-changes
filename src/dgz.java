import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dgz extends dfc implements dmr {
   public static final dtt a = dkw.b;
   public static final dtt b = dkw.c;
   public static final dtt c = dkw.d;
   public static final dtt d = dkw.e;
   public static final dtt e = dts.C;
   protected static final Map<iw, dtt> f = dkw.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ad.a());
   protected final exn[] g;
   protected final exn[] h;
   private final Object2IntMap<dtc> i = new Object2IntOpenHashMap();

   protected dgz(float $$0, float $$1, float $$2, float $$3, float $$4, dtb.d $$5) {
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
   protected abstract MapCodec<? extends dgz> a();

   protected exn[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      exn $$9 = dfc.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      exn $$10 = dfc.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      exn $$11 = dfc.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      exn $$12 = dfc.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      exn $$13 = dfc.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      exn $$14 = exk.a($$10, $$13);
      exn $$15 = exk.a($$11, $$12);
      exn[] $$16 = new exn[]{
         exk.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         exk.a($$11, $$10),
         exk.a($$12, $$10),
         exk.a($$15, $$10),
         $$13,
         exk.a($$11, $$13),
         exk.a($$12, $$13),
         exk.a($$15, $$13),
         $$14,
         exk.a($$11, $$14),
         exk.a($$12, $$14),
         exk.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = exk.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dtc $$0, dbg $$1, ir $$2) {
      return !$$0.c(e);
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected exn b(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(iw $$0) {
      return 1 << $$0.e();
   }

   protected int g(dtc $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(iw.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(iw.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(iw.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(iw.e);
         }

         return $$1;
      });
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(e) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
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
   protected dtc a(dtc $$0, dke $$1) {
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

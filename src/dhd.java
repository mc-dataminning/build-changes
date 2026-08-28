import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dhd extends dfh implements dmi {
   public static final dtb a = dkv.b;
   public static final dtb b = dkv.c;
   public static final dtb c = dkv.d;
   public static final dtb d = dkv.e;
   public static final dtb e = dta.C;
   protected static final Map<jf, dtb> f = dkv.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ewy[] g;
   protected final ewy[] h;
   private final Object2IntMap<dsk> i = new Object2IntOpenHashMap();

   protected dhd(float $$0, float $$1, float $$2, float $$3, float $$4, dsj.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dsk $$6 = (dsk)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dhd> a();

   protected ewy[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ewy $$9 = dfh.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ewy $$10 = dfh.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ewy $$11 = dfh.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ewy $$12 = dfh.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ewy $$13 = dfh.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ewy $$14 = ewv.a($$10, $$13);
      ewy $$15 = ewv.a($$11, $$12);
      ewy[] $$16 = new ewy[]{
         ewv.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ewv.a($$11, $$10),
         ewv.a($$12, $$10),
         ewv.a($$15, $$10),
         $$13,
         ewv.a($$11, $$13),
         ewv.a($$12, $$13),
         ewv.a($$15, $$13),
         $$14,
         ewv.a($$11, $$14),
         ewv.a($$12, $$14),
         ewv.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ewv.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return !$$0.c(e);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(jf $$0) {
      return 1 << $$0.e();
   }

   protected int g(dsk $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jf.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jf.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jf.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jf.e);
         }

         return $$1;
      });
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(e) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
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
   protected dsk a(dsk $$0, dke $$1) {
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

import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class cuw extends ctc implements dab {
   public static final dfu a = cyo.b;
   public static final dfu b = cyo.c;
   public static final dfu c = cyo.d;
   public static final dfu d = cyo.e;
   public static final dfu e = dft.C;
   protected static final Map<ha, dfu> f = cyo.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eia[] g;
   protected final eia[] h;
   private final Object2IntMap<dfd> i = new Object2IntOpenHashMap();

   protected cuw(float $$0, float $$1, float $$2, float $$3, float $$4, dfc.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dfd $$6 = (dfd)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends cuw> a();

   protected eia[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eia $$9 = ctc.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eia $$10 = ctc.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eia $$11 = ctc.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eia $$12 = ctc.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eia $$13 = ctc.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eia $$14 = ehx.a($$10, $$13);
      eia $$15 = ehx.a($$11, $$12);
      eia[] $$16 = new eia[]{
         ehx.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ehx.a($$11, $$10),
         ehx.a($$12, $$10),
         ehx.a($$15, $$10),
         $$13,
         ehx.a($$11, $$13),
         ehx.a($$12, $$13),
         ehx.a($$15, $$13),
         $$14,
         ehx.a($$11, $$14),
         ehx.a($$12, $$14),
         ehx.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ehx.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return !$$0.c(e);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ha $$0) {
      return 1 << $$0.e();
   }

   protected int g(dfd $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ha.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ha.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ha.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ha.e);
         }

         return $$1;
      });
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(e) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
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
   public dfd a(dfd $$0, cxx $$1) {
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

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class cue extends csm implements czn {
   public static final dfr a = cxy.a;
   public static final dfr b = cxy.b;
   public static final dfr c = cxy.c;
   public static final dfr d = cxy.d;
   public static final dfr e = dfq.C;
   protected static final Map<ha, dfr> f = cxy.g.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final ehx[] g;
   protected final ehx[] h;
   private final Object2IntMap<dfa> i = new Object2IntOpenHashMap();

   protected cue(float $$0, float $$1, float $$2, float $$3, float $$4, dez.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.C.a().iterator();

      while (var7.hasNext()) {
         dfa $$6 = (dfa)var7.next();
         this.g($$6);
      }
   }

   protected ehx[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ehx $$9 = csm.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ehx $$10 = csm.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ehx $$11 = csm.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ehx $$12 = csm.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ehx $$13 = csm.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ehx $$14 = ehu.a($$10, $$13);
      ehx $$15 = ehu.a($$11, $$12);
      ehx[] $$16 = new ehx[]{
         ehu.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ehu.a($$11, $$10),
         ehu.a($$12, $$10),
         ehu.a($$15, $$10),
         $$13,
         ehu.a($$11, $$13),
         ehu.a($$12, $$13),
         ehu.a($$15, $$13),
         $$14,
         ehu.a($$11, $$14),
         ehu.a($$12, $$14),
         ehu.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ehu.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return !$$0.c(e);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ha $$0) {
      return 1 << $$0.e();
   }

   protected int g(dfa $$0) {
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
   public ead c_(dfa $$0) {
      return $$0.c(e) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
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
   public dfa a(dfa $$0, cxh $$1) {
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

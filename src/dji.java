import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dji extends dhm implements doo {
   public static final dvj a = dna.b;
   public static final dvj b = dna.c;
   public static final dvj c = dna.d;
   public static final dvj d = dna.e;
   public static final dvj e = dvi.C;
   protected static final Map<jk, dvj> f = dna.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ad.a());
   protected final ezq[] g;
   protected final ezq[] h;
   private final Object2IntMap<dus> i = new Object2IntOpenHashMap();

   protected dji(float $$0, float $$1, float $$2, float $$3, float $$4, dur.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.F.a().iterator();

      while (var7.hasNext()) {
         dus $$6 = (dus)var7.next();
         this.h($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dji> a();

   protected ezq[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      ezq $$9 = dhm.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      ezq $$10 = dhm.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      ezq $$11 = dhm.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      ezq $$12 = dhm.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      ezq $$13 = dhm.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      ezq $$14 = ezn.a($$10, $$13);
      ezq $$15 = ezn.a($$11, $$12);
      ezq[] $$16 = new ezq[]{
         ezn.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         ezn.a($$11, $$10),
         ezn.a($$12, $$10),
         ezn.a($$15, $$10),
         $$13,
         ezn.a($$11, $$13),
         ezn.a($$12, $$13),
         ezn.a($$15, $$13),
         $$14,
         ezn.a($$11, $$14),
         ezn.a($$12, $$14),
         ezn.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = ezn.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean e_(dus $$0) {
      return !$$0.c(e);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.h[this.h($$0)];
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.g[this.h($$0)];
   }

   private static int a(jk $$0) {
      return 1 << $$0.e();
   }

   protected int h(dus $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(jk.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(jk.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(jk.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(jk.e);
         }

         return $$1;
      });
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(e) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      switch ($$1) {
         case c:
            return $$0.b(a, $$0.c(c)).b(b, $$0.c(d)).b(c, $$0.c(a)).b(d, $$0.c(b));
         case d:
            return $$0.b(a, $$0.c(b)).b(b, $$0.c(c)).b(c, $$0.c(d)).b(d, $$0.c(a));
         case b:
            return $$0.b(a, $$0.c(d)).b(b, $$0.c(a)).b(c, $$0.c(b)).b(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      switch ($$1) {
         case b:
            return $$0.b(a, $$0.c(c)).b(c, $$0.c(a));
         case c:
            return $$0.b(b, $$0.c(d)).b(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dis extends dde {
   private static final is[] a = is.values();
   public static final dqy b = dqx.L;
   public static final dqy c = dqx.M;
   public static final dqy d = dqx.N;
   public static final dqy e = dqx.O;
   public static final dqy f = dqx.J;
   public static final dqy g = dqx.K;
   public static final Map<is, dqy> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(is.class), $$0 -> {
      $$0.put(is.c, b);
      $$0.put(is.f, c);
      $$0.put(is.d, d);
      $$0.put(is.e, e);
      $$0.put(is.b, f);
      $$0.put(is.a, g);
   }));
   protected final eui[] i;

   protected dis(float $$0, dqg.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dis> a();

   private eui[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eui $$3 = dde.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eui[] $$4 = new eui[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         is $$6 = a[$$5];
         $$4[$$5] = euf.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eui[] $$7 = new eui[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eui $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = euf.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return false;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dqh $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

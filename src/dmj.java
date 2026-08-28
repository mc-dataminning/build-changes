import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dmj extends dgv {
   private static final jj[] a = jj.values();
   public static final dur b = duq.L;
   public static final dur c = duq.M;
   public static final dur d = duq.N;
   public static final dur e = duq.O;
   public static final dur f = duq.J;
   public static final dur g = duq.K;
   public static final Map<jj, dur> h = ImmutableMap.copyOf(ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.c, b);
      $$0.put(jj.f, c);
      $$0.put(jj.d, d);
      $$0.put(jj.e, e);
      $$0.put(jj.b, f);
      $$0.put(jj.a, g);
   }));
   protected final eyx[] i;

   protected dmj(float $$0, dtz.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmj> a();

   private eyx[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eyx $$3 = dgv.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eyx[] $$4 = new eyx[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jj $$6 = a[$$5];
         $$4[$$5] = eyu.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eyx[] $$7 = new eyx[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eyx $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eyu.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dua $$0) {
      return false;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dua $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

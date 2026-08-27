import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class def extends cys {
   private static final ie[] a = ie.values();
   public static final dma b = dlz.L;
   public static final dma c = dlz.M;
   public static final dma d = dlz.N;
   public static final dma e = dlz.O;
   public static final dma f = dlz.J;
   public static final dma g = dlz.K;
   public static final Map<ie, dma> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ie.class), $$0 -> {
      $$0.put(ie.c, b);
      $$0.put(ie.f, c);
      $$0.put(ie.d, d);
      $$0.put(ie.e, e);
      $$0.put(ie.b, f);
      $$0.put(ie.a, g);
   }));
   protected final eos[] i;

   protected def(float $$0, dli.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends def> a();

   private eos[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      eos $$3 = cys.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      eos[] $$4 = new eos[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ie $$6 = a[$$5];
         $$4[$$5] = eop.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      eos[] $$7 = new eos[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         eos $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eop.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(dlj $$0, cux $$1, hz $$2) {
      return false;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(dlj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

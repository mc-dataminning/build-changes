import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class djm extends ddy {
   private static final it[] a = it.values();
   public static final drs b = drr.L;
   public static final drs c = drr.M;
   public static final drs d = drr.N;
   public static final drs e = drr.O;
   public static final drs f = drr.J;
   public static final drs g = drr.K;
   public static final Map<it, drs> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(it.class), $$0 -> {
      $$0.put(it.c, b);
      $$0.put(it.f, c);
      $$0.put(it.d, d);
      $$0.put(it.e, e);
      $$0.put(it.b, f);
      $$0.put(it.a, g);
   }));
   protected final evd[] i;

   protected djm(float $$0, dra.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends djm> a();

   private evd[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      evd $$3 = ddy.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      evd[] $$4 = new evd[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         it $$6 = a[$$5];
         $$4[$$5] = eva.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      evd[] $$7 = new evd[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         evd $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = eva.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return false;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return this.i[this.m($$0)];
   }

   protected int m(drb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

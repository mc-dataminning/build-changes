import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dqc extends dkm {
   private static final jm[] a = jm.values();
   public static final dym b = dyl.M;
   public static final dym c = dyl.N;
   public static final dym d = dyl.O;
   public static final dym e = dyl.P;
   public static final dym f = dyl.K;
   public static final dym g = dyl.L;
   public static final Map<jm, dym> h = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, b);
      $$0.put(jm.f, c);
      $$0.put(jm.d, d);
      $$0.put(jm.e, e);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   }));
   protected final fcs[] i;

   protected dqc(float $$0, dxu.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqc> a();

   private fcs[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fcs $$3 = dkm.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fcs[] $$4 = new fcs[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jm $$6 = a[$$5];
         $$4[$$5] = fcp.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fcs[] $$7 = new fcs[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fcs $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fcp.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dxv $$0) {
      return false;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dxv $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

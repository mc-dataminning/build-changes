import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dqb extends dkl {
   private static final jm[] a = jm.values();
   public static final dyl b = dyk.M;
   public static final dyl c = dyk.N;
   public static final dyl d = dyk.O;
   public static final dyl e = dyk.P;
   public static final dyl f = dyk.K;
   public static final dyl g = dyk.L;
   public static final Map<jm, dyl> h = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, b);
      $$0.put(jm.f, c);
      $$0.put(jm.d, d);
      $$0.put(jm.e, e);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   }));
   protected final fcr[] i;

   protected dqb(float $$0, dxt.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqb> a();

   private fcr[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fcr $$3 = dkl.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fcr[] $$4 = new fcr[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jm $$6 = a[$$5];
         $$4[$$5] = fco.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fcr[] $$7 = new fcr[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fcr $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fco.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dxu $$0) {
      return false;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dxu $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

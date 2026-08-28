import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dpu extends dke {
   private static final jm[] a = jm.values();
   public static final dye b = dyd.M;
   public static final dye c = dyd.N;
   public static final dye d = dyd.O;
   public static final dye e = dyd.P;
   public static final dye f = dyd.K;
   public static final dye g = dyd.L;
   public static final Map<jm, dye> h = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, b);
      $$0.put(jm.f, c);
      $$0.put(jm.d, d);
      $$0.put(jm.e, e);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   }));
   protected final fcm[] i;

   protected dpu(float $$0, dxm.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpu> a();

   private fcm[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fcm $$3 = dke.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fcm[] $$4 = new fcm[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jm $$6 = a[$$5];
         $$4[$$5] = fcj.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fcm[] $$7 = new fcm[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fcm $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fcj.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dxn $$0) {
      return false;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dxn $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dod extends diq {
   private static final jm[] a = jm.values();
   public static final dwm b = dwl.L;
   public static final dwm c = dwl.M;
   public static final dwm d = dwl.N;
   public static final dwm e = dwl.O;
   public static final dwm f = dwl.J;
   public static final dwm g = dwl.K;
   public static final Map<jm, dwm> h = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, b);
      $$0.put(jm.f, c);
      $$0.put(jm.d, d);
      $$0.put(jm.e, e);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   }));
   protected final fas[] i;

   protected dod(float $$0, dvu.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dod> a();

   private fas[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fas $$3 = diq.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fas[] $$4 = new fas[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jm $$6 = a[$$5];
         $$4[$$5] = fap.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fas[] $$7 = new fas[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fas $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fap.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dvv $$0) {
      return false;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dvv $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

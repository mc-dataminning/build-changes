import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dnr extends die {
   private static final jm[] a = jm.values();
   public static final dwa b = dvz.L;
   public static final dwa c = dvz.M;
   public static final dwa d = dvz.N;
   public static final dwa e = dvz.O;
   public static final dwa f = dvz.J;
   public static final dwa g = dvz.K;
   public static final Map<jm, dwa> h = ImmutableMap.copyOf(ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.c, b);
      $$0.put(jm.f, c);
      $$0.put(jm.d, d);
      $$0.put(jm.e, e);
      $$0.put(jm.b, f);
      $$0.put(jm.a, g);
   }));
   protected final fah[] i;

   protected dnr(float $$0, dvi.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dnr> a();

   private fah[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      fah $$3 = die.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      fah[] $$4 = new fah[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         jm $$6 = a[$$5];
         $$4[$$5] = fae.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      fah[] $$7 = new fah[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         fah $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = fae.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   protected boolean e_(dvj $$0) {
      return false;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.i[this.o($$0)];
   }

   protected int o(dvj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

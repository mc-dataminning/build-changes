import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public abstract class dcl extends cwy {
   private static final ic[] a = ic.values();
   public static final dkg b = dkf.L;
   public static final dkg c = dkf.M;
   public static final dkg d = dkf.N;
   public static final dkg e = dkf.O;
   public static final dkg f = dkf.J;
   public static final dkg g = dkf.K;
   public static final Map<ic, dkg> h = ImmutableMap.copyOf(ac.a(Maps.newEnumMap(ic.class), $$0 -> {
      $$0.put(ic.c, b);
      $$0.put(ic.f, c);
      $$0.put(ic.d, d);
      $$0.put(ic.e, e);
      $$0.put(ic.b, f);
      $$0.put(ic.a, g);
   }));
   protected final emv[] i;

   protected dcl(float $$0, djo.d $$1) {
      super($$1);
      this.i = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcl> a();

   private emv[] a(float $$0) {
      float $$1 = 0.5F - $$0;
      float $$2 = 0.5F + $$0;
      emv $$3 = cwy.a((double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$1 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F), (double)($$2 * 16.0F));
      emv[] $$4 = new emv[a.length];

      for (int $$5 = 0; $$5 < a.length; $$5++) {
         ic $$6 = a[$$5];
         $$4[$$5] = ems.a(
            0.5 + Math.min((double)(-$$0), (double)$$6.j() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.k() * 0.5),
            0.5 + Math.min((double)(-$$0), (double)$$6.l() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.j() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.k() * 0.5),
            0.5 + Math.max((double)$$0, (double)$$6.l() * 0.5)
         );
      }

      emv[] $$7 = new emv[64];

      for (int $$8 = 0; $$8 < 64; $$8++) {
         emv $$9 = $$3;

         for (int $$10 = 0; $$10 < a.length; $$10++) {
            if (($$8 & 1 << $$10) != 0) {
               $$9 = ems.a($$9, $$4[$$10]);
            }
         }

         $$7[$$8] = $$9;
      }

      return $$7;
   }

   @Override
   public boolean a_(djp $$0, ctd $$1, hx $$2) {
      return false;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return this.i[this.h($$0)];
   }

   protected int h(djp $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < a.length; $$2++) {
         if ($$0.c(h.get(a[$$2]))) {
            $$1 |= 1 << $$2;
         }
      }

      return $$1;
   }
}

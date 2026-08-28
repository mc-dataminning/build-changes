import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dti extends dno {
   public static final ech b = ecg.N;
   public static final ech c = ecg.O;
   public static final ech d = ecg.P;
   public static final ech e = ecg.Q;
   public static final ech f = ecg.L;
   public static final ech g = ecg.M;
   public static final Map<jc, ech> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, b, jc.f, c, jc.d, d, jc.e, e, jc.b, f, jc.a, g)));
   private final Function<ebq, fgw> a;

   protected dti(float $$0, ebp.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dti> a();

   private Function<ebq, fgw> a(float $$0) {
      fgw $$1 = dno.a((double)$$0);
      Map<jc, fgw> $$2 = fgt.d(dno.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         fgw $$3 = $$1;

         for (Entry<jc, ech> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fgt.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(ebq $$0) {
      return false;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.a.apply($$0);
   }
}

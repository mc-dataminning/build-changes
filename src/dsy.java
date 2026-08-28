import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dsy extends dne {
   public static final ebx b = ebw.N;
   public static final ebx c = ebw.O;
   public static final ebx d = ebw.P;
   public static final ebx e = ebw.Q;
   public static final ebx f = ebw.L;
   public static final ebx g = ebw.M;
   public static final Map<jc, ebx> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, b, jc.f, c, jc.d, d, jc.e, e, jc.b, f, jc.a, g)));
   private final Function<ebg, fgm> a;

   protected dsy(float $$0, ebf.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsy> a();

   private Function<ebg, fgm> a(float $$0) {
      fgm $$1 = dne.a((double)$$0);
      Map<jc, fgm> $$2 = fgj.d(dne.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         fgm $$3 = $$1;

         for (Entry<jc, ebx> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fgj.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(ebg $$0) {
      return false;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.a.apply($$0);
   }
}

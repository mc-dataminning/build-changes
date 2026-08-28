import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dpw extends dke {
   public static final dyh b = dyg.N;
   public static final dyh c = dyg.O;
   public static final dyh d = dyg.P;
   public static final dyh e = dyg.Q;
   public static final dyh f = dyg.L;
   public static final dyh g = dyg.M;
   public static final Map<jn, dyh> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jn.c, b, jn.f, c, jn.d, d, jn.e, e, jn.b, f, jn.a, g)));
   private final Function<dxq, fcr> a;

   protected dpw(float $$0, dxp.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpw> a();

   private Function<dxq, fcr> a(float $$0) {
      fcr $$1 = dke.a((double)$$0);
      Map<jn, fcr> $$2 = fco.d(dke.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         fcr $$3 = $$1;

         for (Entry<jn, dyh> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fco.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(dxq $$0) {
      return false;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.a.apply($$0);
   }
}

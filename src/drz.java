import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class drz extends dmf {
   public static final eay b = eax.N;
   public static final eay c = eax.O;
   public static final eay d = eax.P;
   public static final eay e = eax.Q;
   public static final eay f = eax.L;
   public static final eay g = eax.M;
   public static final Map<ja, eay> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, b, ja.f, c, ja.d, d, ja.e, e, ja.b, f, ja.a, g)));
   private final Function<eah, ffk> a;

   protected drz(float $$0, eag.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends drz> a();

   private Function<eah, ffk> a(float $$0) {
      ffk $$1 = dmf.a((double)$$0);
      Map<ja, ffk> $$2 = ffh.d(dmf.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         ffk $$3 = $$1;

         for (Entry<ja, eay> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = ffh.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(eah $$0) {
      return false;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.a.apply($$0);
   }
}

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class drm extends dlu {
   public static final eaf b = eae.N;
   public static final eaf c = eae.O;
   public static final eaf d = eae.P;
   public static final eaf e = eae.Q;
   public static final eaf f = eae.L;
   public static final eaf g = eae.M;
   public static final Map<ja, eaf> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, b, ja.f, c, ja.d, d, ja.e, e, ja.b, f, ja.a, g)));
   private final Function<dzo, feq> a;

   protected drm(float $$0, dzn.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends drm> a();

   private Function<dzo, feq> a(float $$0) {
      feq $$1 = dlu.a((double)$$0);
      Map<ja, feq> $$2 = fen.d(dlu.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         feq $$3 = $$1;

         for (Entry<ja, eaf> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fen.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(dzo $$0) {
      return false;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.a.apply($$0);
   }
}

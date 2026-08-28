import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dqm extends dku {
   public static final dzd b = dzc.N;
   public static final dzd c = dzc.O;
   public static final dzd d = dzc.P;
   public static final dzd e = dzc.Q;
   public static final dzd f = dzc.L;
   public static final dzd g = dzc.M;
   public static final Map<jo, dzd> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jo.c, b, jo.f, c, jo.d, d, jo.e, e, jo.b, f, jo.a, g)));
   private final Function<dym, fdo> a;

   protected dqm(float $$0, dyl.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqm> a();

   private Function<dym, fdo> a(float $$0) {
      fdo $$1 = dku.a((double)$$0);
      Map<jo, fdo> $$2 = fdl.d(dku.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         fdo $$3 = $$1;

         for (Entry<jo, dzd> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fdl.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(dym $$0) {
      return false;
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.a.apply($$0);
   }
}

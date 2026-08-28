import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class drt extends dma {
   public static final eaq b = eap.N;
   public static final eaq c = eap.O;
   public static final eaq d = eap.P;
   public static final eaq e = eap.Q;
   public static final eaq f = eap.L;
   public static final eaq g = eap.M;
   public static final Map<ja, eaq> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, b, ja.f, c, ja.d, d, ja.e, e, ja.b, f, ja.a, g)));
   private final Function<dzz, ffc> a;

   protected drt(float $$0, dzy.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends drt> a();

   private Function<dzz, ffc> a(float $$0) {
      ffc $$1 = dma.a((double)$$0);
      Map<ja, ffc> $$2 = fez.d(dma.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         ffc $$3 = $$1;

         for (Entry<ja, eaq> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fez.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(dzz $$0) {
      return false;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.a.apply($$0);
   }
}

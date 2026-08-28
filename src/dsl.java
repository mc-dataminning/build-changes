import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dsl extends dmr {
   public static final ebk b = ebj.N;
   public static final ebk c = ebj.O;
   public static final ebk d = ebj.P;
   public static final ebk e = ebj.Q;
   public static final ebk f = ebj.L;
   public static final ebk g = ebj.M;
   public static final Map<jb, ebk> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, b, jb.f, c, jb.d, d, jb.e, e, jb.b, f, jb.a, g)));
   private final Function<eat, ffw> a;

   protected dsl(float $$0, eas.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsl> a();

   private Function<eat, ffw> a(float $$0) {
      ffw $$1 = dmr.a((double)$$0);
      Map<jb, ffw> $$2 = fft.d(dmr.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         ffw $$3 = $$1;

         for (Entry<jb, ebk> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fft.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(eat $$0) {
      return false;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.a.apply($$0);
   }
}

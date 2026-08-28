import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dsg extends dmm {
   public static final ebf b = ebe.N;
   public static final ebf c = ebe.O;
   public static final ebf d = ebe.P;
   public static final ebf e = ebe.Q;
   public static final ebf f = ebe.L;
   public static final ebf g = ebe.M;
   public static final Map<jb, ebf> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, b, jb.f, c, jb.d, d, jb.e, e, jb.b, f, jb.a, g)));
   private final Function<eao, ffr> a;

   protected dsg(float $$0, ean.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsg> a();

   private Function<eao, ffr> a(float $$0) {
      ffr $$1 = dmm.a((double)$$0);
      Map<jb, ffr> $$2 = ffo.d(dmm.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         ffr $$3 = $$1;

         for (Entry<jb, ebf> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = ffo.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(eao $$0) {
      return false;
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.a.apply($$0);
   }
}

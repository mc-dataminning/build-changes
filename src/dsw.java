import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public abstract class dsw extends dnc {
   public static final ebv b = ebu.N;
   public static final ebv c = ebu.O;
   public static final ebv d = ebu.P;
   public static final ebv e = ebu.Q;
   public static final ebv f = ebu.L;
   public static final ebv g = ebu.M;
   public static final Map<jb, ebv> h = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jb.c, b, jb.f, c, jb.d, d, jb.e, e, jb.b, f, jb.a, g)));
   private final Function<ebe, fgk> a;

   protected dsw(float $$0, ebd.d $$1) {
      super($$1);
      this.a = this.a($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsw> a();

   private Function<ebe, fgk> a(float $$0) {
      fgk $$1 = dnc.a((double)$$0);
      Map<jb, fgk> $$2 = fgh.d(dnc.c((double)$$0, 0.0, 8.0));
      return this.a($$2x -> {
         fgk $$3 = $$1;

         for (Entry<jb, ebv> $$4 : h.entrySet()) {
            if ($$2x.c($$4.getValue())) {
               $$3 = fgh.a($$2.get($$4.getKey()), $$3);
            }
         }

         return $$3;
      });
   }

   @Override
   protected boolean e_(ebe $$0) {
      return false;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.a.apply($$0);
   }
}

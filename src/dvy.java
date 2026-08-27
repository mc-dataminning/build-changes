import com.mojang.serialization.Codec;

public abstract class dvy {
   public static final Codec<dvy> a = kd.V.q().dispatch(dvy::a, dvz::a);

   public static dwh a(djg $$0) {
      return new dwh($$0);
   }

   public static dwh a(cwp $$0) {
      return new dwh($$0.o());
   }

   protected abstract dvz<?> a();

   public abstract djg a(auu var1, hx var2);
}

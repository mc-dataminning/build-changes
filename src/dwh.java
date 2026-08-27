import com.mojang.serialization.Codec;

public abstract class dwh {
   public static final Codec<dwh> a = kd.V.q().dispatch(dwh::a, dwi::a);

   public static dwq a(djp $$0) {
      return new dwq($$0);
   }

   public static dwq a(cwy $$0) {
      return new dwq($$0.o());
   }

   protected abstract dwi<?> a();

   public abstract djp a(auw var1, hx var2);
}

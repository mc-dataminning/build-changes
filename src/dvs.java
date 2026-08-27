import com.mojang.serialization.Codec;

public abstract class dvs {
   public static final Codec<dvs> a = kd.V.q().dispatch(dvs::a, dvt::a);

   public static dwb a(dja $$0) {
      return new dwb($$0);
   }

   public static dwb a(cwj $$0) {
      return new dwb($$0.o());
   }

   protected abstract dvt<?> a();

   public abstract dja a(aup var1, hx var2);
}

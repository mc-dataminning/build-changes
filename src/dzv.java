import com.mojang.serialization.Codec;

public abstract class dzv {
   public static final Codec<dzv> a = ki.V.q().dispatch(dzv::a, dzw::a);

   public static eae a(dmz $$0) {
      return new eae($$0);
   }

   public static eae a(daa $$0) {
      return new eae($$0.o());
   }

   protected abstract dzw<?> a();

   public abstract dmz a(axd var1, ib var2);
}

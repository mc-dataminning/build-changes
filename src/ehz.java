import com.mojang.serialization.Codec;

public abstract class ehz {
   public static final Codec<ehz> a = lv.T.q().dispatch(ehz::a, eia::a);

   public static eii a(dus $$0) {
      return new eii($$0);
   }

   public static eii a(dhm $$0) {
      return new eii($$0.n());
   }

   protected abstract eia<?> a();

   public abstract dus a(azn var1, jf var2);
}

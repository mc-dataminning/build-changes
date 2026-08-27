import com.mojang.serialization.Codec;

public abstract class dye {
   public static final Codec<dye> a = kf.V.q().dispatch(dye::a, dyf::a);

   public static dyn a(dlj $$0) {
      return new dyn($$0);
   }

   public static dyn a(cys $$0) {
      return new dyn($$0.o());
   }

   protected abstract dyf<?> a();

   public abstract dlj a(awp var1, hz var2);
}

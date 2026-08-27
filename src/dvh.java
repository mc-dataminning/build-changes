import com.mojang.serialization.Codec;

public abstract class dvh {
   public static final Codec<dvh> a = kb.V.q().dispatch(dvh::a, dvi::a);

   public static dvq a(dip $$0) {
      return new dvq($$0);
   }

   public static dvq a(cvz $$0) {
      return new dvq($$0.o());
   }

   protected abstract dvi<?> a();

   public abstract dip a(auf var1, hv var2);
}

import com.mojang.serialization.Codec;

public abstract class dto {
   public static final Codec<dto> a = jy.W.q().dispatch(dto::a, dtp::a);

   public static dtx a(dgw $$0) {
      return new dtx($$0);
   }

   public static dtx a(cut $$0) {
      return new dtx($$0.o());
   }

   protected abstract dtp<?> a();

   public abstract dgw a(ato var1, ht var2);
}

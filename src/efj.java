import com.mojang.serialization.Codec;

public abstract class efj {
   public static final Codec<efj> a = lq.T.r().dispatch(efj::a, efk::a);

   public static efs a(dsh $$0) {
      return new efs($$0);
   }

   public static efs a(dff $$0) {
      return new efs($$0.o());
   }

   protected abstract efk<?> a();

   public abstract dsh a(aym var1, ja var2);
}

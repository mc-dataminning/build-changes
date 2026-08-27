import com.mojang.serialization.Codec;

public abstract class ecj {
   public static final Codec<ecj> a = kt.V.q().dispatch(ecj::a, eck::a);

   public static ecs a(dpi $$0) {
      return new ecs($$0);
   }

   public static ecs a(dch $$0) {
      return new ecs($$0.n());
   }

   protected abstract eck<?> a();

   public abstract dpi a(axt var1, id var2);
}

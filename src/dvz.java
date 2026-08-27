import com.mojang.serialization.Codec;

public abstract class dvz {
   public static final Codec<dvz> a = kd.V.q().dispatch(dvz::a, dwa::a);

   public static dwi a(djh $$0) {
      return new dwi($$0);
   }

   public static dwi a(cwq $$0) {
      return new dwi($$0.o());
   }

   protected abstract dwa<?> a();

   public abstract djh a(auv var1, hx var2);
}

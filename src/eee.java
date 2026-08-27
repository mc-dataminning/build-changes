import com.mojang.serialization.Codec;

public abstract class eee {
   public static final Codec<eee> a = le.V.q().dispatch(eee::a, eef::a);

   public static een a(drd $$0) {
      return new een($$0);
   }

   public static een a(dea $$0) {
      return new een($$0.n());
   }

   protected abstract eef<?> a();

   public abstract drd a(aym var1, io var2);
}

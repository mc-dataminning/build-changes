import com.mojang.serialization.Codec;

public abstract class ekc {
   public static final Codec<ekc> a = mb.T.q().dispatch(ekc::a, ekd::a);

   public static ekl a(dww $$0) {
      return new ekl($$0);
   }

   public static ekl a(djl $$0) {
      return new ekl($$0.m());
   }

   protected abstract ekd<?> a();

   public abstract dww a(azh var1, ji var2);
}

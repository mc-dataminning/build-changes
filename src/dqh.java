import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class dqh {
   private static final Codec<Either<die, dqh>> a = Codec.either(die.a, jb.O.q().dispatch(dqh::a, dqi::codec));
   public static final Codec<dqh> c = a.xmap(
      $$0 -> (dqh)$$0.map(dqg::a, $$0x -> $$0x), $$0 -> $$0.a() == dqi.a ? Either.left(((dqg)$$0).b()) : Either.right($$0)
   );

   public abstract int a(apf var1, dih var2);

   public abstract dqi<?> a();
}

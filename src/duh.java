import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class duh {
   private static final Codec<Either<dme, duh>> a = Codec.either(dme.a, jy.O.q().dispatch(duh::a, dui::codec));
   public static final Codec<duh> c = a.xmap(
      $$0 -> (duh)$$0.map(dug::a, $$0x -> $$0x), $$0 -> $$0.a() == dui.a ? Either.left(((dug)$$0).b()) : Either.right($$0)
   );

   public abstract int a(ate var1, dmh var2);

   public abstract dui<?> a();
}

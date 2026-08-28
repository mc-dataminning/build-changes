import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class btw {
   private static final Codec<Either<Integer, btw>> a = Codec.either(Codec.INT, mg.K.q().dispatch(btw::c, btx::codec));
   public static final Codec<btw> c = a.xmap(
      $$0 -> (btw)$$0.map(btt::a, $$0x -> $$0x), $$0 -> $$0.c() == btx.a ? Either.left(((btt)$$0).d()) : Either.right($$0)
   );
   public static final Codec<btw> d = b(0, Integer.MAX_VALUE);
   public static final Codec<btw> e = b(1, Integer.MAX_VALUE);

   public static Codec<btw> b(int $$0, int $$1) {
      return a($$0, $$1, c);
   }

   public static <T extends btw> Codec<T> a(int $$0, int $$1, Codec<T> $$2) {
      return $$2.validate($$2x -> a($$0, $$1, $$2x));
   }

   private static <T extends btw> DataResult<T> a(int $$0, int $$1, T $$2) {
      if ($$2.a() < $$0) {
         return DataResult.error(() -> "Value provider too low: " + $$0 + " [" + $$2.a() + "-" + $$2.b() + "]");
      } else {
         return $$2.b() > $$1 ? DataResult.error(() -> "Value provider too high: " + $$1 + " [" + $$2.a() + "-" + $$2.b() + "]") : DataResult.success($$2);
      }
   }

   public abstract int a(azx var1);

   public abstract int a();

   public abstract int b();

   public abstract btx<?> c();
}

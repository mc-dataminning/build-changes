import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.io.IOException;

public interface erx {
   Codec<erx> b = ery.f.dispatch(erx::a, $$0 -> $$0.a().codec());

   ery a();

   Either<erx.a, erx.b> b();

   public interface a {
      egm load(akx var1) throws IOException;
   }

   public static record b(acq a) {
   }
}

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.io.IOException;

public interface exy {
   Codec<exy> b = exz.f.dispatch(exy::a, $$0 -> $$0.a().codec());

   exz a();

   Either<exy.a, exy.b> b();

   public interface a {
      elz load(aph var1) throws IOException;
   }

   public static record b(agi a) {
   }
}

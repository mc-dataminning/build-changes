import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.io.IOException;

public interface ezx {
   Codec<ezx> b = ezy.f.dispatch(ezx::a, $$0 -> $$0.a().codec());

   ezy a();

   Either<ezx.a, ezx.b> b();

   public interface a {
      enw load(aqc var1) throws IOException;
   }

   public static record b(ahd a) {
   }
}

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.io.IOException;

public interface ewi {
   Codec<ewi> b = ewj.f.dispatch(ewi::a, $$0 -> $$0.a().codec());

   ewj a();

   Either<ewi.a, ewi.b> b();

   public interface a {
      ekk load(aot var1) throws IOException;
   }

   public static record b(afw a) {
   }
}

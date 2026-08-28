import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;
import java.util.stream.Stream;

public class bht extends bbc {
   private final Function<String, String> a;

   public bht(Schema $$0, String $$1, Function<String, String> $$2) {
      super($$0, $$1);
      this.a = $$2;
   }

   @Override
   protected <T> Stream<Dynamic<T>> a(Stream<Dynamic<T>> $$0) {
      return $$0.map($$0x -> $$0x.update("type", $$0xx -> (Dynamic)DataFixUtils.orElse($$0xx.asString().map(this.a).map($$0xx::createString).result(), $$0xx)));
   }
}

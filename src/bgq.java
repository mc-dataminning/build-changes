import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Predicate;

public abstract class bgq extends bgp {
   public bgq(Schema $$0, String $$1, Predicate<String> $$2) {
      super($$0, $$1, $$2);
   }

   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);

   @Override
   protected final Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}

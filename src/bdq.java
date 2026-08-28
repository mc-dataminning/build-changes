import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Map.Entry;

public class bdq extends bgt {
   private final Map<String, String> a;

   public bdq(Schema $$0, String $$1, String $$2, Map<String, String> $$3) {
      super($$0, false, $$1, bhy.B, $$2);
      this.a = $$3;
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      for (Entry<String, String> $$1 : this.a.entrySet()) {
         $$0 = $$0.renameField($$1.getKey(), $$1.getValue());
      }

      return $$0;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}

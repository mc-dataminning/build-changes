import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Map.Entry;

public class bel extends bhv {
   private final Map<String, String> c;

   public bel(Schema $$0, String $$1, String $$2, Map<String, String> $$3) {
      super($$0, false, $$1, bjb.D, $$2);
      this.c = $$3;
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      for (Entry<String, String> $$1 : this.c.entrySet()) {
         $$0 = $$0.renameField($$1.getKey(), $$1.getValue());
      }

      return $$0;
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}

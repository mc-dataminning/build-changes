import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class boq extends bky {
   public boq(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public static SequencedMap<String, Supplier<TypeTemplate>> a(Schema $$0) {
      SequencedMap<String, Supplier<TypeTemplate>> $$1 = bog.a($$0);
      $$1.put("minecraft:can_place_on", () -> b($$0));
      $$1.put("minecraft:can_break", () -> b($$0));
      return $$1;
   }

   private static TypeTemplate b(Schema $$0) {
      TypeTemplate $$1 = DSL.optionalFields("blocks", DSL.or(bjd.E.in($$0), DSL.list(bjd.E.in($$0))));
      return DSL.or($$1, DSL.list($$1));
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, bjd.w, () -> DSL.optionalFieldsLazy(a($$0)));
   }
}

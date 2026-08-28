import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.SequencedMap;
import java.util.function.Supplier;

public class bnm extends bkk {
   public bnm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public static SequencedMap<String, Supplier<TypeTemplate>> a(Schema $$0) {
      SequencedMap<String, Supplier<TypeTemplate>> $$1 = bnh.a($$0);
      $$1.remove("minecraft:food");
      $$1.put("minecraft:use_remainder", () -> biw.t.in($$0));
      $$1.put("minecraft:equippable", () -> DSL.optionalFields("allowed_entities", DSL.or(biw.z.in($$0), DSL.list(biw.z.in($$0)))));
      return $$1;
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(true, biw.w, () -> DSL.optionalFieldsLazy(a($$0)));
   }
}

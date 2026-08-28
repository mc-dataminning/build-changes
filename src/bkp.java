import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkp extends Schema {
   public bkp(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bit.A,
         () -> DSL.and(
               DSL.optional(DSL.field("ArmorItems", DSL.list(bit.t.in($$0)))),
               new TypeTemplate[]{
                  DSL.optional(DSL.field("HandItems", DSL.list(bit.t.in($$0)))),
                  DSL.optional(DSL.field("body_armor_item", bit.t.in($$0))),
                  DSL.optional(DSL.field("saddle", bit.t.in($$0)))
               }
            )
      );
   }
}

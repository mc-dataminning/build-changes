import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkz extends Schema {
   public bkz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjd.A,
         () -> DSL.and(
               DSL.optional(DSL.field("ArmorItems", DSL.list(bjd.t.in($$0)))),
               new TypeTemplate[]{
                  DSL.optional(DSL.field("HandItems", DSL.list(bjd.t.in($$0)))),
                  DSL.optional(DSL.field("body_armor_item", bjd.t.in($$0))),
                  DSL.optional(DSL.field("saddle", bjd.t.in($$0)))
               }
            )
      );
   }
}

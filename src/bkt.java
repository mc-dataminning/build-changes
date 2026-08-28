import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bkt extends Schema {
   public bkt(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bix.A,
         () -> DSL.and(
               DSL.optional(DSL.field("ArmorItems", DSL.list(bix.t.in($$0)))),
               new TypeTemplate[]{
                  DSL.optional(DSL.field("HandItems", DSL.list(bix.t.in($$0)))),
                  DSL.optional(DSL.field("body_armor_item", bix.t.in($$0))),
                  DSL.optional(DSL.field("saddle", bix.t.in($$0)))
               }
            )
      );
   }
}

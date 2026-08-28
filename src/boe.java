import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class boe extends bkr {
   public boe(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         biw.z,
         () -> DSL.or(
               DSL.or(DSL.constType(DSL.string()), DSL.list(biw.z.in($$0))),
               DSL.optionalFields(
                  "extra",
                  DSL.list(biw.z.in($$0)),
                  "separator",
                  biw.z.in($$0),
                  "hover_event",
                  DSL.taggedChoice(
                     "action",
                     DSL.string(),
                     Map.of(
                        "show_text",
                        DSL.optionalFields("value", biw.z.in($$0)),
                        "show_item",
                        biw.t.in($$0),
                        "show_entity",
                        DSL.optionalFields("id", biw.B.in($$0), "name", biw.z.in($$0))
                     )
                  )
               )
            )
      );
   }
}

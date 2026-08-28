import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bol extends bky {
   public bol(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjd.z,
         () -> DSL.or(
               DSL.or(DSL.constType(DSL.string()), DSL.list(bjd.z.in($$0))),
               DSL.optionalFields(
                  "extra",
                  DSL.list(bjd.z.in($$0)),
                  "separator",
                  bjd.z.in($$0),
                  "hover_event",
                  DSL.taggedChoice(
                     "action",
                     DSL.string(),
                     Map.of(
                        "show_text",
                        DSL.optionalFields("value", bjd.z.in($$0)),
                        "show_item",
                        bjd.t.in($$0),
                        "show_entity",
                        DSL.optionalFields("id", bjd.B.in($$0), "name", bjd.z.in($$0))
                     )
                  )
               )
            )
      );
   }
}

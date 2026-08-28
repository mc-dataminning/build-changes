import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bok extends bky {
   public bok(int $$0, Schema $$1) {
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
                  "hoverEvent",
                  DSL.taggedChoice(
                     "action",
                     DSL.string(),
                     Map.of(
                        "show_text",
                        DSL.optionalFields("contents", bjd.z.in($$0)),
                        "show_item",
                        DSL.optionalFields("contents", DSL.or(bjd.t.in($$0), bjd.F.in($$0))),
                        "show_entity",
                        DSL.optionalFields("type", bjd.B.in($$0), "name", bjd.z.in($$0))
                     )
                  )
               )
            )
      );
   }
}

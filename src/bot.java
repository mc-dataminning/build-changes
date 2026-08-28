import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bot extends blh {
   public bot(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjm.z,
         () -> DSL.or(
               DSL.or(DSL.constType(DSL.string()), DSL.list(bjm.z.in($$0))),
               DSL.optionalFields(
                  "extra",
                  DSL.list(bjm.z.in($$0)),
                  "separator",
                  bjm.z.in($$0),
                  "hoverEvent",
                  DSL.taggedChoice(
                     "action",
                     DSL.string(),
                     Map.of(
                        "show_text",
                        DSL.optionalFields("contents", bjm.z.in($$0)),
                        "show_item",
                        DSL.optionalFields("contents", DSL.or(bjm.t.in($$0), bjm.F.in($$0))),
                        "show_entity",
                        DSL.optionalFields("type", bjm.B.in($$0), "name", bjm.z.in($$0))
                     )
                  )
               )
            )
      );
   }
}

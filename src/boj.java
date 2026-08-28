import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class boj extends bkw {
   public boj(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjb.z,
         () -> DSL.or(
               DSL.or(DSL.constType(DSL.string()), DSL.list(bjb.z.in($$0))),
               DSL.optionalFields(
                  "extra",
                  DSL.list(bjb.z.in($$0)),
                  "separator",
                  bjb.z.in($$0),
                  "hover_event",
                  DSL.taggedChoice(
                     "action",
                     DSL.string(),
                     Map.of(
                        "show_text",
                        DSL.optionalFields("value", bjb.z.in($$0)),
                        "show_item",
                        bjb.t.in($$0),
                        "show_entity",
                        DSL.optionalFields("id", bjb.B.in($$0), "name", bjb.z.in($$0))
                     )
                  )
               )
            )
      );
   }
}

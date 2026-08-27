import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class azz extends Schema {
   public azz(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         ayp.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  ayp.z.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     ayp.w.in($$0),
                     "BlockEntityTag",
                     ayp.s.in($$0),
                     "CanDestroy",
                     DSL.list(ayp.y.in($$0)),
                     "CanPlaceOn",
                     DSL.list(ayp.y.in($$0)),
                     "Items",
                     DSL.list(ayp.t.in($$0))
                  )
               ),
               bcr.a,
               HookFunction.IDENTITY
            )
      );
   }
}

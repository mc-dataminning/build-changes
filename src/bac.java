import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bac extends Schema {
   public bac(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         ays.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  ays.z.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     ays.w.in($$0),
                     "BlockEntityTag",
                     ays.s.in($$0),
                     "CanDestroy",
                     DSL.list(ays.y.in($$0)),
                     "CanPlaceOn",
                     DSL.list(ays.y.in($$0)),
                     "Items",
                     DSL.list(ays.t.in($$0))
                  )
               ),
               bcu.a,
               HookFunction.IDENTITY
            )
      );
   }
}

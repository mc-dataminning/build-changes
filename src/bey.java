import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bey extends Schema {
   public bey(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bdn.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bdn.A.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     bdn.x.in($$0),
                     "BlockEntityTag",
                     bdn.s.in($$0),
                     "CanDestroy",
                     DSL.list(bdn.z.in($$0)),
                     "CanPlaceOn",
                     DSL.list(bdn.z.in($$0)),
                     "Items",
                     DSL.list(bdn.t.in($$0))
                  )
               ),
               bhv.a,
               HookFunction.IDENTITY
            )
      );
   }
}

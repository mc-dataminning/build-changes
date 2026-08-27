import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bfe extends Schema {
   public bfe(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bdt.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bdt.A.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     bdt.x.in($$0),
                     "BlockEntityTag",
                     bdt.s.in($$0),
                     "CanDestroy",
                     DSL.list(bdt.z.in($$0)),
                     "CanPlaceOn",
                     DSL.list(bdt.z.in($$0)),
                     "Items",
                     DSL.list(bdt.t.in($$0))
                  )
               ),
               bie.a,
               HookFunction.IDENTITY
            )
      );
   }
}

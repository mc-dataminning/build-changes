import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bfs extends Schema {
   public bfs(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         beh.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  beh.A.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     beh.x.in($$0),
                     "BlockEntityTag",
                     beh.s.in($$0),
                     "CanDestroy",
                     DSL.list(beh.z.in($$0)),
                     "CanPlaceOn",
                     DSL.list(beh.z.in($$0)),
                     "Items",
                     DSL.list(beh.t.in($$0))
                  )
               ),
               bit.a,
               HookFunction.IDENTITY
            )
      );
   }
}

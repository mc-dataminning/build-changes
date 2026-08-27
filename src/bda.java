import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bda extends Schema {
   public bda(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bbq.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bbq.z.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     bbq.w.in($$0),
                     "BlockEntityTag",
                     bbq.s.in($$0),
                     "CanDestroy",
                     DSL.list(bbq.y.in($$0)),
                     "CanPlaceOn",
                     DSL.list(bbq.y.in($$0)),
                     "Items",
                     DSL.list(bbq.t.in($$0))
                  )
               ),
               bfw.a,
               HookFunction.IDENTITY
            )
      );
   }
}

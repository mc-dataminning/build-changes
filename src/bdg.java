import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bdg extends Schema {
   public bdg(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bbw.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bbw.z.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     bbw.w.in($$0),
                     "BlockEntityTag",
                     bbw.s.in($$0),
                     "CanDestroy",
                     DSL.list(bbw.y.in($$0)),
                     "CanPlaceOn",
                     DSL.list(bbw.y.in($$0)),
                     "Items",
                     DSL.list(bbw.t.in($$0))
                  )
               ),
               bgc.a,
               HookFunction.IDENTITY
            )
      );
   }
}

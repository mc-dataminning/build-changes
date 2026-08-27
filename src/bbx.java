import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class bbx extends Schema {
   public bbx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         ban.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  ban.z.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     ban.w.in($$0),
                     "BlockEntityTag",
                     ban.s.in($$0),
                     "CanDestroy",
                     DSL.list(ban.y.in($$0)),
                     "CanPlaceOn",
                     DSL.list(ban.y.in($$0)),
                     "Items",
                     DSL.list(ban.t.in($$0))
                  )
               ),
               ber.a,
               HookFunction.IDENTITY
            )
      );
   }
}

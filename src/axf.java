import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class axf extends Schema {
   public axf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         avw.m,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  avw.s.in($$0),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     avw.p.in($$0),
                     "BlockEntityTag",
                     avw.l.in($$0),
                     "CanDestroy",
                     DSL.list(avw.r.in($$0)),
                     "CanPlaceOn",
                     DSL.list(avw.r.in($$0)),
                     "Items",
                     DSL.list(avw.m.in($$0))
                  )
               ),
               azx.a,
               HookFunction.IDENTITY
            )
      );
   }
}

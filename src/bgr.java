import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bgr extends Schema {
   public bgr(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bff.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bff.B.in($$0),
                  "tag",
                  ayu.a(
                     Pair.of("EntityTag", bff.y.in($$0)),
                     Pair.of("BlockEntityTag", bff.s.in($$0)),
                     Pair.of("CanDestroy", DSL.list(bff.A.in($$0))),
                     Pair.of("CanPlaceOn", DSL.list(bff.A.in($$0))),
                     Pair.of("Items", DSL.list(bff.t.in($$0))),
                     Pair.of("ChargedProjectiles", DSL.list(bff.t.in($$0)))
                  )
               ),
               bjv.b,
               HookFunction.IDENTITY
            )
      );
   }
}

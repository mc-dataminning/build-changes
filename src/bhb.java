import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhb extends Schema {
   public bhb(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bfp.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bfp.B.in($$0),
                  "tag",
                  aze.a(
                     Pair.of("EntityTag", bfp.y.in($$0)),
                     Pair.of("BlockEntityTag", bfp.s.in($$0)),
                     Pair.of("CanDestroy", DSL.list(bfp.A.in($$0))),
                     Pair.of("CanPlaceOn", DSL.list(bfp.A.in($$0))),
                     Pair.of("Items", DSL.list(bfp.t.in($$0))),
                     Pair.of("ChargedProjectiles", DSL.list(bfp.t.in($$0)))
                  )
               ),
               bkg.b,
               HookFunction.IDENTITY
            )
      );
   }
}

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjo extends Schema {
   public bjo(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bhy.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bhy.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bhy.A.in($$0)),
                        Pair.of("BlockEntityTag", bhy.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bhy.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bhy.C.in($$0))),
                        Pair.of("Items", DSL.list(bhy.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bhy.t.in($$0)))
                     }
                  )
               ),
               bna.b,
               HookFunction.IDENTITY
            )
      );
   }
}

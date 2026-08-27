import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhn extends Schema {
   public bhn(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bga.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bga.B.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bga.y.in($$0)),
                        Pair.of("BlockEntityTag", bga.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bga.A.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bga.A.in($$0))),
                        Pair.of("Items", DSL.list(bga.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bga.t.in($$0)))
                     }
                  )
               ),
               bks.b,
               HookFunction.IDENTITY
            )
      );
   }
}

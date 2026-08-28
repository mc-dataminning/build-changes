import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bie extends Schema {
   public bie(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgq.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bgq.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bgq.A.in($$0)),
                        Pair.of("BlockEntityTag", bgq.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bgq.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bgq.C.in($$0))),
                        Pair.of("Items", DSL.list(bgq.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bgq.t.in($$0)))
                     }
                  )
               ),
               blm.b,
               HookFunction.IDENTITY
            )
      );
   }
}

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bgm extends Schema {
   public bgm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bfa.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bfa.B.in($$0),
                  "tag",
                  ays.a(
                     Pair.of("EntityTag", bfa.y.in($$0)),
                     Pair.of("BlockEntityTag", bfa.s.in($$0)),
                     Pair.of("CanDestroy", DSL.list(bfa.A.in($$0))),
                     Pair.of("CanPlaceOn", DSL.list(bfa.A.in($$0))),
                     Pair.of("Items", DSL.list(bfa.t.in($$0))),
                     Pair.of("ChargedProjectiles", DSL.list(bfa.t.in($$0)))
                  )
               ),
               bjq.a,
               HookFunction.IDENTITY
            )
      );
   }
}

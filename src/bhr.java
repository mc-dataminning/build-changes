import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhr extends Schema {
   public bhr(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgf.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bgf.B.in($$0),
                  "tag",
                  azu.a(
                     Pair.of("EntityTag", bgf.y.in($$0)),
                     Pair.of("BlockEntityTag", bgf.s.in($$0)),
                     Pair.of("CanDestroy", DSL.list(bgf.A.in($$0))),
                     Pair.of("CanPlaceOn", DSL.list(bgf.A.in($$0))),
                     Pair.of("Items", DSL.list(bgf.t.in($$0))),
                     Pair.of("ChargedProjectiles", DSL.list(bgf.t.in($$0)))
                  )
               ),
               bkw.b,
               HookFunction.IDENTITY
            )
      );
   }
}

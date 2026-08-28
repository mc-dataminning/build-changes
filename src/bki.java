import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bki extends Schema {
   public bki(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bis.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bis.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bis.A.in($$0)),
                        Pair.of("BlockEntityTag", bis.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bis.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bis.C.in($$0))),
                        Pair.of("Items", DSL.list(bis.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bis.t.in($$0)))
                     }
                  )
               ),
               bnu.b,
               HookFunction.IDENTITY
            )
      );
   }
}

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhu extends Schema {
   public bhu(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgg.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bgg.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bgg.A.in($$0)),
                        Pair.of("BlockEntityTag", bgg.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bgg.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bgg.C.in($$0))),
                        Pair.of("Items", DSL.list(bgg.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bgg.t.in($$0)))
                     }
                  )
               ),
               blc.b,
               HookFunction.IDENTITY
            )
      );
   }
}

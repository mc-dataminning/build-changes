import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bif extends Schema {
   public bif(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bgs.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bgs.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bgs.A.in($$0)),
                        Pair.of("BlockEntityTag", bgs.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bgs.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bgs.C.in($$0))),
                        Pair.of("Items", DSL.list(bgs.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bgs.t.in($$0)))
                     }
                  )
               ),
               bll.b,
               HookFunction.IDENTITY
            )
      );
   }
}

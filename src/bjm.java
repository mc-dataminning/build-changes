import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bjm extends Schema {
   public bjm(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bhw.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bhw.D.in($$0),
                  "tag",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("EntityTag", bhw.A.in($$0)),
                        Pair.of("BlockEntityTag", bhw.s.in($$0)),
                        Pair.of("CanDestroy", DSL.list(bhw.C.in($$0))),
                        Pair.of("CanPlaceOn", DSL.list(bhw.C.in($$0))),
                        Pair.of("Items", DSL.list(bhw.t.in($$0))),
                        Pair.of("ChargedProjectiles", DSL.list(bhw.t.in($$0)))
                     }
                  )
               ),
               bmy.b,
               HookFunction.IDENTITY
            )
      );
   }
}

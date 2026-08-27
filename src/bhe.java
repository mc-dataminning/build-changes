import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bhe extends Schema {
   public bhe(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bfs.t,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  bfs.B.in($$0),
                  "tag",
                  azh.a(
                     Pair.of("EntityTag", bfs.y.in($$0)),
                     Pair.of("BlockEntityTag", bfs.s.in($$0)),
                     Pair.of("CanDestroy", DSL.list(bfs.A.in($$0))),
                     Pair.of("CanPlaceOn", DSL.list(bfs.A.in($$0))),
                     Pair.of("Items", DSL.list(bfs.t.in($$0))),
                     Pair.of("ChargedProjectiles", DSL.list(bfs.t.in($$0)))
                  )
               ),
               bki.b,
               HookFunction.IDENTITY
            )
      );
   }
}

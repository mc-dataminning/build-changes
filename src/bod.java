import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bod extends bko {
   public bod(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bit.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", bit.t.in($$0)),
                        Pair.of("offhand", bit.t.in($$0)),
                        Pair.of("feet", bit.t.in($$0)),
                        Pair.of("legs", bit.t.in($$0)),
                        Pair.of("chest", bit.t.in($$0)),
                        Pair.of("head", bit.t.in($$0)),
                        Pair.of("body", bit.t.in($$0)),
                        Pair.of("saddle", bit.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

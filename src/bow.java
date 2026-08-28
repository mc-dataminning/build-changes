import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bow extends blh {
   public bow(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjm.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", bjm.t.in($$0)),
                        Pair.of("offhand", bjm.t.in($$0)),
                        Pair.of("feet", bjm.t.in($$0)),
                        Pair.of("legs", bjm.t.in($$0)),
                        Pair.of("chest", bjm.t.in($$0)),
                        Pair.of("head", bjm.t.in($$0)),
                        Pair.of("body", bjm.t.in($$0)),
                        Pair.of("saddle", bjm.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

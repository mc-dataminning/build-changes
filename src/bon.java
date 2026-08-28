import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bon extends bky {
   public bon(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjd.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", bjd.t.in($$0)),
                        Pair.of("offhand", bjd.t.in($$0)),
                        Pair.of("feet", bjd.t.in($$0)),
                        Pair.of("legs", bjd.t.in($$0)),
                        Pair.of("chest", bjd.t.in($$0)),
                        Pair.of("head", bjd.t.in($$0)),
                        Pair.of("body", bjd.t.in($$0)),
                        Pair.of("saddle", bjd.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

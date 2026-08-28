import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class boh extends bks {
   public boh(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bix.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", bix.t.in($$0)),
                        Pair.of("offhand", bix.t.in($$0)),
                        Pair.of("feet", bix.t.in($$0)),
                        Pair.of("legs", bix.t.in($$0)),
                        Pair.of("chest", bix.t.in($$0)),
                        Pair.of("head", bix.t.in($$0)),
                        Pair.of("body", bix.t.in($$0)),
                        Pair.of("saddle", bix.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

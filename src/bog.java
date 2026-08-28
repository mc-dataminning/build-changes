import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bog extends bkr {
   public bog(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         biw.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", biw.t.in($$0)),
                        Pair.of("offhand", biw.t.in($$0)),
                        Pair.of("feet", biw.t.in($$0)),
                        Pair.of("legs", biw.t.in($$0)),
                        Pair.of("chest", biw.t.in($$0)),
                        Pair.of("head", biw.t.in($$0)),
                        Pair.of("body", biw.t.in($$0)),
                        Pair.of("saddle", biw.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

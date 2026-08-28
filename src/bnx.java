import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bnx extends bkj {
   public bnx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         biq.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", biq.t.in($$0)),
                        Pair.of("offhand", biq.t.in($$0)),
                        Pair.of("feet", biq.t.in($$0)),
                        Pair.of("legs", biq.t.in($$0)),
                        Pair.of("chest", biq.t.in($$0)),
                        Pair.of("head", biq.t.in($$0)),
                        Pair.of("body", biq.t.in($$0)),
                        Pair.of("saddle", biq.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class bol extends bkw {
   public bol(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         bjb.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", bjb.t.in($$0)),
                        Pair.of("offhand", bjb.t.in($$0)),
                        Pair.of("feet", bjb.t.in($$0)),
                        Pair.of("legs", bjb.t.in($$0)),
                        Pair.of("chest", bjb.t.in($$0)),
                        Pair.of("head", bjb.t.in($$0)),
                        Pair.of("body", bjb.t.in($$0)),
                        Pair.of("saddle", bjb.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

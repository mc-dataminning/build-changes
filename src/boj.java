import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Supplier;

public class boj extends bku {
   public boj(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         true,
         biz.A,
         () -> DSL.optional(
               DSL.field(
                  "equipment",
                  DSL.optionalFields(
                     new Pair[]{
                        Pair.of("mainhand", biz.t.in($$0)),
                        Pair.of("offhand", biz.t.in($$0)),
                        Pair.of("feet", biz.t.in($$0)),
                        Pair.of("legs", biz.t.in($$0)),
                        Pair.of("chest", biz.t.in($$0)),
                        Pair.of("head", biz.t.in($$0)),
                        Pair.of("body", biz.t.in($$0)),
                        Pair.of("saddle", biz.t.in($$0))
                     }
                  )
               )
            )
      );
   }
}

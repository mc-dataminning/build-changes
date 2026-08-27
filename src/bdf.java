import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bdf extends bbi {
   public bdf(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         baa.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(baa.w.in($$0)),
               "block_entities",
               DSL.list(DSL.or(baa.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", baa.y.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(baa.G.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(baa.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(baa.C.in($$0)))
            )
      );
   }
}

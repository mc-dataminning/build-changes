import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bds extends bbv {
   public bds(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         ban.c,
         () -> DSL.optionalFields(
               "entities",
               DSL.list(ban.w.in($$0)),
               "block_entities",
               DSL.list(DSL.or(ban.s.in($$0), DSL.remainder())),
               "block_ticks",
               DSL.list(DSL.fields("i", ban.y.in($$0))),
               "sections",
               DSL.list(
                  DSL.optionalFields(
                     "biomes", DSL.optionalFields("palette", DSL.list(ban.G.in($$0))), "block_states", DSL.optionalFields("palette", DSL.list(ban.u.in($$0)))
                  )
               ),
               "structures",
               DSL.optionalFields("starts", DSL.compoundList(ban.C.in($$0)))
            )
      );
   }
}

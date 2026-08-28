import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bit extends bij {
   public bit(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         bgx.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(bgx.A.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(bgx.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", bgx.C.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(bgx.u.in($$0))))
               )
            )
      );
   }
}

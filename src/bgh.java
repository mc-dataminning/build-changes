import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class bgh extends bfq {
   public bgh(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public void registerTypes(Schema $$0, Map<String, Supplier<TypeTemplate>> $$1, Map<String, Supplier<TypeTemplate>> $$2) {
      super.registerTypes($$0, $$1, $$2);
      $$0.registerType(
         false,
         beh.c,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(beh.x.in($$0)),
                  "TileEntities",
                  DSL.list(DSL.or(beh.s.in($$0), DSL.remainder())),
                  "TileTicks",
                  DSL.list(DSL.fields("i", beh.z.in($$0))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(beh.u.in($$0)))),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(beh.D.in($$0)))
               )
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema $$0) {
      Map<String, Supplier<TypeTemplate>> $$1 = super.registerBlockEntities($$0);
      $$1.put("DUMMY", DSL::remainder);
      return $$1;
   }
}

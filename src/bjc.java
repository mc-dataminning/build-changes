import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bjc extends bbw {
   public bjc(Schema $$0) {
      super($$0, bjm.b);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.a),
         $$0 -> {
            OpticFinder<?> $$1 = $$0.getType().findField("RootVehicle");
            return $$0.updateTyped($$1, $$1.type(), $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> c($$0xx, "Attach", "Attach").orElse($$0xx)))
               .update(DSL.remainderFinder(), $$0x -> bfu.c(bfu.b($$0x)));
         }
      );
   }
}

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bin extends bbz {
   public bin(Schema $$0) {
      super($$0, biw.b);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.a),
         $$0 -> {
            OpticFinder<?> $$1 = $$0.getType().findField("RootVehicle");
            return $$0.updateTyped($$1, $$1.type(), $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> c($$0xx, "Attach", "Attach").orElse($$0xx)))
               .update(DSL.remainderFinder(), $$0x -> bfn.c(bfn.b($$0x)));
         }
      );
   }
}

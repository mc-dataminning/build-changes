import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bfk extends azm {
   public bfk(Schema $$0) {
      super($$0, bfs.b);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "PlayerUUIDFix",
         this.getInputSchema().getType(this.a),
         $$0 -> {
            OpticFinder<?> $$1 = $$0.getType().findField("RootVehicle");
            return $$0.updateTyped($$1, $$1.type(), $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> c($$0xx, "Attach", "Attach").orElse($$0xx)))
               .update(DSL.remainderFinder(), $$0x -> bcs.c(bcs.b($$0x)));
         }
      );
   }
}

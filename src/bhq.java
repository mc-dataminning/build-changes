import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Optional;

public class bhq extends DataFix {
   public bhq(Schema $$0) {
      super($$0, false);
   }

   private static String a(String $$0) {
      return $$0.equals("health") ? "hearts" : "integer";
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(biq.J);
      return this.fixTypeEverywhereTyped("ObjectiveRenderTypeFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> {
            Optional<String> $$1 = $$0xx.get("RenderType").asString().result();
            if ($$1.isEmpty()) {
               String $$2 = $$0xx.get("CriteriaName").asString("");
               String $$3 = a($$2);
               return $$0xx.set("RenderType", $$0xx.createString($$3));
            } else {
               return $$0xx;
            }
         }));
   }
}

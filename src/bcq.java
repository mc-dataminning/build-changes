import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class bcq extends DataFix {
   public bcq(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgx.x);
      return this.writeFixAndRead("EmptyItemInVillagerTradeFix", $$0, $$0, $$0x -> {
         Dynamic<?> $$1 = $$0x.get("buyB").orElseEmptyMap();
         String $$2 = $$1.get("id").asString("");
         int $$3 = $$1.get("count").asInt(0);
         return !$$2.equals("minecraft:air") && $$3 != 0 ? $$0x : $$0x.remove("buyB");
      });
   }
}

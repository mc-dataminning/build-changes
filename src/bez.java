import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bez extends bht {
   public bez(Schema $$0) {
      super($$0, false, "EntitySalmonSizeFix", biz.D, "minecraft:salmon");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         String $$1 = $$0x.get("type").asString("medium");
         return $$1.equals("large") ? $$0x : $$0x.set("type", $$0x.createString("medium"));
      });
   }
}

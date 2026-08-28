import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bee extends bgr {
   public bee(Schema $$0) {
      super($$0, false, "EntitySalmonSizeFix", bhw.B, "minecraft:salmon");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> {
         String $$1 = $$0x.get("type").asString("medium");
         return $$1.equals("large") ? $$0x : $$0x.set("type", $$0x.createString("medium"));
      });
   }
}

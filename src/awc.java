import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.List;

public class awc extends axz {
   public awc(Schema $$0) {
      super($$0, false, "EntityShulkerRotationFix", ayx.x, "minecraft:shulker");
   }

   public Dynamic<?> a(Dynamic<?> $$0) {
      List<Double> $$1 = $$0.get("Rotation").asList($$0x -> $$0x.asDouble(180.0));
      if (!$$1.isEmpty()) {
         $$1.set(0, $$1.get(0) - 180.0);
         return $$0.set("Rotation", $$0.createList($$1.stream().map($$0::createDouble)));
      } else {
         return $$0;
      }
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), this::a);
   }
}

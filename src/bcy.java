import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bcy extends bhs {
   public bcy(Schema $$0, boolean $$1) {
      super($$0, $$1, "BlockEntityShulkerBoxColorFix", bix.s, "minecraft:shulker_box");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.remove("Color"));
   }
}

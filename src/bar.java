import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;

public class bar extends bfd {
   public bar(Schema $$0, boolean $$1) {
      super($$0, $$1, "BlockEntityShulkerBoxColorFix", bgh.s, "minecraft:shulker_box");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      return $$0.update(DSL.remainderFinder(), $$0x -> $$0x.remove("Color"));
   }
}

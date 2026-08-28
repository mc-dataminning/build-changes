import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;

public class bia extends bhv {
   public bia(Schema $$0, boolean $$1) {
      super($$0, $$1, "OminousBannerBlockEntityRenameFix", bjb.s, "minecraft:banner");
   }

   @Override
   protected Typed<?> a(Typed<?> $$0) {
      OpticFinder<?> $$1 = $$0.getType().findField("CustomName");
      OpticFinder<Pair<String, String>> $$2 = DSL.typeFinder(this.getInputSchema().getType(bjb.z));
      return $$0.updateTyped(
         $$1,
         $$1x -> $$1x.update(
               $$2,
               $$0xx -> $$0xx.mapSecond(
                     $$0xxx -> $$0xxx.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"")
                  )
            )
      );
   }
}
